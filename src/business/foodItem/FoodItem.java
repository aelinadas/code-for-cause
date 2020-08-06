/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.foodItem;

/**
 *
 * @author Abhishek
 */
public class FoodItem {

    String name;
    int quantity;
    String id;

    public FoodItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.id = name + id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name;
    }
}
