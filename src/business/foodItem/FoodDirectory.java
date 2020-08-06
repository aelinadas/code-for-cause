/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.foodItem;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class FoodDirectory {

    private ArrayList<FoodItem> foodList;

    public FoodDirectory() {
        foodList = new ArrayList<FoodItem>();
    }

    public ArrayList<FoodItem> getFoodList() {
        return foodList;
    }

    public FoodItem addFoodItem(String name, int quantity) {
        FoodItem foodItem = new FoodItem(name, quantity);
        foodList.add(foodItem);
        return foodItem;
    }

    public void deleteFoodItem(FoodItem foodItem) {
        foodList.remove(foodItem);
    }
}
