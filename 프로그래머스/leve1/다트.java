package level1;
import java.util.*;
public class 다트 {

	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		
		int[] ans = new int[3];
		int cnt = 0;
		for(int i=0; i<dartResult.length(); i++) {
			//System.out.println(dartResult.charAt(i));
			if(dartResult.charAt(i)-'0'>=0 && dartResult.charAt(i)-'0'<=10) {
				if(dartResult.charAt(i)-'0'==0) {
					if(ans[cnt]!=0) {
						ans[cnt]= 10;
					}
				}else {
					ans[cnt] = dartResult.charAt(i)-'0';
				}
			}else if(dartResult.charAt(i)=='*') {
				if(cnt == 1) {
					ans[0] *=2;
				}else {
					ans[cnt-2] *=2;
					ans[cnt-1]  *=2;
				}
			}else if(dartResult.charAt(i)=='#') {
				ans[cnt-1] *= -1;
			}else {
				if(dartResult.charAt(i)=='S') {
					ans[cnt] = ans[cnt];
				}else if(dartResult.charAt(i)=='D') {
					ans[cnt] = (int)Math.pow(ans[cnt], 2);
				}else {
					ans[cnt] = (int)Math.pow(ans[cnt], 3);
				}
				cnt +=1;
			}
		}
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += ans[i];
		}
		System.out.println(sum);
	}

}
