package codility;

public class OddOccurrencesInArray {

	public static void main (String[] args) {
		OddOccurrencesInArray oddOccurencesInArray = new OddOccurrencesInArray();
		int[] data = new int[] {1,1,2,2,3};
		System.out.println("Solution=" + oddOccurencesInArray.solution(data)); //N=10
	}

    public int solution(int[] A) {
    	int xorElements = 0;
    	for (int a : A) {
    		xorElements ^= a;
    	}
    	return(xorElements);
    }
}
