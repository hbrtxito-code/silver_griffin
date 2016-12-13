/**
 * Created by hbrtxito on 12/6/16.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Create_File {

    private Services services = new Services();


    public void create_File(String content) {

        int product_id =0;





        String headline = "             B U D G E T   A P P L I CA T I O N  \n" +
                "==========================================================================================="+
                "\n     Database's Back Up - Tex File Version - V.01 \n " +
                "\n  ID -  Quantity  -  Product    - Category  -   Store    -  Price   -   Payment  -  Date  - Comments \n" ;



        String username = System.getProperty("user.home");
        String new_dir = "/media/hbrtxito/My Data/Budget_back_up";
        System.out.println(username);


        File directory = new File(new_dir+File.separator+"Budget_app_data_expenses");
        String name_of_file = "budget_back_up.txt";

        File file = new File(directory+File.separator+ name_of_file);

        if (!directory.exists()){
            try {
                directory.mkdirs();


                // if file doesn't exists, then create it
                if (!file.exists() ) {
                    //file.createNewFile();
                     product_id = 1;

                    System.out.println("file created");
                    FileWriter writer = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(writer);
                    bw.write(headline);
                    bw.close();

                }
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("\n"+ "("+ product_id + " , " +content);
                bw.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }

        }else {
             product_id = services.max_id();

            System.out.println("The directory is already on the computer");
            try {
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("\n"+ "("+ product_id + " , " +content);
                bw.close();
            }catch(IOException ex){
            ex.printStackTrace();
        }



        }
    }

    public void create_File_2(String content) {

        int product_id =0;





        String headline = "             B U D G E T   A P P L I CA T I O N  \n" +
                "==========================================================================================="+
                "\n     Database's Back Up - Tex File Version - V.01 \n " +
                "\n ID  -Date -  User    - Income  - Comments \n" ;



        String username = System.getProperty("user.home");
        String new_dir = "/media/hbrtxito/My Data/Budget_back_up";
        System.out.println(username);


        File directory = new File(new_dir+File.separator+"Budget_app_data_income");
        String name_of_file = "income_back_up.txt";

        File file = new File(directory+File.separator+ name_of_file);

        if (!directory.exists()){
            try {
                directory.mkdirs();


                // if file doesn't exists, then create it
                if (!file.exists() ) {
                    //file.createNewFile();
                    product_id = 1;

                    System.out.println("file created");
                    FileWriter writer = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(writer);
                    bw.write(headline);
                    bw.close();

                }
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("\n"+ "("+ product_id + " , " +content);
                bw.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }

        }else {
            product_id = services.max_id();

            System.out.println("The directory is already on the computer");
            try {
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("\n"+ "("+ product_id + " , " +content);
                bw.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }



        }
    }

}






