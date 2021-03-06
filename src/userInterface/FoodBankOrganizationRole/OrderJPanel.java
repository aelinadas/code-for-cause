/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FoodBankOrganizationRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.FoodBankEnterprise;
import business.foodItem.FoodItem;
import business.organization.FoodPackerOrganization;
import business.organization.Organization;
import business.organization.PantryOrganization;
import business.userAccount.UserAccount;
import business.workQueue.PantryWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class OrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderJPanel
     */
    private JPanel userProcessContainer;
    private FoodBankEnterprise foodBankEnterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem ecoSystem;
    public ArrayList<FoodItem> myOrderList;
    private FoodItem toBeChanged;
    private Enterprise enterprise;

    public OrderJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.foodBankEnterprise = (FoodBankEnterprise) enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.myOrderList = new ArrayList<FoodItem>();
        this.enterprise = enterprise;
        populateTable();
        setInitial();
        this.setBackground(new Color(255, 255, 255));
        this.setSize(1440, 900);
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) mainjTable.getModel();
        model.setRowCount(0);
        for (FoodItem foodItem : foodBankEnterprise.getFoodDirectory().getFoodList()) {
            if (foodItem.getQuantity() != 0) {
                Object[] row = new Object[2];
                row[0] = foodItem;
                row[1] = foodItem.getQuantity();
                model.addRow(row);
            }
        }
    }

    public void setInitial() {
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        cancelBtn.setVisible(false);
        addCartBtn.setVisible(false);
        quantityjSpinner.setVisible(false);
        itemTxtField.setVisible(false);
        itemTxtField.setText("");

    }

    public void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) cartjTable.getModel();
        model.setRowCount(0);
        if (!myOrderList.isEmpty()) {
            for (FoodItem foodItem : myOrderList) {
                if (foodItem.getQuantity() != 0) {
                    Object[] row = new Object[2];
                    row[0] = foodItem;
                    row[1] = foodItem.getQuantity();
                    model.addRow(row);
                }
            }
        }
    }

    public boolean cartEmpty() {
        return myOrderList.isEmpty();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        itemTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quantityjSpinner = new javax.swing.JSpinner();
        addCartBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        refreshTestJButton2 = new javax.swing.JButton();

        mainjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Quantity(Pounds)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainjTable);
        if (mainjTable.getColumnModel().getColumnCount() > 0) {
            mainjTable.getColumnModel().getColumn(0).setResizable(false);
            mainjTable.getColumnModel().getColumn(1).setResizable(false);
        }

        cartjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity(Pounds)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartjTable);
        if (cartjTable.getColumnModel().getColumnCount() > 0) {
            cartjTable.getColumnModel().getColumn(0).setResizable(false);
            cartjTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Item Name*:");

        jLabel2.setText("Quantity*:");

        quantityjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        addCartBtn.setText("Add To Cart");
        addCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        selectBtn.setText("Select Quantity");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        orderButton.setText("Place Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setText("Available Products");

        jLabel4.setText("Your Cart");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Purchase for my Pantry");

        refreshTestJButton2.setBackground(new java.awt.Color(255, 255, 255));
        refreshTestJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshTestJButton2.setBorder(null);
        refreshTestJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(432, 432, 432)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 503, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(addCartBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(quantityjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addCartBtn, cancelBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(refreshTestJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(selectBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantityjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(addCartBtn))
                .addGap(489, 489, 489))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartBtnActionPerformed
        try {
            // TODO add your handling code here:
            quantityjSpinner.commitEdit();
        } catch (ParseException ex) {
            System.out.println("Commit Edit");
        }
        int quantity = (Integer) quantityjSpinner.getValue();
        FoodItem myFoodItem = new FoodItem(itemTxtField.getText().trim(), quantity);
        myFoodItem.setId(toBeChanged.getId());
        myOrderList.add(myFoodItem);
        for (FoodItem foodItem : foodBankEnterprise.getFoodDirectory().getFoodList()) {
            if (foodItem.getId().equalsIgnoreCase(toBeChanged.getId())) {
                int difference = toBeChanged.getQuantity() - quantity;
                foodItem.setQuantity(difference);
            }
        }
        populateCartTable();
        setInitial();
        populateTable();
    }//GEN-LAST:event_addCartBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setInitial();
        toBeChanged = null;
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = mainjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            FoodItem foodItem = (FoodItem) mainjTable.getValueAt(selectedRow, 0);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            cancelBtn.setVisible(true);
            addCartBtn.setVisible(true);
            quantityjSpinner.setVisible(true);
            itemTxtField.setVisible(true);
            itemTxtField.setText(foodItem.getName());
            itemTxtField.setEditable(false);
            SpinnerNumberModel spinnerNumberModel = (SpinnerNumberModel) quantityjSpinner.getModel();
            spinnerNumberModel.setMaximum(foodItem.getQuantity());
            JFormattedTextField formattedTextField = ((JSpinner.DefaultEditor) quantityjSpinner.getEditor()).getTextField();
            formattedTextField.setText(foodItem.getQuantity() + "");
            formattedTextField.setEditable(false);
            formattedTextField.setBackground(Color.white);
            toBeChanged = foodItem;
        }

    }//GEN-LAST:event_selectBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartjTable.getSelectedRow();
        setInitial();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            FoodItem foodItem = (FoodItem) cartjTable.getValueAt(selectedRow, 0);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogValue = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + foodItem + " ?", "Message", dialogButton);
            if (dialogValue == JOptionPane.YES_OPTION) {
                for (FoodItem fi : foodBankEnterprise.getFoodDirectory().getFoodList()) {
                    if (fi.getId().equals(foodItem.getId())) {
                        int addition = fi.getQuantity() + foodItem.getQuantity();
                        fi.setQuantity(addition);
                    }
                }
                myOrderList.remove(foodItem);
                populateTable();
                populateCartTable();
            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        if (!myOrderList.isEmpty()) {
            PantryWorkRequest pantryWorkRequest = new PantryWorkRequest();
            pantryWorkRequest.setSender(userAccount);
            ArrayList<FoodItem> orderList = pantryWorkRequest.getGroceryList();
            Iterator<FoodItem> iterator = myOrderList.iterator();
            while (iterator.hasNext()) {
                orderList.add((FoodItem)iterator.next());         
            }
            pantryWorkRequest.setAddress(((PantryOrganization) organization).getAddress());
            pantryWorkRequest.setZipCode(((PantryOrganization) organization).getZipCode());
            pantryWorkRequest.setStatus("ORDER PLACED");
            myOrderList.clear();
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FoodPackerOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(pantryWorkRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(pantryWorkRequest);
                JOptionPane.showMessageDialog(null, "Thank you, your order has been placed. You can track your order on View Orders Page");
                btnBackActionPerformed(evt);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You have an empty cart. Please add items to your cart, before you order.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_orderButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if (!myOrderList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please empty your cart before you leave this screen.", "Message", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void refreshTestJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton2ActionPerformed
        // TODO add your handling code here:
        populateCartTable();
        populateTable();
    }//GEN-LAST:event_refreshTestJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTable cartjTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField itemTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mainjTable;
    private javax.swing.JButton orderButton;
    private javax.swing.JSpinner quantityjSpinner;
    private javax.swing.JButton refreshTestJButton2;
    private javax.swing.JButton selectBtn;
    // End of variables declaration//GEN-END:variables
}
