/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sk.stu.fiit.inputs.InputSanitizer;
import sk.stu.fiit.agency.Employer;

/**
 *
 * @author PeterSmrecek
 */
public class AddEmployerWindow extends javax.swing.JFrame {

    /**
     * Creates new form ShowEmployerWindow
     */
    
    Main_window main_window;
    final JFileChooser fc = new JFileChooser();
    ImageIcon icon;
    
    public AddEmployerWindow(Main_window main_window) {
        initComponents();
        this.main_window = main_window;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        addEmpPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        fieldLbl = new javax.swing.JLabel();
        numberGivenLbl = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        nameTf = new javax.swing.JTextField();
        fieldTf = new javax.swing.JTextField();
        numberGivenTf = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        logoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pridanie zamestnávateľa");
        setLocationByPlatform(true);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        addEmpPnl.setLayout(jPanel1Layout);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Údaje zamestnávateľa");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setPreferredSize(new java.awt.Dimension(600, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        addEmpPnl.add(titleLbl, gridBagConstraints);

        logoLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoLbl.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        addEmpPnl.add(logoLbl, gridBagConstraints);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Názov");
        nameLbl.setPreferredSize(new java.awt.Dimension(300, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        addEmpPnl.add(nameLbl, gridBagConstraints);

        fieldLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldLbl.setText("Oblasť podnikania");
        fieldLbl.setPreferredSize(new java.awt.Dimension(300, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        addEmpPnl.add(fieldLbl, gridBagConstraints);

        numberGivenLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberGivenLbl.setText("Počet zamestnancov firmy");
        numberGivenLbl.setPreferredSize(new java.awt.Dimension(300, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        addEmpPnl.add(numberGivenLbl, gridBagConstraints);

        okBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        addEmpPnl.add(okBtn, gridBagConstraints);

        nameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        addEmpPnl.add(nameTf, gridBagConstraints);

        fieldTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        addEmpPnl.add(fieldTf, gridBagConstraints);

        numberGivenTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberGivenTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        addEmpPnl.add(numberGivenTf, gridBagConstraints);

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelBtn.setText("Zrušiť");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        addEmpPnl.add(cancelBtn, gridBagConstraints);

        logoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoBtn.setText("Vybrať logo");
        logoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        addEmpPnl.add(logoBtn, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEmpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEmpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnMouseReleased
        // TODO add your handling code here:
        
        createEmployer();
    }//GEN-LAST:event_okBtnMouseReleased

    private void cancelBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseReleased
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseReleased

    private void logoBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoBtnMouseReleased
        // TODO add your handling code here:
        
        icon = null;
        logoLbl.setIcon(icon);
        
        int returnVal = fc.showOpenDialog(this);
        
        File file = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Nie je vybraný žiaden súbor!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            BufferedImage img = ImageIO.read(file);
            icon = InputSanitizer.resize(img, 180);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Vybraný súbor nie je možné použiť ako logo!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        logoLbl.setIcon(icon);
        
    }//GEN-LAST:event_logoBtnMouseReleased

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ShowEmployerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowEmployerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowEmployerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowEmployerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowEmployerWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addEmpPnl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel fieldLbl;
    private javax.swing.JTextField fieldTf;
    private javax.swing.JButton logoBtn;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel numberGivenLbl;
    private javax.swing.JTextField numberGivenTf;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

    private void createEmployer() {
        
        String name = nameTf.getText();
        String field = fieldTf.getText();
        String numberGivenString = numberGivenTf.getText();
        
        boolean iconBool = icon == null;
        int numberGiven;
        
        try {
            numberGiven = Integer.parseInt(numberGivenString);
            
            if (numberGiven <= 0) {
                throw new Exception("Number is not valid quantity");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Počet zamestnancov musí byť prirodzené číslo!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println(iconBool  + ", " + InputSanitizer.emptyString(name)  + ", " + InputSanitizer.emptyString(field));
        System.out.println(icon + ", " + name + ", " + field + ", " + numberGivenString);
        if (iconBool || InputSanitizer.emptyString(name) || InputSanitizer.emptyString(field)) {
            JOptionPane.showMessageDialog(rootPane,
                    "Žiadne pole nesmie zostať prázdne!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Employer employer = new Employer(name, field, numberGiven, icon);
        main_window.getAgency().addEmployer(employer);
        main_window.updateAll();
        this.dispose();
        
    }
}
