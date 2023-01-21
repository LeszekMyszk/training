package Interview.Week1;

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

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int l = arr.size();
        double p = 0;
        double u = 0;
        double o = 0;

        for (int i=0; i<l; i++){
            if (arr.get(i) >0) {
                p++;
            } else if (arr.get(i) < 0){
                u++;
            } else {
                o++;
            }
        }

        System.out.println(String.format("%.6f", p/l));
        System.out.println(String.format("%.6f", u/l));
        System.out.println(String.format("%.6f", o/l));
    }





    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
                */

        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, -1, -2));


        PlusMinus.plusMinus(arr);

        //bufferedReader.close();
    }
}

