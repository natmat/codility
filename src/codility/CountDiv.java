package codility;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(CountDiv.solution(11,345,17));

		System.out.println(CountDiv.solution( 6, 11,  2));
		System.out.println(CountDiv.solution(10, 10,  5));
		System.out.println(CountDiv.solution(10, 10,  7));
		System.out.println(CountDiv.solution(10, 10, 10));
		System.out.println(CountDiv.solution(10, 10, 20));
		System.out.println(CountDiv.solution( 5, 10,  4));
		System.out.println(CountDiv.solution( 5, 10,  5));
		System.out.println(CountDiv.solution( 5, 10,  6));
	}

	public static int solution(int A, int B, int K) {
 		int n = 0;
		
		if (A == 0) n++;
		if (K>B) return(n);
		
		int first;
		first = (int)(A/K)*K;
		if (first < A) first += K;

		if ((first >= A) && (first <= B)) n++;

		int diff = B-first;
		n += (int)(diff/K);

		return(n);
	}
}


