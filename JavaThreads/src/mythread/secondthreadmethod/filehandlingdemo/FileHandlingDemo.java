package mythread.secondthreadmethod.filehandlingdemo;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IO;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException{
       Scanner scan = new Scanner(System.in);

    //     String file1 = "src/mythread/secondthreadmethod/filehandlingdemo/file1.txt";

    //     File file = new File(file1);

    //   FileWriter fw = new FileWriter(file1,true);
    //   BufferedWriter bw = new BufferedWriter(fw);

       // fw.write("Hello, World!!");      // Using FileWriter method...
        //fw.append("\n bhai");

        // System.out.println("Write what you want to write...");
        // String s1 = scan.nextLine();

        // bw.write(s1);

      //  FileReader fr = new FileReader(file1);

        // print Content of the file..

        // int ch;
        //     while(((ch=fr.read()) != -1)){
        //         System.out.print((char)ch);
        //     }
            

        // Print content of the file but using try catch block and try with Rresourse...

        // try(FileReader fr = new FileReader(file1);) {
        //     int ch;
        //     while(((ch=fr.read()) != -1)){
        //         System.out.print((char)ch);
        //     }
        //     fr.close();
        // } catch (Exception e) {
        // }

    // BufferedWriter br = new BufferedWriter(fw);
   //  br.write("Hello bro..");

        // Count number of character from the file..[check new space, new line and most importantly the carriage return]
        // int count = 0;
        // int ch;
        // while(((ch=fr.read() )!= -1)){
        // if(ch !=' '&& ch != '\n' && ch != '\r'){
        //     count++;
        //     }
        // }
        // System.out.println(count);


        // Count number of Word's...
        // int count=0;
        // int ch;
        // while(((ch=fr.read()) != -1)){
        //     if(ch == ' ' ||ch == '\n'){
        //         count++;
        //     }
        // }
        // System.out.println(count);
    // br.close();
    //    fr.close();
    //    bw.close();
    //    fw.close();


    String file2 = "src/mythread/secondthreadmethod/filehandlingdemo/file2.txt";
    String file3 = "src/mythread/secondthreadmethod/filehandlingdemo/file3.txt";
    File fileInputFile = new File(file2);
    File fileOutputFile = new File(file3);

    try{
        if(fileInputFile.createNewFile()){
            System.out.println("File is created...");
        }else
            System.out.println("file already exsits...");
    }catch(IOException e){
        e.getStackTrace();
    }
     FileInputStream fis = new FileInputStream(fileInputFile);
    
    FileOutputStream fos = new FileOutputStream(fileOutputFile);

    int c;
    while ((c=fis.read()) != -1) { 
        System.out.print(c);
        fos.write(c);
      }
      fos.close();
      fis.close();
    }
}
