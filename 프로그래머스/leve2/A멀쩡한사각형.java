package leve2;

public class A멀쩡한사각형 {

	public static void main(String[] args) {
		long w = 8;
		long h = 12;
		
		long ans = 0;
        long x = w;
        long y = h;
        long num = gcd(x,y);
        ans = x*y - (x/num + y/num - 1)*num;
        System.out.println(ans);
    }
    private static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    } 
}