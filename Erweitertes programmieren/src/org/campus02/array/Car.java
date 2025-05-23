package org.campus02.array;

public class Car implements Sortable<Car>{
    private int prductionYear;

    private String carType;

    private int drivenKilometer;

    @Override
    public int sort(Car s) {
       if (this.getPrductionYear()== s.getPrductionYear()){
           return 0;
       }
       if (this.getPrductionYear() < s.getPrductionYear()){
           return -1;
       }
       else {
           return 1;
       }
    }

    public Car(int prductionYear, String carType, int drivenKilometer) {
        this.prductionYear = prductionYear;
        this.carType = carType;
        this.drivenKilometer = drivenKilometer;
    }

    public int getPrductionYear() {
        return prductionYear;
    }

    public void setPrductionYear(int prductionYear) {
        this.prductionYear = prductionYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getDrivenKilometer() {
        return drivenKilometer;
    }

    public void setDrivenKilometer(int drivenKilometer) {
        this.drivenKilometer = drivenKilometer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "prductionYear=" + prductionYear +
                ", carType='" + carType + '\'' +
                ", drivenKilometer=" + drivenKilometer +
                '}';
    }


}
