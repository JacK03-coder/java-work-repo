public class Day_28_08 {
    public static void main(String[] args) {
        //Array operations......

        //Using for loop....
        int [] marks = {85,24,65,85,65,94,65,54};
        for(int i=0;i< marks.length; i++){
            System.out.println(marks[i]);
        }  


        // Using for-each loop...........
        System.out.println("using for-each loop...");
        for(int element: marks){
            System.out.println(element);
        }
        //Two dimansional Array...
        System.out.println("\n");
        System.out.println("Two Dimansional Array...");

        int [] [] flat = new int [2][3];
        flat[0][0] = 39;
        flat[0][1] = 89;
        flat[0][2] = 68;
        flat[1][0] = 46;
        flat[1][1] = 42;
        flat[1][2] = 26;
        

        for(int i=0;i<flat.length ; i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }System.out.println("\n"); 
        }
        
        
        System.out.println("New Array....");
        int [][]  random = new int [2][3];
        random [0][0] = 15;
        random [0][1] = 15;
        random [0][2] = 15;
        random [1][0] = 35;
        random [1][1] = 15;
        random [1][2] = 15;
       

        for(int i = 0 ; i<random.length;i++){
            for(int j = 0 ; j < random[i].length ; j++){
                System.out.print(random[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }



    } 
}
