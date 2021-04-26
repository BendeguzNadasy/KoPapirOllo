package kopapirollo;

import java.util.ArrayList;
import javax.swing.JButton;

public class Ablak extends javax.swing.JFrame {
    public ArrayList<String> opcio; //= new ArrayList {"KŐ", "PAPÍR", "OLLÓ"} ;
    Jatekos jatekos;
    Gep gep;
    public String jatekosOp;
    public String gepOp;
    public int gepInd;
    public int dontetlen;
    
    public Ablak() {
        initComponents();
        opcio = new ArrayList<>();
        opcio.add("KŐ");
        opcio.add("PAPÍR");
        opcio.add("OLLÓ");
        ujJatek();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp = new javax.swing.ButtonGroup();
        btnKo = new javax.swing.JButton();
        btnOllo = new javax.swing.JButton();
        btnPapir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblGepValasztasa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblKorAllasa = new javax.swing.JLabel();
        lblGepNyeresei = new javax.swing.JLabel();
        lblJatekosNyeresei = new javax.swing.JLabel();
        lblModKiir = new javax.swing.JLabel();
        lblDonteltenek = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuJatek = new javax.swing.JMenu();
        mnuUjJatek = new javax.swing.JMenuItem();
        mnuMentes = new javax.swing.JMenuItem();
        mnuBetoltes = new javax.swing.JMenuItem();
        mnuMod = new javax.swing.JMenu();
        mnuMod3 = new javax.swing.JRadioButtonMenuItem();
        mnuMod5 = new javax.swing.JRadioButtonMenuItem();
        mnuMod7 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kő Papír Olló");

        btnKo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnKo.setText("KŐ");
        btnKo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jatekosValaszt(evt);
            }
        });

        btnOllo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOllo.setText("OLLÓ");
        btnOllo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jatekosValaszt(evt);
            }
        });

        btnPapir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPapir.setText("PAPÍR");
        btnPapir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jatekosValaszt(evt);
            }
        });

        jLabel1.setText("Válassz:");

        lblGepValasztasa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGepValasztasa.setText("Gép választása:");

        lblKorAllasa.setText("-- Kör állása --");

        lblGepNyeresei.setText("Gép nyerései:");

        lblJatekosNyeresei.setText("Te nyeréseid:");

        lblModKiir.setText("Mód: ");

        lblDonteltenek.setText("Döntetlenek:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDonteltenek)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGepNyeresei)
                            .addComponent(lblJatekosNyeresei)
                            .addComponent(lblModKiir)
                            .addComponent(lblKorAllasa))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblKorAllasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModKiir)
                .addGap(5, 5, 5)
                .addComponent(lblGepNyeresei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJatekosNyeresei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDonteltenek)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuJatek.setText("Játék");

        mnuUjJatek.setText("Új játék");
        mnuUjJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujJatek(evt);
            }
        });
        mnuJatek.add(mnuUjJatek);

        mnuMentes.setText("Mentés");
        mnuJatek.add(mnuMentes);

        mnuBetoltes.setText("Betöltés");
        mnuJatek.add(mnuBetoltes);

        jMenuBar1.add(mnuJatek);

        mnuMod.setText("Mód");

        btnGrp.add(mnuMod3);
        mnuMod3.setSelected(true);
        mnuMod3.setText("3 nyerésig");
        mnuMod.add(mnuMod3);

        btnGrp.add(mnuMod5);
        mnuMod5.setText("5 nyerésig");
        mnuMod.add(mnuMod5);

        btnGrp.add(mnuMod7);
        mnuMod7.setText("7 nyerésig");
        mnuMod.add(mnuMod7);

        jMenuBar1.add(mnuMod);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPapir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOllo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(lblGepValasztasa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPapir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOllo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGepValasztasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jatekosValaszt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jatekosValaszt
        JButton g = (JButton) evt.getSource();
        jatekosOp = g.getText();
        //System.out.println(jatekosOp);
        gepValaszt();
        kiNyer();
    }//GEN-LAST:event_jatekosValaszt

    private void ujJatek(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujJatek
        // TODO add your handling code here:
    }//GEN-LAST:event_ujJatek

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
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnKo;
    private javax.swing.JButton btnOllo;
    private javax.swing.JButton btnPapir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDonteltenek;
    private javax.swing.JLabel lblGepNyeresei;
    private javax.swing.JLabel lblGepValasztasa;
    private javax.swing.JLabel lblJatekosNyeresei;
    private javax.swing.JLabel lblKorAllasa;
    private javax.swing.JLabel lblModKiir;
    private javax.swing.JMenuItem mnuBetoltes;
    private javax.swing.JMenu mnuJatek;
    private javax.swing.JMenuItem mnuMentes;
    private javax.swing.JMenu mnuMod;
    private javax.swing.JRadioButtonMenuItem mnuMod3;
    private javax.swing.JRadioButtonMenuItem mnuMod5;
    private javax.swing.JRadioButtonMenuItem mnuMod7;
    private javax.swing.JMenuItem mnuUjJatek;
    // End of variables declaration//GEN-END:variables

    private void kiNyer() {
        if ((gepOp.equals("KŐ") && jatekosOp.equals("PAPÍR"))
                || (gepOp.equals("PAPÍR") && jatekosOp.equals("OLLÓ"))
                || (gepOp.equals("OLLÓ") && jatekosOp.equals("KŐ"))
        ) 
        {
            jatekos.jatekosNyer();
            lblJatekosNyeresei.setText("Te nyeréseid: " + jatekos.getNyeresek());
            System.out.println("Játékos nyer");
        }
        else if ((jatekosOp.equals("KŐ") && gepOp.equals("PAPÍR"))
                || (jatekosOp.equals("PAPÍR") && gepOp.equals("OLLÓ"))
                || (jatekosOp.equals("OLLÓ") && gepOp.equals("KŐ"))
        ) 
        {
            gep.jatekosNyer();
            lblGepNyeresei.setText("Gép nyerései: " + gep.getNyeresek());
            System.out.println("Gép nyer");
        }
        else  {
            ++dontetlen;
            lblDonteltenek.setText("Döntetlenek: " + dontetlen);
            System.out.println("Döntetlen");
        }
    }

    private void gepValaszt() {
        gepInd = (int) (Math.random() * 3);
        gepOp = opcio.get(gepInd);
        lblGepValasztasa.setText("Gép választása: " + gepOp);
    }

    private void ujJatek() {
        jatekos = new Jatekos();
        gep = new Gep();
        lblGepNyeresei.setText("Gép nyerései: 0");
        lblJatekosNyeresei.setText("Te nyeréseid: 0");
        lblDonteltenek.setText("Döntetlenek: 0");
    }
}
