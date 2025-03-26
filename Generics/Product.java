package Generics;

public class Product<T,U> {
    // T is the default type parameter
    // After T definitely U will come for the other existence
    T item;//generic type item
    U price;

    // Genearte Constructors for these two generic variables
    public Product(T item,U price) {
        this.item = item;
        this.price = price; 
    }

    public T getItem() {
        return item;
    }

    public U getPrice() {
        return price;
    }

}
