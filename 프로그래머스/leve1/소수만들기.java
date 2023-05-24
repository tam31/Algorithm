package level1;
import java.util.*;
public class 소수만들기 {
	static boolean[] vis;
	static int cnt = 0;
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		int n = nums.length;
		vis = new boolean[n];
		func(nums,0,0,0);
		System.out.println(cnt);
	}
	static void func(int[] nums, int sum, int count, int a) {
		if(count == 3) {
			if(check(sum)) {
				cnt +=1;
			}
			
			return;
		}
		
		for(int i=a; i<nums.length; i++) {
			if(!vis[i]) {
				vis[i]=true;
				func(nums, sum+nums[i], count+1,i+1);
				vis[i]=false;
			}
		}
		
	}
	static boolean check(int a) {
		for(int i=2; i<=Math.sqrt(a); i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
