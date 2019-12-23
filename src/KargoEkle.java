
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class KargoEkle extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
    int id;
    public KargoEkle() {
        initComponents();
        super.getContentPane().setBackground(Color.PINK);
        bttnIdIcın.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGönderenAdı = new javax.swing.JTextField();
        txtGönderenSoyad = new javax.swing.JTextField();
        txtGönderenTc = new javax.swing.JTextField();
        txtGönderenTel = new javax.swing.JTextField();
        txtGönderenAdres = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtAlıcıAd = new javax.swing.JTextField();
        txtAlıcıSoyad = new javax.swing.JTextField();
        txtAlıcıTel = new javax.swing.JTextField();
        txtAlıcıAdres = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAlıcıNot = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtGönderenTarih = new datechooser.beans.DateChooserCombo();
        bttnIdIcın = new javax.swing.JButton();
        rbYurtIci = new javax.swing.JRadioButton();
        rbYurtDisi = new javax.swing.JRadioButton();
        txtalıcıtc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kargo Ekle");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gönderen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 11, 88, 33));

        jLabel2.setText("Alıcı ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 11, 77, 33));

        jLabel3.setText("Adı                 :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        jLabel4.setText("Soyadı           :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, -1));

        jLabel5.setText("TC. Kimlik No :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, -1, -1));

        jLabel6.setText("Telefon Num.  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, -1, -1));

        jLabel7.setText("Tarih              :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel8.setText("Adres             :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, -1, -1));

        jLabel9.setText("Kargo Türü    :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 376, -1, -1));
        getContentPane().add(txtGönderenAdı, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 62, 194, 28));
        getContentPane().add(txtGönderenSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 101, 194, 29));
        getContentPane().add(txtGönderenTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 136, 194, 34));
        getContentPane().add(txtGönderenTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 189, 179, 31));
        getContentPane().add(txtGönderenAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 275, 182, 54));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Kırılacak" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 373, 124, -1));

        jLabel10.setText("Adı                 :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 76, -1, -1));

        jLabel11.setText("Soyadı           :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel13.setText("Telefon Num. :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 197, -1, -1));

        jLabel14.setText("Adres             :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 274, -1, -1));
        getContentPane().add(txtAlıcıAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 62, 203, 28));
        getContentPane().add(txtAlıcıSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 101, 203, 29));
        getContentPane().add(txtAlıcıTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 189, 203, 31));
        getContentPane().add(txtAlıcıAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 254, 203, 54));

        jLabel15.setText("Not                :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 340, -1, 34));
        getContentPane().add(txtAlıcıNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 347, 203, -1));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 515, -1, -1));

        jLabel17.setText("Ödeme Şekli: ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 443, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kapıda Ödeme", "Kredi Kartı" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 440, 155, -1));

        jLabel18.setText("Ağırlık:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 543, -1, -1));

        jSlider1.setMaximum(1000);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSlider1MouseClicked(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 534, -1, -1));

        jButton2.setText("Ücretlendir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 584, -1, -1));

        jLabel20.setText("Ücret:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 579, 53, 32));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 570, 93, 32));

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 523, 135, 47));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 515, -1, -1));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 579, 76, 34));

        jLabel23.setText("Ağırlık");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 531, 71, 31));

        txtGönderenTarih.setCalendarPreferredSize(new java.awt.Dimension(500, 500));
        txtGönderenTarih.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                txtGönderenTarihOnSelectionChange(evt);
            }
        });
        getContentPane().add(txtGönderenTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 244, -1, -1));

        bttnIdIcın.setText("Id numarası için >>");
        bttnIdIcın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnIdIcınActionPerformed(evt);
            }
        });
        getContentPane().add(bttnIdIcın, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 523, -1, 47));

        buttonGroup1.add(rbYurtIci);
        rbYurtIci.setText("Yurtiçi Kargo");
        rbYurtIci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYurtIciActionPerformed(evt);
            }
        });
        getContentPane().add(rbYurtIci, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 415, 117, -1));

        buttonGroup1.add(rbYurtDisi);
        rbYurtDisi.setText("Yurtdışı Kargo");
        rbYurtDisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYurtDisiActionPerformed(evt);
            }
        });
        getContentPane().add(rbYurtDisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 415, 110, -1));
        getContentPane().add(txtalıcıtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 136, 203, 35));

        jLabel12.setText("TC. Kimlik No:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 146, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ucakbult.jpg"))); // NOI18N
        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 630));

        setSize(new java.awt.Dimension(925, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Kargo k = new Kargo();

        if (rbYurtIci.isSelected()) {

            if (jSlider1.getValue() >= 0 && jSlider1.getValue() <= 50) {
                jLabel22.setText("50 TL");
            } else if (jSlider1.getValue() > 50 && jSlider1.getValue() <= 200) {
                jLabel22.setText("150 TL");
            } else if (jSlider1.getValue() > 200 && jSlider1.getValue() <= 500) {
                jLabel22.setText("350 TL");
            } else if (jSlider1.getValue() > 500 && jSlider1.getValue() <= 800) {
                jLabel22.setText("650 TL");
            } else if (jSlider1.getValue() > 800 && jSlider1.getValue() <= 1000) {
                jLabel22.setText("900 TL");
            }
        } else if (rbYurtDisi.isSelected()) {

            YurtDisi yd = new YurtDisi();

            if (jSlider1.getValue() >= 0 && jSlider1.getValue() <= 50) {
                jLabel22.setText("500 TL");

            } else if (jSlider1.getValue() > 50 && jSlider1.getValue() <= 200) {
                jLabel22.setText("1500 TL");

            } else if (jSlider1.getValue() > 200 && jSlider1.getValue() <= 500) {
                jLabel22.setText("3500 TL");

            } else if (jSlider1.getValue() > 500 && jSlider1.getValue() <= 800) {
                jLabel22.setText("6500 TL");

            } else if (jSlider1.getValue() > 800 && jSlider1.getValue() <= 1000) {
                jLabel22.setText("9000 TL");

            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jSlider1MouseClicked

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
     
        
        try {
            // TODO add your handling code here:

            JOptionPane.showMessageDialog(this, "Kargonuz kaydedildi.Id numaranızı öğrenmek için diğer butona tıklayınız. ");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sql = "INSERT INTO alankısı (tc,ad,soyad,tel,adres) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, (txtalıcıtc.getText()));
            ps.setString(2, txtAlıcıAd.getText());
            ps.setString(3, txtAlıcıSoyad.getText());
            ps.setString(4, txtAlıcıTel.getText());
            ps.setString(5, txtAlıcıAdres.getText());

            ps.executeUpdate();

               Kargo.kargoId++;
               
              String sql1="INSERT INTO gonderenkısı (tc,ad,soyad,tel,adres) VALUES (?,?,?,?,?)";
              PreparedStatement ps1 = con.prepareStatement(sql1);
               ps1.setString(1, txtGönderenTc.getText());
               ps1.setString(2, txtGönderenAdı.getText());
               ps1.setString(3, txtGönderenSoyad.getText());
               ps1.setString(4, txtGönderenTel.getText());
               ps1.setString(5, txtGönderenAdres.getText());
               
               ps1.executeUpdate();
       
           
            
            
          String   sql2="INSERT INTO KARGOLAR  (alanTc,gönderenTc) VALUES (?,?)";
          PreparedStatement  ps2 = con.prepareStatement(sql2);
        
            ps2.setString(1, txtalıcıtc.getText());
            ps2.setString(2, txtGönderenTc.getText());
            
            ps2.executeUpdate();
            
            
         String sql3= "SELECT KARGOID FROM KARGOLAR WHERE alanTc=? AND gönderenTC=?";
            PreparedStatement ps3= con.prepareStatement(sql3);
               ps3.setString(1, txtalıcıtc.getText());
            ps3.setString(2, txtGönderenTc.getText());
            
            ResultSet rs1= ps3.executeQuery();
            while(rs1.next()){
                id=rs1.getInt(1);
            
            
            }       
            
            
            
            
            
            txtAlıcıAd.setText(null);
            txtAlıcıSoyad.setText(null);
            txtAlıcıAdres.setText(null);
            txtAlıcıNot.setText(null);
            txtAlıcıTel.setText(null);
            txtGönderenAdres.setText(null);
            txtGönderenAdı.setText(null);
            txtGönderenSoyad.setText(null);
            txtGönderenTarih.setText(null);
            txtGönderenTc.setText(null);
            txtGönderenTel.setText(null);
            txtalıcıtc.setText(null);
            
            
            
            bttnIdIcın.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(KargoEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          

    }//GEN-LAST:event_btnKaydetActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

        jLabel23.setText(String.valueOf(jSlider1.getValue() + ""));
    }//GEN-LAST:event_jSlider1StateChanged

    private void txtGönderenTarihOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_txtGönderenTarihOnSelectionChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtGönderenTarihOnSelectionChange

    private void bttnIdIcınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnIdIcınActionPerformed
          
        
        MüsteriId mı=new MüsteriId(id);
         mı.setVisible(true);
        
    }//GEN-LAST:event_bttnIdIcınActionPerformed

    private void rbYurtIciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYurtIciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbYurtIciActionPerformed

    private void rbYurtDisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYurtDisiActionPerformed

    }//GEN-LAST:event_rbYurtDisiActionPerformed

    private void txtAlıcıNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlıcıNotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlıcıNotActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KargoEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KargoEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KargoEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KargoEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KargoEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton bttnIdIcın;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JRadioButton rbYurtDisi;
    private javax.swing.JRadioButton rbYurtIci;
    private javax.swing.JTextField txtAlıcıAd;
    private javax.swing.JTextField txtAlıcıAdres;
    private javax.swing.JTextField txtAlıcıNot;
    private javax.swing.JTextField txtAlıcıSoyad;
    private javax.swing.JTextField txtAlıcıTel;
    private javax.swing.JTextField txtGönderenAdres;
    private javax.swing.JTextField txtGönderenAdı;
    private javax.swing.JTextField txtGönderenSoyad;
    private datechooser.beans.DateChooserCombo txtGönderenTarih;
    private javax.swing.JTextField txtGönderenTc;
    private javax.swing.JTextField txtGönderenTel;
    private javax.swing.JTextField txtalıcıtc;
    // End of variables declaration//GEN-END:variables
}
