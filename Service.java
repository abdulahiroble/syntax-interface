class Service implements DisplayInterface {

    public void DisplayNice() {
        System.out.println("Name: " + Name + " ,Price " + Price);
    }

    private String Name;
    private double Price;

    public Service() {
        Name = "Dat20v1";
        Price = 1000;
    }

    @Override
    public String toString() {
        return "Name: " + Name + " , Price: " + Price;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }

}