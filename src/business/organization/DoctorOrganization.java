/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DoctorRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class DoctorOrganization extends Organization {

    public DoctorOrganization() {
        super(OrganizationType.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }

}
