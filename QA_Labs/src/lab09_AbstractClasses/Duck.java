package lab09_AbstractClasses;

public class Duck extends Bird {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeNest() {
        System.out.println(getName() + " the duck eaves a reed nest by the water.");
    }

}
