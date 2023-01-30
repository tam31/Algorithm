package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 이코테8 {

	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		//정렬
		Arrays.sort(arr);
		
		String ans ="";
		int cnt =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='A' && arr[i] <='Z') {
				ans += arr[i];
			}else {
				cnt += arr[i]-'0';
			}
		}
		ans += cnt;
		System.out.println(ans);
	}

}
