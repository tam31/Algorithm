package level1;
import java.util.*;
public class 두개뽑아서더하기 {
	static ArrayList<Integer> list= new ArrayList<>();
	static boolean[] vis;
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		
		int n = numbers.length;
		vis = new boolean[n];
		func(numbers,0,0,0);
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}
		Arrays.sort(ans);
		System.out.println(Arrays.toString(ans));
	}
	static void func(int[] numbers, int cnt, int sum, int a) {
		if(cnt==2) {
			if(!list.contains(sum)) {
				list.add(sum);
			}
			return;
		}
		
		for(int i=a; i<numbers.length; i++) {
			if(!vis[i]) {
				vis[i]=true;
				func(numbers, cnt+1, sum+numbers[i], i+1);
				vis[i]= false;
			}
		}
	}

}
