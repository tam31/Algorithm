package 해시;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1351 {
	static Map<Long, Long> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		if(n==0) {
			System.out.println(1);
		}else {
			
			long ans = func(n, p, q);
			System.out.println(ans);
		}
	}
	private static long func(long num,int p,int q) {
		if(num==0) return 1;
		if(map.containsKey(num)) return map.get(num);
		
		long a= (long)(num/p);
		long b= (long)(num/q);
		
		map.put(num, func(a,p,q)+func(b,p,q));
		return map.get(num);
	}

}
