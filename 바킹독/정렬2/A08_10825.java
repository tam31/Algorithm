package 정렬2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A08_10825 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[][] str = new String[n][4];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			str[i][0] = st.nextToken();
			str[i][1] = st.nextToken();
			str[i][2] = st.nextToken();
			str[i][3] = st.nextToken();
		}
		
		Arrays.sort(str, (o1,o2)->{
			if(o1[1].equals(o2[1])) {
				if(o1[2].equals(o2[2])) {
					if(o1[3].equals(o2[3])) {
						return o1[0].compareTo(o2[0]);
					}
					return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
				}
				return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
			}
			return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(str[i][0]);
		}
	}

}
