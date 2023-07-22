package 오답1;
import java.util.*;
public class A2개이하로다른비트 {

	public static void main(String[] args) {
		int[] numbers = {2,7,9};
		
		long[] ans = new long[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] %2 ==0) {
				ans[i] = numbers[i]+1;
			}else {
				String tmp = Long.toString(numbers[i],2);
				
				if(tmp.lastIndexOf("0") == -1) {
					String str = "10"+tmp.substring(1);
					ans[i] = Long.parseLong(str,2);
				}else {
					String str = tmp.substring(0,tmp.lastIndexOf("0"))+"10"+
								tmp.substring(tmp.lastIndexOf("0")+2);
					ans[i] = Long.parseLong(str,2);
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
