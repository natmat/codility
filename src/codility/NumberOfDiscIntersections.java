package codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class NumberOfDiscIntersections {
	public NumberOfDiscIntersections() {
	}

	public static void main(String args[]) {
//		int actuals[] = {1,5,2,1,4,0};
//		int actuals[] = {1,1,1};
		int actuals[] = {1, 2147483647, 0};
		
		int expecteds = solution(actuals);
		System.out.println(Arrays.toString(actuals) + "=" + expecteds);
	}

	public static int solution(int[] A) {
		if (A.length < 2) return(0);

		int sum = 0;
		Pair events[] = new Pair[A.length];
		for (int i = 0 ; i < A.length ; i++) {
			long start = Math.max(0, i-A[i]);
			long stop  = Math.min(A.length-1, i+A[i]);
			events[i] = new NumberOfDiscIntersections.Pair((int)start, (int)stop);
		}
		//	 		PrintPairs(events);
		Arrays.sort(events);
		//	 		PrintPairs(events);

		int count[] = new int[A.length];
		for (int i = 0 ; i < events.length ; i++) {
			Pair p = events[i];
			sum += count[p.start];
			for (int j = p.start ; j <= p.stop ; j++) {
				count[j] += 1;
			}
		}

		return(sum);
	}

	static void PrintPairs(Pair e[]) {
		for (Pair p : e) {
			System.out.print(p.start + "-" + p.stop + " ");
		}
		System.out.println();
	}

	static class Pair implements Comparable<Object> {
		int start, stop;
		public Pair(int a, int b) {
			start = a ; stop = b;
		}
		@Override
		public int compareTo(Object o) {
			Pair op = (Pair)o;
			if (this.start == op.start) {
				if (this.stop == op.stop) return(0);
				else if (this.stop < op.stop) return(-1);
				else return(1);
			}

			else if (this.start < op.start) return(-1);
			else return(1);
		}
	}
}

