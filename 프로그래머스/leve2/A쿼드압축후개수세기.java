package leve2;
import java.util.*;
public class A쿼드압축후개수세기 {
	static boolean[][] vis;
	static int[][] map;
	static int[] ans = new int[2];
	public static void main(String[] args) {
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		//{{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		int n = arr.length;
		vis = new boolean[n][n];
		map = arr;
				
		cal(n,0,0);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(vis[i][j] +" ");
			}
			System.out.println();
		}
				
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!vis[i][j]) {
					ans[map[i][j]] +=1;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(ans));
	
	}
	private static void cal(int size , int x, int y) {
		
		if(size==1) return;
		
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				if(map[i][j] != map[x][y]) {
					cal(size/2, x,y);
					cal(size/2, x,y+size/2);
					cal(size/2, x+size/2, y);
					cal(size/2, x+size/2, y+size/2);
					return;
				}
			}
		}
		
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				vis[i][j]=true;
			}
		}
		ans[map[x][y]] +=1;
	}
	
}
