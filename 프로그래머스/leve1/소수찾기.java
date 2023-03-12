package level1;

public class 소수찾기 {

	public static void main(String[] args) {
		
		int n = 10;
		int cnt = 0;
        boolean[] data = new boolean[1000001];
        for(int i=2; i<=Math.sqrt(1000001); i++){
            if(data[i] == true){
                continue;
            }
            for(int j=i*i; j<=1000000; j+=i){
                data[j] = true;
            }

        }
        for(int i=2; i<=n; i++) {
        	if(!data[i]) {
        		cnt +=1;
        	}
        }
        System.out.println(cnt);
        
	}

}
