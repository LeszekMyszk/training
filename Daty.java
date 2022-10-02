package hakerrank;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Result {

	public static String timeConversion(String s) {
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat input = new SimpleDateFormat("hh:mm:ssaa");
		String output = "";
		try {
			Date date = input.parse(s);
			output = displayFormat.format(date);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return output;
	}
}

public class Daty {
	public static void main(String[] args) throws IOException {

		String s = "08:07:47PM";
		String result = Result.timeConversion(s);
		System.out.println(result);
	}
}
