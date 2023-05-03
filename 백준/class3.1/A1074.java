package class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1074 {
	static int n, r, c;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		func((int)Math.pow(2, n), r, c);
		System.out.println(cnt);
	}
	static private void func(int a, int x, int y) {
		if(a==1) {
			return;
		}
		int size = a/2;
		
		if(x<size && y<size) {
			func(size, x, y);
		}else if(x<size && y<size+size) {
			cnt += size*size;
			func(size, x, y-size);
		}else if(x<size+size && y<size) {
			cnt += size*size*2;
			func(size, x-size, y);
		}else {
			cnt += size*size*3;
			func(size, x-size, y-size);
		}
	}
}
