/*
 * Thread class & Thread Constructor....
 * 
 */

import java.util.*;
import javax.sound.sampled.SourceDataLine;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
}


public class Day_28_09 {
    public static void main(String[] args) {
     Mythr tr1 = new Mythr("jay");
     tr1.start();
     System.out.println("The name of  thread tr1 is : "+tr1.getName());
     System.out.println("The id of Thread is : "+tr1.threadId());

    }
}
