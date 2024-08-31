package Basics;

public class O04_Strings {
    public static void main(String[] args) {
        String str1 = "Java Program";
        System.out.println(str1);
        String str2 = new String("Java");
        System.out.println(str2);
        char c[] = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(c);
        System.out.println(str3);
        byte b[] = { 65, 66, 67, 68 };
        System.out.println(b);
        String str4 = new String(b);
        System.out.println(str4);

        // METHODS
        System.out.println();
        String s = " Java Program ";
        System.out.println(s);
        int l = s.length();
        System.out.println(l);
        String s2 = s.toLowerCase();
        System.out.println(s2);
        String s3 = s.trim();
        System.out.printf(s3, s3.length());
        System.out.println();
        String s4 = s.substring(3, 6);
        System.out.println(s4);
        char c5 = s.charAt(2);
        System.out.println(c5);
        int i6 = s.indexOf("a");
        System.out.println(i6);
        int i7 = s.indexOf("a", 5);
        System.out.println(i7);
        int i8 = s.indexOf("?", 5);
        System.out.println(i8);
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        String s9 = "JAVA";
        String s10 = "PYTHON";
        System.out.println(s9.compareTo(s10));

        // REG EX
        String strin1 = "ab";
        strin1 = "a";
        System.out.println(strin1.matches("[abc]"));

    }
}
