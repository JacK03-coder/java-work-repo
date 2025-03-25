
/*
 * Java File's--->>>> Creating  , Writing And Deleting an File ...
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Day_04_10 {
    public static void main(String[] args) {
        //For creating an file..
        File Myfile = new File("jack.txt");
        try {
            Myfile.createNewFile();  
        } catch (IOException e) {
            System.out.println("Unable to create file..");
        }
        //For Writing an File....
        try {
            FileWriter fileWriter = new FileWriter("jack.txt true");  
            fileWriter.write("jack"); 
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
        //for Reading form an file...
        // try {
        //     FileReader fileread = new FileReader("jack.txt");
        //     int i = fileread.read();
        //     System.out.print((char)i);
        //     while((i =fileread.read())!=-1){
        //         System.out.print((char)i);

        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        //If you want to delete an file
        // if(Myfile.delete()){
        //     System.out.println("File is deleted"+Myfile.getParentFile());
        // }
        // else{
        //     System.out.println(" An error occured..!");
        // }
    }
}
 