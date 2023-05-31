package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] data = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			data[i][0] = a;
			data[i][1] = b;
		}
		
		Arrays.sort(data, (o1,o2)->{
			if(o1[1]==o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1];
		});
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			if(stack.isEmpty()) {
				stack.add(data[i][1]);
			}else {
				if(stack.peek() <= data[i][0]) {
					stack.add(data[i][1]);
				}
			}
			
		}
		System.out.println(stack.size());
		
	}

}
