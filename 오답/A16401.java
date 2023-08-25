package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16401 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); 
        int N = Integer.parseInt(st.nextToken()); 
        int[] L = new int[N]; 
        st = new StringTokenizer(br.readLine());
        int max = 0; 
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, L[i]);
        }

        System.out.println(binarySearch(L, M, 1, max));;
    }

    public static int binarySearch(int[] L, int M, int left, int right) {
        int result = 0;
        while (left <= right) {
            int mid =  left + (right - left) / 2;
            int cnt = 0;

            for (int i = 0; i < L.length; i++) {
            	
                cnt += L[i] / mid;
            }

            if (cnt >= M) {
            	
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}