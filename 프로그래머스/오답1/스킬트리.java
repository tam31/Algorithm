package 오답1;
import java.util.*;
public class 스킬트리 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int ans = 0;
		int n = skill_trees.length;
		for(int i=0; i<n; i++) {
			String[] a = skill_trees[i].split("");
			List<Character> list = new LinkedList<>();
			for(int j=0; j<a.length; j++) {
				if(skill.contains(a[j])) {
					list.add(skill_trees[i].charAt(j));
				}
			}
			boolean check = true;
			for(int j=0; j<list.size(); j++) {
				if(list.get(j)!=skill.charAt(j)) {
					check = false;
					break;
				}
			}
			if(check) {
				ans +=1;
			}
			
		}
		System.out.println(ans);
	}

}
