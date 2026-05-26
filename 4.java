import java.util.*;
class StringConstructorsDemo {
public static void main(String[] args) {
String s1 = new String();
System.out.println("Empty String: " + s1);
String s2 = new String("Hello");
System.out.println("From String: " + s2);
char ch[] = {'J', 'A', 'V', 'A'};
String s3 = new String(ch);
System.out.println("From Char Array: " + s3);
byte b[] = {65, 66, 67};
String s4 = new String(b);
System.out.println("From Byte Array: " + s4);
String s5 = new String(ch, 1, 2);
System.out.println("Partial Char Array: " + s5);
}
}