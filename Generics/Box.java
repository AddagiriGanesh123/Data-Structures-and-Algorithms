package Generics;

public class Box<T> {
   T item;
   // Set the item in the box
   public void setItem(T item){
    this.item = item;
   }
   // Get the item from the box
   public T getItem(){
    return this.item;
   }
}
