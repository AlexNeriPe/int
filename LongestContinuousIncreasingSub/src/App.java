public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,3,5,4,7};
        int n  = findLengthOfLCIS(nums);
    }

     static int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int anchor = 1;

        for(int i = 0 ; i < nums.length ; i++) {
            if(i > 0 && nums[i - 1] >= nums[i]) anchor = i;
            result = Math.max(result, i - anchor + 1);
        }

        return result;
     }
}
