package CyclingRace;

public class TimeTrialist extends Cyclist {
    private double maxSpeed;

    public TimeTrialist(int id, String name, double maxSpeed) {
        super(id, name);
        this.maxSpeed = maxSpeed;
    }

    protected double getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void print() {
        super.print();
        System.out.println("Velocidad máxima = " + maxSpeed);
    }

    protected String printType() {
        return "Es un contrarrelojista";
    }
}
