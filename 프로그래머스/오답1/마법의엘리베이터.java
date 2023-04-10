package 오답1;

public class 마법의엘리베이터 {

	public static void main(String[] args) {
		int storey = 16;
		int ans = 0;
		
		while(storey !=0) {
			int cur = storey%10;
			int next = (storey/10)%10;
			
			
			
			if(cur >5) {
				ans += 10-cur;
				storey +=10;
			}else if(cur == 5) {
				if(next >=5) {
					storey +=10;
				}
				ans += 5;
			}else {
				ans += cur;
			}
			
			storey /= 10;
		}
		
		System.out.println(ans);
	}

}
