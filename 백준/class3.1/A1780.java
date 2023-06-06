package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1780 {
	static int n;
	static int[] ans = new int[3];
	static int[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		func(0,0,n);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
	}
	static void func(int x, int y, int m) {
		
		if(check(x,y,m)) {
			ans[map[x][y]+1] +=1;
			return;
		}
		
		int a = m/3;
		
		func(x,y,a);
		func(x,y+a,a);
		func(x,y+a*2,a);
		func(x+a,y,a);
		func(x+a,y+a,a);
		func(x+a,y+a*2,a);
		func(x+a*2,y,a);
		func(x+a*2,y+a,a);
		func(x+a*2,y+a*2,a);
		
	}
	static boolean check(int x, int y, int m) {
		for(int i=x; i<x+m; i++) {
			for(int j=y; j<y+m; j++) {
				if(map[x][y] != map[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
