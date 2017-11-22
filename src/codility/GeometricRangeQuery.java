package codility;

// you can also use imports, for example:
import java.util.*;
import java.lang.String.*;
import java.math.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int[] solution(String S, int[] P, int[] Q) {
		int M = P.length;
		int[] out = new int[M];
		Arrays.fill(out, 5);

		int i, j, c;
		for (i = 0 ; i < S.length() ; i++) {
			c = getValue(S.charAt(i));
			for (j = 0 ; j < M ; j++) {
				if (out[j] == 1) {
					continue;
				}

				if ((i >= P[j]) && (i <= Q[j])) {
					if (c < out[j]) {
						out[j] = c;
					}
					if (out[j] == 1) {
						break;
					}
				}
			}            
		}        
		return(out);
	}

	int getValue(char c) {
		switch(c) {
		case 'A': return 1;
		case 'C': return 2;
		case 'G': return 3;
		case 'T': return 4;
		}
		return(5);
	}
}
