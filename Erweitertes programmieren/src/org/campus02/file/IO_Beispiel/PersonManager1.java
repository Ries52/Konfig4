package org.campus02.file.IO_Beispiel;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManager1 {
    protected ArrayList<Personen> personen;

    public PersonManager1() {
        this.personen =new ArrayList<>();
    }
    public void load(String path) throws PersonLoadException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); //nicht weglöschen (Kopfzeile/Überschrift wird gelöscht)

            while ((line = br.readLine()) != null) {

                String[] colmus = line.split(",");

                if (line.isEmpty()){
                    continue;
                }

                if (colmus.length != 3){
                    throw new PersonLoadException("Fehler in Zeile: "+line);
                }

                Personen p = new Personen(colmus[0], colmus[1], colmus[2]);
                personen.add(p);

            }


        } catch (FileNotFoundException e) {
            throw new PersonLoadException("Datei nicht gefunden",e);
        } catch (IOException e) {
            throw new PersonLoadException("Datei nicht gefunden",e);
        }
    }


    public ArrayList<Personen> getPersonen() {
        return personen;
    }






    public void bufferedreader() throws PersonLoadException {
        List<String> persons = new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader("C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Person.txt"))) {

            for (int i = 0;i< br.read();i++){
            persons.add(br.readLine());
            }
            System.out.println(persons);

        } catch (FileNotFoundException e) {
            throw new PersonLoadException("Datei nicht gefunde"+"C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Person.txt",e);

        } catch (IOException e) {
            throw new PersonLoadException("IOException: "+"C:\\UebenProgrammieren\\sub-ordner\\dokumente\\Person.txt",e);
        }

    }


}
