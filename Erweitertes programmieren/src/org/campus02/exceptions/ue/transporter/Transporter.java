package org.campus02.exceptions.ue.transporter;

public class Transporter {

    public void beam(String person,String from,String to,boolean urgent) throws TransporterMalfunctionException{
        if (urgent==true&&Math.random()<0.5){
            throw new TransporterMalfunctionException("Transporter ist ausgefallen");
        }else {
            System.out.println(person+"urede erfogreich von"+from+"nach"+to+"gebracht");
        }
    }
    public void shutdown(){
        System.out.println("SHUTDOWN");
    }
}
