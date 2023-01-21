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

class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        Collections.sort(a);
        System.out.println(a);
        int lonely = 0;
        int i=0;
             if (a.size()==1) {
            lonely=a.get(0);
        } else {
            aa:
            for (i=0; i<a.size()-1; i=i+2){
                if (a.get(i)-a.get(i+1)!= 0) {
                    lonely=a.get(i);
                    break aa;
                } else {
                    lonely=a.get(a.size()-1);
                }}
        }


        return lonely;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());*/

        List<Integer> a = new ArrayList<>(Arrays.asList(0, 0, 6,6,2,3,4,5,2,4,5)); // można podać dowolną listę z tylko 1 elementem bez pary
        System.out.println(a);

        int result = LonelyInteger.lonelyinteger(a);

        System.out.println(result); //ok

    }
}
