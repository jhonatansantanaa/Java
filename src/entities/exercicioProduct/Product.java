package entities.exercicioProduct;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public double TotalValueInStock() {
        return  price * quantity;
    }

    public void AddProductToStock(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + TotalValueInStock();
    }

}
