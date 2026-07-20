
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {

        BigInteger num1=new BigInteger(a,2);
        BigInteger num2= new BigInteger(b,2);

        BigInteger sum=num1.add(num2);

        return sum.toString(2);
        
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String a=sc.next().trim();
        String b=sc.next().trim();

        Solution sol= new Solution();
 
        String result=sol.addBinary(a,b);
        System.out.print(result);

    }
}