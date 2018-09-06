/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
//import javax.media.*;

//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
public class NewJFrame extends javax.swing.JFrame {

    ArrayList<String> takim = new ArrayList<String>();
    ArrayList<String> kayitli_takimlar = new ArrayList<String>();
    ArrayList<String> kayitli_takimlar2 = new ArrayList<String>();
    ArrayList<String> grup1 = new ArrayList<>();
    ArrayList<String> grup2 = new ArrayList<>();
    ArrayList<String> grup3 = new ArrayList<>();
    ArrayList<String> grup4 = new ArrayList<>();

    ArrayList<String> grup1_amblem = new ArrayList<>();
    ArrayList<String> grup2_amblem = new ArrayList<>();
    ArrayList<String> grup3_amblem = new ArrayList<>();
    ArrayList<String> grup4_amblem = new ArrayList<>();

    public NewJFrame() {
        initComponents();
        
        jLabel2.setVisible(false);
        jTextField1.setVisible(false);
        jButton1.setVisible(false);
        jButton4.setVisible(false);
        jScrollPane2.setVisible(false);
        jLabel5.setVisible(false);

        this.setSize(700, 550);
        try {
            AudioPlayer.player.start(new AudioStream(getClass().getResourceAsStream("/sounds/UEFA Champions League.wav")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        kayitli_takimlar.add("ARSENAL");
        kayitli_takimlar.add("ATLETICO MADRID");
        kayitli_takimlar.add("BARCELONA");
        kayitli_takimlar.add("BAYERN MUNCHEN");
        kayitli_takimlar.add("BENFICA");
        kayitli_takimlar.add("BEŞİKTAŞ");
        kayitli_takimlar.add("BORUSSIA DORTMUND");
        kayitli_takimlar.add("CHELSEA");
        kayitli_takimlar.add("FENERBAHÇE");
        kayitli_takimlar.add("GALATASARAY");
        kayitli_takimlar.add("INTER");
        kayitli_takimlar.add("JUVENTUS");
        kayitli_takimlar.add("LIVERPOOL");
        kayitli_takimlar.add("MANCHESTER CITY");
        kayitli_takimlar.add("MANCHESTER UNITED");
        kayitli_takimlar.add("MILAN");
        kayitli_takimlar.add("NAPOLI");
        kayitli_takimlar.add("PORTO");
        kayitli_takimlar.add("PSG");
        kayitli_takimlar.add("REAL MADRID");
        kayitli_takimlar.add("ROMA");
        kayitli_takimlar.add("TAVŞANLI LİNYİT SPOR");
        kayitli_takimlar.add("TRABZON SPOR");
        kayitli_takimlar.add("VALENCIA");
//        System.out.println(kayitli_takimlar.size());
//        System.out.println(kayitli_takimlar2.size());
        for (int i = 0; i < kayitli_takimlar.size(); i++) {
            kayitli_takimlar2.add(kayitli_takimlar.get(i));
        }
//        System.out.println(kayitli_takimlar2.size());
//        System.out.println(kayitli_takimlar.size());

        takim_listesi_yazdir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ŞAMPİYONLAR LİGİ");
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(333, 20, 70, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("TAKIM EKLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 20, 110, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("GRUP VE FİKSTÜR OLUŞTUR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 20, 185, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TAKIM EKLE");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 80, 73, 15);

        jTextField1.setBackground(new java.awt.Color(102, 153, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(230, 100, 210, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("OTOMATİK ATA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 180, 210, 31);

        jList1.setBackground(new java.awt.Color(102, 153, 255));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 196, 310);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 140, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TAKIM LİSTESİ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 70, 100, 15);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/dbyty.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (takim.size() != 16) {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "lütfen isim giriniz");
            } else {
                takim.add(jTextField1.getText().toUpperCase());
                jTextField1.setText(null);

                takim_listesi_yazdir();
            }
        }
        if (takim.size() == 16) {
            JOptionPane.showMessageDialog(rootPane, "takım listesi doldu");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel2.setVisible(true);
        jTextField1.setVisible(true);
        jButton1.setVisible(true);
        jButton4.setVisible(true);
        jScrollPane2.setVisible(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Random random = new Random();
        int temp;
        if (takim.size() != 16) {
            while (takim.size() != 16) {
                temp = random.nextInt(kayitli_takimlar.size());
                takim.add(kayitli_takimlar.get(temp));
                kayitli_takimlar.remove(temp);
                takim_listesi_yazdir();
            }
        }
        if (takim.size() == 16) {
            JOptionPane.showMessageDialog(rootPane, "takım listesi doldu");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (takim.size() == 16) {
            Random r = new Random();
            int temp2;
            while (takim.size() != 0) {
                if (grup1.size() != 4) {
                    temp2 = r.nextInt(takim.size());
                    grup1.add(takim.get(temp2));
                    if (kayitli_takimlar2.contains(takim.get(temp2))) {
                        grup1_amblem.add(takim.get(temp2));
                    } else {
                        grup1_amblem.add("DEFAULT");
                    }
                    takim.remove(temp2);

                } else if (grup2.size() != 4) {
                    temp2 = r.nextInt(takim.size());
                    grup2.add(takim.get(temp2));
                    if (kayitli_takimlar2.contains(takim.get(temp2))) {
                        grup2_amblem.add(takim.get(temp2));
                    } else {
                        grup2_amblem.add("DEFAULT");
                    }
                    takim.remove(temp2);

                } else if (grup3.size() != 4) {
                    temp2 = r.nextInt(takim.size());
                    grup3.add(takim.get(temp2));
                    if (kayitli_takimlar2.contains(takim.get(temp2))) {
                        grup3_amblem.add(takim.get(temp2));
                    } else {
                        grup3_amblem.add("DEFAULT");
                    }
                    takim.remove(temp2);

                } else if (grup4.size() != 4) {
                    temp2 = r.nextInt(takim.size());
                    grup4.add(takim.get(temp2));
                    if (kayitli_takimlar2.contains(takim.get(temp2))) {
                        grup4_amblem.add(takim.get(temp2));
                    } else {
                        grup4_amblem.add("DEFAULT");
                    }
                    takim.remove(temp2);

                }
            }

            NewJFrame1 frame = new NewJFrame1(this, null);
            frame.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "takım listesi eksik");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void takim_listesi_yazdir() {
        Object[] isimler = new Object[takim.size()];
        for (int i = 0; i < isimler.length; i++) {
            isimler[i] = takim.get(i);
        }
        jList1.setListData(isimler);
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
