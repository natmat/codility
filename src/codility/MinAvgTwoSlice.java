package codility;

public class MinAvgTwoSlice {

	public static void main (String[] args) {
		MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
		int[] A = {4,2,2,5,1,5,8};
		System.out.println(minAvgTwoSlice.solution(A));
	}

	public int solution(int[] A) {
		double avg = 10000;
		int i = 0;
		for (int j = 0 ; j < A.length-1 ; j++) {
			// System.out.println("avg="+avg+",this="+(A[j] + A[j+1])/2.0);
			if ((A[j] + A[j+1]) < 2*avg) {
				avg = (A[i] + A[j])/2.0;
				i = j;
			}            
		}
		return(i);
	}
}
