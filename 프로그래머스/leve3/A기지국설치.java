package leve3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class A기지국설치 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 11;
		int[] stations = {4,11};
		int w = 1;
		
		int cnt = 0;
		int start =1;
		for(int i=0; i<stations.length; i++) {
			int tmp = (stations[i]-w)-start;
			
			cnt += (int)Math.ceil(1.0*tmp/(w*2+1));
			start = stations[i]+w+1;
		}
		
		if(start==n) {
			cnt+=1;
		}else if(start<n) {
			cnt+=(int)Math.ceil((1.0*n-start)/(w*2+1));
		}
		
		System.out.println(cnt);
	}

}
