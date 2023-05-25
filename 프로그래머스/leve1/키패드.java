package level1;
import java.util.*;
public class 키패드 {
	static int[][] move= new int[2][2];
	static String hand;
	static String ans= "";
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		hand = "right";
		
		
		
        move[0][0]=3;
        move[0][1]=0;
        move[1][0]=3;
        move[1][1]=2;
        
        for(int i=0; i<numbers.length; i++){
            int a =numbers[i];
            if(a==1 || a==4 || a==7) {
            	move[0][0] = a/3;
            	move[0][1] = 0;
            	ans += "L";
            }else if(a==3 || a==6|| a==9) {
            	move[1][0] = a/3-1;
            	move[1][1] = 2;
            	ans += "R";
            }else if(a==2) {
            	func(0,1);
            }else if(a==5) {
            	func(1,1);
            }else if(a==8) {
            	func(2,1);
            }else if(a==0) {
            	func(3,1);
            }
        }
        System.out.println(ans);
        
	}
	static void func(int a, int b) {
    	int a1 = a;
    	int a2 = b;
    	int tmp1 = Math.abs(a1-move[0][0])+Math.abs(a2-move[0][1]);
    	int tmp2 = Math.abs(a1-move[1][0])+Math.abs(a2-move[1][1]);
    	
    	if(tmp1==tmp2) {
    		if(hand.equals("right")) {
    			ans +="R";
    			move[1][0]=a1;
    			move[1][1]=a2;
    		}else {
    			ans += "L";
    			move[0][0]=a1;
    			move[0][1]=a2;
    		}
    	}else if(tmp1>tmp2) {
    		ans +="R";
    		move[1][0]=a1;
    		move[1][1]=a2;
    	}else {
    		ans +="L";
    		move[0][0]=a1;
    		move[0][1]=a2;
    	}
    }
}
