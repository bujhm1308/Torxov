package Proverka;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 14.03.2018.
 */
public class Proverka1 {
    public static void main(String[] args) {
        String str = new String();
        Scanner in = new Scanner(System.in);
        str=in.next();
        Pattern email = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$", Pattern.CASE_INSENSITIVE);
        Pattern data = Pattern.compile("^([0-9]{1,2})\\-([0-9]{1,2})\\-([0-9]+)$", Pattern.CASE_INSENSITIVE);
        Pattern time = Pattern.compile("^([0-9]{1,2})\\-([0-9]{1,2})\\-([0-9]+)([T])([0-9]{1,2})\\:([0-9]{1,2})\\:([0-9]{1,2})$", Pattern.CASE_INSENSITIVE);
        Matcher m = email.matcher(str);
        int point=(m.matches()?1:0);
        switch (point) {
            case (1):
            {System.out.println("емэил");}

        }
        m = data.matcher(str);
        point=(m.matches()?1:0);
        switch (point) {
            case (1):
            {System.out.println("дата");}

        }
        m = time.matcher(str);
        point=(m.matches()?1:0);
        switch (point) {
            case (1):
            {System.out.println("время");}

        }
        System.out.println(str);
    }
}
