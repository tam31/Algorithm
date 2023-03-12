package level1;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] arr = {"Jane", "Kim"};
		int cnt = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i].equals("Kim")) {
				cnt = i;
			}
		}
		
		System.out.println(Integer.toString(cnt));
	}

}
