package lk.ijse.dep11.q5;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,6,7,5,6,4,3,1,8,9,5,13,5,4,6,7,8,13};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] nums) {
        loop:
        for (int i = 0; i < nums.length; i++) {
            int noOfDuplicates = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] == nums[j] && j < i) continue loop;
                if (nums[i] == nums[j]) {
                    noOfDuplicates++;
                }
            }
            if (noOfDuplicates > 1) System.out.println(nums[i]+" has "+noOfDuplicates+" duplicates");
        }
    }
}
