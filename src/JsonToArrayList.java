import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * class converts JSON directly to an arraylist of player objects
 */
public class JsonToArrayList {

    public static ArrayList<Student> jsonToArrayList() {

        Gson gson = new Gson();

        try (Reader reader = new FileReader(ImportStudents.filePath)) {

            // Convert JSON File to Java Object
            Type listType  = new TypeToken<ArrayList<Student>>(){}.getType();

            ArrayList<Student> studentArrayList = gson.fromJson(reader, listType);

        return studentArrayList;


        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }



    }
}
