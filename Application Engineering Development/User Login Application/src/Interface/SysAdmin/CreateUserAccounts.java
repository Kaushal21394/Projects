/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdmin;

import Business.Business;
import Business.HumanResource.Person;
import Business.HumanResource.PersonCatalog;
import Business.SystemAdmin.User;
import Business.SystemAdmin.UserCatalog;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kaush
 */
public class CreateUserAccounts extends javax.swing.JPanel {
    JPanel userControlPanel;
    Business business;
    User user;
    /**
     * Creates new form CreateUserAccounts
     */
    

    CreateUserAccounts(JPanel userControlPanel,Business business, User user) {
       initComponents();
       this.userControlPanel=userControlPanel;
       this.business=business;
       this.user=user;
       comboBox();
       
    }
    public void comboBox(){
       boxPerson.removeAllItems();
       //boxRole.removeAll();
       //UserCatalog uc=business.getuCatalog();
        PersonCatalog pc=business.getpCatalog();
       for(Person user: pc.getPersonCatalog()){
           boxPerson.addItem(user);
       }
       //for(User user: uc.getUserCatalog()){
         //  boxRole.addItem(user.getRole());
       //}
    }
    public void populateTable(){
        String userName=txtUser.getText();
        String password=txtPass.getText();
        String role=boxRole.getSelectedItem().toString();
        String status=txtStatus.getText();
        Person person=(Person)boxPerson.getSelectedItem();
        
        UserCatalog uc=business.getuCatalog();
        User u=uc.addUser();
        u.setUsername(userName);
        u.setPassword(password);
        u.setRole(role);
        u.setStatus(status);
        u.setPerson(person);
        
        JOptionPane.showMessageDialog(null,"User Account Created !!!");
        
        txtUser.setText("");
        txtPass.setText("");
        txtStatus.setText("");
       
        
       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        boxPerson = new javax.swing.JComboBox();
        boxRole = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE USER ACCOUNT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 690, 31));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Username:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 145, 77, 24));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("Status:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 77, 24));
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 146, 126, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 188, 126, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setText("Select a Role:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 77, 24));

        add(boxPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 111, 126, -1));

        boxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "System Admin", "HR Admin" }));
        add(boxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 126, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setText("Select Person:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 82, 77, 24));

        btnCancel.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 105, 36));

        btnCreate.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 105, 36));

        btnBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 105, 36));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 187, 77, 24));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       userControlPanel.remove(this);
       Component[] componentArray=userControlPanel.getComponents();
       Component component=componentArray[componentArray.length-1];
       ManageUserAccounts panel= (ManageUserAccounts)component;
        panel.populateTable();
      
      CardLayout layout=(CardLayout)userControlPanel.getLayout();
      layout.previous(userControlPanel);



        //ManageUserAccounts panel= new ManageUserAccounts(userControlPanel,business,user);
       //userControlPanel.add("ManageUserAccounts",panel);
       //CardLayout layout=(CardLayout)userControlPanel.getLayout();
       //layout.next(userControlPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxPerson;
    private javax.swing.JComboBox<String> boxRole;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

