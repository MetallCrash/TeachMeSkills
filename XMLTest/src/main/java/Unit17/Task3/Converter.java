package Unit17.Task3;

import Unit17.Task2.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String file = "XMLTest/src/main/java/Unit17/Task3/BookList.json";

    public static void toJSON(BookList bookList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(file), bookList);
        System.out.println("JSON created");
    }
}
