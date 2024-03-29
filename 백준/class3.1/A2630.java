package ����;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A2630 {
	static int n;
	static int[][] arr;
	static int[] ans = new int[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		func(0,0,n);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
	private static void func(int x, int y, int n) {
		
		if(check(x,y,n)) {
			ans[arr[x][y]] +=1;
			return;
		}
		int a = n/2;
		func(x,y,a);
		func(x,y+a,a);
		func(x+a,y,a);
		func(x+a,y+a,a);
	}
	private static boolean check(int x, int y, int n) {
		for(int i=x; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				if(arr[x][y] != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
