import com.google.gson.Gson;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * class converts JSON directly to an array of player objects
 * this is more straightforward than writing to arraylist
 */
public class JsonToArray {



    public static Student[] jsonToArray() {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(ImportStudents.filePath)) {

            // Convert JSON File to Java Object
            Student[] studentArray = gson.fromJson(reader, Student[].class);

            return studentArray;

        } catch (IOException e) {
            e.printStackTrace();

        }

        return null;
    }
}
