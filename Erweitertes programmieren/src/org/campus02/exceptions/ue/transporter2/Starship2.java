package org.campus02.exceptions.ue.transporter2;

public class Starship2 {
    private String name;
    private Transporter2 transporter2;

    public Starship2(String name) {
        this.name = name;
        this.transporter2= new Transporter2();
    }
    public void beamUP(String person, String from){
        try {
            transporter2.beam(person,from,name,true);
        }catch (TransporterMalfunctionException2 e) {

            e.printStackTrace();
        }finally {
            transporter2.shutdown2();
        }
    }
}
