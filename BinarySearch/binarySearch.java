/*
For a binary search from scratch in Java, the key conditions are:

The array must be sorted.
Keep two boundaries:
left → beginning of the search range
right → end of the search range
Calculate the middle.
Compare array[mid] with the target.
Eliminate half of the remaining range each iteration.
*/

public class binarySearch {

    private static int binarysearch(int [] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
            // Found it
            return mid;
            }
            else if (nums[mid] < target) {
                // Target must be to the RIGHT
                left = mid + 1;
            }
            else {
                // Target must be to the LEFT
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 11;

        int res = binarysearch(nums, target);


        if (res > 0) System.out.println("El numero se encuentra en la pos:" + res);
        else System.out.println("Numero no encontrado");
    }
    
}
