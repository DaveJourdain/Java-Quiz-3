package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;


    public Lab() {
        this(null);

    }

    public Lab(String labName) {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "name='" + name + '\'' +
                '}';
    }
}