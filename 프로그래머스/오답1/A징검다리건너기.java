package 오답1;

public class A징검다리건너기 {

	public static void main(String[] args) {
		int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		int k = 3;
		
		int ans = 0;
		int min = 0;
		int max = Integer.MAX_VALUE;
		while(min<=max) {
			int mid = (min+max)/2;
			if(func(mid, stones, k)) {
				min = mid+1;
				ans = mid;
			}else {
				max = mid-1;
			}
		}
		System.out.println(ans);
	}

	private static boolean func(int mid, int[] stones, int k) {
		int cnt =0;
		for(int i=0; i<stones.length; i++) {
			if(stones[i]<mid) {
				cnt +=1;
				if(cnt ==k) {
					return false;
				}
			}else {
				cnt =0;
			}
		}
		
		return true;
	}
	
}
