/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.LogisticRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class LogisticOrganization extends Organization {

    public LogisticOrganization() {
        super(OrganizationType.Logistic.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LogisticRole());
        return roles;
    }

}
