public class Day_08_09 {
  public static void main(String[] args) {
    int [] arr = {1,2,6,3,5,6,59,32,6,9,49,6,9,5,6,66,5,6};
    int max = 0; 
    for (int i = 0 ; i<arr.length; i++){
         if(arr[i]>max){
           max = arr[i];
          }
     } System.out.println("largest: "+max);
     
     for(int i =0 ; i<arr.length; i++){
         for(int element: arr){
              if(!(arr[i]>max)){
                max = arr[i];
              }
         }
      }System.out.println("Smallest :"+max);

      int a =3;
      int b =5;
      int temp=0;
      System.out.println("value of a is: "+a+"  & b is: "+b);

      System.out.println("After Swapping Number's :::");
      temp = a;
      a = b;
      b = temp;

      System.out.println("value of a is: "+a+" & b is : "+b);
      System.out.println(" "+temp);
    } 
 }
