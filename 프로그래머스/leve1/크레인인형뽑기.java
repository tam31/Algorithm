package 일차5;

import java.util.Stack;

public class 크레인인형뽑기 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int n = board.length;
		Stack<Integer> stack = new Stack<>();
		
		int cnt = 0;
		for(int i=0; i<moves.length; i++) {
			int num = moves[i];
			
			int pop = 0;
			for(int j=0; j<n; j++) {
				if(board[j][num-1]!=0) {
					pop = board[j][num-1];
					board[j][num-1] = 0;
//					System.out.println(pop);
					break;
				}
			}
			
			if(pop == 0) {
				continue;
			}
			
			if(!stack.isEmpty()) {
				if(stack.peek()==pop) {
					stack.pop();
					cnt +=2;
					continue;
				}
			}
			stack.add(pop);
			
			
		}
		System.out.println(cnt);
	}

}
