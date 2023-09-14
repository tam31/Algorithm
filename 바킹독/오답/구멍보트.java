package 프로그래머스;
import java.util.*;
public class 구멍보트 {

	public static void main(String[] args) {
		int[] people = {70,50,80,50};
		int limit = 100;
		
		int n = people.length;
		Arrays.sort(people);
		int start = 0;
		int end = n-1;
		int cnt = 0;
		while(start<=end) {
			
			if(people[start]+people[end] <= limit) {
				start +=1;
				end -=1;
			}else {
				end -=1;
			}
			cnt +=1;
		}
		System.out.println(cnt);
	}

}
