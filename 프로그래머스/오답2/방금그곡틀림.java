package 오답2;
import java.util.*;
public class 방금그곡틀림 {

	public static void main(String[] args) {
		String m = "ABC";
		String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
			//{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		
		m = change(m);
		String ans ="";
		int max = 0;
		for(int i=0; i<musicinfos.length; i++) {
			String[] str = musicinfos[i].split(",");
			
			int time = change2(str[1]) - change2(str[0]);
			String music = change(str[3]);
			int n = music.length();
			
			String tmp ="";
			if(n<=time) {
				for(int j=0; j<time/n; j++) {
					tmp+=music;
				}
				tmp += music.substring(0,n%time);
			}else {
				tmp += music.substring(0,time);
			}
			
			System.out.println(tmp);
			if(tmp.contains(m) && time>max) {
				ans = str[2];
				max = time;
			}
		}
		
		System.out.println(max==0 ? "(None)":ans);
		
	}
	private static String change(String str) {
		str = str.replaceAll("C#","H");
		str = str.replaceAll("D#","N");
		str = str.replaceAll("F#","M");
		str = str.replaceAll("G#","L");
		str = str.replaceAll("A#","Z");
		return str;
	}
	
	private static int change2(String str) {
		String[] tmp = str.split(":");
		int re = Integer.valueOf(tmp[0])*60+Integer.valueOf(tmp[1]);
		return re;
	}
}
