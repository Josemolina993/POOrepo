package CyclingRace;

public class Sprinter extends Cyclist {
    private double averagePower;
    private double averageSpeed;

    public Sprinter(int id, String name, double averagePower, double averageSpeed) {
        super(id, name);
        this.averagePower = averagePower;
        this.averageSpeed = averageSpeed;
    }

    protected double getAveragePower() {
        return averagePower;
    }

    protected void setAveragePower(double averagePower) {
        this.averagePower = averagePower;
    }

    protected double getAverageSpeed() {
        return averageSpeed;
    }

    protected void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    protected void print() {
        super.print();
        System.out.println("Potencia promedio = " + averagePower);
        System.out.println("Velocidad promedio = " + averageSpeed);
    }

    protected String printType() {
        return "Es un velocista";
    }
}
