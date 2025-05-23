package org.campus02.file.IO_Beispiel;

public class Personen implements Comparable<Personen>{

    private String firstname;
    private String nachname;
    private String birthday;

    public Personen(String firstname, String nachname, String birthday) {
        this.firstname = firstname;
        this.nachname = nachname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Personen{" +
                "firstname='" + firstname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Personen o) {
        int comp = o.getNachname().compareTo(this.getNachname());
        if (comp ==0){
            return getFirstname().compareTo(o.getFirstname());
        }
        return comp;
    }
}
