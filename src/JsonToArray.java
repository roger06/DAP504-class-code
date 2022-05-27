import com.google.gson.Gson;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * class converts JSON directly to an array of player objects
 * this is more straightforward than writing to arraylist
 */
public class JsonToArray {

    static String filePath = "data/students.json";

    public static Student[] jsonToArray() {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(filePath)) {

            // Convert JSON File to Java Object
            Student[] playerArray = gson.fromJson(reader, Student[].class);

            return playerArray;

        } catch (IOException e) {
            e.printStackTrace();

        }

        return null;
    }
}
