package 오답1;

public class 모음사전 {
	static char arr[] = {'A','E','I','O','U'};
	static int ans = 0;
	static int cnt = 0;
	public static void main(String[] args) {
		String word = "AAAAE";
		func("", 0, word);
		System.out.println(ans);
	}
	private static void func(String str, int idx, String word) {
		if(idx == 5) {
			return;
		}
		for(int i=0; i<5; i++) {
			String ss = str + arr[i];
			cnt +=1;
			if(ss.equals(word)) {
				ans = cnt;
				return;
			}
			func(ss,idx+1,word);
		}
	}

}
