package Strings;

public class StringPractice {

    // String literal
    String movie1 = "Harry Potter and the Sorcerer's Stone";
    // new Keyword
    String movie2 = new String("Harry Potter and the Chamber of Secrets   ");

    String movie3 = "";
    String movieName = "Harry Potter and the Prisoner of Azkaban ";

    public static void main(String[] args) {
        StringPractice movie = new StringPractice();

        System.out.println("PART 1- " + movie.movie1);
        System.out.println("PART 2- " + movie.movie2);

        System.out.println("COMPARE TO=> "+ movie.movie1.compareTo(movie.movie2));

        System.out.println("CONCAT => "+movie.movie1.concat(movie.movie2));

        System.out.println("EQUALS => "+movie.movie1.equals(movie.movie2));
        String words[]=movie.movie1.split("Chamber");
        System.out.println("SPLIT => ");
        
        
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("LENGTH => "+movie.movie1.length());
        // System.out.println(movie.movie1.replace(movie.movie3, movie.movieName));
        System.out.println("REPLACE => "+movie.movieName.replace('r', 'p'));

        String s1=new String("hello");
        String s2="hello";

        String s3=s1.intern();//returns string from pool, now it will be same as s2
        System.out.println("INTERN => "+s3);
        System.out.println("Compare two string => ");
        System.out.println(s1==s2);//false because reference variables are pointing to different instance
        System.out.println(s2==s3);

        System.out.println("SUBSTRING =>");
        System.out.println(movie.movie1.substring(21));
        System.out.println(movie.movie1.substring(6, 12));

        System.out.println("CHAR AT => "+ movie.movie1.charAt(15));

        System.out.println("LOWERCASE => "+movie.movie1.toLowerCase());
        System.out.println("UPPERCASE => "+movie.movie2.toUpperCase());

        System.out.println("CONTAINS => "+movie.movieName.contains("Potter"));

        System.out.println("INDEX OF =>");
        System.out.println(movie.movie2.indexOf("and", 10));
        System.out.println(movie.movie1.indexOf('S', 5));

        System.out.println("TRIM => "+movie.movie2.trim());

        System.out.println("STARTS WITH =>");
        System.out.println(movie.movie2.indexOf("Chamber", 0));
        System.out.println(movie.movie2.startsWith("Chamber", 21));
        System.out.println(movie.movieName.startsWith("Prisoner"));

        System.out.println("ENDS WITH => "+movie.movie1.endsWith("Stone"));

        System.out.println("LAST INDEX OF => "+movie.movie2.lastIndexOf("Potter", 0));

        String one="Sneha";
        String two="SnEhA";
        System.out.println("EQUALS IGNORE CASE => "+one.equalsIgnoreCase(two));
        System.out.println("COMPARE TO IGNORE CASE => "+one.compareToIgnoreCase(two));

        char cArr[]={'J','a','v','a',' ','S','t','r','i','n','g','s'};
        String sub="";
        System.out.println("VALUE OF => "+sub.valueOf(cArr,5,6));

        String phone1="123_456_7890";
        String phone2="abc_xyz";
        String phoneRegex="\\d{3}_\\d{3}_\\d{4}";

        System.out.println("MATCHES => ");
        System.out.println(phone1.matches(phoneRegex));
        System.out.println(phone2.matches(phoneRegex));

        System.out.println("STRING TO ARRAY=> ");
        char[] chArr=movie.movie1.toCharArray();
        for (char c : chArr) {
            System.out.println(c);
        }
        String arrToString=new String(cArr);
        System.out.println("ARRAY TO STRING =>"+arrToString);

    // String Builder
    StringBuilder str1=new StringBuilder("Harry Potter ");
    System.out.println("\nSTRING BUILDER = "+str1);
    str1.append("and the Goblet of Fire");
    System.out.println("APPEND = "+str1);
    str1.insert( 13,"and the Order of the Phoenix ");
    System.out.println("INSERT = "+str1);
    str1.replace(13, str1.length(), "and the Half Blood Prince");
    System.out.println("REPLACE = "+str1);
    str1.delete(13, str1.length());
    System.out.println("DELETE = "+str1);
    System.out.println("CAPACITY = "+str1.capacity());
    System.out.println("REVERSE = "+str1.reverse());
    System.out.println("ENSURE CAPACITY =");
    str1.ensureCapacity(25);
    System.out.println(str1.capacity());
    str1.reverse();
    System.out.println("CHAR AT = "+str1.charAt(6));
    System.out.println("SUBSTRING = "+str1.substring(6, 12));
    System.out.println("Substring begin index = "+str1.substring(6));
       
    StringBuffer str2=new StringBuffer("Harry Potter and the Deathly Hallows -I");
    System.out.println("\nSTRING BUFFER = "+str2);
    // same methods as String builder
    }

}
// String methods
    // concat(), equals(), compareTo(),
    // split(), length(), replace(), 
    // intern(), substring(),  charAt(),
    // contains(),toLowerCase(),toUpperCase(),
    // indexOf(), trim(), startsWith(),
    // endsWith(),lastIndexOf(),equalsIgnoreCase(),
    // compareToIgnoreCase(),valueOf(), matches(regex)
    // String to Array & vice versa

