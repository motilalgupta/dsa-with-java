package ArraysPartII;

public class TrappingRainWater2nd {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trappingTrainWater(height);
        System.out.println("Total Trapped Water is: "+res);
    }
    public static int trappingTrainWater(int height[]){
        int n = height.length;
        // calculate leftMaxBoundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }
        // calculate rightMaxBoundary
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }
        // loop
        int trappedWater = 0;
        for(int i = 0; i<n; i++){
            // calculate waterLevel
            int waterLevel = Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
            // calculate trappedWater
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
