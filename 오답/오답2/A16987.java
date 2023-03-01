package 오답2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16987 {
	static int n;
	static int[] dura;
	static int[] we;
	static int ans = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		dura = new int[n];
		we = new int[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			dura[i] = Integer.parseInt(st.nextToken());
			we[i] = Integer.parseInt(st.nextToken());
		}
		
		func(0,0);
		System.out.println(ans);
		
		
	}
	private static void func(int k, int cnt) {
		if(k==n) {
			ans = Math.max(ans, cnt);
			return;
		}
		if(dura[k] <= 0 || cnt == n-1) {
			func(k+1, cnt);
			return;
		}
		int nCnt = cnt;
		for(int i=0; i<n; i++) {
			if(k==i) continue;
				
			if(dura[i]<=0) continue;
			
			attack(k,i);
			
			if(dura[k] <=0) {
				cnt +=1;
			}
			
			if(dura[i] <= 0) {
				cnt +=1;
			}
			func(k+1,cnt);
			cnt = nCnt;
			recover(k,i);
			
		}
	}
	private static void recover(int k, int i) {
		dura[k] += we[i];
		dura[i] += we[k];
		
	}
	private static void attack(int k, int i) {
		dura[k] -= we[i];
		dura[i] -= we[k];
	}

}
