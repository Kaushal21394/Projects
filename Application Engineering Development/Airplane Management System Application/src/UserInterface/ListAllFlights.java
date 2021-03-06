/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Airliner;
import Business.AirlinerCatalog;
import Business.Airplane;
import Business.AirplaneCatalog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaush
 */
public class ListAllFlights extends javax.swing.JPanel {
    private JPanel userControlDisplayPanel;
    private AirplaneCatalog aCatalog;
   
    /**
     * Creates new form ListAllFlights
     */
    

    ListAllFlights(JPanel userControlDisplayPanel, AirplaneCatalog aCatalog) {
        initComponents();
        this.userControlDisplayPanel=userControlDisplayPanel;
        this.aCatalog=aCatalog;
       
        populateTable();
    
    }

    
    public void populateTable(){
    DefaultTableModel dtm=(DefaultTableModel)tblListAll.getModel();
    dtm.setNumRows(0);
    
    for(Airplane vs:aCatalog.getAirlineCatalog())
      
    {
        
    Object row[]=new Object[10];
    row[0]=vs.getAirlinerName();
    row[1]=vs.getAirlineID();
    row[2]=vs.getFlightNumber();
    row[3]=vs.getModelNumber();
    row[4]=vs.getManufactureName();
    row[5]=vs.getFromLocation();
    row[6]=vs.getToLocation();
    row[9]=vs.getSeatPrice();
    row[8]=vs.getArrival();
    row[7]=vs.getDeparture();
    
    dtm.addRow(row);
    
    }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListAll = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblListAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Airline ID", "Flight Number", "Model Number", "Manufacture Name", "From ", "To", "Arrival Time", "Departure Time", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListAll);
        if (tblListAll.getColumnModel().getColumnCount() > 0) {
            tblListAll.getColumnModel().getColumn(0).setResizable(false);
            tblListAll.getColumnModel().getColumn(1).setResizable(false);
            tblListAll.getColumnModel().getColumn(2).setResizable(false);
            tblListAll.getColumnModel().getColumn(3).setResizable(false);
            tblListAll.getColumnModel().getColumn(4).setResizable(false);
            tblListAll.getColumnModel().getColumn(5).setResizable(false);
            tblListAll.getColumnModel().getColumn(6).setResizable(false);
            tblListAll.getColumnModel().getColumn(7).setResizable(false);
            tblListAll.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH ALL FLIGHTS");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListAll;
    // End of variables declaration//GEN-END:variables
}

