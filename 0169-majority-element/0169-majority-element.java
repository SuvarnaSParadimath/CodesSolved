class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
               
               int value=0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                value = map.get(nums[i]);
                map.put(nums[i],value+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
            int num=0;
             int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
                num=nums[i];

            }
        }

        return num;
        
    }
}