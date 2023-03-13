package Day3.Ex1;

public class Xe {
    private int id;
    private String name;
    private String color;

    public Xe() {
    }

    @Override
    public String toString() {
        return "Xe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Xe(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
