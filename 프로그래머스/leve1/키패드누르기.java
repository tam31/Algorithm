package 일차5;

import java.util.Arrays;

public class 키패드누르기 {

	public static void main(String[] args) {
		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		String ans = "";
		int now[][] = new int[2][2];
		now[0][0] = 3; now[0][1] = 0; 
		now[1][0] = 3; now[1][1] = 2;
		for(int i=0; i<numbers.length; i++) {
			int num = numbers[i]-1;
			int a = num/3;
			int b = num%3;
//			System.out.println(num);
			
			char check;
			if(num == 0||num==3||num==6) {
				now[0][0] = a;
				now[0][1] = b;
				check = 'L';
			}else if(num==2||num==5||num==8) {
				now[1][0] = a;
				now[1][1] = b;
				check = 'R';
			}else {
				if(num == -1) {
					a = 3; b=1;
				}
				
				int lft = Math.abs(a-now[0][0]) + Math.abs(b-now[0][1]);
				int rft = Math.abs(a-now[1][0]) + Math.abs(b-now[1][1]);
				if(lft<rft) {
					now[0][0] = a;
					now[0][1] = b;
					check = 'L';
				}else if(lft>rft) {
					now[1][0] = a;
					now[1][1] = b;
					check = 'R';
				}else {
					if(hand.equals("right")) {
						now[1][0] = a;
						now[1][1] = b;
						check = 'R';
					}else {
						now[0][0] = a;
						now[0][1] = b;
						check = 'L';
					}
				}
			}
//			System.out.println(check);
//			System.out.println(Arrays.deepToString(now));
			ans += check;
		}
		System.out.println(ans);
	
	}

}
