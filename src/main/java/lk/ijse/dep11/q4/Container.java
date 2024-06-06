package lk.ijse.dep11.q4;

public class Container {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(getMaxArea(height));
    }

    public static int getMaxArea(int[] height){
        int maxArea = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = Math.min(height[i],height[j]) * (j-i);
                if (maxArea < area) maxArea = area;
            }
        }
        return maxArea;
    }
}
