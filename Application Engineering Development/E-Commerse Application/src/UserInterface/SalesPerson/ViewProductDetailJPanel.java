/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package UserInterface.SalesPerson;

import business.sales.OrderItem;
import business.supplier.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chava
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {


    /** Creates new form CreateProductJPanel */
    private JPanel userProcessContainer;
    private Product product;
    public ViewProductDetailJPanel(JPanel userProcessContainer, Product p) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.product=p;
        txtFieldProductName.setText(product.getProdName());
        txtFieldId.setText(product.getProductId());
        txtFieldPrice.setText(Integer.toString(product.getPrice()));
        txtFieldAvailability.setText(Integer.toString(product.getAvailQuantity()));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */




    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldAvailability = new javax.swing.JTextField();
        txtFieldId = new javax.swing.JTextField();
        txtFieldPrice = new javax.swing.JTextField();
        txtFieldProductName = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("PRODUCT DETAIL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 30));

        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel6.setText("Availability");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));
        add(txtFieldAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, -1));

        txtFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldIdActionPerformed(evt);
            }
        });
        add(txtFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, -1));
        add(txtFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, -1));
        add(txtFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldIdActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtFieldAvailability;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldPrice;
    private javax.swing.JTextField txtFieldProductName;
    // End of variables declaration//GEN-END:variables
    
}
