package ¿¬½À;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		
		int n = a.length();
		int m = b.length();
		int map[][] = new int[m+1][n+1];
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(b.charAt(i-1) == a.charAt(j-1)) {
					map[i][j] = map[i-1][j-1]+1;
				}else {
					map[i][j] = Math.max(map[i-1][j], map[i][j-1]);
				}
			}
		}
		
		System.out.println(map[m][n]);
	}

}
