package Shop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ProductManager {
    private static final String path = "XMLTest/src/main/java/Shop/ProductList.json";
    private final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    public List<Product> getProducts() throws IOException {
        return mapper.readValue(new File(path), new TypeReference<List<Product>>() {
        });
    }
    public void updateProducts(List<Product> productList) throws IOException {
        mapper.writeValue(new File(path), productList);
    }
}
