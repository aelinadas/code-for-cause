/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private int networkId;

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static String[] extract = formatter.format(new Date()).toString().split(" ");
    private static String part1 = extract[0];
    private static String[] dm = part1.split("/");
    private static String part2 = extract[1];
    private static String[] hm = part2.split(":");
    private static String initialString = dm[1] + hm[0] + dm[0] + hm[1];
    private static int intialCounter = Integer.parseInt(initialString);

    private static int networkCounter = intialCounter;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        networkId = networkCounter;
        ++networkCounter;
    }

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}