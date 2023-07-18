package 오답1;
import java.util.*;
public class A수식최대화 {
	static String[][] cal = {{"+","-","*"},{"+","*","-"},
							{"-","+","*"},{"-","*","+"},
							{"*","+","-"},{"*","-","+"}};
	public static void main(String[] args) {
		String expression = "50*6-3*2";
		
		List<String> list = new ArrayList<>();
		String tmp = "";
		for(int i=0; i<expression.length(); i++) {
			if(expression.charAt(i)=='+' || expression.charAt(i)=='-' || expression.charAt(i)=='*') {
				list.add(tmp);
				list.add(expression.charAt(i)+"");
				tmp="";
			}else {
				tmp += expression.charAt(i);
			}
		}
		list.add(tmp);
		
		
		Long ans = 0l;
		for(int i=0; i<cal.length; i++) {
			List<String> list2 = new ArrayList<>(list);
			String re = "";;
			for(int j=0; j<3; j++) {
				for(int k=0; k<list2.size(); k++) {
					if(list2.get(k).equals(cal[i][j])) {
						list2.set(k-1,cal(list2.get(k-1), list2.get(k), list2.get(k+1)));
						list2.remove(k);
						list2.remove(k);
						k--;
					}
				}
			}
			ans = Math.max(ans, Math.abs(Long.parseLong(list2.get(0))));
			
			
		}
		System.out.println(ans);
		
	}
	private static String cal(String one, String two, String thr) {
		Long a = Long.parseLong(one);
		Long b = Long.parseLong(thr);
		String re="";
		if(two.equals("+")) {
			re = String.valueOf(a+b);
		}else if(two.equals("-")){
			re = String.valueOf(a-b);
		}else {
			re = String.valueOf(a*b);
		}
		return re;
	}
}
