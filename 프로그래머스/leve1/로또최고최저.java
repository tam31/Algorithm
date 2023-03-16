package 일차5;

public class 로또최고최저 {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int count = 0;
		int cnt = 0;
		for(int i=0; i<6; i++) {
			if(lottos[i] == 0) {
				cnt +=1;
				continue;
			}
			for(int j=0; j<6; j++) {
				if(lottos[i] == win_nums[j]) {
					count +=1;
				}
			}
		}
		
		int a = 7-(count+cnt);
		int b = 7-count;
		if(a==7) a= 7;
		if(b == 7) b = 6;
		System.out.printf("%d %d\n", a, b);
	}

}
