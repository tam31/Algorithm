package leve2;
import java.util.*;
public class A타켓넘버 {
	static int ans = 0;
	public static void main(String[] args) {
		int[] numbers = {4,1,2,1};
		int target = 4;
		
		cal(0,0,numbers, target);
		System.out.println(ans);
	}
	private static void cal(int sum, int cnt, int[] numbers, int target) {
		if(cnt == numbers.length) {
			if(sum==target) {
				ans +=1;
			}
			return;
		}
		
		cal(sum+numbers[cnt], cnt+1, numbers, target);
		cal(sum-numbers[cnt], cnt+1, numbers, target);
	}
}
