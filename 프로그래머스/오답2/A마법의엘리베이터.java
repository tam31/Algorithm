package 오답2;
import java.util.*;
public class A마법의엘리베이터 {

	public static void main(String[] args) {
		int storey = 2554;
		
		int ans = 0;
		while(storey !=0) {
			int a = storey%10;
			int b = (storey/10)%10;
			
			if(a>5) {
				ans += (10-a);
				storey +=10;
			}else if(a==5) {
				if(b>=5) {
					storey +=10;
				}
				ans += 5;
			}else {
				ans += a;
			}
			
			storey /=10;
		}
		
		System.out.println(ans);
	}

}
