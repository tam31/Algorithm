package 오답2;

public class 엘리베이터 {

	public static void main(String[] args) {
		int storey = 16;
		
		int cnt = 0;
		while(storey !=0) {
			int cur = storey%10;
			int next = (storey/10)%10;
			
			if(cur >5) {
				cnt+= 10-cur;
				storey +=10;
			}else if(cur == 5) {
				if(next>=5) {
					cnt += 5;
					storey +=10;
				}else {
					cnt +=5;
				}
			}else {
				cnt += cur;
			}
			
			storey /= 10;
		}
		
		System.out.println(cnt);
	}

}
