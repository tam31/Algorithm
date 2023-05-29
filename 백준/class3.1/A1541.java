package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("-");
		
		
		int ans = 0;
		for(int i=0; i<str.length; i++) {
			int sum=0;
			String[] data = str[i].split("\\+");
			for(int j=0; j<data.length; j++) {
				sum+= Integer.parseInt(data[j]);
			}
			if(i==0) {
				ans += sum;
			}else {
				ans -=sum;
			}
		}
		
		System.out.println(ans);
	}

}
