package leve2;
import java.util.*;
public class A행렬테두리회전하기 {
	static int[][] map;
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}}; 
			//{{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		int ans[] = new int[queries.length];
		map = new int[rows][columns];
		int num = 1;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				map[i][j] =num;
				num++;
			}
		}
		
		for(int i=0; i<queries.length; i++) {
			int tmp = func(queries[i]);
			ans[i]=tmp;
			sys(rows,columns);
		}
		
		System.out.println(Arrays.toString(ans));
		
		
	
	}
	private static int func(int[] move) {
		int min = Integer.MAX_VALUE;
		
		int x = move[0]-1;
		int y = move[1]-1;
		int x2 = move[2]-1;
		int y2 = move[3]-1;
		
		
		int tmp = map[x][y];
		int num;
		
		for(int i=y+1; i<=y2; i++) {
			min = Math.min(min, tmp);
			num = map[x][i];
			map[x][i] = tmp;
			tmp = num;
		}
		
		for(int i=x+1; i<=x2; i++) {
			min = Math.min(min, tmp);
			num = map[i][y2];
			map[i][y2] = tmp;
			tmp = num;
		}
		
		for(int i=y2-1; i>=y; i--) {
			min = Math.min(min, tmp);
			num = map[x2][i];
			map[x2][i] = tmp;
			tmp = num;
		}
		
		for(int i=x2-1; i>=x; i--) {
			min = Math.min(min, tmp);
			num = map[i][y];
			map[i][y] = tmp;
			tmp = num;
		}
		min = Math.min(min, tmp);
		
		return min;
	}
	
	private static void sys(int rows, int columns) {
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
