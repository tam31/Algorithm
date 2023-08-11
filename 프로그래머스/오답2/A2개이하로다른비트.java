package 오답2;
import java.util.*;
public class A2개이하로다른비트 {

	public static void main(String[] args) {
		long[] numbers = {2,7};
		
		long[] ans = new long[numbers.length];
        for(int i=0; i<numbers.length; i++){
            long num = numbers[i];
            if(num%2==0){
                ans[i] = num+1;
            }else{
                String tmp = Long.toString(num,2);
                if(tmp.lastIndexOf("0")!=-1){
                    int idx = tmp.lastIndexOf("0");
                    // System.out.println(tmp+" "+idx);
                    int min = Math.min(idx+2,tmp.length());
                    tmp = tmp.substring(0,idx)+"10"+tmp.substring(min, tmp.length());
                    // System.out.println(tmp);
                    ans[i] = Long.parseLong(tmp,2);
                }else{
                    tmp = "10"+tmp.substring(1,tmp.length());
                    ans[i] = Long.parseLong(tmp,2);
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}