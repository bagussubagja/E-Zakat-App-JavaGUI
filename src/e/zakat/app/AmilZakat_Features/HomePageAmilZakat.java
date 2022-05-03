/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.AmilZakat_Features;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author bagus
 */
public class HomePageAmilZakat extends javax.swing.JFrame {

    /**
     * Creates new form HomePageAmilZakat
     */
    public HomePageAmilZakat() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/main-menu-logo.png")));
    
    Image img1 = myimage.getImage();
    Image img2 = img1.getScaledInstance(IconLabel.getWidth(), IconLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon i = new ImageIcon(img2);
    
    IconLabel.setIcon(i);
    
    ImageIcon myimage2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-copyright.png")));
    
    Image img3 = myimage2.getImage();
    Image img4 = img3.getScaledInstance(CopyrightLabel.getWidth(), CopyrightLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon j = new ImageIcon(img4);
    
    CopyrightLabel.setIcon(j);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IconLabel = new javax.swing.JLabel();
        dataTransaksi_radio = new javax.swing.JRadioButton();
        dataAntrian_radio = new javax.swing.JRadioButton();
        struktur_radio = new javax.swing.JRadioButton();
        btn_login = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CopyrightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("é-Zakat - Amil Zakat");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Selamat datang, Masjid Nurul Falah");

        buttonGroup1.add(dataTransaksi_radio);
        dataTransaksi_radio.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        dataTransaksi_radio.setText("Data Transaksi Zakat Maal");
        dataTransaksi_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTransaksi_radioActionPerformed(evt);
            }
        });

        buttonGroup1.add(dataAntrian_radio);
        dataAntrian_radio.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        dataAntrian_radio.setText("Data Antrian Zakat Fitrah");
        dataAntrian_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAntrian_radioActionPerformed(evt);
            }
        });

        buttonGroup1.add(struktur_radio);
        struktur_radio.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        struktur_radio.setText("Struktur Kepengurusan Amil Zakat");

        btn_login.setBackground(new java.awt.Color(24, 152, 139));
        btn_login.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(238, 238, 238));
        btn_login.setText("Pilih Menu");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(221, 221, 221));
        btn_back.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        btn_back.setText("Keluar");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel3.setText("Menu Utama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataTransaksi_radio)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataAntrian_radio)
                                    .addComponent(struktur_radio))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(504, 504, 504))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dataTransaksi_radio)
                        .addGap(18, 18, 18)
                        .addComponent(dataAntrian_radio)
                        .addGap(18, 18, 18)
                        .addComponent(struktur_radio)
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        if(dataTransaksi_radio.isSelected()){
        
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void dataTransaksi_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTransaksi_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTransaksi_radioActionPerformed

    private void dataAntrian_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAntrian_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataAntrian_radioActionPerformed

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
            java.util.logging.Logger.getLogger(HomePageAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageAmilZakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_login;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dataAntrian_radio;
    private javax.swing.JRadioButton dataTransaksi_radio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton struktur_radio;
    // End of variables declaration//GEN-END:variables
}