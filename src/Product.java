public class Product
{
    private String ID = "";
    private String name = "";
    private String description = "";
    private double cost = 0.0;

    public Product(String ID, String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getID() {
        return ID;
    }
//    public void setID(String ID) {
//        this.ID = ID;
//    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ID='" + ID + '\'' +
                ", cost=" + cost +
                '}';
    }
    public String toCSVDataRecord()
    {
    return this.ID + ", " + this.name + ", " + this.description + ", " + this.cost;
    }
}
