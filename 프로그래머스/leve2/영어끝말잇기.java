package leve2;

import java.util.*;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] ans = {0,0};
		int n =2;
		
		ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        while(cnt<words.length){
            int num = cnt % n;
            String check = words[cnt];
            //System.out.println(check);
            if(!list.contains(check)){
                if(cnt != 0){
                    String check2 = words[cnt-1];
                    if(check2.charAt(check2.length()-1) 
                       == check.charAt(0)){
                    	                       
                    }else{
                    	//System.out.printf("%s %s",check2.charAt(check.length()-1), check.charAt(0));
                        ans[0] = num+1;
                        ans[1] = cnt/n+1;
                        break;
                    }
                   
                }
                cnt +=1;
                list.add(check);
            }else{
                ans[0] = num+1;
                ans[1] = cnt/n+1;
                break;
            }
        }
        
        System.out.println(Arrays.toString(ans));    
	}

}
