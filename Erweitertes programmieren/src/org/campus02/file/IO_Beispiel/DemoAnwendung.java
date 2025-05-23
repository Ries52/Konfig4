package org.campus02.file.IO_Beispiel;

import java.util.ArrayList;
import java.util.Collections;

public class DemoAnwendung {
    public static void main(String[] args) {

        PersonManager1 pm = new PersonManager1();

        try {
            pm.load("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Person.txt");
        } catch (PersonLoadException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Personen> personens = pm.personen;
        Collections.sort(personens);

        for (int i = 0; i<pm.personen.size();i++){
            System.out.println(pm.personen.get(i));
        }


    }

}
