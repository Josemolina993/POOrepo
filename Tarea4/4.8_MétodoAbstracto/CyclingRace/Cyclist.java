package CyclingRace;

public abstract class Cyclist {
    private int id;
    private String name;
    private int accumulatedTime = 0;

    public Cyclist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract String printType();

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAccumulatedTime() {
        return accumulatedTime;
    }

    protected void setAccumulatedTime(int accumulatedTime) {
        this.accumulatedTime = accumulatedTime;
    }

    protected void print() {
        System.out.println("Identificador = " + id);
        System.out.println("Nombre = " + name);
        System.out.println("Tiempo Acumulado = " + accumulatedTime);
    }
}
