package 일차5;

import java.util.ArrayList;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {

		int[] numbers = {2,1,3,4,1};
		
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                list.add(sum);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(!ans.contains(list.get(i))){
                ans.add(list.get(i));
            }
        }
        System.out.println(ans);
	}

}
