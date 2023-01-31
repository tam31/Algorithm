package 오답;

public class 이코테10 {
	static int[][] newLock;
	public static void main(String[] args) {
		int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

		int n = lock.length;
		int m = key.length;
		
		newLock = new int[n*3][n*3];
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				newLock[n+i][n+j] = lock[i][j];
			}
		}
		
		for(int num=0; num<4; num++) {
			key = degree90(key);
			for(int i=0; i<n*2; i++) {
				for(int j=0; j<n*2; j++) {
					
					for(int x=0; x<m; x++) {
						for(int y = 0; y<m; y++) {
							newLock[i+x][j+y] += key[x][y];
						}
					}
					
					if(check(newLock)) {
//						return true;
						System.out.println("성공");
					}
					
					for(int x=0; x<m; x++) {
						for(int y=0; y<m; y++) {
							newLock[i+x][j+y] -= key[x][y];
						}
					}
				}
			}
		}
//		return false;
		System.out.println("실패");
	}
	private static boolean check(int[][] lock) {
		int n = lock.length/3;
		for(int i=n; i<n*2; i++) {
			for(int j=n; j<n*2; j++) {
				if(lock[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	//90도 회전
	private static int[][] degree90(int[][] key) {
		int n = key.length;
		int m = key[0].length;
		int[][] board = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				board[i][j] = key[n-1-j][i];
			}
		}
		return board;
	}

}
