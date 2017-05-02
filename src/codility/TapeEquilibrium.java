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
		int min = Integer.MAX_VALUE;
		long sumL = 0;
		long sumR = sum;
		for (int i : A) {
			sumL += i;
			sumR -= i;
			if (0 == sumR) { break ; }
			int diff = (int)Math.abs(sumL - sumR);
			if (min > diff) {
				min = diff;
			}
//			System.out.println("L="+sumL+",sumR="+sumR+",diff="+diff+",min="+min);
		}
		return(min);
	}
}
