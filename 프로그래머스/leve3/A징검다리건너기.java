package leve3;
import java.util.*;
public class A징검다리건너기 {
	
	public static void main(String[] args) {
		int k = 3;
		int stones[] = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		
		int min = 0;
        int max = Integer.MAX_VALUE;
        int ans = 0;
        while(min <= max) {
            int mid = (min + max) / 2;
            if(func(mid, k, stones)){
                min = mid + 1;
                ans = mid;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }
    
    private static boolean func(int mid, int k, int[] stones) {
        int count = 0;
        for(int i = 0; i < stones.length; i++) {
            if(stones[i] < mid) {
                count+=1;
                if(count >= k) return false;
            } else count = 0;
        }
        return true;
    }

}
