package 오답1;

public class 연속된부분수열 {

	public static void main(String[] args) {
		int[] sequence = {2, 2, 2, 2, 2};
		int k = 6;
		
		int n = sequence.length;
		int left = 0;
		int right = 0;
		int sleft = 0;
		int sright = 0;
		int sum = sequence[0];
		int len = n;
		
		while(true) {
			if(left == n && right == n) {
				break;
			}
			
			if(sum == k && right-left < len) {
				sleft = left;
				sright = right;
				len = right-left;
			}
			
			if(sum<=k && right <n) {
				right +=1;
				if(right<n) {
					sum += sequence[right];
				}
			}else {
				sum -=sequence[left];
				left +=1;
			}
		}
		
		System.out.printf("%d %d\n",sleft, sright);
	}

}
