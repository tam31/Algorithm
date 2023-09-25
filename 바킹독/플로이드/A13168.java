package 플로이드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A13168 {
	static final int INF = 987654321;
	static Set<String> free = new HashSet<>(List.of("ITX-Saemaeul", "ITX-Cheongchun", "Mugunghwa"));
	static Set<String> discount = new HashSet<>(List.of("S-Train", "V-Train"));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			map.put(st.nextToken(), i);
		}
		
		int k = Integer.parseInt(br.readLine());
		int[] list = new int[k];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<k; i++) {
			String name = st.nextToken();
			list[i] = map.get(name);
		}
		
		double[][] arr1 = new double[n][n];
		double[][] arr2 = new double[n][n];
		
		for(int i=0; i<n; i++) {
			Arrays.fill(arr1[i], INF);
			Arrays.fill(arr2[i], INF);
			arr1[i][i] = 0;
			arr2[i][i] = 0;
		}
		int r = Integer.parseInt(br.readLine());
		for(int i=0; i<r; i++) {
			String[] str = br.readLine().split(" ");
			int a = map.get(str[1]);
			int b = map.get(str[2]);
			double money = Double.parseDouble(str[3]);
			if(free.contains(str[0])) {
				arr1[a][b] = 0;
				arr1[b][a] = 0;
				
				arr2[a][b] = Math.min(arr2[a][b], money);
				arr2[b][a] = Math.min(arr2[a][b], money);
			}else if(discount.contains(str[0])) {
				arr1[a][b] = Math.min(arr1[a][b], money*0.5);
				arr1[b][a] = Math.min(arr1[a][b], money*0.5);
				
				arr2[a][b] = Math.min(arr2[a][b], money);
				arr2[b][a] = Math.min(arr2[a][b], money);
			}else {
				arr1[a][b] = Math.min(arr1[a][b], money);
				arr1[b][a] = Math.min(arr1[a][b], money);
				
				arr2[a][b] = Math.min(arr2[a][b], money);
				arr2[b][a] = Math.min(arr2[a][b], money);
			}
		}
		
		for(int q=0; q<n; q++) {
			for(int i=0; i<n; i++) {
				if(q==i) continue;
				for(int j=0; j<n; j++) {
					if(i==j || j==q) continue;
					arr1[i][j] = Math.min(arr1[i][j], arr1[i][q]+arr1[q][j]);
					arr2[i][j] = Math.min(arr2[i][j], arr2[i][q]+arr2[q][j]);
				}
			}
		}
		
		int now = list[0];
		int sum = m;
		int sum2 = 0;
		for(int i=1; i<k; i++) {
			int num = list[i];
			sum += arr1[now][num] != INF ? arr1[now][num] : 0;
			sum2 += arr2[now][num] != INF ? arr2[now][num] : 0;
			now = num;
		}
		
		if(sum<sum2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
