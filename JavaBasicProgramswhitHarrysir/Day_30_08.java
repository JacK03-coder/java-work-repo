public class Day_30_08 {
    public static void main(String[] args) {
//Using IgnoreCase of the string.....
        String name = "Madam";
        String m = "";
        for (int i = name.length()-1; i>=0 ; i--){
            m = m+name.charAt(i);
        } 
        if(name.equalsIgnoreCase(m)){
            System.out.println("String is Palindrom.....");
        }else 
            System.out.println("String is not Palindrom......");
    
//Using only String are equal or not.........
            System.out.println("Cheacking palindrom...");
            String  random = "nitin";
            String a = new String();

            for(int i=random.length()-1 ;i>=0 ; i-- ){
                a = a+random.charAt(i);
            }
            if(random.equals(a)){
                System.out.println("String is Palindrom...");
            }else
                System.out.println("String is not palindrom.......");

//Reverse of an Array....
                int [] arr = {1,2,3,4,5,6,7,8,9,10};
                
                for(int i = arr.length; i!=0;i--){
                    System.out.println(i);
                }
//reverse of an String..........
                System.out.println("Reverse an String");
                String jay = "helloJay";
                String J = new String(); 
                for(int i= jay.length()-1;i>=0;i--){
                    J = J+jay.charAt(i);
                } 
                System.out.println(""+J);

//Swaping of Array...
                System.out.println("Using Thire Variable...");
                int[] marks = {5,10,15,20,20,54,23,21};
                int l = marks.length;
                int n = Math.floorDiv(l, 2);
                int temp;

                for (int  i = 0 ; i<n ; i++){
                    temp = marks[i];
                    marks[i]=marks[l-1-i];
                    marks[l-1-i] = temp;
                }

                for(int element: marks){
                    System.out.println(element);
                }


                System.out.println("without using Third Variable....");
                int[] value = {25,15,36,25,63,15,32};
                 int L = value.length;
                 int N = Math.floorDiv(L,2);

                 for(int i = 0 ; i<N ; i++){
                     value [i] = value[i]+value[L-1-i];
                     value [L-1-i] = value[i] - value[L-1-i];
                     value[i]= value[i]-value[L-1-i];
                 }

                 for(int element:value){
                     System.out.println(element);
                 }
     }
}


