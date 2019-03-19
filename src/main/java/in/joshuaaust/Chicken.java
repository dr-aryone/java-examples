package in.joshuaaust;

public class Chicken {
    public String name = "Fluffy";
    { System.out.println("setting field directly"); }

    public Chicken() {
        name = "Little";
        System.out.println("setting field from constructor");
    }
}
