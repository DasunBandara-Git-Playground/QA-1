package lk.ijse.dep11.q6;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15,3,4,5,12};
        findSum(arr,9);
    }

    public static boolean findSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " + " + nums[j] + " => " + target);
                    return true;
                }
            }
        }
        System.out.println("Can't find the sum of two numbers for " + target);
        return false;
    }
}
