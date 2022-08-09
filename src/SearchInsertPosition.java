public class SearchInsertPosition {
    

    
    private static int searchInsertPosition(int[] nums, int target){

        int leftPtr = 0;
        int rightPtr = nums.length - 1;

        while(leftPtr <= rightPtr){
            int mid = (leftPtr + rightPtr) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                rightPtr = mid - 1;
            }else if(nums[mid] < target){
                leftPtr = mid + 1;
            }

        }

        return leftPtr;
    }
    
    
    public static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{1,3,5,6}, 5));
    }
}
