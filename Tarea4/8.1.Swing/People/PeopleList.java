package People;

import java.util.Vector;

public class PeopleList {
    private Vector<Person> peopleVector; 

    public PeopleList() {
        peopleVector = new Vector<>(); 
    }

    public void addPerson(Person p) {
        peopleVector.add(p);
    }

    public void deletePerson(int i) {
        peopleVector.removeElementAt(i);
    }

    public void clearList() {
        peopleVector.removeAllElements();
    }
}
