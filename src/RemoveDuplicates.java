import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    private static int removeDuplicates(int[] nums){

        if(nums.length == 1){
            return 1;
        }




        int current = 0;
        int temp;

        for (int i = 1; i < nums.length; i++) {
            
            if(nums[i] != nums[current]){
                temp = nums[current+1];
                nums[current+1] = nums[i];
                nums[i] = temp;
                current++;
            }



        }

        return current+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}




/**
         for (int i = 1; i < nums.length; i++) {
            if(current == nums[i]){

                for (int j = i; j < nums.length-1; j++) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                i--;
            }else{
                current = nums[i];
                count++;
            }

        }
 */
/*

(1)
temp=arr[0]
i=1
counter=1
|
|
(2)
temp == arr[i]------------no--------counter++; temp=arr[i]
|
|
yes
|
|
shift all left by one
i++
goes to (2)


function to shift by one to the left


*/
