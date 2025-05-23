package org.campus02.file.objektoutputdemo;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {

        Person p= new Person("Susi","Sorglos",1);
        Person p2 = new Person("Max","Mustermann",2);

        FileOutputStream fos = new FileOutputStream("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\peson.txt");
        BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fos);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        objectOutputStream.writeObject(p);
        objectOutputStream.writeObject(p2);
        objectOutputStream.writeObject(null);

        objectOutputStream.flush();
        objectOutputStream.close();


    }
}
