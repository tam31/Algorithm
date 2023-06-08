package leve2;
import java.util.*;
public class 단체사진찍기 {
	static char[] arr;
	static boolean[] vis;
	static String[] dt;
	static int ans;
	public static void main(String[] args) {
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};

		dt = data;
		arr = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
		vis = new boolean[8];
		ans = 0;
		dfs("",0);
		System.out.println(ans);
		
	}
	static void dfs(String line, int depth)
    {
        if(depth == 8)
        {
            if(check(line)) ans++;
            return;
        }

        // depth -> 자리(인덱스) , i -> 프렌즈
        for(int i = 0; i < 8; ++i)
        {
            //아직 줄을 서지 않은 프렌즈면 세우고 재귀
            if(!vis[i])
            {
                vis[i] = true;
                dfs(line+arr[i],depth+1);
                vis[i] = false;
            }
        }
    }
	
	static boolean check(String line)
    {
        //"N~F=0", "R~T<2"
        for(String cond : dt)
        {
            //둘사이의 거리
            int diff = (Math.abs(line.indexOf(cond.charAt(0)) - line.indexOf(cond.charAt(2))))-1;
            char sign = cond.charAt(3);
            int val = cond.charAt(4)-'0';

            if(sign == '=')
            {
                if(diff != val) return false;
            }
            else if(sign == '>')
            {
                if(diff <= val) return false;
            }
            else
            {
                if(diff >= val) return false;
            }
        }
        //걸리지지 않았다면 true
        return true;
    }
}