package lt.vtvpmc.ems.akademijait.simmika;

import java.util.Locale;
import java.util.StringTokenizer;

public class JavaStrings {
    private static String hello = "Hello World!";
 public static void main(String[] args) {
        System.out.println((hello + hello));
//        String specialChar = "\r \n \' \" \\";
        //    \r kurseri parvesk i pradzia return
//     String specialChar = "hello + \r + hello";
     String specialChar = "hello + \n + \t \t hello";
     System.out.println(specialChar);

     String str1 = "Test12345";
     String str2 = "TEST12345";
     boolean result = str1.equalsIgnoreCase(str2);
     System.out.println(result);

     String str1lang = "Taki";
     String srt2lang = "TAKI";
     System.out.println(str1lang.equalsIgnoreCase(srt2lang));
     Locale locale = Locale.forLanguageTag("tr TR");
     System.out.println(str1lang.toLowerCase(locale).equals(srt2lang));

     String stringObject = new String ( "hello");
     String st = "Hello!";
     System.out.println(stringObject.equals(st));


     System.out.println("1" + 1);
     System.out.println((1 + "1" + 1));
     System.out.println(1 + 1 + "1");
     System.out.println("1" + 1 +1 );   // !!! stringa surades tai viska pakeicia i stringa

     String one = "Katinas";
     String two = "Katinas!";
     System.out.println(one == two); // taip lyginti stringu negalima. Jis lygina tik objektu nuorodas.

     String frase = "This is random String";
     String apper = frase.toUpperCase();
     String lower = frase.toLowerCase();
     Boolean contains = frase.contains("random");

     System.out.println(contains);
     System.out.println(apper);
     System.out.println(lower);


     int i = frase.indexOf('i');
     System.out.println(i);


     String a = "alpha";
     String b = "alpha";
     String c = new String("alpha");

     System.out.println(a.equals(b) && b.equals(c));

     StringBuilder Sb = new StringBuilder();
     Sb.append("hello ");
     Sb.append("hello Wrold");
     System.out.println(Sb);

     String lazyString = "Labas pasauli, hello world!";
     StringTokenizer stringTokenizer = new StringTokenizer(lazyString);
     while (stringTokenizer.hasMoreTokens()) {
         System.out.println(stringTokenizer.nextToken());
     }


     int i1 = 10 ;
     System.out.println(Math.cos(i1));


     boolean [] bits = new boolean [0];








    }
}

