package business.person;

public class Employee extends Person {

    public Employee(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + ", Name: " + this.getName() + " (" + this.getClass().getSimpleName() + ")";
    }
}
