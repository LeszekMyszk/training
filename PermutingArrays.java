package hakerrank;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	class Result5 {

	    /*
	     * Complete the 'twoArrays' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER k
	     *  2. INTEGER_ARRAY A
	     *  3. INTEGER_ARRAY B
	     */

	    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	        String result;
	        int min;
	        List<Integer> C=new ArrayList<Integer>();
	        java.util.Collections.sort(A);
	        java.util.Collections.sort(B);
	        java.util.Collections.reverse(B);
	        for (int i = 0; i < A.size(); i++) {
	            C.add(A.get(i) + B.get(i));}
	        java.util.Collections.sort(C);
	        min = C.get(0);
	        if (min <k) {
	            result="NO";}
	        else {result="YES";}
	        
	        return result;

	    }

	}

	public class PermutingArrays {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, q).forEach(qItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int n = Integer.parseInt(firstMultipleInput[0]);

	                int k = Integer.parseInt(firstMultipleInput[1]);

	                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                    .map(Integer::parseInt)
	                    .collect(toList());

	                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                    .map(Integer::parseInt)
	                    .collect(toList());

	                String result = Result5.twoArrays(k, A, B);

	                bufferedWriter.write(result);
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

	
	
}
