package 오답2;
import java.util.*;
public class 요격시스템 {

	public static void main(String[] args) {
		int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
		
		int n = targets.length;
		int ans = 1;
		Arrays.sort(targets, (o1,o2)->{
			return o1[1]-o2[1];
		});
		
		int end = targets[0][1];
		for(int i=1; i<n; i++) {
			int start = targets[i][0];
			if(end <= start) {
				ans +=1;
				end = targets[i][1];
			}
		}
		
		System.out.println(ans);
	}

}
