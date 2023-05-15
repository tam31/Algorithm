package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A9019 {
	static boolean[] vis;
	static String[] str;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int num=0; num<n; num++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			vis = new boolean[10000];
			str = new String[10000];
			Arrays.fill(str, "");
			Queue<Integer> que = new LinkedList<>();
			que.add(a);
			vis[a] = true;
			
			while(!que.isEmpty() && !vis[b]) {
				int tmp = que.poll();
				
				int d = (tmp*2)%10000;
				int s = tmp == 0? 9999:tmp-1;
				int l = (tmp/1000) + (tmp%1000)*10;
				int r = (tmp%10)*1000 + tmp/10;
				
				if(!vis[d]) {
					vis[d]=true;
					str[d]=str[tmp]+"D";
					que.add(d);
				}
				if(!vis[s]) {
					vis[s]=true;
					str[s]=str[tmp]+"S";
					que.add(s);
				}
				if(!vis[l]) {
					vis[l]=true;
					str[l]=str[tmp]+"L";
					que.add(l);
				}
				if(!vis[r]) {
					vis[r]=true;
					str[r]=str[tmp]+"R";
					que.add(r);
				}
				
			}
			
			System.out.println(str[b]);
		}
	}

}
