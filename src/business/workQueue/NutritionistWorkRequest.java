/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author aelinadas
 */
public class NutritionistWorkRequest extends WorkRequest{

    private String address;
    private int zipCode;
    private String nutritionistMsg;
    private boolean assigned;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getNutritionistMsg() {
        return nutritionistMsg;
    }

    public void setNutritionistMsg(String nutritionistMsg) {
        this.nutritionistMsg = nutritionistMsg;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

}
