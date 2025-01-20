package CyclingRace;

import java.util.*;

public class Team {
    private String name;
    private static double totalTime;
    private String country;
    Vector<Cyclist> cyclistList;


    public Team(String name, String country) {
        this.name = name;
        this.country = country;
        totalTime = 0;
        cyclistList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String getCountry() {
        return country;
    }

    protected void setCountry(String country) {
        this.country = country;
    }

    void addCyclist(Cyclist cyclist) {
        cyclistList.add(cyclist);
    }

    void listTeam() {
        for (int i = 0; i < cyclistList.size(); i++) {
            Cyclist c = (Cyclist) cyclistList.elementAt(i);
            System.out.println(c.getName());
        }
    }

    void findCyclist() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter cyclist name: ");
            String cyclistName = sc.next();
            for (int i = 0; i < cyclistList.size(); i++) {
                Cyclist c = cyclistList.get(i);
                if (c.getName().equals(cyclistName)) {
                    System.out.println("Cyclist found: " + c.getName());
                }
            }
        }
    }

    void calculateTotalTime() {
        for (int i = 0; i < cyclistList.size(); i++) {
            Cyclist c = (Cyclist) cyclistList.elementAt(i);
            totalTime = totalTime + c.getAccumulatedTime();
        }
    }

    void print() {
        System.out.println("Nombre del equipo = " + name);
        System.out.println("País = " + country);
        System.out.println("Tiempo total del equipo = " + totalTime);
    }
}