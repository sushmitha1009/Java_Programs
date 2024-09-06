class Solution {
    public int findNumbers(int[] nums) {
        int arr[]=new int[nums.length];
        int temp=0,rem=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int num:nums[i]){
                temp=num%10;
                count++;
                num/=10;
            }
            arr[i]=count;
        }
    }
}