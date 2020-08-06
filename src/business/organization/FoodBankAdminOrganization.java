/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.FoodBankAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class FoodBankAdminOrganization extends Organization {

    public FoodBankAdminOrganization() {
        super(OrganizationType.FoodBankAdminOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodBankAdminRole());
        return roles;
    }
}
