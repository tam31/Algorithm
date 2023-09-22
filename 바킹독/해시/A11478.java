package 해시;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11478 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int n = str.length();
		Set<String> list = new HashSet<>();
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<=n-i; j++) {
				String tmp = str.substring(j,j+i);
				list.add(tmp);
			}
		}
		System.out.println(list.size());
	}

}
