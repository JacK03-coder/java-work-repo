public class day_03_09 {
    public static void main(String[] args) {
        // String name = "abcde";
        // int len = name.length();
        // int m = len/2;
        //     if(len%2!=0){
        //         String substring1 = name.substring(0,m);
        //         String substring2 = name.substring(m+1);
        //         System.out.print(substring1);
        //         System.out.print(substring2);
        //     }else{
        //         String substring3 = name.substring(0,m);
        //         String substring4 = name.substring(m);
        //         System.out.print(substring3);
        //         System.out.print(" "+substring4);
        //     }

            String name = "jiay";
            for(int i = 0 ; i< name.length()-1 ; i++){
                char c = name.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    System.out.print(c);
                    break;
                }

                char c1 = name.charAt(i+1);
                if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
                    System.out.print(c1);
                    break;
                } 
            }
    }
}