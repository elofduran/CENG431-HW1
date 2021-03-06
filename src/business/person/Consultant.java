package business.person;

public class Consultant extends Person {

    public Consultant(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + ", Name: " + this.getName() + " (" + this.getClass().getSimpleName() + ")";
    }
}
