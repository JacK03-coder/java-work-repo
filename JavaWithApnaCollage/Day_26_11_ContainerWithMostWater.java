
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.List;
import java.util.*;
public class Day_26_11_ContainerWithMostWater {
    public static int bruteForce(int height[]){
        int maxTrappedWater = 0;
        for(int i=0 ; i<height.length ; i++){
            for(int j=i+1 ; j<height.length ; j++){
                int height1 = Math.min(height[i], height[j]);
                 int width   = j-i;
                 int trappedWater = height1*width;
                 maxTrappedWater = Math.max(maxTrappedWater, trappedWater);
            }
        }
        return maxTrappedWater;
    }

    public static int easyWay(int height[]){
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;

        while(lp<rp){
            int height1 = Math.min(height[lp] , height[rp]);
            int currWater = height1*(rp-lp);
            maxWater = Math.max(currWater, maxWater);

            if(height[lp]<height[rp]){
                lp++;
            }else
                rp--;
        }
        return maxWater;
    }

    public static int[] pairSum(int arr[] , int target){
        for(int i=0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j]== target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static boolean pairSum2(int arr[] , int target){

        int lp = 0;
        int rp = arr.length-1;

        while(lp != rp){
            int sum =arr[lp]+arr[rp];
            if(sum==target){
                return true;
            }
            if(sum>target){
                rp--;
            }else
                lp++;
        }
        return false;
    }
    public static boolean pair2SumRotatingMethod(int arr[] , int target){
        int  n= arr.length;
        int pivot = 0;

        for(int i=0; i<arr.length ; i++){
            if(arr[i]>arr[i+1]){
                pivot = i+1;
                break;
            }
        }
        int lp = pivot;
        int rp = (pivot -1+n)%n;

        while(rp==lp){
            int sum = arr[lp]+arr[rp];
            if(sum==target){
                return true;
            }
            if(sum>target){
                rp = (n+rp-1)%n;
            }else
                lp = (lp+1)%n;
        }
        return false;
    }

    public static boolean pairsum222(List<Integer> list , int target){
        int bp = -1;
        int n= list.size();

        for(int i=0; i<list.size() ; i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp  = bp;
        int rp  = bp+1;

        while(lp != rp){
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }

            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            else
                rp = (n+rp-1)%n;
        }
        return false;
    }
    public static boolean randomfunc(int arr[] , int target){
        int n = arr.length;
        int bp = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                bp = i;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while(rp!=lp){
            if(arr[lp]+arr[rp]== target){
                return true;
            }

            if(arr[lp]+arr[rp]<target){
                lp = (lp+1)%n;
            }
            else{
                rp =(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(bruteForce(height));
        System.out.println(easyWay(height));

        int arr[] = {1,2,3,4,5,6};
        int target = 5;
        int[] result = pairSum(arr, target);

        if(result[0] == -1){
            System.out.println("Fuck man!! you don't have any solution");
        }else{
            System.out.println("Damm!! you have solution ::\nfirst index::"+result[0]+" \nsecond index:::"+result[1]);
        }

        System.out.println(pairSum2(arr, target));

        System.out.println();

        int arr3[] = {11,15,6,8,9,10};
        int target33 = 16;
        System.out.println("THE ELEMENT IS::"+pair2SumRotatingMethod(arr3, target33));
        
        List<Integer> list = new List<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target45 = 16;

        System.out.println(pairsum222(list, target45));
    }
}
