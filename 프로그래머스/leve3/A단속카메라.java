package leve3;
import java.util.*;
public class A단속카메라 {

	public static void main(String[] args) {
		int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
		
		//2.2 도착점 기준으로 정렬하기
		Arrays.sort(routes, (o1,o2)->{
			if(o1[1]==o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1]-o2[1];
		});
		
		//3. 카메라 수 구하기
		//첫 데이터의 도착점(카메라)을 end로 잡아기때문에 ans=1
		int ans=1;
		int end = routes[0][1];
		for(int i=1; i<routes.length; i++) {
			//출발지가 카메라의 위치에 벗어나 있을경우
			if(routes[i][0]>end) {
				ans +=1;
				end = routes[i][1];
			}
		}
		System.out.println(ans);
	}
}
