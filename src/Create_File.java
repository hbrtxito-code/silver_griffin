/**
 * Created by hbrtxito on 12/6/16.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Create_File {
    Expenses expenses = new Expenses();
    List<String> data_to_file = new ArrayList<>();


    public void create_File(String content) {

        String test = " hola hola hola ";
        String path = "/home/hbrtxito/Downloads/hi.txt";

        String headline = "         B U D G E T   A P P L I CA T I O N  \n" +
                "==========================================================================================="+
                        "\nDatabase's Back Up - Tex File Version - V.01 \n ";


        try {

            // create new file
            File file = new File(path);

            // if file doesn't exists, then create it
            if (!file.exists() ) {
                //file.createNewFile();
                System.out.println("file created");
                FileWriter writer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(headline);
                bw.close();

            }
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("\n"+ content);
            bw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }


}






