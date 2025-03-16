class Laptop extends GeneralObject {
    private String brand;
    private double processorSpeed;
    public Laptop(String name, int id, String brand, double processorSpeed) {
        super(name, id);
        this.brand = brand;
        this.processorSpeed = processorSpeed;
    }
    @Override
    public void displayDetails() {
        System.out.println("Laptop ID: " + id + ", Model: " + name + ", Brand: " + brand + ", Processor Speed: " + processorSpeed + " GHz");
    }
}
