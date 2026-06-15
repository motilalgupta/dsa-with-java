package ArraysPartII;

public class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
       int result = trappedWater(height);
        System.out.println("Total Trapped Water is: "+result);
    }
    public static int trappedWater(int height[]){
        int n = height.length;
        // calculate left max boundary
        int leftMaxBounday[] = new int[n];
        leftMaxBounday[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMaxBounday[i] += Math.max(height[i], leftMaxBounday[i-1]);
        }

        // calculate right max boundary
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1] = height[n-1];
        for(int i = height.length-2; i>=0; i--){
            rightMaxBoundary[i] += Math.max(height[i], rightMaxBoundary[i+1]);
        }
        // loop
        int trappedWater = 0;
        for(int i = 0; i<n; i++){
            // calculate waterLevel
            int waterLevel = Math.min(leftMaxBounday[i], rightMaxBoundary[i]);
            // calulate trappedWater
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
