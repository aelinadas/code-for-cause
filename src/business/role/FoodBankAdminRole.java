/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.FoodBankAdminWorkArea.FoodBankAdminWorkJPanel;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class FoodBankAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new FoodBankAdminWorkJPanel(userProcessContainer, enterprise, ecosystem);
    }
}
