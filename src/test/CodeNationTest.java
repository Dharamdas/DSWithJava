package test;

import java.util.HashMap;
import java.util.Scanner;

public class CodeNationTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		int D = sc.nextInt();
		int V1 = sc.nextInt();
		int V2 = sc.nextInt();
		int T1 = sc.nextInt();
		
		int V3 = sc.nextInt();
		int V4 = sc.nextInt();
		int T2 = sc.nextInt();
		
		HashMap<Integer,Integer> addLane = new HashMap<Integer, Integer>();
		addLane.put(1, 4);
		addLane.put(2, 2);
		
		int time=0;
		for (int i=1; i<=3; i++) {
			for (int k=1; k<i; k++) {
				time = time + addLane.get(k);
			}
			time = time + 1;
			for (int ii = i; ii<3; ii++) {
				time = time + addLane.get(ii);
			}
		}
		System.out.println((time/3));
	}

}
