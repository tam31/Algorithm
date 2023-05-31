package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A9019 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int k=0; k<n; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			boolean[] vis = new boolean[10000];
			String[] str = new String[10000]; 
			Arrays.fill(str, "");
			vis[num] = true;
					
			Queue<Integer> que = new LinkedList<>();
			que.add(num);
			while(!que.isEmpty() && !vis[target]) {
				int a = que.poll();
				
				int d = (a*2)%10000;
				int s = a == 0 ? 9999: a-1;
				int l = (a%1000)*10+a/1000;
				int r = (a%10) * 1000 + a/10;
				
				if(!vis[d]) {
					vis[d] = true;
					str[d] = str[a]+"D"; 
					que.add(d);
				}
				if(!vis[s]) {
					que.add(s);
					vis[s] = true;
					str[s] = str[a]+"S";
				}
				if(!vis[l]) {
					que.add(l);
					vis[l] = true;
					str[l] = str[a]+"L";
				}
				if(!vis[r]) {
					que.add(r);
					vis[r] = true;
					str[r] = str[a]+"R";
				}
				
				
			}
			
			System.out.println(str[target]);
		}
	}

}
