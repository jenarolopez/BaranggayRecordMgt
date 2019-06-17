
package pack;

import static pack.Dashboard.flag;
import static pack.Dashboard.indexes;
import static pack.Dashboard.searchIndex;

public class Records extends javax.swing.JFrame {

    String name="";
    public Records() {
        initComponents();
        
        setLocationRelativeTo(null);
        if(flag==false)
        {
            name = Variables.Fullname.get(searchIndex);
        }
        else
        {
            name = Variables.Fullname.get(indexes.get(searchIndex));
        }
        
        namelbl.setText("Records of "+name);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recordsP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        namelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(629, 581));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record", "Record Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        recordsTable.setRowHeight(20);
        jScrollPane1.setViewportView(recordsTable);
        if (recordsTable.getColumnModel().getColumnCount() > 0) {
            recordsTable.getColumnModel().getColumn(0).setResizable(false);
            recordsTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            recordsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        recordsP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, 360));

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addbtn.setText("Add Record");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        recordsP.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("ALL RECORDS");
        recordsP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, -1));

        getContentPane().add(recordsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 610, 410));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 80, 30));

        namelbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        namelbl.setText("jLabel3");
        getContentPane().add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
    }//GEN-LAST:event_addbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JPanel recordsP;
    private javax.swing.JTable recordsTable;
    // End of variables declaration//GEN-END:variables
}
