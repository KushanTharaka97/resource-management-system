/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_projectse;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class AddNewAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AddNewAdmin
     */
    public AddNewAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        my_projectsePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("my_projectsePU").createEntityManager();
        admintableQuery = java.beans.Beans.isDesignTime() ? null : my_projectsePUEntityManager.createQuery("SELECT a FROM Admintable a");
        admintableList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery.getResultList();
        admintableQuery1 = java.beans.Beans.isDesignTime() ? null : my_projectsePUEntityManager.createQuery("SELECT a FROM Admintable a");
        admintableList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery1.getResultList();
        admintableQuery2 = java.beans.Beans.isDesignTime() ? null : my_projectsePUEntityManager.createQuery("SELECT a FROM Admintable a");
        admintableList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery2.getResultList();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("my_projectse?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        admintableQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Admintable a");
        admintableList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery3.getResultList();
        admintableQuery4 = java.beans.Beans.isDesignTime() ? null : my_projectsePUEntityManager.createQuery("SELECT a FROM Admintable a");
        admintableList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery4.getResultList();
        admintableQuery5 = java.beans.Beans.isDesignTime() ? null : my_projectsePUEntityManager.createQuery("SELECT a FROM Admintable a");
        admintableList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery5.getResultList();
        admintableQuery6 = java.beans.Beans.isDesignTime() ? null : my_projectsePUEntityManager.createQuery("SELECT a FROM Admintable a");
        admintableList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : admintableQuery6.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jButton_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_create = new javax.swing.JButton();
        jButton_help = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton_Minimize1 = new javax.swing.JButton();
        jButton_Close1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back-512.png"))); // NOI18N
        jButton_Back.setToolTipText("Back to Main Menue");
        jButton_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Admin");
        jLabel1.setToolTipText("Add a new admin to the system");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 51), new java.awt.Color(102, 255, 102), null, null));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator-1188494_960_720.jpg"))); // NOI18N

        jButton_create.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_create.setForeground(new java.awt.Color(51, 255, 51));
        jButton_create.setText("Create Now");
        jButton_create.setToolTipText("Click to create now");
        jButton_create.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 0), new java.awt.Color(153, 255, 153), null, null));
        jButton_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createActionPerformed(evt);
            }
        });

        jButton_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questions.png"))); // NOI18N
        jButton_help.setToolTipText("Questions/Help?");
        jButton_help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_helpActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, admintableList6, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nic}"));
        columnBinding.setColumnName("Nic");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_create, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(676, 676, 676)
                .addComponent(jButton_help, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(853, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton_help, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton_create, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jButton_Minimize1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Minimize1.setForeground(new java.awt.Color(51, 51, 255));
        jButton_Minimize1.setText("-");
        jButton_Minimize1.setToolTipText("Minimize the window");
        jButton_Minimize1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255), null, null));
        jButton_Minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Minimize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Minimize1ActionPerformed(evt);
            }
        });

        jButton_Close1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Close1.setForeground(new java.awt.Color(204, 0, 0));
        jButton_Close1.setText("X");
        jButton_Close1.setToolTipText("Close window");
        jButton_Close1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51), null, null));
        jButton_Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Close1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addComponent(jButton_Minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Close1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Close1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        settings form=new settings();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);

        //current window close
        this.dispose();
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_createActionPerformed
        Registry_form form =new Registry_form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        
        //current window close
        this.dispose();
        
        
    }//GEN-LAST:event_jButton_createActionPerformed

    private void jButton_Minimize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Minimize1ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton_Minimize1ActionPerformed

    private void jButton_Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Close1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_Close1ActionPerformed

    private void jButton_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_helpActionPerformed
        JOptionPane.showMessageDialog(null,"you can use this window for add new employers to the main database,\n"
                + "From this you can add new employers to the system ,\n"
                + " who are new to the organization [warrning:all the employers must be selected person for the organization]");
    }//GEN-LAST:event_jButton_helpActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<my_projectse.Admintable> admintableList;
    private java.util.List<my_projectse.Admintable> admintableList1;
    private java.util.List<my_projectse.Admintable> admintableList2;
    private java.util.List<my_projectse.Admintable> admintableList3;
    private java.util.List<my_projectse.Admintable> admintableList4;
    private java.util.List<my_projectse.Admintable> admintableList5;
    private java.util.List<my_projectse.Admintable> admintableList6;
    private javax.persistence.Query admintableQuery;
    private javax.persistence.Query admintableQuery1;
    private javax.persistence.Query admintableQuery2;
    private javax.persistence.Query admintableQuery3;
    private javax.persistence.Query admintableQuery4;
    private javax.persistence.Query admintableQuery5;
    private javax.persistence.Query admintableQuery6;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Close1;
    private javax.swing.JButton jButton_Minimize1;
    private javax.swing.JButton jButton_create;
    private javax.swing.JButton jButton_help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.persistence.EntityManager my_projectsePUEntityManager;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}