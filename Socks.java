package hakerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {
	public static int sockMerchant(int n, List<Integer> ar) {

		int pairs = 0;
		List<Integer> br;
		br = ar.stream().distinct().collect(Collectors.toList());
		System.out.println("Values: " + br);

		for (int color : br) {
			pairs += (ar.stream().filter(v -> v == color).count() / 2);
			System.out.println("Count: " + ar.stream().filter(v -> v == color).count());
			System.out.println("Color: " + color);
		}

		return pairs;
	}

}

public class Socks {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Result.sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
