package org.campus02.file.uebungfile;

import java.io.File;

public class UebungFile {
    public static void main(String[] args) {
        File file = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\lorem-ipsum.txt");
        File file2 = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\er hörte leise.txt");
        File file3 = new File("C:\\UebenProgrammieren\\sub-ordner\\dokumente");
        File file5 = new File("C:");
        System.out.println(printAndGetSize(file));
        System.out.println(printAndGetSize(file2));
        System.out.println(printAndGetSize(file3));
        System.out.println(printAndGetSize(file5));

    }

    public static long printAndGetSize(File f){

        if (f.isFile()) {
            return f.length();
        }
        long length = 0;
        for (File fd : f.listFiles()){
                length+= printAndGetSize(fd);
        }

        return length;

    }
}
