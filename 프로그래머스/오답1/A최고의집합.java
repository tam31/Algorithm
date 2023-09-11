package 오답1;
import java.util.*;
public class A최고의집합 {

	public static void main(String[] args) {
		int n = 2;
		int s = 9;
		
		if(n>s) {
			System.out.println(new int[] {-1});
		}else {
			int size = s/n;
			int[] list = new int[n];
			for(int i=0; i<n; i++) {
				list[i] = size;
			}
			
			for(int i=0; i<s%n; i++) {
				list[i] +=1; 
			}
			
			Arrays.sort(list);
			
			System.out.println(Arrays.toString(list));
		}
	}

}
