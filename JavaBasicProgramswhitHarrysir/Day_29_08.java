public class Day_29_08 {
    public static void main(String[] args) {
 //PROGRAM'S ONE TWO DIMASTIONAL ARRAY.............

 //Print element of 2-D Array......

        // System.out.println("Print 2-D Array");
        // int [][] A = {{2,3},{5,6}};
        // int sum = 0; 
        // for(int i=0;i<A.length;i++){
        //     for(int j=0;j<A[i].length;j++){
        //         System.out.print(A[i][j]+" "); 
            
        //     }
        // }  
        // System.out.println("\n");
//ADD 2-D Arrays Elements............    
        // System.out.println("Print sum of 2-D Array....");
        // int [][] mat1 = {{2,6,5,3,4},{5,6,9,4,6}};
        // int [][] mat2 = {{5,9,8,6,7},{6,9,5,3,4}};

        // int [][] result = {{0,0,0,0,0},{0,0,0,0,0}};

        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[i].length;j++){
        //         result[i][j]=mat1[i][j]+mat2[i][j];
        //         System.out.print("   "+result[i][j]);
        //     }System.out.println("");
        // } 

// Print The index Number And Value of i & j and The Addtion of Element's Also..........
        // int [][] mat1 = {{2,6,5,3,4},{5,6,9,4,6}};
        // int [][] mat2 = {{5,9,8,6,7},{6,9,5,3,4}};

        // int [][] result = {{0,0,0,0,0},{0,0,0,0,0}};

        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[i].length;j++){
        //         System.out.format("Setting the value of i = %d and j = %d",i,j);
        //         result[i][j]=mat1[i][j]+mat2[i][j]; 
        //         System.out.println("  "+result[i][j]); 
        //     }System.out.println(" ");
        // }
        
        // int [] arr = {1,2,3,4,5,6};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for(int i =0; i<n; i++){
        //     //swap element...
        //     temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }
        // for(int element:arr){
        //     System.out.println(element);
        // }

 // Print Largest & Smallest element from an Array....
        int []  arr = {2,5,3,4,6,2,9,3,5,6,4,11,-1,-7};
        int max = arr[0];
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(" The LArgest element is :  "+max);

        // for(int i =0 ; i<arr.length ; i++){
        //     if(!(arr[i]>max)){
        //         max = arr[i];
        //     } 
        // } 
        // System.out.println(" The Samllest  element is :  "+max);

//Using For-each loop finding the smalllest value.........
         max = arr[0];
        for(int element:arr){
            if(!(element>max)){
                max = element;
            }
        }System.out.println("smallest element: "+max);


//Check Array is Shorted or not............
        //  int [] arr = {2,6,8,9};
        //  boolean IsShorted = true;
        //  for ( int i = 0; i< arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         IsShorted = false;
        //         break;
        //     }
        //  }
        //  if(IsShorted == true){
        //     System.out.println("Array is Shorted");
        //  }else
        //     System.out.println("Array is Not Shorted....");
         
    } 
}

