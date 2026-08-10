class Solution {
    public int singleNumber(int[] nums) {

        LinkedHashMap<Integer, Integer> map= new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int v=map.get(nums[i]);
                map.put(nums[i],v+1);
            }

            else{
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)==1){
            return key;
            }
        }
        
        return 0;
    }
}