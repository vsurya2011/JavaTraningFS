
// public class Sixthday {
    
// }
// String 
// String methods
// length()
// isBlank()
// isEmpty()
import java.lang.Package;
public class Sixthday{
    public static void main(String[] args) {
        String str1= new String("Hello");
        String str2="World";
        System.out.println(str1+" "+str2);  
        // length
        System.out.println(str1.length()); 
        // isBlank
        // returns true if the string is empty or contains only white space codepoints
        // otherwise flase
        String str3=" t";
    System.out.println(str3.isBlank()); 
    
        // isEmpty
        // it returns true when the length of the string is 0 otherwise false
        // to check the spaces
        String s2="";
        System.out.println(s2.isEmpty());

        // compare heap using new keyword to create a obj
        String s1= new String("ABC");
        String s3=new String("ABC");
        if(s1==s3){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("s1 and s3 are not equal");
        }
        // using litrels SCP
        String str5="abc";
        String str6="abc";
        if(str5==str6){
            System.out.println("It is equal");
        }else{
            System.out.println("It is not equal");
        }

        // equals method
        String ss1="abc";
        String ss2="adc";
        System.out.println(ss1.equals(ss2));    //if same true else flase

        // equalsIgnorecase
        String st1="abc";
        String st2="Abc";
        System.out.println(st1.equalsIgnoreCase(st2)); //true

        // compareTo()
        String a1="abc";
        String a2="bc";
        System.out.println(a1.compareTo(a2)); /*0 if both are same else return using ASII value
        else return negative if a1<a2, else return positive a1>a2*/

        // compareToIgnoreCase()
        String b1="abc";
        String b2="abc";
        System.out.println(b1.compareTo(b2));

        // startswith()
        String a="Hello World";
        System.out.println(a.startsWith("A"));

        // startsWith(prefix,fromIndex
        System.out.println(a.startsWith("llo",2));

        // endsWith()
        System.out.println(a.endsWith("ld"));

        // contentEquals()
        String c="Hello";
        System.out.println(c.contentEquals("Hello"));

        //contains()
        System.out.println(c.contains("World"));

        // indexOf()
        String s="Hello Chennai";
        System.out.println(s.indexOf('e')); //1st occurrence
        System.out.println(s.indexOf("e",5)); //search from index 5

        // lastIndexOf()
        System.out.println(s.lastIndexOf('n')); //last occurrence

        // substring()(strat index and end index)
        String str="my World";
        System.out.println(str.substring(3,8));
        System.out.println(str.substring(0,8));


  }
}