package codility;

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int sum = 0;
        Pair events[] = new Pair[A.length];
        for (int i = 0 ; i < A.length ; i++) {
            int start = Math.max(0, i-A[i]);
            int stop  = Math.min(A.length, i+A[i]);
            events[i] = new Pair(start, stop);
        }
        PrintPairs(events);
        Arrays.sort(events);
        PrintPairs(events);
        
        int count[] = new int[A.length];
        for (int i = 0 ; i < events.length ; i++) {
            Pair p = events[i];
            for (int j = p.start ; j < p.stop ; j++) {
                count[i] += 1;
            }
        }
        
        return(sum);
    }
    
    void PrintPairs(Pair e[]) {
        for (Pair p : e) {
            System.out.print(p.start + "-" + p.stop + " ");
        }
        System.out.println();
    }
    
    class Pair implements Comparable<Object> {
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

