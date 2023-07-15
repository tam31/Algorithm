package leve2;

public class A모음사전 {
	static String[] arr = {"A","E","I","O","U"};
    static int cnt = 0;
    static int num = 0;
	public static void main(String[] args) {
		String word = "AAAAE";
		
		func("",word);
		System.out.println(cnt);
	}
	static private void func(String a,String word){
        //System.out.println(a+" "+num);
        if(a.equals(word)){
            cnt = num;
            return;
        }
        if(a.length()==5){
            return;
        }
        
        for(int i=0; i<5; i++){
            num+=1;
            func(a+arr[i],word);
            
        }
    }
}