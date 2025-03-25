public class Day_18_10_TrappedRainWater {
    public static int trappedWatter( int height[] ){
        // calculating  right max boundry....
        int rigthboundry[] = new int[height.length];
        rigthboundry[0] = height[0];

        for(int i =1 ; i<height.length ; i++){
            rigthboundry[i]=  Math.max(height[i] ,rigthboundry[i-1]);
        }

        // calculating left max boundry....
        int leftboundry[]  = new int[height.length];
        leftboundry[leftboundry.length-1] = height[height.length-1];

        for(int i = height.length-2; i>=0 ; i--){
            leftboundry[i] = Math.max(height[i], leftboundry[i+1]);
            }

        // find trapped Rain Water.....
        
        int trappedWater = 0;
        for(int i =0 ; i<height.length ; i++){
            int waterlevel = Math.min(leftboundry[i], rigthboundry[i]);
             trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    // for Printing all SubArrays Of an Array.....
    public static void printSubArrays(int height[]){
        for(int i=0 ; i<=height.length; i++){
            for(int j=i+1 ;j<=height.length ;j++){
                for(int k = i ; k<=j ; k++){
                    System.out.print("["+k+"]");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println( trappedWatter(height));
        int height1[] = {1,2,3,4};
        printSubArrays(height1);
    }
} 
 