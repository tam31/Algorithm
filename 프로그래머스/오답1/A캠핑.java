package 오답1;
import java.util.*;
public class A캠핑 {

	public static void main(String[] args) {
		int n = 4;
		int[][] data = {{0, 0}, {1, 1}, {0, 2}, {2, 0}};
	
		Arrays.sort(data, (o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];
		});
		
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(data[i][0] == data[j][0] ||
						data[i][1]==data[j][1]) {
					continue;
				}
				
				boolean check = true;
				for(int k=i+1; k<j; k++) {
					if(data[i][0] != data[k][0] &&
						data[i][1] != data[k][1]&&
						data[j][0] != data[k][0] &&
						data[j][1] != data[k][1]) {
						check = false;
						break;
					}
				}
				
				if(check) {
					ans +=1;
				}
			}
		}
		System.out.println(ans);
	}

}
