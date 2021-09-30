class Solution {
    public void moveZeroes(int[] nums) {
        
        int index=0;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
    }
}

public static void main(String[] args) {
	
	int[] arr = { 8, 0, 9, 6, 5, 1, 0, 3, 0, 2 };
	
	moveZeroes(arr);
	
	System.out.println(Arrays.toString(arr));
	
}