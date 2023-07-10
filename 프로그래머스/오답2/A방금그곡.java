package 오답2;
import java.util.*;
public class A방금그곡 {

	public static void main(String[] args) {
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		
		m = change(m);
		String ans = "";
		int max = 0;
		for(String str:musicinfos) {
			String[] tmp = str.split(",");
			int a = time(tmp[0]);
			int b = time(tmp[1]);
			String c = change(tmp[3]);
			
			String check="";
			int num = b-a;
			if(c.length()>num) {
				check= c.substring(0,num);
			}else {
				for(int i=0; i<num/c.length(); i++) {
					check += c;
				}
				check += c.substring(0,num%c.length());
			}
			if(check.contains(m)&& num>max) {
				ans = tmp[2];
				max = num;
			}
		}
		System.out.println(max == 0 ? "(None)" : ans);
	}
	private static String change(String str) {
		str = str.replaceAll("C#", "H");
		str = str.replaceAll("D#", "I");
		str = str.replaceAll("F#", "J");
		str = str.replaceAll("G#", "K");
		str = str.replaceAll("A#", "M");
		
		return str;
	}
	
	private static int time(String str) {
		String[] tmp = str.split(":");
		return Integer.parseInt(tmp[0])*60+Integer.parseInt(tmp[1]);
	}
}
