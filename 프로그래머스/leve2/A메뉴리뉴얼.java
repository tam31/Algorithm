package leve2;
import java.util.*;
import java.util.Map.Entry;
public class A메뉴리뉴얼 {
	static Map<String, Integer> map;
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		
		List<String> list = new ArrayList<>();
		for(int i=0; i<orders.length; i++) {
			char[] charArray = orders[i].toCharArray();
			Arrays.sort(charArray);
			orders[i] = String.valueOf(charArray);
		}
		
		for(int i=0; i<course.length; i++) {
			map = new HashMap<>();
			int max = Integer.MIN_VALUE;
			for(int j=0; j<orders.length; j++) {
				StringBuilder sb = new StringBuilder();
				if(course[i]<=orders[j].length()) {
					combi(orders[j],sb,0,0,course[i]);
				}
			}
			
			for(Entry<String,Integer> entry : map.entrySet()){
	            max = Math.max(max,entry.getValue());
	               
	        }
	        for(Entry<String,Integer> entry : map.entrySet()){
	        	if(max >=2 && entry.getValue() == max)
	        		list.add(entry.getKey());
	        }
		}
		
		Collections.sort(list);
		String[] ans = new String[list.size()];
		for(int i=0; i<list.size();i++) {
			ans[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(ans));
		
	}
	public static void combi(String str,StringBuilder sb,int idx, int cnt, int n){
       if(cnt == n) {
           map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
           return;
        }
        
        for(int i = idx ; i<str.length();i++){
            sb.append(str.charAt(i));
            combi(str,sb,i+1,cnt+1,n);
            sb.delete(cnt,cnt+1);
        }
    }
}