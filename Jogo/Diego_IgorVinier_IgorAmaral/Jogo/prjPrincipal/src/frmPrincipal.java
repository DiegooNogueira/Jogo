import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

     String nome;
    public frmPrincipal() {
        initComponents();
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTutorial = new javax.swing.JButton();
        btnIrAoJogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reciclando :D");
        setPreferredSize(new java.awt.Dimension(470, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTutorial.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        btnTutorial.setForeground(new java.awt.Color(102, 102, 255));
        btnTutorial.setText("Tutorial");
        btnTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnTutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 190, 60));

        btnIrAoJogo.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        btnIrAoJogo.setForeground(new java.awt.Color(102, 102, 255));
        btnIrAoJogo.setText("JOGAR  ");
        btnIrAoJogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIrAoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAoJogoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIrAoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 310, 60));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Reciclando");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 450, 100));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reciclando.png"))); // NOI18N
        jPanel1.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, 320));

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ceu.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnIrAoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAoJogoActionPerformed
       nome = JOptionPane.showInputDialog("Nome do Jogador");
       if(nome == null){
           dispose();
       }else
        if(nome.length() == 0){
            nome = JOptionPane.showInputDialog("Nome do Jogador");
        }
        else{
             new frmJogo1(nome).setVisible(true);
             setVisible(false);
        }
        
     
    }//GEN-LAST:event_btnIrAoJogoActionPerformed
    
    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorialActionPerformed
      
             new frmAjuda().setVisible(true);
            setVisible(false);
        
    }//GEN-LAST:event_btnTutorialActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrAoJogo;
    private javax.swing.JButton btnTutorial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}
