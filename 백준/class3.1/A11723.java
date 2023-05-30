package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			
			if(str[0].equals("all")) {
				for(int j=1; j<=20; j++) {
					set.add(j);
				}
				continue;
			}else if(str[0].equals("empty")) {
				set.clear();
				continue;
			}
			
			int a = Integer.parseInt(str[1]);
			if(str[0].equals("add")) {
				set.add(a);
			}else if(str[0].equals("remove")) {
				set.remove(a);
			}else if(str[0].equals("check")) {
				if(set.contains(a)) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(str[0].equals("toggle")) {
				if(set.contains(a)) {
					set.remove(a);
				}else {
					set.add(a);
				}
			}
		}
		System.out.println(sb);
	}

}
