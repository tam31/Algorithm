package 정렬2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A05_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (o1,o2)->{
			if(o1[0] == o2[0]) {
				return 1;
			}
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});

		for(int i=0; i<n; i++) {
			System.out.printf("%s %s\n",arr[i][0],arr[i][1]);
		}
	}

}
