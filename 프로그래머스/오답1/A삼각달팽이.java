package 오답1;
import java.util.*;
public class A삼각달팽이 {

	public static void main(String[] args) {
		int n = 5;
		
		int[][] tmp = new int[n][n];
		int x = -1;
		int y = 0;
		int num = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(i%3==0) {
					x++;
				}else if(i%3 == 1) {
					y++;
				}else {
					x--;
					y--;
				}
				tmp[x][y]=num;
				num++;
			}
		}
		
		int k=0;
		int[] ans = new int[(n*(n+1))/2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(tmp[i][j]!=0) {
					ans[k]=tmp[i][j];
					k++;
				}
			}
		}
	}

}
