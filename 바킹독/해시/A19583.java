package 해시;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A19583 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = time(st.nextToken());
		int end1 = time(st.nextToken());
		int end2 = time(st.nextToken());
		
		Set<String> name = new HashSet<>();
		String value = null;
		int ans = 0;
		while((value = br.readLine()) != null) {
			String[] str = value.split(" ");
			int member = time(str[0]);
			
			if(member<=start) {
				name.add(str[1]);
			}
			if(end1<=member && end2>=member && name.contains(str[1])) {
				name.remove(str[1]);
				ans+=1;
			}
			
			value = br.readLine();
		}
		System.out.println(ans);
	}
	
	private static int time(String str) {
		String[] tmp = str.split(":");
		int sum = Integer.parseInt(tmp[0])*60+Integer.parseInt(tmp[1]);
		return sum;
	}
}
