public class prctice {
    public static int trappedWater(int height[]){

        // left max boundry...

        int maxleft[] = new int[height.length];
        maxleft[0] = height[0];
        for(int i =1 ; i<height.length ; i++){
            maxleft[i] = Math.max(height[i] ,maxleft[i-1]);
        }

        //right max boundry...

        int maxright[] = new int[height.length];
        maxright[maxright.length-1] = height[height.length-1];

        for(int i = height.length-2 ; i>=0 ; i--){
            maxright[i] = Math.max(height[i], maxright[i+1]);
        }
        // for final solution to check the trapped water ...

        int trappedWater=0;
        for(int i=0 ; i<height.length ; i++){
            int waterlevel = Math.min(maxleft[i], maxright[i]);
             trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
