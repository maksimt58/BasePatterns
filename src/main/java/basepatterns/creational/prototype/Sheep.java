package basepatterns.creational.prototype;

public class Sheep implements Copyable {
    private int id;
    private String name;

    public Sheep(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public Object copy() {
        Sheep sheepDolly = new Sheep(id, name);
        return sheepDolly;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
