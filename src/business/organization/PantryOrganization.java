/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.FoodPantryAdminRole;
import business.role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class PantryOrganization extends Organization {

    private int zipCode;
    private String Address;
    private HashMap<String, Integer> statsMap;

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public PantryOrganization() {
        super(OrganizationType.pantry.getValue());
        statsMap = new HashMap<String, Integer>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodPantryAdminRole());
        return roles;
    }

    public HashMap<String, Integer> getStatsMap() {
        return statsMap;
    }

}
