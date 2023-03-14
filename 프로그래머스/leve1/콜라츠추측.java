package 일차3;

public class 콜라츠추측 {

	public static void main(String[] args) {
		long n = 626331;
		
		int cnt = 0;
		while(n!=1) {
			if(n%2 == 0) {
				n = n/2;
			}else {
				n= n*3+1;
			}
			cnt +=1;
			if(cnt >=500) {
				cnt =-1;
				break;
			}
		}
		System.out.println(cnt);
	}

}
