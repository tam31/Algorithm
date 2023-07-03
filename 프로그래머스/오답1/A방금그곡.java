package 오답1;
import java.util.*;
public class A방금그곡 {

	public static void main(String[] args) {
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		
		String ans = "";
		int max = 0;
		m = change(m);
		for(String tmp:musicinfos) {
			String[] str = tmp.split(",");
			String[] time = str[0].split(":");
			int start = Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
			
			String[] time2 = str[1].split(":");
			int end = Integer.parseInt(time2[0])*60+Integer.parseInt(time2[1]);
			
			String music = change(str[3]);
			String che = "";
			if(end-start>=music.length()) {
				for(int i=0; i<(end-start)/music.length(); i++) {
					che +=music;
				}
				che += music.substring(0,(end-start)%music.length());
			}else {
				che += music.substring(0,(end-start));
			}
			
			if(che.contains(m) && (end-start)>max) {
				max = (end-start);
				ans = str[2];
			}
			
		}
		System.out.println(ans);
	
	}
	private static String change(String tmp) {
		tmp =tmp.replaceAll("C#","H");
		tmp =tmp.replaceAll("D#", "J");
		tmp =tmp.replaceAll("F#", "K");
		tmp =tmp.replaceAll("G#", "L");
		tmp =tmp.replaceAll("A#", "M");
		return tmp;
	}
}
