package 그리드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16953 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		//반대로 k를 2로 나눌수 있으면 나눔
		//못하면 뒷 문자열을 뺀다.
		int cnt = 1;
		while(true) {
			if(k % 2 == 0) {
				k /=2;
				cnt +=1;
			}else if(k % 10 == 1) {
				k /=10;
				cnt +=1;
//				String k1 = Integer.toString(k);
//				k1 = k1.substring(0, k1.length()-1);
////				System.out.println(k1);
//				cnt +=1;
//				k = Integer.parseInt(k1);
			}else {
				cnt =-1;
				break;
			}
			if(k == n) {
				break;
			}else if(k <n) {
				cnt =-1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
