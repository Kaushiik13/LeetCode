class Solution {
    public static int searchInsert(int[] nums, int target) {
        int foundItemIndex = Arrays.binarySearch(nums, target);
        if(foundItemIndex<0)
        {
            foundItemIndex = (foundItemIndex*(-1))-1;
        }
        return foundItemIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = sc.nextInt();
        int[] nums  = {1,3,5,6};
        searchInsert(nums,target);
    }
}
