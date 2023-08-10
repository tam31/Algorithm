package 오답2;
import java.util.*;
public class 수식최대화 {
	static String[][] cal = {{"+","-","*"},{"+","*","-"},
			{"-","+","*"},{"-","*","+"},
			{"*","+","-"},{"*","-","+"}};
	static long ans = 0;
	public static void main(String[] args) {
		String expression = "50*6-3*2";
		List<String> str = new ArrayList<>();
		String tmp = "";
		for(int i=0; i<expression.length(); i++) {
			if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*') {
				str.add(tmp);
				str.add(expression.charAt(i)+"");
				tmp = "";
			}else {
				tmp+= expression.charAt(i);
			}
		}
		
		str.add(tmp);
		func(str,0);
		System.out.println(ans);
	}
	
	private static void func(List<String> str, int cnt) {
		for(int i=0; i<6; i++) {
			List<String> tmp = new ArrayList<>(str);
			
			for(int j=0; j<3; j++) {
				
				for(int k=0; k<tmp.size(); k++) {
					if(cal[i][j].equals(tmp.get(k))) {
						long num = Long.valueOf(tmp.get(k-1));
						long num2 = Long.valueOf(tmp.get(k+1));
						long re= cal2(num,num2,cal[i][j]);
						tmp.set(k-1,String.valueOf(re));
						tmp.remove(k);
						tmp.remove(k);
						k--;
					}
				}
			}
			long re = Math.abs(Long.valueOf(tmp.get(0)));
			ans = Math.max(ans, re);
		}
		
		
	}

	private static long cal2(long num, long num2, String s) {
		if(s.equals("+")) return num+num2;
		if(s.equals("-")) return num-num2;
		return num*num2;
		
		
	}

}
