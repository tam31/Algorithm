package 오답1;
import java.util.*;
public class A혼자서하는틱택토 {
	static char[][] map = new char[3][3];
	public static void main(String[] args) {
		String[] board = {"OOO", "...", "XXX"};
		
		for(int i=0; i<3; i++) {
			map[i] = board[i].toCharArray();
		}
		
		int ans = func();
		System.out.println(ans);
	}

	private static int func() {
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(map[i][j]=='O') {
					cnt1 +=1;
				}else if(map[i][j]=='X') {
					cnt2 +=1;
				}
			}
		}
		
		if(cnt1<cnt2) return 0;
		if(cnt1>cnt2+1) return 0;
		
		boolean o = check('O');
		boolean x = check('X');
		System.out.println(o+" "+x);
		if(o && x) return 0;
		if(o && !x && cnt1 <=cnt2) return 0;
		if(!o && x && cnt1 > cnt2) return 0;
		
		return 1;
	}
	private static boolean check(char a) {
		for(int i=0; i<3; i++) {
			if(map[i][0]==a&&map[i][1]==a&&map[i][2]==a) {
				return true;
			}
			if(map[0][i]==a&&map[1][i]==a&&map[2][i]==a) {
				return true;
			}
		}
		
		if(map[0][0]==a&&map[1][1]==a&&map[2][2]==a) return true;
		if(map[0][2]==a&&map[1][1]==a&&map[2][0]==a) return true;
		
		return false;
	}
}
