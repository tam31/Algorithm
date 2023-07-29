package 오답1;

public class A마법의엘리베이터 {

	public static void main(String[] args) {
		int storey = 2554;
		
		int ans = 0;
		while(storey !=0) {
			System.out.println(ans);
			int one = storey%10;
			int two = (storey/10)%10;
			
			if(one <5) {
				ans += one;
			}else if(one ==5) {
				if(two>=5){
					storey+=10;
				}
				ans +=5;
			}else {
				ans += (10-one);
				storey+=10;
			}
			
			storey /=10;
		}
		System.out.println(ans);
	}

}
