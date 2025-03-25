public class DAy_21_11_Gridways {
    public static int gridWays(int i , int j , int n ,int m){
        if(i == n-1 && j==  m-1){
            return 1;
        }
        else if (i==n || j==m) {
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static long gridWays2(int n ,int m){
        
        int totWAys = n+m-2;
        int K = n-1;

        long result = 1;

        for(int i =1 ; i<=K ; i++){
            result =  result*(totWAys-i+1)/i;
        }

        return  result;
    }
    public static void main(String[] args) {
        int n =3;
        int m =3;
        System.out.println(gridWays2(n,m));
    }
}
