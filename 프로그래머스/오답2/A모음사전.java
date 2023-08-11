package 오답2;
import java.util.*;
public class A모음사전 {
	static int ans = 0;
    static int cnt = 0;
    static char[] list = {'A', 'E', 'I', 'O', 'U'};
	public static void main(String[] args) {
		String word = "AAAAE";
		
		func(word,"");
        System.out.println(ans);
    }
    
    private static void func(String word, String str){
    	if(str.equals(word)) {
                ans = cnt;
        }
        
        if(str.length()>=5){
            return;
        }
        
        for(int i=0; i<5; i++){

            cnt ++;           
            func(word,str+list[i]);
        }
    }
}