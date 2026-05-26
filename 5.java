import java.util.*;
class StringMethodsDemo {
public static void main(String[] args) {
String s1 = "Hello Java";
String s2 = "hello java";
System.out.println("Character at index 1: " + s1.charAt(1));
char ch[] = new char[5];
s1.getChars(0, 5, ch, 0);
System.out.println("Extracted characters: " + new String(ch));
System.out.println("Equals: " + s1.equals(s2));
System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
System.out.println("Index of 'Java': " + s1.indexOf("Java"));
System.out.println("Last Index of 'a': " + s1.lastIndexOf('a'));
System.out.println("Upper Case: " + s1.toUpperCase());
System.out.println("Lower Case: " + s1.toLowerCase());
System.out.println("Replace: " + s1.replace("Java", "World"));
System.out.println("Substring: " + s1.substring(0, 5));
}
}