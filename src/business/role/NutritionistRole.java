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
import userInterface.Nutritionist.NutritionistWorkAreaJPanel;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class NutritionistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NutritionistWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
}