package codility;

import java.util.Arrays;

public class GeometricRangeQuery {
	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		
		int[] answer = solution(S, P, Q);
		for (int i : answer) { System.out.println(i + " "); } System.out.println();
	}

	public static int[] solution(String S, int[] P, int[] Q) {
		int[] out = new int[P.length];
		Arrays.fill(out, 5);
		int[] end = new int[P.length];
		Arrays.fill(end, 1);

		for (int i = 0 ; i < S.length() ; i++) {
			char c = S.charAt(i);
			for (int n = 0 ; n < P.length ; n++) {
				if ((out[n] != 1) && (P[n] <= i) && (i <= Q[n])) {
					out[n] = Math.min(out[n], dnaToInt(c));
				}
			} 
			if (Arrays.equals(out, end)) break;
		}
		return(out);
	}

	static int dnaToInt(char c) {
		int out = 5;
		switch(c) {
		case 'A': out = 1; break;
		case 'C': out = 2; break;
		case 'G': out = 3; break;
		case 'T': out = 4; break;
		}
		return(out);
	}
}
