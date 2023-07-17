package leve2;
import java.util.*;
public class A수식최대화 {
	static String[][] cal = {{"+","-","*"},{"+","*","-"},
							{"-","+","*"},{"-","*","+"},
							{"*","+","-"},{"*","-","+"}};
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		
		long ans = 0;
		List<String> list = new ArrayList<>();
		int start = 0;
		for(int i=0; i<expression.length(); i++) {
			if(expression.charAt(i)=='+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
				list.add(expression.substring(start,i));
				list.add(expression.charAt(i)+"");
				start = i+1;
			}
		}
		list.add(expression.substring(start));
		
		for(int i=0; i<cal.length; i++) {
			List<String> tmp = new ArrayList<>(list);
			
			for(int j=0; j<3; j++) {
				for(int k=0; k<tmp.size(); k++) {
					if(cal[i][j].equals(tmp.get(k))) {
						tmp.set(k-1, cal(tmp.get(k-1), tmp.get(k), tmp.get(k+1)));
						tmp.remove(k);
						tmp.remove(k);
						k--;
					}
					
				}
				
			}
			ans = Math.max(ans, Math.abs(Long.parseLong(tmp.get(0))));
		}
		System.out.println(ans);
	}
	private static String cal(String one, String two, String thr) {
		long a = Long.parseLong(one);
		long b = Long.parseLong(thr);
		
		long tmp;
		if(two.equals("+")) {
			tmp = a+b;
		}else if(two.equals("-")) {
			tmp = a-b;
		}else {
			tmp = a*b;
		}
		return String.valueOf(tmp);
	}

}
