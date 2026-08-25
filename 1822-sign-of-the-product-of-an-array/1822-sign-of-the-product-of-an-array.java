
import java.math.BigInteger;
class Solution {
    public int arraySign(int[] nums) {
          

        BigInteger product=BigInteger.ONE;
        for(int i=0; i<nums.length;i++){
            product=product.multiply(BigInteger.valueOf(nums[i]));
        }

        if(product.compareTo(BigInteger.ZERO)>0){
            return 1;
        }else if(product.compareTo(BigInteger.ZERO)<0){
            return -1;
        }
        
             return 0;
        
        
    }
}