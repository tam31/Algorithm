package 오답;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A16987 {
	static int n;
	static int[] dura;
	static int[] we;
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
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
		System.out.println(max);
		
	}
	private static void func(int k, int cnt) {
		if(k == n) {
			max = Math.max(max,cnt);
			return;
		}
		//손으로 든 계란이 이미 깨졋거나 다 깨져 잇을때
		if(dura[k] <=0 || cnt == n-1) {
			func(k+1,cnt);
			return;
		}
		//다른 계란과 부딪혀봄
		int ncnt = cnt;
		for(int i=0; i<n; i++) {
			//손으로 들고 있는 계란이 같은 경우
			if(k==i) continue;
			
			hitEgg(k,i);
			
			if(dura[i]<=0) {
				cnt +=1;
			}
			
			if(dura[k]<=0) {
				cnt +=1;
			}
			
			func(k+1,cnt);
			recoverEgg(k,i);
			cnt = ncnt;
			
		}
	}
	private static void recoverEgg(int k, int i) {
		dura[k] += we[i];
		dura[i] += we[k];
	}
	private static void hitEgg(int k, int i) {
		dura[k] -= we[i];
		dura[i] -= we[k];
	}

}

