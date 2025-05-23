package org.campus02.exceptions.ue.transporter2;



public class Transporter2 {
    public void beam(String person,String from,String to,boolean urgent) throws TransporterMalfunctionException2 {
        if (urgent==true&&Math.random()>0.3){
            throw new TransporterMalfunctionException2("Tramsporter ist ausgefallen");
        } else if (urgent==true&&Math.random()>0.6) {
            throw new TransporterMalfunctionException2("Transporter asgefallen Fehler2");
        } else {
            System.out.println("Transport abgeschlosse");
        }

    }
    public void shutdown2(){
        System.out.println("Shutdown / ENDED");
    }
}
