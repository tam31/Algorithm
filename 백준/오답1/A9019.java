package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A9019 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int k=0; k<n; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			boolean[] vis = new boolean[10000];
			String[] str = new String[10000];
			Arrays.fill(str, "");
			
			Queue<Integer> que = new LinkedList<>();
			que.add(a);
			vis[a] = true;
			while(!que.isEmpty() && !vis[b]) {
				int num = que.poll();
				
				int d = (num*2)%10000;
				int s = num ==0 ? 9999:num-1;
				int l = (num%1000)*10+(num/1000);
				int r = (num%10)*1000 + (num/10);
				
				if(!vis[d]) {
					que.add(d);
					vis[d]=true;
					str[d] = str[num]+"D";
				}
				if(!vis[s]) {
					que.add(s);
					vis[s]=true;
					str[s] = str[num]+"S";
				}
				if(!vis[l]) {
					que.add(l);
					vis[l]=true;
					str[l] = str[num]+"L";
				}
				if(!vis[r]) {
					que.add(r);
					vis[r]=true;
					str[r] = str[num]+"R";
				}
			}
			System.out.println(str[b]);
		}
		
	}

}
