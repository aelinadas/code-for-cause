/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import business.DB4O.DB4OUtil;
import java.awt.Component;
import javax.swing.JOptionPane;
import userInterface.FoodBankOrganizationRole.OrderJPanel;

/**
 *
 * @author Abhishek
 */
public class UserWorkAreaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserWorkAreaJFrame
     */
    private final JFrame MainJFrame;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil;

    public UserWorkAreaJFrame(JFrame mainJFrame, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.setTitle("Community Service - Welcome");
        this.MainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.dB4OUtil = dB4OUtil;
        setRightPanel();
        userDetailsPanel.setBackground(new Color(37, 78, 88));
        this.setSize(1440, 900);
        setUserDetails();
    }
    
    public void setUserDetails(){
        nameLabel.setText(userAccount.getEmployee().getName());
        roleLabel.setText(userAccount.getRole().toString());
        if (userAccount.getRole()!=null) {
         if (userAccount.getRole().toString().equalsIgnoreCase("SystemAdminRole")) {
           lblEnt.setVisible(false);
           enterpriseLabel.setVisible(false);
           roleLabel.setText("System Administrator"); 
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("FoodBankAdminRole")) {
           roleLabel.setText("Food Bank Administrator");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("HospitalAdminRole")) {
           roleLabel.setText("Hospital Administrator");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("FoodPantryAdminRole")) {
           roleLabel.setText("Food Pantry Administrator");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("FoodPackerRole")) {
           roleLabel.setText("Food Packer");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("LogisticRole")) {
           roleLabel.setText("Logistics");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("DoctorRole")) {
           roleLabel.setText("Doctor");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("LabAssistantRole")) {
           roleLabel.setText("Lab Assistant");
           enterpriseLabel.setText(enterprise.getName());
        }
        if (userAccount.getRole().toString().equalsIgnoreCase("NutritionistRole")) {
           roleLabel.setText("Nutritionist");
           enterpriseLabel.setText(enterprise.getName());
            }   
        }       
    }

    public void setRightPanel() {
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("workArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, organization, enterprise, ecoSystem));
        cardLayout.next(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workAreaSplitPane = new javax.swing.JSplitPane();
        userDetailsPanel = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        imageUser = new javax.swing.JLabel();
        lblEnt = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chngPswdBtn = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        workAreaSplitPane.setDividerLocation(210);

        logoutBtn.setText("Logout");
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        imageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginAvatar.png"))); // NOI18N

        lblEnt.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        lblEnt.setForeground(new java.awt.Color(255, 255, 255));
        lblEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnt.setText("Enterprise");
        lblEnt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");
        nameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nameLabel.setSize(new java.awt.Dimension(40, 40));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Enterprise");
        enterpriseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setSize(new java.awt.Dimension(40, 40));

        lblRole.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Designation");
        lblRole.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleLabel.setText("Role");
        roleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roleLabel.setSize(new java.awt.Dimension(40, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        chngPswdBtn.setText("Change Password");
        chngPswdBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chngPswdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chngPswdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userDetailsPanelLayout = new javax.swing.GroupLayout(userDetailsPanel);
        userDetailsPanel.setLayout(userDetailsPanelLayout);
        userDetailsPanelLayout.setHorizontalGroup(
            userDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(userDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(imageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chngPswdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        userDetailsPanelLayout.setVerticalGroup(
            userDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userDetailsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(chngPswdBtn)
                .addGap(37, 37, 37)
                .addComponent(logoutBtn)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        workAreaSplitPane.setLeftComponent(userDetailsPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        workAreaSplitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workAreaSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workAreaSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        Component[] components = this.userProcessContainer.getComponents();
        for (Component component : components) {
            if (component instanceof OrderJPanel) {
                OrderJPanel orderJPanel = (OrderJPanel) component;
                if (orderJPanel.cartEmpty()) {
                    dB4OUtil.storeEcoSystem(ecoSystem);
                    MainJFrame.setVisible(true);
                    this.setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please empty your Cart before you leave this screen.", "Message", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        dB4OUtil.storeEcoSystem(ecoSystem);
        MainJFrame.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void chngPswdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chngPswdBtnActionPerformed
        // TODO add your handling code here:
        ChangePasswordJFrame changePasswordJFrame=new ChangePasswordJFrame(this,userAccount);
        changePasswordJFrame.setVisible(true);
        this.setVisible(false);
        dispose();       
    }//GEN-LAST:event_chngPswdBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new UserWorkAreaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chngPswdBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel imageUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEnt;
    private javax.swing.JLabel lblRole;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JPanel userDetailsPanel;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JSplitPane workAreaSplitPane;
    // End of variables declaration//GEN-END:variables
}
