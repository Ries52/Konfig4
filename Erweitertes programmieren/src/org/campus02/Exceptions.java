package org.campus02;

public class Exceptions {
    public static void main(String[] args) {


        try {
            System.out.println(8/4);
            System.out.println(2/0);
            System.out.println(6/2);
        } catch (Exception e) {
            System.out.println("Fehler");
        }finally {
            System.out.println("Finally: Aufräumen");
        }
        try {
            doSomthing();
        } catch (Exception e) {
            System.out.println("Fehler2");
        }
        System.out.println("Programm Ende");

    }
    private static void doSomthing() throws Exception{
        System.out.println("Do something");
        throw new Exception("Fehler");
    }


}
