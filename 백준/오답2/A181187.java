package ¿¬½À;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A181187 {

	public static void main(String[] args) {
		int r1 = 2;
		int r2 = 3;
		
		for(int i=1; i<=r2; i++) {
			int a = (int)Math.floor(Math.sqrt(Math.pow(r2, 2)-Math.pow(i, 2)));
			int b = (int)Math.ceil(Math.sqrt(Math.pow(r1, 2)-Math.pow(i, 2)));
			
			System.out.println(a-b);
		}
	}

}
