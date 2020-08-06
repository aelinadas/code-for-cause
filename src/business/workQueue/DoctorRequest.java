package business.workQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author aelinadas
 */
public class DoctorRequest extends WorkRequest {

    private String address;
    private int zipCode;
    private int expectedPpl;
    private String doctorMsg;
    private boolean assigned;

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getExpectedPpl() {
        return expectedPpl;
    }

    public void setExpectedPpl(int expectedPpl) {
        this.expectedPpl = expectedPpl;
    }

    public String getDoctorMsg() {
        return doctorMsg;
    }

    public void setDoctorMsg(String doctorMsg) {
        this.doctorMsg = doctorMsg;
    }
}
