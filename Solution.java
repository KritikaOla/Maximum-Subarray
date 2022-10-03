//using kadane's algorithm
//Leetcode problem solution
class Solution {
    public int maxSubArray(int[] nums) { 
      //cs= current sum,   maxs= maximum sum
        int cs=0,maxs=Integer.MIN_VALUE;
      // loop that traverse through array
        for(int i=0; i<nums.length; i++){
            cs+= nums[i];
          //if current sum is greator than maximum sum
            if(cs>maxs){
                maxs= cs;
            }
          //if current sum gives negative value
            if(cs<0){
                cs=0;  
            }
        }
        return maxs;
    }
}
