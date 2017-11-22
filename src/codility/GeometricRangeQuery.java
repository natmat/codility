package codility;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int[] solution(String S, int[] P, int[] Q) {
		final int N = S.length();
		final int M = P.length;

		// Add the index for the ACGT       
		ArrayList<Integer>[] indexList = (ArrayList<Integer>[]) new ArrayList[5];
		for (int i = 0 ; i < 5 ; i++) {
			indexList[i] = new ArrayList<Integer>();
		}

		// Add the indicies
		for (int i = 0 ; i < N ; i++) {
			indexList[getCode(S.charAt(i))].add(i);
		}   

		int[] out = new int[M];
		// Loop for the PQ arrays
		for (int i = 0 ; i < M ; i++) {
			System.out.println("P[i]=" + P[i] + ",Q[i]=" + Q[i]);
			// Loop for the indexLists
			for (int j = 1 ; j < 5 ; j++) {
				System.out.println("j=" + j);
				// Loop for each element in the indexList
				for (Integer il : indexList[j]) {
					System.out.println("il=" + il);
					if ((P[i] <= il) && (Q[i] >= il)) {
						out[i] = j;
						j = 5;
						System.out.println("break");
						break;
					}
				}
			}
		}

		return out;
	}

	private int getCode(char c) {
		int code = 5;
		switch(c) {
		case 'A' : code = 1; break;
		case 'C' : code = 2; break;
		case 'G' : code = 3; break;
		case 'T' : code = 4; break;
		}
		return(code);
	}
}
