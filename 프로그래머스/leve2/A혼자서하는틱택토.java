package leve2;
import java.util.*;
public class A혼자서하는틱택토 {
	static char[][] map = new char[3][3];
	public static void main(String[] args) {
		String[] board = {"...", "...", "..."};
		
		for(int i=0; i<3; i++) {
			map[i] = board[i].toCharArray();
		}
		if(func()) System.out.println(1);
		System.out.println(0);
		
	}
	private static boolean func() {
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(map[i][j] == 'O') {
					cnt1 +=1;
				}else if(map[i][j] == 'X') {
					cnt2 +=1;
				}
			}
		}
		// 1. o가 x+1보다 많을떄
		if(cnt1 > cnt2+1) return false;
		// 2. x가 o보다 많을떄
		if(cnt2 >cnt1) return false;
		
		boolean o = check2('O');
		boolean x = check2('X');
		//o가 빙고인데 x가 빙고일때
		if(o && x) return false;
		//o이 빙고이고 x는 빙고가 아니지만 갯수가 많을때
		if(o && !x) {
			if(cnt1 <= cnt2) return false;
		}
		//o이 빙고가 아니고 x가 빙고이지만 o의 갯수가 많을때
		if(!o && x) {
			if(cnt1> cnt2) return false;
		}
		
		
//		int o = check('O');
//		int x = check('X');
//		if(o>0 && x>0) {
//			return false;
//		}
//		if(o>0 && cnt1<=cnt2) return false;
//		if(x>0 && cnt1>cnt2) return false;
		
		return true;
	}
	
	private static int check(char c) {
		int cnt = 0;
		for(int i=0; i<3; i++) {
			if(map[i][0]==c&&map[i][1]==c&&map[i][2]==c) {
				cnt +=1;
			}
			if(map[0][i]==c&&map[1][i]==c&&map[2][i]==c) {
				cnt +=1;
			}
		}
		
		if(map[0][0]==c&&map[1][1]==c&&map[2][2]==c) cnt +=1;
		if(map[0][2]==c&&map[1][1]==c&&map[2][0]==c) cnt +=1;
		
		return cnt;
		
	}
	
	private static boolean check2(char c) {
		for(int i=0; i<3; i++) {
			if(map[i][0]==c&&map[i][1]==c&&map[i][2]==c) {
				return true;
			}
			if(map[0][i]==c&&map[1][i]==c&&map[2][i]==c) {
				return true;
			}
		}
		
		if(map[0][0]==c&&map[1][1]==c&&map[2][2]==c) return true;
		if(map[0][2]==c&&map[1][1]==c&&map[2][0]==c) return true;
		
		return false;
		
	}
}
