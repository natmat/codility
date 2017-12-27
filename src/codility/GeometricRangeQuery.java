package codility;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int[] solution(String S, int[] P, int[] Q) {
		final int N = S.length();
		final int M = P.length;

		int[] out = new int[M];

		int[][] dna = new int[4][N];

		// Init the first code - all other remain zero
		dna[getCode(S.charAt(0))][0] = 1;

		for (int i = 1 ; i < N ; i++) {           
			// Loop for each dna ACGT
			for (int j = 0 ; j < 4 ; j++) {               
				dna[j][i] = dna[j][i-1];
			}
			dna[getCode(S.charAt(i))][i]++;
		}

		// Debug dna array
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < 4 ; j++) {
				// System.out.print(dna[j][i] + " ");
			}
			// System.out.println();
		}
		// System.out.println();

		for (int i = 0 ; i < M ; i++) { // PQ index
			for (int j = 0 ; j < 4 ; j++) { // dna index
				if ((getCode(S.charAt(P[i])) == j) || (dna[j][P[i]] < dna[j][Q[i]])) {
					out[i] = j+1;
					break;
				}
			}
		}

		return out;
	}


	private int getCode(char c) {
		int code = 4;
		switch(c) {
		case 'A' : code = 0; break;
		case 'C' : code = 1; break;
		case 'G' : code = 2; break;
		case 'T' : code = 3; break;
		}
		return(code);
	}
}

