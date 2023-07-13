package leve2;

public class A문자열압축 {

	public static void main(String[] args) {
		String s = "aabbaccc";
		
		int n = s.length();
		int ans = n;
		for(int i=1; i<=n/2; i++) {
			String a = s.substring(0,i);
			int cnt = 1;
			String tmp = "";
			for(int j=i; j<n; j+=i) {
				int end = Math.min(i+j, n);
				String b = s.substring(j, end);
				if(a.equals(b)) {
					cnt +=1;
				}else {
					if(cnt == 1) {
						tmp += a;
					}else {
						tmp += cnt +a;
					}
					a = b;
					cnt =1;
				}
			}
			if(cnt ==1) {
				tmp +=a;
			}else {
				tmp += cnt +a;
			}
			
			ans = Math.min(ans, tmp.length());
		}
		System.out.println(ans);
    }
}