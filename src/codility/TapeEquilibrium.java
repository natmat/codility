package codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println("TapeEquilibrium=" + te.solution(new int[] {1,2,3,4,5}));
	}

	public int solution(int[] A) {
		long sum = 0;
		for (int i : A) {
			sum += i;
		}
		int min = (int)Math.abs(2*A[0] - sum);
		long sumL = 0;
		long sumR = sum;
		int n = 1;
		for (int i : A) {
			sumL += i;
			sumR -= i;
			int diff = (int)Math.abs(sumL - sumR);
			if (min > diff) {
				min = diff;
			}
			//	 			System.out.println("L="+sumL+",sumR="+sumR+",diff="+diff+",min="+min);
			if (n == A.length-1) { break; }
			n++;
		}
		return(min);
	}
}
