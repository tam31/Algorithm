package 오답2;

public class Ak진수에서소수개수구하기 {

	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		
		int ans = 0;
		String str[] = Integer.toString(n,k).split("0");
		for(int i=0; i<str.length; i++) {
			if(!str[i].equals("")) {
				if(func(str[i])) ans ++;
			}
		}
		System.out.println(ans);
	}
	private static boolean func(String str) {
		Long tmp = Long.parseLong(str);
		if(tmp <2) return false;
		for(long i=2; i<=Math.sqrt(tmp); i++) {
			if(tmp%i==0) {
				return false;
			}
		}
		
		return true;
	}
}