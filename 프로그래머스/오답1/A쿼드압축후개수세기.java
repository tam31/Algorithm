package 오답1;
import java.util.*;
public class A쿼드압축후개수세기 {
	static boolean[][] vis;
	static int[] ans = new int[2];
	public static void main(String[] args) {
		int[][] arr= {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		
		int n = arr.length;
		vis = new boolean[n][n];
		
		func(n,0,0,arr);
		
		System.out.println(Arrays.toString(ans));
	
	}
	static void func(int n, int x, int y, int[][] arr) {
		if(n==1 || vis[x][y]) {
			ans[arr[x][y]] +=1;
			return;
		}
		
		for(int i=x; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				if(arr[x][y] != arr[i][j]) {
					func(n/2, x,y,arr);
					func(n/2, x+n/2,y,arr);
					func(n/2, x,y+n/2, arr);
					func(n/2, x+n/2, y+n/2, arr);
					return;
				}
			}
		}
		
		ans[arr[x][y]] +=1;
	}
}
