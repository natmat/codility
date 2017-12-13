package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Triangle {
	private static ArrayList<Integer> al;
	
	public static void main(String[] args) {
		int[] actuals = {10,2,5,1,8,20};
		System.out.println(solution(actuals));
	}

	public static int solution(int[] A) {
		// Convert array to ArrayList
		Integer[] a2 = Arrays.stream(A).boxed().toArray(Integer[]::new);
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(a2));
		
		sort();
		unique();

		for (int p = 0  ; p < al.size() ; p++) {
			for (int q = p+1  ; q <al.size() ; q++) {
				for (int r = q+1  ; r < al.size() ; r++) {
					if ((al.get(p) + al.get(q) > al.get(r)) &&
							(al.get(q) + al.get(r) > al.get(p)) &&
							(al.get(r) + al.get(p) > al.get(q))) {
						return(1);
					}
				}
			}		
		}
		return(0);
	}

	static void sort() {
		for (int i = 0 ; i < al.size()-1 ; i++) {
			for (int j = 1 ; j < al.size()-i ; j++) {
				if (al.get(j-1) > al.get(j)) {
					int tmp = al.get(j);
					al.set(j, al.get(j-1));
					al.set(j-1, tmp);
				}
			}
		}
	}

	static void unique() {
		Iterator<Integer> it = al.iterator();
		Integer prev = al.get(0);
		while (it.hasNext()) {
			Integer i = it.next();
			if (i.equals(prev)) {
				it.remove();
			}
			else {
				prev = i;
			}
		}
	}
}

