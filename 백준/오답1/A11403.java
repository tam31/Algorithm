package 오답1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A11403 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 
		 int[][] map = new int[n][n];
		 for(int i=0; i<n; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 for(int j=0; j<n; j++) {
				 map[i][j] = Integer.parseInt(st.nextToken());
			 }
		 }
		 
		 for(int k=0; k<n; k++) {
			 for(int i=0; i<n; i++) {
				 for(int j=0; j<n; j++) {
					 if(map[i][k]==1&&map[k][j]==1) {
						 map[i][j] = 1;
					 }
				 }
			 }
		 }
		 
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 System.out.printf("%d ", map[i][j]);
			 }
			 
		 }
	}

}
