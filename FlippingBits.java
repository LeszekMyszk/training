package hakerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class Result2 {

	public static long flippingBits(long n) {
		/*
		 * the simplest way to change bits (1->0 and 0->1) is just to minus one number
		 * from max binary, for example: binary: 1111 - 0010 = 1101 decimal: 15 - 2 = 13
		 */
		long maxi = 4294967295L;
		long rozn = maxi - n;
		return rozn;
	}

}

public class FlippingBits {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				long n = Long.parseLong(bufferedReader.readLine().trim());

				long result = Result2.flippingBits(n);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
