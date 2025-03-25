
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\jayar\\OneDrive\\Desktop\\VS code programs\\JavaWithApnaCollage\\jack.txt");
        file.createNewFile();
        
        FileWriter fw = new FileWriter("jack.txt");
        fw.write("nothing bro");
        fw.close();

        FileReader fr = new FileReader("jack.txt");
         int i = fr.read();
        //  System.out.print((char)i);
        // while((i = fr.read())!=-1){
        //     System.out.print((char)i);
        // }

        while(i!=-1){
            System.out.print((char)i);
            i = fr.read();
        }
    }
}
