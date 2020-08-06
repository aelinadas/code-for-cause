package business;

import business.employee.Employee;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem ecoSystem = EcoSystem.getInstance();
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("System Admininstrator");
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        return ecoSystem;
    }

}
