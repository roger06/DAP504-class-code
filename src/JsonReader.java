import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

/**
 * just reads json and show output
 */
public class JsonReader {



    public static void jsonRead() throws IOException {

        Gson gson = new Gson();

        try (FileReader fileReader = new FileReader(ImportStudents.filePath);

             com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(fileReader);

        ) {

            // create array of our ReadJson objects

            Student[] data = gson.fromJson(jsonReader, Student[].class);


            for (Student theStudent : data){

                System.out.println(theStudent.email);

                //System.out.println(readJson);


            } // end for


        }

    } // end jsonRead()
}
