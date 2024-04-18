package code.arrays;

public class Trapped_Rainwater {
  public static int trappedRainwater(int[] height) {

    int n = height.length;

    // calculate left max boundry - array
    int[] leftMax = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    // calculate right max boundry - array

    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int j = n - 2; j >= 0; j--) {
      rightMax[j] = Math.max(height[j], rightMax[j + 1]);
    }

    int trappedWater = 0;
    // loop
    for (int k = 0; k < n; k++) {
      // waterLevel = min(leftmax bound, rightmax bound)
      int waterLevel = Math.min(leftMax[k], rightMax[k]);
      // trapped water = waterLavel - height[i]
      trappedWater += waterLevel - height[k];

    }
    return trappedWater;
  }

  public static void main(String[] args) {
    int[] height = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println("Trapped rainwater: " + trappedRainwater(height));
  }
}
