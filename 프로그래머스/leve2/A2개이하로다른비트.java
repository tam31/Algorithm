package leve2;
import java.util.*;
public class A2개이하로다른비트 {

	public static void main(String[] args) {
		long[] numbers = {2,7,5};
		
		long[] ans = new long[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			long a = numbers[i];
			//짝수일때
			if(a%2==0) {
				ans[i] = a+1;
			}//홀수일때
			else {
				String str = Long.toString(a,2);
				int zero = str.lastIndexOf("0");
				if(zero == -1) {
					String tmp = "10"+str.substring(1);
					ans[i] = Long.parseLong(tmp,2);
				}else {
					String tmp = str.substring(0,zero)+"10"+str.substring(zero+2);
					ans[i] = Long.parseLong(tmp,2);
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
