abstract class GeneralObject {
    protected String name;
    protected int id;
    public GeneralObject(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract void displayDetails();
    public double computeValue(double parameter) {
        return parameter * 1.5;
    }
}
