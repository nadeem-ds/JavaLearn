package nad;

public class StringLearn {
    public  static  void main(String args[]){
        System.out.println("String Learn");

        //string
        String str1 = "Nadeem";
        String str11 = "Nadeem";
        String str2 = new String("Nadeem");
        String str3 = new String("NAdeem");

        System.out.println("Check the equality of string "+(str1==str11));

        //string method
        //1. length
        String Str2 = "Master of game";
        System.out.println(str2.length());
        //2. toUpperCase
        String Str3 = "Master of game";
        System.out.println(str2.toUpperCase());
        //3.trim
        String Str4 = "Master of game";
        System.out.println(str2.toLowerCase());
        //4.subString(int begin)
        String Str5 = "Master of game";
        System.out.println(Str5.substring(1));
        //5.subString(int begin,int end)
        String Str6 = "Master of game";
        System.out.println(Str6.substring(1,6));
        //6.replace
        String Str7 = "Master of game";
        System.out.println(Str7.replace("game","begin"));
        //7.startWith(String S)
        String Str8 = "Master of game";
        System.out.println(Str8.startsWith("Ma"));
//        //8. end(String S)
        String Str9 = "Master of game";
        System.out.println(Str9.endsWith("me"));
//        //9.charAt(int index)
        String Str10 = "Master of game";
        System.out.println(Str10.charAt(10));
//        //10.indexOf(String S)
        String Str11 = "Master of game";
        System.out.println(str11.indexOf("m"));
//        //11. lastIndexOf(String S)
        String Str12 = "Master of game";
        System.out.println(Str12.lastIndexOf("er"));
//        //12. boolean equal(String S)
        String Str13 = "Master of game";
        System.out.println(Str13.equals("Master of game"));
//        //13. boolean equalIgnore(String S)
        String Str14 = "Master of game";
        System.out.println(Str14.equalsIgnoreCase("master OF GAMe"));
//        //14. int compareTo(String S)
        String Str15 = "Master of game";
        System.out.println(Str15.compareTo("NAdeem")); //return -1 if not compare
//        //15. String valueOf(int i)
        String Str16 = "Master of game";
        System.out.println(Str16.valueOf(9));

        String str = "Hello World";
        boolean contains = str.contains("World"); // true
        System.out.println(contains);

        String str19 = "  Hello  ";
        String trimmedStr = str19.trim(); // "Hello"
        System.out.println(trimmedStr);

        String str20 = "Hello";
        String str21 = " World";
        String concatenated = str20.concat(str21); // "Hello World"
        System.out.println(concatenated);
    }
}
