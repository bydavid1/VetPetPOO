package Helpers;

public abstract class Identifiable {
    private int id;

    public Identifiable() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
