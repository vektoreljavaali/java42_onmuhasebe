/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pinkas.onmuhasebe.gui;

/**
 *
 * @author vektorel
 */
public class frmAnaSayfa extends javax.swing.JFrame {

    /**
     * Creates new form frmAnaSayfa
     */
    public frmAnaSayfa() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        musteriislemleri = new javax.swing.JMenu();
        btnmusteriekle = new javax.swing.JMenuItem();
        btnmusterilistesi = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnborclumusteriler = new javax.swing.JMenuItem();
        stokislemleri = new javax.swing.JMenu();
        btnurunekleme = new javax.swing.JMenuItem();
        btnbirimtanimlama = new javax.swing.JMenuItem();
        btnmarka = new javax.swing.JMenuItem();
        btnmodel = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnstoklistesi = new javax.swing.JMenuItem();
        btnkasaislemleri = new javax.swing.JMenu();
        btnkasatanimlama = new javax.swing.JMenuItem();
        btnkasagirisleri = new javax.swing.JMenuItem();
        btnkasacikislari = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnharcamalar = new javax.swing.JMenuItem();
        btnfaturaislemleri = new javax.swing.JMenu();
        btnfirmatanimlama = new javax.swing.JMenuItem();
        btngirisfaturasi = new javax.swing.JMenuItem();
        btncikisfatura = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        btnfaturarapor = new javax.swing.JMenuItem();
        btnsatis = new javax.swing.JMenu();
        btnsatisyap = new javax.swing.JMenuItem();
        btnodeme = new javax.swing.JMenuItem();
        btnmusterikartı = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        btngunlukrapor = new javax.swing.JMenuItem();
        btngenelraorlama = new javax.swing.JMenuItem();
        btnhakkimizda = new javax.swing.JMenu();
        btncikis = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÖN MUHASEBE OTOMASYONU");

        musteriislemleri.setText("Müşteri İşlemleri");

        btnmusteriekle.setText("Müşteri Ekleme");
        musteriislemleri.add(btnmusteriekle);

        btnmusterilistesi.setText("Müşteri Listesi");
        musteriislemleri.add(btnmusterilistesi);
        musteriislemleri.add(jSeparator1);

        btnborclumusteriler.setText("Borçlu Müşteriler");
        musteriislemleri.add(btnborclumusteriler);

        jMenuBar1.add(musteriislemleri);

        stokislemleri.setText("Stok İşlemleri");

        btnurunekleme.setText("Ürün Ekleme");
        stokislemleri.add(btnurunekleme);

        btnbirimtanimlama.setText("Birim Tanımlama");
        stokislemleri.add(btnbirimtanimlama);

        btnmarka.setText("Marka Ekleme");
        stokislemleri.add(btnmarka);

        btnmodel.setText("Model Ekleme");
        stokislemleri.add(btnmodel);
        stokislemleri.add(jSeparator2);

        btnstoklistesi.setText("Stok Listesi");
        stokislemleri.add(btnstoklistesi);

        jMenuBar1.add(stokislemleri);

        btnkasaislemleri.setText("Kasa İşlemleri");

        btnkasatanimlama.setText("Kasa Tanımlama");
        btnkasaislemleri.add(btnkasatanimlama);

        btnkasagirisleri.setText("Kasa Girişleri");
        btnkasaislemleri.add(btnkasagirisleri);

        btnkasacikislari.setText("Kasa Çıkışları");
        btnkasaislemleri.add(btnkasacikislari);
        btnkasaislemleri.add(jSeparator3);

        btnharcamalar.setText("Harcama İşlemleri");
        btnkasaislemleri.add(btnharcamalar);

        jMenuBar1.add(btnkasaislemleri);

        btnfaturaislemleri.setText("Fatura İşlemleri");

        btnfirmatanimlama.setText("Firma Tanımlama");
        btnfaturaislemleri.add(btnfirmatanimlama);

        btngirisfaturasi.setText("Giriş Faturası İşlemleri");
        btnfaturaislemleri.add(btngirisfaturasi);

        btncikisfatura.setText("Çıkış Faturası İşlemleri");
        btnfaturaislemleri.add(btncikisfatura);
        btnfaturaislemleri.add(jSeparator4);

        btnfaturarapor.setText("Fatura Raporları");
        btnfaturaislemleri.add(btnfaturarapor);

        jMenuBar1.add(btnfaturaislemleri);

        btnsatis.setText("Satış İşlemleri");

        btnsatisyap.setText("Satış Yap");
        btnsatisyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsatisyapActionPerformed(evt);
            }
        });
        btnsatis.add(btnsatisyap);

        btnodeme.setText("Ödeme Al");
        btnsatis.add(btnodeme);

        btnmusterikartı.setText("Müşteri Kartı");
        btnsatis.add(btnmusterikartı);
        btnsatis.add(jSeparator5);

        btngunlukrapor.setText("Günlük Raporlar");
        btnsatis.add(btngunlukrapor);

        btngenelraorlama.setText("Genel Raporlama");
        btnsatis.add(btngenelraorlama);

        jMenuBar1.add(btnsatis);

        btnhakkimizda.setText("Hakkımızda");
        jMenuBar1.add(btnhakkimizda);

        btncikis.setText("Çıkış");
        jMenuBar1.add(btncikis);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsatisyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsatisyapActionPerformed
        frmSatis frm = new frmSatis();
        frm.setVisible(true);
    }//GEN-LAST:event_btnsatisyapActionPerformed

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
            java.util.logging.Logger.getLogger(frmAnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnaSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnbirimtanimlama;
    private javax.swing.JMenuItem btnborclumusteriler;
    private javax.swing.JMenu btncikis;
    private javax.swing.JMenuItem btncikisfatura;
    private javax.swing.JMenu btnfaturaislemleri;
    private javax.swing.JMenuItem btnfaturarapor;
    private javax.swing.JMenuItem btnfirmatanimlama;
    private javax.swing.JMenuItem btngenelraorlama;
    private javax.swing.JMenuItem btngirisfaturasi;
    private javax.swing.JMenuItem btngunlukrapor;
    private javax.swing.JMenu btnhakkimizda;
    private javax.swing.JMenuItem btnharcamalar;
    private javax.swing.JMenuItem btnkasacikislari;
    private javax.swing.JMenuItem btnkasagirisleri;
    private javax.swing.JMenu btnkasaislemleri;
    private javax.swing.JMenuItem btnkasatanimlama;
    private javax.swing.JMenuItem btnmarka;
    private javax.swing.JMenuItem btnmodel;
    private javax.swing.JMenuItem btnmusteriekle;
    private javax.swing.JMenuItem btnmusterikartı;
    private javax.swing.JMenuItem btnmusterilistesi;
    private javax.swing.JMenuItem btnodeme;
    private javax.swing.JMenu btnsatis;
    private javax.swing.JMenuItem btnsatisyap;
    private javax.swing.JMenuItem btnstoklistesi;
    private javax.swing.JMenuItem btnurunekleme;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu musteriislemleri;
    private javax.swing.JMenu stokislemleri;
    // End of variables declaration//GEN-END:variables
}
