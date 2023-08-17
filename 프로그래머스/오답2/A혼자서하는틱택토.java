package 오답2;
import java.util.*;
public class A혼자서하는틱택토 {
	static char[][] map = new char[3][3];
	public static void main(String[] args) {
		String[] board = {"O.X", ".O.", "..X"};
		
		for(int i=0; i<board.length; i++) {
			map[i] = board[i].toCharArray();
		}
		
		int cnt1=0;
		int cnt2=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(map[i][j] =='O') {
					cnt1++;
				}else if(map[i][j]=='X') {
					cnt2++;
				}
			}
		}
		
		if(cnt1<cnt2) {
			System.out.println("false");
		}
		if(cnt1>cnt2+1) {
			System.out.println("false");
		}
		
		boolean check1 = func('O');
		boolean check2 = func('X');
		
		if(check1 && check2) System.out.println("false");
		if(check1 && !check2 && cnt1<=cnt2) System.out.println("false");
		if(!check1 && check2 && cnt1>cnt2) System.out.println("false");
		
		System.out.println(true);
	}
	private static boolean func(char a) {
		for(int i=0; i<3; i++) {
			if(map[i][0]==a && map[i][1]==a && map[i][2]==a) return true;
			
			if(map[0][i]==a && map[1][i]==a && map[2][i]==a) return true;
		}
		
		if(map[0][0]==a&& map[1][1]==a && map[2][2]==a) return true;
		if(map[0][2]==a&& map[1][1]==a && map[2][0]==a) return true;
		
		return false;
	}
}
