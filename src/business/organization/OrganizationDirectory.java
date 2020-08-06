/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.enterprise.Enterprise;
import business.enterprise.Enterprise.EnterpriseType;
import business.organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(OrganizationType organizationType, Enterprise.EnterpriseType enterpriseType) {
        Organization organization = null;
        if (enterpriseType == EnterpriseType.Hospital) {
            if (organizationType == OrganizationType.Doctor) {
                organization = new DoctorOrganization();
                organizationList.add(organization);
            } else if (organizationType == OrganizationType.Nutritionist) {
                organization = new NutritionistOrganization();
                organizationList.add(organization);
            } else if (organizationType == OrganizationType.LabAssistant) {
                organization = new LabAssitantOrganization();
                organizationList.add(organization);
            }
        } else if (enterpriseType == EnterpriseType.FoodBank) {
            if (organizationType == OrganizationType.pantry) {
                organization = new PantryOrganization();
                organizationList.add(organization);
            } else if (organizationType == OrganizationType.FoodPacker) {
                organization = new FoodPackerOrganization();
                organizationList.add(organization);
            } else if (organizationType == OrganizationType.Logistic) {
                organization = new LogisticOrganization();
                organizationList.add(organization);
            }
        }
        return organization;
    }

    public void deleteOrganization(Organization organization) {
        organizationList.remove(organization);
    }
}
