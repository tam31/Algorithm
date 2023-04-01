package leve2;
import java.util.*;
public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		
		int n = numbers.length;
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(arr, (o1,o2)->{
        	return (o1+o2).compareTo(o2+o1);
        });
        System.out.println(Arrays.toString(arr));
        String ans = "";
        for(int i=n-1; i>=0; i--){
            ans += arr[i];
        }
        

	}

}
