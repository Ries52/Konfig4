package Example;

public class Berechnung {


    public double berechnungRechteckFläche(double width,double height){
        return width * height;
    }

    public double berchnungRechteckUmfang(double width,double height){
        return 2* (width + height);
    }

    public double berechnungKreisFläche(double radius){
        return Math.PI * radius * radius;
    }
    public double berechnungKreisUmfang(double radius){
        return 2 * Math.PI * radius;
    }
    public double berechnungDreieckFläche(double side){
        return Math.sqrt(3) / 4 * side * side;
    }
    public double berechnungDreieckUmfang(double side){
        return 3 * side;
    }
}
