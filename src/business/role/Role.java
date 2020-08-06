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

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public abstract class Role {

    public enum RoleType {
        FoodAdministrator("Food Bank Administrator"),
        HospitalAdministrator("Hospital Administrator"),
        PantryAdministrator("Pantry Administrator"),
        FoodPacker("FoodPacker"),
        Logistic("Logistic"),
        Doctor("Doctor"),
        LabAssistant("LabAssitant"),
        Nutritionist("Nutritionist");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
