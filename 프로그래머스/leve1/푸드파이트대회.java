package 일차6;

public class 푸드파이트대회 {

	public static void main(String[] args) {
		int[] food = {1,3,4,6};
		
		StringBuilder sb = new StringBuilder();
		for(int i= 1; i<food.length; i++) {
			if(food[i]>=2) {
				for(int j=0; j<food[i]/2; j++) {
					sb.append(i);
				}
			}
		}
		String ans = sb.toString();
		String str = sb.reverse().toString();
		ans += '0'+str;
		System.out.println(ans);
	}

}
