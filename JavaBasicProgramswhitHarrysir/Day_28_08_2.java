public class Day_28_08_2 {
     public static void main(String[] args) {

//PROGRAM'S ON ONE DIMANSTIONAL ARRAY.......

//Find sum of the Array Element...
    //     float [] marks = {25.2f,65.5f,98.6f,54.9f,68.5f ,64.1f};
    //     float sum = 0; 
    //     for( float element:marks){
    //         sum = sum + element;
    //     }
    //     System.out.println("The sum of Arrays Elements is: "+sum);

//Find Element inside the Array.....
        // float [] marks = {25.2f,65.5f,98.6f,54.9f,68.5f ,64.1f};
        // float value = 64.1f;
        // boolean IsInArray = false;
        // for( float element:marks){
        //     if(value==element){
        //         System.out.println("Elements is present in the array...");
        //         break;
        //     }     
        // }
        // System.out.println("Not present...");

        // for(float element:marks){
        //     if(value == element){
        //         IsInArray = true;
        //         break;
        //     }
        // }
        // if(IsInArray==true){
        //     System.out.println("Element Present in the array...");
        // }else 
        //     System.out.println("Element not Present in the array....");

 //finding the avarage.....
            // float [] marks = {25.2f,65.5f,98.6f,54.9f,68.5f ,64.1f};
            //   float sum = 0; 
            //   for( float element:marks){
            //   sum = sum + element;
            // }
            // System.out.println("The Avarage of the marks is : "+sum/marks.length);


//Code to find Sum of Even or Odd Numbers....
            int a [] = {10,45,125,46,85,50,31,30,21,20};
            int sum = 0;
            for(int element:a){
              if(!(element%2==0)){
                sum += element;
              }    
            }
            System.out.println(sum);
    }
}