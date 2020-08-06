/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author Abhishek
 */
public class LabRequest extends WorkRequest{

    private String testResult;
    private String testType;
    private String patientId;
    private boolean alreadyAssigned;

    public boolean isAlreadyAssigned() {
        return alreadyAssigned;
    }

    public void setAlreadyAssigned(boolean alreadyAssigned) {
        this.alreadyAssigned = alreadyAssigned;
    }

    public String getTestResult() {
        return testResult;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

}
