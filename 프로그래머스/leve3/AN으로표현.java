package leve3;
import java.util.*;
public class AN으로표현 {
	
	public static void main(String[] args) {
		int N = 2;
		int number = 11;
		// 1. n의 사용횟수에 따른 연산값이 중복해서 들어가지 않도록 set리스트를 사용
		Set<Integer>[] numberBox = new HashSet[9];
		for(int i=1; i<9; i++) {
			numberBox[i] = new HashSet<>();
		}
		
		// 2.N을 1번 사용해서 만들수 있는 수의 집합은 N
		numberBox[1].add(N);
		
		// 3.최소값 구하기
		int answer = getAnswerMinCount(N,number, numberBox);
		System.out.println(answer);
		
	}
	
	private static int getAnswerMinCount(int N, int number, Set<Integer>[] numberBox) {
		for(int i=1; i<9; i++) {
			for(int j=1; j<i; j++) {
				// 3. n의 사용횟수에 대한 사칙연산한 값 넣기
				isCalculateNumbers(numberBox[i], numberBox[i-j], numberBox[j]);
			}
			
			// 3.5 N의 연속된 숫자 넣기
			String continuousNumber = Integer.toString(N).repeat(i);
			numberBox[i].add(Integer.parseInt(continuousNumber));
			// 해당 박스안에 number가 있다면 사용횟수 반환
			if(numberBox[i].contains(number)) {
				return i;
			}
		}
		
		//최소 8번으로 답이 나오지 않을경우
		return -1;
	}
	
	private static void isCalculateNumbers(Set<Integer> union, Set<Integer> cal1, Set<Integer> cal2) {
		for(int x: cal1) {
			for(int y: cal2) {
				union.add(x+y);
				union.add(x-y);
				union.add(x*y);
				if(y!=0) union.add(x/y);
			}
		}
	}
}