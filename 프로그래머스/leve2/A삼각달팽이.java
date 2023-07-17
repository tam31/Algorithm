package leve2;
import java.util.*;
public class A삼각달팽이 {

	public static void main(String[] args) {
		int n = 6;
		
		int[] ans = new int[(n*(n+1))/2];
		int[][] list = new int[n][n];
		int num = 1;
		int x=-1;
		int y=0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(i%3==0) {
					x++;
				}else if(i%3==1) {
					y++;
				}else {
					x--;
					y--;
				}
				list[x][y] = num;
				num++;
			}
			
		}
		
		int k=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(list[i][j]==0) {
					break;
				}
				ans[k] = list[i][j];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
