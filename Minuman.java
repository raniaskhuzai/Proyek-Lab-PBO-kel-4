/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

/**
 *
 * @author hani
 */
public class Minuman extends javax.swing.JFrame {

    /**
     * Creates new form Minuman
     */
    public Minuman() {
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

        jButton1 = new javax.swing.JButton();
        rkmminum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manis = new javax.swing.JCheckBox();
        asam = new javax.swing.JCheckBox();
        asin = new javax.swing.JCheckBox();
        pahit = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        reg = new javax.swing.JCheckBox();
        med = new javax.swing.JCheckBox();
        lrg = new javax.swing.JCheckBox();
        ice = new javax.swing.JCheckBox();
        hot = new javax.swing.JCheckBox();
        kaf = new javax.swing.JCheckBox();
        nonkaf = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jpn = new javax.swing.JCheckBox();
        china = new javax.swing.JCheckBox();
        ina = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampil = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rkmminum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rkmminum.setText("REKOMENDASI MINUMAN");

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        jLabel1.setText("Request Rasa Yang Diinginkan :");

        manis.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        manis.setText("Manis");

        asam.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        asam.setText("Asam");

        asin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        asin.setText("Asin");

        pahit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        pahit.setText("Pahit");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        jLabel2.setText("Budget Pelanggan : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        jLabel3.setText("Ukuran minuman :");

        reg.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        reg.setText("Regular");

        med.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        med.setText("Medium");

        lrg.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        lrg.setText("Large");

        ice.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        ice.setText("Ice");

        hot.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        hot.setText("Hot");

        kaf.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        kaf.setText("Kafein");

        nonkaf.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        nonkaf.setText("Non Kafein");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        jLabel4.setText("Asal Negara :");

        jpn.setText("Jepang");
        jpn.setToolTipText("");

        china.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        china.setText("China");

        ina.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        ina.setText("Indonesia");

        tampil.setColumns(20);
        tampil.setRows(5);
        jScrollPane1.setViewportView(tampil);

        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jButton2.setText("Pesan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jButton3.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(rkmminum))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manis, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(asam)
                        .addGap(18, 18, 18)
                        .addComponent(asin)
                        .addGap(18, 18, 18)
                        .addComponent(pahit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reg)
                            .addComponent(ice)
                            .addComponent(kaf))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nonkaf)
                            .addComponent(hot)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(med)
                                .addGap(18, 18, 18)
                                .addComponent(lrg))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(china)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ina))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkmminum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asam)
                    .addComponent(asin)
                    .addComponent(pahit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg)
                    .addComponent(med)
                    .addComponent(lrg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ice)
                    .addComponent(hot))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaf)
                    .addComponent(nonkaf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jpn)
                    .addComponent(china)
                    .addComponent(ina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String show;
        show = "";
        if(jpn.isSelected()){
            nonkaf.isSelected();
            jpn.isSelected();
            show +="Request Rasa "+pahit.getText()+" "+nonkaf.getText();
            show +="\nRekomendasi Minuman Ocha\n";
            show +="Asal Negara "+jpn.getText()+"\n";
        }
        if(china.isSelected()){
            nonkaf.isSelected();
            china.isSelected();
            show +="Request Rasa "+manis.getText()+" "+nonkaf.getText();
            show +="\nRekomendasi Minuman Bubble Tea\n";
            show +="Asal Negara "+china.getText()+"\n";
        }
        if(ina.isSelected()){
            manis.isSelected();
            nonkaf.isSelected();
            ina.isSelected();
            show +="Request Rasa "+manis.getText()+" "+nonkaf.getText();
            show +="\nRekomendasi Minuman Es Jeruk\n";
            show +="Asal Negara "+ina.getText()+"\n";
        }
        
        tampil.setText(show);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Minuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox asam;
    private javax.swing.JCheckBox asin;
    private javax.swing.JCheckBox china;
    private javax.swing.JCheckBox hot;
    private javax.swing.JCheckBox ice;
    private javax.swing.JCheckBox ina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox jpn;
    private javax.swing.JCheckBox kaf;
    private javax.swing.JCheckBox lrg;
    private javax.swing.JCheckBox manis;
    private javax.swing.JCheckBox med;
    private javax.swing.JCheckBox nonkaf;
    private javax.swing.JCheckBox pahit;
    private javax.swing.JCheckBox reg;
    private javax.swing.JLabel rkmminum;
    private javax.swing.JTextArea tampil;
    // End of variables declaration//GEN-END:variables
}