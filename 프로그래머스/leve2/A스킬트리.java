package leve2;
import java.util.*;
public class A스킬트리 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int ans = 0;
		for(String str:skill_trees) {
			if(check(skill,str)) {
				ans +=1;
			}
		}
		System.out.println(ans);
	}
	
	private static boolean check(String skill, String str) {
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(skill.contains(str.charAt(i)+"")) {
				if(cnt<skill.length() && skill.charAt(cnt)==str.charAt(i)) {
					cnt+=1;
				}else {
					return false;
				}
			}
		}
		
		return true;
	}

}
