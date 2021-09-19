package Shop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private static final String path = "XMLTest/src/main/java/Shop/ProductList.json";
    private final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    public List<Product> getProducts() {
        try {
            return mapper.readValue(new File(path), new TypeReference<List<Product>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
    public void updateProducts(List<Product> productList) {
        try {
            mapper.writeValue(new File(path), productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
