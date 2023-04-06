package 오답2;
import java.util.*;
public class 전화번호목록 {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		int n = phone_book.length;
		Arrays.sort(phone_book);
		for(int i=0; i<n-1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				System.out.println(false);
			}
		}
		System.out.println(true);
	}

}
