package codility;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(CountDiv.solution(6, 11, 2));
		System.out.println(CountDiv.solution(10,10, 5));
		System.out.println(CountDiv.solution(10,10, 7));
		System.out.println(CountDiv.solution(10,10, 20));
	}

	public static int solution(int A, int B, int K) {
		int n = 0;
		if (A == 0) n++;
		if (K>B) return(n);
		
		int first;
		if (A == K) {
			first = A;
		}
		else {
			first = (int)(A/K)*K;
			if (first < A) first += K;
		} 

		if ((first >= A) && (first <= B)) n++;

		int diff = B-first;
		n += (diff/K);

		return(n);
	}
}


