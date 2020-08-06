/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.FoodPackerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class FoodPackerOrganization extends Organization {

    public FoodPackerOrganization() {
        super(OrganizationType.FoodPacker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodPackerRole());
        return roles;
    }

}
