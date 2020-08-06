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
import userInterface.FoodBankOrganizationRole.LogisticsJPanel;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class LogisticRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new LogisticsJPanel(userProcessContainer, account, organization, enterprise, ecoSystem);
    }
    
}
