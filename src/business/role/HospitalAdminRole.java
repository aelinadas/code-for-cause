/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.HospitalAdminWorkArea.HospitalAdminWorkJPanel;

/**
 *
 * @author Abhishek
 */
public class HospitalAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new HospitalAdminWorkAreaJpanel(userProcessContainer,account, enterprise, business);
        return new HospitalAdminWorkJPanel(userProcessContainer, enterprise, business);
    }
}
