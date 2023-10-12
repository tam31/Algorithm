package 오답2;
import java.util.*; 
public class A징검다리건너기 {

	public static void main(String[] args) {
		int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		int k = 3;
		
		int min = 0;
		int max = 200000000;
		while(min<=max) {
			int mid = (min+max)/2;
			if(func(mid,stones,k)) {
				min = mid+1;
			
			}else {
				max = mid-1;
			}
		}
		System.out.println(min);
	}

	private static boolean func(int mid, int[] stones, int k) {
		int cnt = 0;
		for(int i=0; i<stones.length; i++) {
			if(stones[i] <= mid) {
				cnt+=1;
				if(k==cnt) {
					return false;
				}
			}else {
				cnt = 0;
			}
		}
		return true;
	}
}
