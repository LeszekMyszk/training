package hakerrank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Result1 {

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		List<Integer> result = new ArrayList<>();
		for (int q = 0; q < queries.size(); q++) {
			int a = 0;
			for (int s = 0; s < strings.size(); s++) {
				if (queries.get(q).equalsIgnoreCase(strings.get(s))) {
					a = a + 1;
				}
			}
			result.add(a);
		}
		return result;
	}

}

public class SparseArrays {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(toList());

		int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(toList());

		List<Integer> res = Result1.matchingStrings(strings, queries);

		bufferedWriter.write(res.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
