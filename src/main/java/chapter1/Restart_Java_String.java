package chapter1;
/*
* @author 70pice
* @Description java基础对于String的一些回顾
* */


public class Restart_Java_String {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        System.out.println(s1 ==s2);

        String s4 = new String("abc");
        String s3 = "abc";
        System.out.println(s3 == s4);

        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println(s5 == s6);

        String s13 = "abc";
        String s14 =  new String("abc").intern();
        System.out.println(s13 == s14);

    }

}
