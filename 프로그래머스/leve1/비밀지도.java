package level1;
import java.util.*;
public class 비밀지도 {
	static char[][] vis;
	static int n;
	static String[] ans;
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		n = 5;
		vis = new char[n][n];
		ans = new String[n];

		func(arr1);
		func(arr2);
		for(int i=0; i<n; i++) {
			String a = "";
			for(int j=0; j<n; j++) {
				if(vis[i][j] == ' ') {
					vis[i][j] = ' ';
				}
				a+=vis[i][j];
			}
			ans[i] = a;
		}
	}
	static void func(int[] arr) {
		for(int i=0; i<n; i++) {
			int a= arr[i];
			int b = n-1;
			while(a!=0) {
				if(a%2==1) {
					vis[i][b] = '#';
				}
				a = a/2;
				b-=1;
			}
		}
	}
}
