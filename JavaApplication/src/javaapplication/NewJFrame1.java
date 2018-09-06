/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.awt.Color;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author PC
 */
public class NewJFrame1 extends javax.swing.JFrame {

    private NewJFrame ilkPencere;
    private NewJFrame2 ucuncuPencere;
    int width = 60;
    int height = 60;

    public NewJFrame1(NewJFrame ilkPen, NewJFrame2 ucpen) {
        this.ilkPencere = ilkPen;
        this.ucuncuPencere = ucpen;

        ucuncuPencere = new NewJFrame2(this, ilkPen);
        ucuncuPencere.setVisible(false);
        
        initComponents();
        
        this.setSize(1130, 500);
     
        
        //grup1
        ImageIcon image0 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup1_amblem.get(0) + ".png"));
        image0 = new ImageIcon(image0.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel6.setIcon(image0);
        jLabel6.setText(ilkPencere.grup1.get(0));

        ImageIcon image1 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup1_amblem.get(1) + ".png"));
        image1 = new ImageIcon(image1.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel7.setIcon(image1);
        jLabel7.setText(ilkPencere.grup1.get(1));

        ImageIcon image2 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup1_amblem.get(2) + ".png"));
        image2 = new ImageIcon(image2.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel8.setIcon(image2);
        jLabel8.setText(ilkPencere.grup1.get(2));

        ImageIcon image3 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup1_amblem.get(3) + ".png"));
        image3 = new ImageIcon(image3.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel9.setIcon(image3);
        jLabel9.setText(ilkPencere.grup1.get(3));

        //grup2
        ImageIcon image4 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup2_amblem.get(0) + ".png"));
        image4 = new ImageIcon(image4.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel10.setIcon(image4);
        jLabel10.setText(ilkPencere.grup2.get(0));

        ImageIcon image5 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup2_amblem.get(1) + ".png"));
        image5 = new ImageIcon(image5.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel11.setIcon(image5);
        jLabel11.setText(ilkPencere.grup2.get(1));

        ImageIcon image6 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup2_amblem.get(2) + ".png"));
        image6 = new ImageIcon(image6.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel12.setIcon(image6);
        jLabel12.setText(ilkPencere.grup2.get(2));

        ImageIcon image7 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup2_amblem.get(3) + ".png"));
        image7 = new ImageIcon(image7.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel13.setIcon(image7);
        jLabel13.setText(ilkPencere.grup2.get(3));

        //grup3
        ImageIcon image8 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup3_amblem.get(0) + ".png"));
        image8 = new ImageIcon(image8.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel14.setIcon(image8);
        jLabel14.setText(ilkPencere.grup3.get(0));

        ImageIcon image9 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup3_amblem.get(1) + ".png"));
        image9 = new ImageIcon(image9.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel15.setIcon(image9);
        jLabel15.setText(ilkPencere.grup3.get(1));

        ImageIcon image10 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup3_amblem.get(2) + ".png"));
        image10 = new ImageIcon(image10.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel16.setIcon(image10);
        jLabel16.setText(ilkPencere.grup3.get(2));

        ImageIcon image11 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup3_amblem.get(3) + ".png"));
        image11 = new ImageIcon(image11.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel17.setIcon(image11);
        jLabel17.setText(ilkPencere.grup3.get(3));

        //grup4
        ImageIcon image12 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup4_amblem.get(0) + ".png"));
        image12 = new ImageIcon(image12.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel18.setIcon(image12);
        jLabel18.setText(ilkPencere.grup4.get(0));

        ImageIcon image13 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup4_amblem.get(1) + ".png"));
        image13 = new ImageIcon(image13.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel19.setIcon(image13);
        jLabel19.setText(ilkPencere.grup4.get(1));

        ImageIcon image14 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup4_amblem.get(2) + ".png"));
        image14 = new ImageIcon(image14.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel20.setIcon(image14);
        jLabel20.setText(ilkPencere.grup4.get(2));

        ImageIcon image15 = new ImageIcon(this.getClass().getResource("/images/" + ilkPencere.grup4_amblem.get(3) + ".png"));
        image15 = new ImageIcon(image15.getImage().getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH));
        jLabel21.setIcon(image15);
        jLabel21.setText(ilkPencere.grup4.get(3));
        
        ilkPencere.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ŞAMPİYONLAR LİGİ GRUPLAR");
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("FİKSTÜRÜ GÖRÜNTÜLEMEK İÇİN TIKLAYINIZ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 310, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 10, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" GRUP A ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 67, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 120, 270, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 200, 270, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 280, 270, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 360, 270, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" GRUP B ");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 60, 67, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 120, 270, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 200, 270, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(300, 280, 270, 60);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(300, 360, 270, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" GRUP C ");
        jLabel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(580, 60, 67, 23);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(580, 120, 270, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 200, 270, 60);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(580, 280, 270, 60);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(580, 360, 270, 60);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" GRUP D ");
        jLabel23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel23);
        jLabel23.setBounds(860, 60, 67, 23);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(860, 120, 270, 60);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(860, 200, 270, 60);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(860, 280, 270, 60);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(860, 360, 270, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images2/dbyty.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ucuncuPencere.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
