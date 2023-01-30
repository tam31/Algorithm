package 구현;

import java.util.Arrays;

public class 이코테10 {
	static int[][] newLock;
	public static void main(String[] args) {
		int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		
		int n = lock.length;
		int m = key.length;
		boolean ans = true;
		//배열채우기
		newLock = new int[n*3][n*3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				newLock[i+n][j+n] = lock[i][j];
			}
		}
		//각회전마다 완전탐색으로 자물쇠 들어가는지 확인
		for(int num=0; num<4; num++) {
			key = degree90(key);
			for(int i = 0; i<n*2; i++) {
				for(int j=0; j<n*2; j++) {
					//자물쇠넣기
					for(int x=0; x<m; x++) {
						for(int y=0; y<m; y++) {
							newLock[x+i][y+j] += key[x][y];
						}
					}
					if(check(newLock)) {
						ans = true;
						System.out.println(ans);
					}
					//자물쇠 다시 빼기
					for(int x=0; x<m; x++) {
						for(int y=0; y<m; y++) {
							newLock[x+i][y+j] -= key[x][y];
						}
					}
				}
			}
		}
		ans = false;
		System.out.println(ans);
	}
	private static boolean check(int[][] newLock2) {
		int n = newLock2.length/3;
		for(int i=n; i<n*2; i++) {
			for(int j=n; j<n*2; j++) {
				if(newLock2[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	private static int[][] degree90(int[][] key) {
		int n = key.length;
		int m = key[0].length;
		int[][] result = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				result[i][j] = key[n-1-j][i];
			}
		}
		return result;
	}
	
}
