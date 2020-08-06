package business.workQueue;

import business.foodItem.FoodItem;
import business.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author aelinadas
 */
public class PantryWorkRequest extends WorkRequest {

    private String address;
    private boolean alreadyAssignedPacker;
    private boolean alreadyAssignedLogistic;
    private boolean forward;
    private UserAccount packerUserAccount;
    private ArrayList<FoodItem> groceryList =new ArrayList<FoodItem>();
    private int zipCode;

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public ArrayList<FoodItem> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<FoodItem> groceryList) {
        this.groceryList = groceryList;
    }

    public UserAccount getPackerUserAccount() {
        return packerUserAccount;
    }

    public void setPackerUserAccount(UserAccount packerUserAccount) {
        this.packerUserAccount = packerUserAccount;
    }

    public boolean isAlreadyAssignedPacker() {
        return alreadyAssignedPacker;
    }

    public void setAlreadyAssignedPacker(boolean alreadyAssignedPacker) {
        this.alreadyAssignedPacker = alreadyAssignedPacker;
    }

    public boolean isAlreadyAssignedLogistic() {
        return alreadyAssignedLogistic;
    }

    public void setAlreadyAssignedLogistic(boolean alreadyAssignedLogistic) {
        this.alreadyAssignedLogistic = alreadyAssignedLogistic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }

}