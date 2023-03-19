package 일차7;

import java.util.Arrays;

public class 바탕화면정리 {
	static int n;
	static int m;
	static int[] ans = new int[4];
	static char[][] data;
	public static void main(String[] args) {
		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		n = wallpaper.length;
		m = wallpaper[0].length();
		data = new char[n][m];
		for(int i=0; i<n; i++) {
			data[i] = wallpaper[i].toCharArray();
		}
		
		find1();
		find2();
		find3();
		find4();
		System.out.println(Arrays.toString(ans));
		
		
		System.out.println(Arrays.deepToString(data));
	}
	private static void find1() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(data[i][j]=='#') {
					ans[0] = i;
					return;
				}
			}
		}
	}
	private static void find2() {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(data[j][i]=='#') {
					ans[1] = i;
					return;
				}
			}
		}
		
	}
	
	private static void find3() {
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<m; j++) {
				if(data[i][j] =='#') {
					ans[2] = i+1;
					return;
				}
			}
		}
	}
	private static void find4() {
		for(int i=m-1; i>=0; i--) {
			for(int j=0; j<n; j++) {
				if(data[j][i]=='#') {
					ans[3] = i+1;
					return;
				}
			}
		}
	}
}
