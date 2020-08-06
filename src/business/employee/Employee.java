/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class Employee {

    private String name;
    private int id;
    private String address;
    private int zipCode;
    
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static String[] extract = formatter.format(new Date()).toString().split(" ");
    private static String part1 = extract[0];
    private static String[] dm = part1.split("/");
    private static String part2 = extract[1];
    private static String[] hm = part2.split(":");
    private static String initialString = dm[1] + dm[0] + hm[0] + hm[1];
    private static int intialCounter = Integer.parseInt(initialString);
       
    private static int count = intialCounter;

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

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}