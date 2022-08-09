public class RemoveElement {

    private static int removeElement(int[] nums, int val){
        int count = 0;

        for (int i = 0; i < nums.length - count; i++) {
            if(val == nums[i]){
                for (int j = i; j < nums.length-1; j++) {
                    int temp = nums[j+1];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                i--;
                count++;
            }
        }


        return nums.length - count ;
    }
    public static void main(String[] args) {
        
        // System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));

    }
}
