package Interview.Week1;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class XORStrings2 {

    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        //Scanner in = new Scanner(System.in);
        //s = in.nextLine();
        //t = in.nextLine();
        s="100101";
        t="011100";
        System.out.println(stringsXOR(s, t));

    }

}



