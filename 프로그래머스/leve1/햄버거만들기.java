package 일차6;
import java.util.*;
public class 햄버거만들기 {

	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		int cnt = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<ingredient.length; i++) {
			stack.add(ingredient[i]);
			
			if(stack.size()>=4) {
				
				if(stack.get(stack.size()-1) == 1&&
						stack.get(stack.size()-2)==3&&
						stack.get(stack.size()-3)==2&&
						stack.get(stack.size()-4)==1
						) {
					cnt +=1;
					for(int j=0; j<4; j++) {
						stack.pop();
					}
				}
					
			}
			
		}
		System.out.println(cnt);
	}

}
