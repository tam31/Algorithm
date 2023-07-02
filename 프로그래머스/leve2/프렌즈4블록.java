package leve2;
import java.util.*;
public class 프렌즈4블록 {
	static boolean[][] vis;
	static char[][] map;
	static int ans = 0;
	public static void main(String[] args) {
		int m = 6;
		int n = 6;
		String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		
		vis = new boolean[m][n];
		map = new char[m][n];
		for(int i=0; i<m; i++) {
			map[i] = board[i].toCharArray();
		}
		
		while(true) {
			boolean check = remove();
			System.out.println(check);
			if(check) {
				break;
			}
			remove2();
			change();
		}
		System.out.println(ans);
	}
	public static boolean remove() {
		boolean che = true;
		for(int i=0; i<map.length-1; i++) {
			for(int j=0; j<map[i].length-1; j++) {
				if(map[i][j] !='0' &&map[i][j] == map[i][j+1] &&map[i][j] == map[i+1][j] && map[i][j] ==map[i+1][j+1]) {
					vis[i][j] = true;
					vis[i][j+1]= true;
					vis[i+1][j] = true;
					vis[i+1][j+1] = true;
					che = false;
				}
			}
		}
		if(che) return true;
		return false;
	}
	
	public static void remove2() {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(vis[i][j]) {
					ans +=1;
					vis[i][j]=false;
					map[i][j] = '0';
				}
			}
		}
	}
	
	public static void change() {
		for(int j=0; j<map[0].length; j++) {
			for(int i=map.length-1; i>-1; i--) {
				if(map[i][j]=='0') {
					int cnt=1;
					while(i-cnt>=0) {
						if(map[i-cnt][j] != '0') {
							map[i][j] = map[i-cnt][j];
							map[i-cnt][j] = '0';
							break;
						}
						cnt+=1;
					}
				}
			}
		}
	}

}
