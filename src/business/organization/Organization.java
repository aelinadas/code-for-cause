/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.network.Network;
import business.role.Role;
import business.userAccount.UserAccountDirectory;
import business.workQueue.WorkQueue;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private Network network;

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static String[] extract = formatter.format(new Date()).toString().split(" ");
    private static String part1 = extract[0];
    private static String[] dm = part1.split("/");
    private static String part2 = extract[1];
    private static String[] hm = part2.split(":");
    private static String initialString = dm[0] + dm[1] + hm[0] + hm[1];
    private static int intialCounter = Integer.parseInt(initialString);

    private static int counter = intialCounter;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public enum OrganizationType {
        FoodBankAdminOrganization("FoodBank Administration Organization"),
        HospitalAdminOrganization("Hospital Administration Organization"),
        FoodPacker("FoodPacker Organization"),
        pantry("Pantry Organization"),
        Logistic("Logistic Organization"),
        Doctor("Doctor Organization"),
        LabAssistant("LabAssitant Organization"),
        Nutritionist("Nutritionist Organization");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}