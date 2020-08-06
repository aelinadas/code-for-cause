/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.foodItem.FoodDirectory;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class FoodBankEnterprise extends Enterprise {

    private FoodDirectory foodDirectory;

    public FoodBankEnterprise(String name) {
        super(name, EnterpriseType.FoodBank);
        foodDirectory = new FoodDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public FoodDirectory getFoodDirectory() {
        return foodDirectory;
    }
    
}
