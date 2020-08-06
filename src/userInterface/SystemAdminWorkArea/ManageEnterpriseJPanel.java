/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.FoodBankAdminRole;
import business.role.HospitalAdminRole;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Enterprise toBeEdited;

    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateTable();
        setTab1Initial();
        setTab2Initial();
        this.setSize(1440, 900);
    }

    private void setTab1Initial() {
        networkLabel.setVisible(false);
        networkJComboBox.setVisible(false);
        enterpriseLabel.setVisible(false);
        enterpriseTypeJComboBox.setVisible(false);
        nameLabel.setVisible(false);
        enterpriseNameTextField.setVisible(false);
        enterpriseNameTextField.setText("");
        addressLabel.setVisible(false);
        enterpriseAddressTextField.setVisible(false);
        enterpriseAddressTextField.setText("");
        zipLabel.setVisible(false);
        zipTextField.setVisible(false);
        zipTextField.setText("");
        submitBtn.setVisible(false);
        cancelBtn.setVisible(false);
        confirmBtn.setVisible(false);
        hlpLabel.setVisible(false);
    }

    private void setTab2Initial() {
        tab2NetworkLabel.setVisible(false);
        adminNetworkComboBox.setVisible(false);
        tab2EnterpriseLabel.setVisible(false);
        adminEnterpriseComboBox.setVisible(false);
        adminNameLabel.setVisible(false);
        adminNameTextField.setVisible(false);
        userNameLabel.setVisible(false);
        adminUsernameTextField.setVisible(false);
        passwordLabel.setVisible(false);
        passwordField.setVisible(false);
        tab2SubmitBtn.setVisible(false);
        tab2CancelBtn.setVisible(false);
        passwordField.setBorder(new LineBorder(new Color(128, 128, 128)));
        passwordLabel.setForeground(Color.BLACK);
        adminUsernameTextField.setBorder(new LineBorder(new Color(128, 128, 128)));
        userNameLabel.setForeground(Color.BLACK);
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[4];
                row[0] = enterprise.getOrganizationID();
                row[1] = enterprise;
                row[2] = network;
                row[3] = enterprise.getEnterpriseType().getValue();
                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();
        for (Network network : ecoSystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
        }
    }

    private void populateAdminTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = network;
                    row[1] = enterprise;
                    row[2] = userAccount.getEmployee();
                    row[3] = userAccount;
                    model.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        enterpriseTabbedPane = new javax.swing.JTabbedPane();
        manageEnterprise = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        networkLabel = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        enterpriseNameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        addEnterpriseBtn = new javax.swing.JButton();
        viewEnterpriseDetailsBtn = new javax.swing.JButton();
        deleteEnterpriseBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        addressLabel = new javax.swing.JLabel();
        enterpriseAddressTextField = new javax.swing.JTextField();
        zipLabel = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        hlpLabel = new javax.swing.JLabel();
        manageEnterpriseAdmin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enterpriseAdminJTable = new javax.swing.JTable();
        adminNetworkComboBox = new javax.swing.JComboBox();
        adminEnterpriseComboBox = new javax.swing.JComboBox();
        tab2NetworkLabel = new javax.swing.JLabel();
        tab2EnterpriseLabel = new javax.swing.JLabel();
        adminNameLabel = new javax.swing.JLabel();
        adminNameTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        adminUsernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        tab2SubmitBtn = new javax.swing.JButton();
        tab2CancelBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        addEnterpriseAdminBtn = new javax.swing.JButton();
        deleteEnterpriseAdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        enterpriseTabbedPane.setBackground(new java.awt.Color(230, 250, 250));
        enterpriseTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                enterpriseTabbedPaneStateChanged(evt);
            }
        });

        manageEnterprise.setBackground(new java.awt.Color(255, 255, 255));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Id", "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);
        if (enterpriseJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(2).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        networkLabel.setText("Network:");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enterpriseLabel.setText("Enterprise Type:");

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });

        enterpriseNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterpriseNameTextFieldKeyTyped(evt);
            }
        });

        nameLabel.setText("Enterprise Name*:");

        addEnterpriseBtn.setText("Add Enterprise");
        addEnterpriseBtn.setMaximumSize(null);
        addEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriseBtnActionPerformed(evt);
            }
        });

        viewEnterpriseDetailsBtn.setText("Edit Enterprise");
        viewEnterpriseDetailsBtn.setMaximumSize(null);
        viewEnterpriseDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEnterpriseDetailsBtnActionPerformed(evt);
            }
        });

        deleteEnterpriseBtn.setText("Delete Enterprise");
        deleteEnterpriseBtn.setMaximumSize(null);
        deleteEnterpriseBtn.setMinimumSize(new java.awt.Dimension(135, 29));
        deleteEnterpriseBtn.setPreferredSize(new java.awt.Dimension(135, 29));
        deleteEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterpriseBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        addressLabel.setText("Address*:");

        enterpriseAddressTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enterpriseAddressTextFieldKeyTyped(evt);
            }
        });

        zipLabel.setText("Zip Code*:");

        zipTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zipTextFieldKeyTyped(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        hlpLabel.setText("(5 digit zip code)");

        javax.swing.GroupLayout manageEnterpriseLayout = new javax.swing.GroupLayout(manageEnterprise);
        manageEnterprise.setLayout(manageEnterpriseLayout);
        manageEnterpriseLayout.setHorizontalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewEnterpriseDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addComponent(networkLabel)
                        .addGap(6, 6, 6)
                        .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterpriseLabel)
                        .addGap(6, 6, 6)
                        .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(addressLabel)
                            .addComponent(zipLabel))
                        .addGap(3, 3, 3)
                        .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                                .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hlpLabel))
                            .addComponent(enterpriseAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                                .addComponent(submitBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmBtn))
                            .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        manageEnterpriseLayout.setVerticalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewEnterpriseDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(networkLabel)
                            .addComponent(enterpriseLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageEnterpriseLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(enterpriseAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hlpLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(cancelBtn)
                    .addComponent(confirmBtn))
                .addContainerGap(493, Short.MAX_VALUE))
        );

        enterpriseTabbedPane.addTab("Manage Enterprise                                     ", manageEnterprise);

        manageEnterpriseAdmin.setBackground(new java.awt.Color(255, 255, 255));

        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Enterprise Name", "Admin Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(enterpriseAdminJTable);
        if (enterpriseAdminJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseAdminJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseAdminJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseAdminJTable.getColumnModel().getColumn(2).setResizable(false);
            enterpriseAdminJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        adminNetworkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Select Network>>" }));
        adminNetworkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNetworkComboBoxActionPerformed(evt);
            }
        });

        adminEnterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Select Enterprise>>" }));

        tab2NetworkLabel.setText("Network:");

        tab2EnterpriseLabel.setText("Enterprise:");

        adminNameLabel.setText("Name*:");

        adminNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adminNameTextFieldKeyTyped(evt);
            }
        });

        userNameLabel.setText("Username*:");

        adminUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsernameTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password*:");

        tab2SubmitBtn.setText("Submit");
        tab2SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab2SubmitBtnActionPerformed(evt);
            }
        });

        tab2CancelBtn.setText("Cancel");
        tab2CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab2CancelBtnActionPerformed(evt);
            }
        });

        addEnterpriseAdminBtn.setText("Add Enterprise Admin");
        addEnterpriseAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriseAdminBtnActionPerformed(evt);
            }
        });

        deleteEnterpriseAdminBtn.setText("Delete Enterprise Admin");
        deleteEnterpriseAdminBtn.setMinimumSize(new java.awt.Dimension(135, 29));
        deleteEnterpriseAdminBtn.setPreferredSize(new java.awt.Dimension(135, 29));
        deleteEnterpriseAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterpriseAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageEnterpriseAdminLayout = new javax.swing.GroupLayout(manageEnterpriseAdmin);
        manageEnterpriseAdmin.setLayout(manageEnterpriseAdminLayout);
        manageEnterpriseAdminLayout.setHorizontalGroup(
            manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEnterpriseAdminLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                        .addComponent(addEnterpriseAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(deleteEnterpriseAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                            .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adminNameLabel)
                                .addComponent(userNameLabel)
                                .addComponent(passwordLabel))
                            .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(tab2SubmitBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tab2CancelBtn))
                                .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(adminUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                            .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tab2EnterpriseLabel)
                                .addComponent(tab2NetworkLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(adminNetworkComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminEnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
        );
        manageEnterpriseAdminLayout.setVerticalGroup(
            manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEnterpriseAdminBtn)
                    .addComponent(deleteEnterpriseAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tab2NetworkLabel)
                    .addComponent(adminNetworkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tab2EnterpriseLabel)
                    .addComponent(adminEnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tab2SubmitBtn)
                    .addComponent(tab2CancelBtn))
                .addContainerGap(454, Short.MAX_VALUE))
        );

        enterpriseTabbedPane.addTab("Manage Enterprise Administrators                         ", manageEnterpriseAdmin);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Enterprise");

        refreshTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshTestJButton.setBorder(null);
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(386, 386, 386)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backBtn)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterpriseTabbedPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkJPanel systemAdminWorkJPanel = (SystemAdminWorkJPanel) component;
        systemAdminWorkJPanel.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void addEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriseBtnActionPerformed
        // TODO add your handling code here:
        networkLabel.setVisible(true);
        networkJComboBox.setVisible(true);
        enterpriseLabel.setVisible(true);
        enterpriseTypeJComboBox.setVisible(true);
        nameLabel.setVisible(true);
        enterpriseNameTextField.setVisible(true);
        addressLabel.setVisible(true);
        enterpriseAddressTextField.setVisible(true);
        zipLabel.setVisible(true);
        zipTextField.setVisible(true);
        submitBtn.setVisible(true);
        cancelBtn.setVisible(true);
        enterpriseAddressTextField.setText("");
        enterpriseNameTextField.setText("");
        zipTextField.setText("");
        populateComboBox();
        networkJComboBox.setEnabled(true);
        enterpriseTypeJComboBox.setEnabled(true);
        hlpLabel.setVisible(true);
        enterpriseNameTextField.setEnabled(true);
        enterpriseNameTextField.setEditable(true);
        confirmBtn.setVisible(false);
    }//GEN-LAST:event_addEnterpriseBtnActionPerformed

    private void viewEnterpriseDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEnterpriseDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 1);
            toBeEdited = enterprise;
            networkLabel.setVisible(true);
            networkJComboBox.setVisible(true);
            enterpriseLabel.setVisible(true);
            enterpriseTypeJComboBox.setVisible(true);
            nameLabel.setVisible(true);
            enterpriseNameTextField.setVisible(true);
            addressLabel.setVisible(true);
            enterpriseAddressTextField.setVisible(true);
            zipLabel.setVisible(true);
            zipTextField.setVisible(true);
            confirmBtn.setVisible(true);
            cancelBtn.setVisible(true);
            enterpriseAddressTextField.setText(enterprise.getAddress());
            enterpriseNameTextField.setText(enterprise.getName());
            zipTextField.setText(enterprise.getZipCode() + "");
            enterpriseTypeJComboBox.removeAllItems();
            networkJComboBox.removeAllItems();
            enterpriseTypeJComboBox.addItem((Enterprise.EnterpriseType) enterprise.getEnterpriseType());
            networkJComboBox.addItem((Network) enterprise.getNetwork());
            submitBtn.setVisible(false);
            networkJComboBox.setEnabled(false);
            enterpriseTypeJComboBox.setEnabled(false);
            enterpriseNameTextField.setEnabled(false);
            enterpriseNameTextField.setEditable(false);
            hlpLabel.setVisible(true);
        }
    }//GEN-LAST:event_viewEnterpriseDetailsBtnActionPerformed

    private void deleteEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterpriseBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 1);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + enterprise.getName() + " ?", "Message", dialogButton);
            if (dialogValue == JOptionPane.YES_OPTION) {
                Network network = (Network) enterpriseJTable.getValueAt(selectedRow, 2);
                network.getEnterpriseDirectory().deleteEnterprise(enterprise);
                populateTable();
                setTab1Initial();
            }
        }
    }//GEN-LAST:event_deleteEnterpriseBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        Boolean exist = false;
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        Enterprise enterprise;
        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid input","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        String enterpriseName = enterpriseNameTextField.getText().trim();
        String address=enterpriseAddressTextField.getText().trim();
        String zipCode= zipTextField.getText().trim();
        if (enterpriseName.equalsIgnoreCase("")||address.equalsIgnoreCase("")||zipCode.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (zipCode.length()!=5) {
            JOptionPane.showMessageDialog(null, "Please enter a valid zip code.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getName().equalsIgnoreCase(enterpriseName) && e.getEnterpriseType().equals(type)) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            enterprise = network.getEnterpriseDirectory().createEnterprise(enterpriseName, type);
            enterprise.setAddress(enterpriseAddressTextField.getText().trim());
            enterprise.setZipCode(Integer.parseInt(zipTextField.getText().trim()));
            enterprise.setNetwork(network);
            populateTable();
            setTab1Initial();
        } else {
            JOptionPane.showMessageDialog(null, "Enterprise " + enterpriseName + " already exists in the chosen Network.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setTab1Initial();
        networkJComboBox.setEnabled(true);
        enterpriseTypeJComboBox.setEnabled(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void PopulateTab2NetworkComboBox() {
        adminNetworkComboBox.removeAllItems();
        for (Network network : ecoSystem.getNetworkList()) {
            adminNetworkComboBox.addItem(network);
        }
    }
    
    public boolean isUniqueInEcosystem(String userName){
        Boolean notFound=true;
        for (Network network : ecoSystem.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
               notFound  = e.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                if (notFound && !e.getOrganizationDirectory().getOrganizationList().isEmpty()) {
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        notFound=organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                        if (!notFound) {
                            return notFound;
                        }
                    }
                }else{
                    return notFound;
                }                
            }            
        }
        return notFound;
    }

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        String enterpriseName = enterpriseNameTextField.getText().trim();
        String address=enterpriseAddressTextField.getText().trim();
        String zipCode= zipTextField.getText().trim();
        if (enterpriseName.equalsIgnoreCase("")||address.equalsIgnoreCase("")||zipCode.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (zipCode.length()!=5) {
            JOptionPane.showMessageDialog(null, "Please enter a valid zip code.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            toBeEdited.setName(enterpriseNameTextField.getText().trim());
            toBeEdited.setAddress(enterpriseAddressTextField.getText().trim());
            toBeEdited.setZipCode(Integer.parseInt(zipTextField.getText().trim()));
            populateTable();
            setTab1Initial();
        }        
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void populateEnterpriseComboBox(Network network) {
        adminEnterpriseComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            adminEnterpriseComboBox.addItem(enterprise);
        }
    }

    private void adminNetworkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNetworkComboBoxActionPerformed
        Network network = (Network) adminNetworkComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_adminNetworkComboBoxActionPerformed

    private void enterpriseTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_enterpriseTabbedPaneStateChanged
        // TODO add your handling code here:
        JTabbedPane tabbedPane = (JTabbedPane) evt.getSource();
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex == 1) {
            populateAdminTable();
            setTab2Initial();
        }
    }//GEN-LAST:event_enterpriseTabbedPaneStateChanged

    private void tab2SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab2SubmitBtnActionPerformed
        // TODO add your handling code here:
         if (adminNetworkComboBox.getSelectedItem() == null || adminEnterpriseComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Enterprise enterprise = (Enterprise) adminEnterpriseComboBox.getSelectedItem();
        Network network = (Network) adminNetworkComboBox.getSelectedItem();
        String name = adminNameTextField.getText().trim();
        String username = adminUsernameTextField.getText().trim();
        String password = String.valueOf(passwordField.getPassword());
        if (username == null || username.equals("")) {
            adminUsernameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            userNameLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter a username.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!usernamePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Enter a valid username.", "Error", JOptionPane.ERROR_MESSAGE);
            adminUsernameTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            userNameLabel.setForeground(Color.RED);
            return;
        }
        if(password.equalsIgnoreCase("") || password == null){
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter a password.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password must be atleast 6 characters and a combination of number, uppercase, lowercase and special characters $,&,#", "Error", JOptionPane.ERROR_MESSAGE);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordLabel.setForeground(Color.RED);
            passwordField.setText("");
            return;
            
        }
        if (isUniqueInEcosystem(username)) {
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            if (enterprise.getEnterpriseType()== Enterprise.EnterpriseType.FoodBank) {  
              UserAccount userAccount = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FoodBankAdminRole());  
            } else {
              UserAccount userAccount = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
            }            
            populateAdminTable();
            setTab2Initial();
        } else {
            JOptionPane.showMessageDialog(null, username + " already exists.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_tab2SubmitBtnActionPerformed
    private boolean passwordPatternCorrect() {
        char[] newPwd = passwordField.getPassword();
        String newPassword = String.valueOf(newPwd);
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m = p.matcher(newPassword);
        boolean b = m.matches();
        return b;
    }
    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher m = p.matcher(adminUsernameTextField.getText().trim());
        boolean b = m.matches();
        return b;
    }
    private void tab2CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab2CancelBtnActionPerformed
        // TODO add your handling code here:
        setTab2Initial();
    }//GEN-LAST:event_tab2CancelBtnActionPerformed

    private void adminUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsernameTextFieldActionPerformed

    private void addEnterpriseAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriseAdminBtnActionPerformed
        // TODO add your handling code here:
        tab2NetworkLabel.setVisible(true);
        adminNetworkComboBox.setVisible(true);
        tab2EnterpriseLabel.setVisible(true);
        adminEnterpriseComboBox.setVisible(true);
        adminNameLabel.setVisible(true);
        adminNameTextField.setVisible(true);
        userNameLabel.setVisible(true);
        adminUsernameTextField.setVisible(true);
        passwordLabel.setVisible(true);
        passwordField.setVisible(true);
        tab2SubmitBtn.setVisible(true);
        tab2CancelBtn.setVisible(true);
        adminNameTextField.setText("");
        adminUsernameTextField.setText("");
        passwordField.setText("");
        PopulateTab2NetworkComboBox();
        adminEnterpriseComboBox.setEnabled(true);
        adminNetworkComboBox.setEnabled(true);
        passwordField.setBorder(new LineBorder(new Color(128, 128, 128)));
        passwordLabel.setForeground(Color.BLACK);
        adminUsernameTextField.setBorder(new LineBorder(new Color(128, 128, 128)));
        userNameLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_addEnterpriseAdminBtnActionPerformed

    private void deleteEnterpriseAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterpriseAdminBtnActionPerformed
        // TODO add your handling code here:    
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            UserAccount userAccount = (UserAccount) enterpriseAdminJTable.getValueAt(selectedRow, 3);
            Enterprise enterprise = (Enterprise) enterpriseAdminJTable.getValueAt(selectedRow, 1);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + userAccount.toString() + " ?", "Message", dialogButton);
            if (dialogValue == JOptionPane.YES_OPTION) {
                enterprise.getUserAccountDirectory().deleteUserAccount(userAccount);
                populateAdminTable();
            }
        }
    }//GEN-LAST:event_deleteEnterpriseAdminBtnActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateTable();
        populateAdminTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void enterpriseNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldKeyTyped
        // TODO add your handling code here:
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && code != KeyEvent.VK_BACK_SPACE && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_enterpriseNameTextFieldKeyTyped

    private void enterpriseAddressTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterpriseAddressTextFieldKeyTyped
        // TODO add your handling code here:
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && code != KeyEvent.VK_BACK_SPACE && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_enterpriseAddressTextFieldKeyTyped

    private void zipTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zipTextFieldKeyTyped
        // TODO add your handling code here:
        char enteredChar = evt.getKeyChar();
        if (!Character.isDigit(enteredChar) || (enteredChar == KeyEvent.VK_BACK_SPACE) || (enteredChar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_zipTextFieldKeyTyped

    private void adminNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminNameTextFieldKeyTyped
        // TODO add your handling code here:
        int code = evt.getKeyCode();
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && code != KeyEvent.VK_BACK_SPACE && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_adminNameTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEnterpriseAdminBtn;
    private javax.swing.JButton addEnterpriseBtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JComboBox adminEnterpriseComboBox;
    private javax.swing.JLabel adminNameLabel;
    private javax.swing.JTextField adminNameTextField;
    private javax.swing.JComboBox adminNetworkComboBox;
    private javax.swing.JTextField adminUsernameTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton deleteEnterpriseAdminBtn;
    private javax.swing.JButton deleteEnterpriseBtn;
    private javax.swing.JTextField enterpriseAddressTextField;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JTabbedPane enterpriseTabbedPane;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel hlpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel manageEnterprise;
    private javax.swing.JPanel manageEnterpriseAdmin;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JLabel networkLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton tab2CancelBtn;
    private javax.swing.JLabel tab2EnterpriseLabel;
    private javax.swing.JLabel tab2NetworkLabel;
    private javax.swing.JButton tab2SubmitBtn;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JButton viewEnterpriseDetailsBtn;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
