package 오답1;
import java.util.*;
public class 혼자서하는틱택토 {
	static char[][] map = new char[3][3];
	public static void main(String[] args) {
		String[] board = {"O.X", ".O.", "..X"};
		
		for(int i=0; i<3; i++) {
			map[i] = board[i].toCharArray();
		}
		
		if(func()) {
			System.out.println(1);
		}
		System.out.println(0);
	}
	private static boolean func() {
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(map[i][j] =='O') {
					cnt1++;
				}else if(map[i][j] == 'X') {
					cnt2++;
				}
			}
		}
		
		if(cnt1>cnt2+1) return false;
		if(cnt1<cnt2) return false;
		
		boolean o = check('O');
		boolean x = check('X');
		
		if(o && x) return false;
		if(o && !x && cnt1 <= cnt2) return false;
		if(!o && x && cnt1 > cnt2) return false;
		
		return true;
	}
	
	private static boolean check(char tmp) {
		
		for(int i=0; i<3; i++) {
			if(map[i][0]==tmp&&map[i][1]==tmp&&map[i][2]==tmp) return true;
			
			if(map[0][i]==tmp&&map[1][i]==tmp&&map[2][i]==tmp) return true;
		}
		
		if(map[0][0]==tmp&&map[1][1]==tmp&&map[2][2]==tmp) {
			return true;
		}
		if(map[1][1]==tmp&&map[0][2]==tmp&&map[2][0]==tmp) return true;
		
		return false;
	}
}
