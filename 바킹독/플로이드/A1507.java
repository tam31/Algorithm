package 플로이드;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1507 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        int[][] copy = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(input[j]);
                copy[i][j] = map[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    if (map[j][k] == map[j][i] + map[i][k]) {
                        copy[j][k] = 0;
                    }

                    if (map[j][k] > map[j][i] + map[i][k]) {
                        System.out.println(-1);
                        System.exit(0);
                    }
                }
            }
        }

        int result = 0;

        for (int[] route : copy) {
            for (int i : route) {
                result += i;
            }
        }
        System.out.println(result / 2);
    }
}

