package level1;

public class 수박 {

	public static void main(String[] args) {
		int n = 3;
		
		String ans = "";
		for(int i=0; i<n/2; i++) {
			ans += "수박";
		}
		if(n%2!=0) {
			ans+="수";
		}
		
		System.out.println(ans);
	}

}
