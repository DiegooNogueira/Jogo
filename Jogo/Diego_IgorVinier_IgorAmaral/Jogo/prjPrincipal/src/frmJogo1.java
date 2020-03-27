import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

//Diego Marques  2°D A
//Igor Amaral    2°D A
//Igor Venier    2°D A

public class frmJogo1 extends javax.swing.JFrame {
     int escolhaCmn=0;//random do Caminho da imagem 
     int escolhaImg=0;//random da imagem
     int escolhaNome=0;
     
     int contJ=0;//quantos acertos
     int contPc=0;//quantos erros
     

     int continuar = 0;
     
     int tempo = 10;

     int aux=0;
     String nome;//nome do placar
     
     int clickAzul=0, clickVermelho=0, clickAmarelo=0, clickVerde=0, clickCinza=0, clickMarrom=0;/*variaveis das 
                                                                                                   labels lixeiras*/
    private Timer controlador;
    private TimerTask tarefa;
     
    public frmJogo1() {
        
        
      
             initComponents();
             controlador = new Timer();
            escolher();

            escolhaNome = (int)Math.round(Math.random() * 14);
            lblContPc.setText(nomes[escolhaNome]+" = "+contPc);
    }
    public frmJogo1(String nome){
        this();
        lblContJ.setText(nome);
       this.nome=nome;
    }
    
    frmJogo1(frmPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    String nomes[]= new String[]{//vetor dos das imagens
            "IGOR",
            "LUCAS",
            "KATARINA",
            "MARIA",
            "ANA",
            "THIAGO",
            "AFONSO",
            "SAMIR",
            "FERNANDA",
            "ANDERSON",
            "JOÃO",
            "JULIA",
            "CAMILE",
            "RYAN",
            "PEDRO"
            
    };
    
    String caminhos[]= new String[]{//vetor dos caminhos das imagens
            "src/imagens/imagensMetais/",
            "src/imagens/imagensPapeis/",
            "src/imagens/imagensNaoReciclaveis/",
            "src/imagens/imagensOrganicos/",
            "src/imagens/imagensVidro/",
            "src/imagens/imagensPlasticos/",    
    };
    
    
    String imagens[]= new String[]{//vetor dos das imagens
            "imagem1.jpg",
            "imagem2.jpg",
            "imagem3.jpg",
            "imagem4.jpg",
            "imagem5.jpg",
            "imagem6.jpg",
            "imagem7.jpg",
            "imagem8.jpg"
    };
    
    private void atualizar(){//atualiza o tempo 
        if(tempo==0){
            tarefa.cancel();
            JOptionPane.showMessageDialog(this,"Seu tempo acabou");
            contPc++;
            placar();
            
        }else{
        lblTimer.setText("TEMPO:"+tempo);
        tempo--;
        }
    }
    
    private void click(){//funcao se acertou ou não
        if(clickAzul==1 && escolhaCmn==1){
            funcao();
        }else if (clickVermelho==1 && escolhaCmn==5){
            funcao();
        }else if (clickVerde==1 && escolhaCmn==4){
            funcao();
        }else if (clickAmarelo==1 && escolhaCmn==0){
            funcao();
        }else if (clickMarrom==1 && escolhaCmn==3){
            funcao();
        }else if (clickCinza==1 && escolhaCmn==2){
            funcao();
        }else{
            tarefa.cancel();
            JOptionPane.showMessageDialog(this,"Você Errou");
            limpar();
            contPc++;
            placar();
        }
    }
    
    
    private void limpar(){//limpa as variaveis
        clickAzul=0; 
        clickVermelho=0; 
        clickAmarelo=0;
        clickVerde=0; 
        clickCinza=0;
        clickMarrom=0;
        tempo=10;
        
    }
     
    private void escolher(){//ele escolhe sorteando os numeros das casas do vetor da imagem
        tarefa = new TimerTask(){
                @Override
                public void run(){
                    atualizar();
                }
            };
         
        controlador.schedule(tarefa, 0, 1000);
       
        escolhaImg  = (int)Math.round(Math.random() * 7);
        escolhaCmn = (int)Math.round(Math.random() * 5);
        
        ImageIcon imagem = new ImageIcon(caminhos[escolhaCmn] + imagens[escolhaImg]);
        
        lblImagem.setIcon(imagem);
        lblContJ.setText(nome);
        
        lblContJ.setText(nome + " = " + contJ);
        lblContPc.setText(nomes[escolhaNome] +" = " + contPc); 
    }
    
    private void reiniciar(){//reinicia o jogo
        limpar();
        contJ=0;
        contPc=0;
  
    }
    
    private void placar(){//a
            if(contJ == 5){
                        tarefa.cancel();
                        new frmGanhando(nome).setVisible(true);
                        setVisible(false);                
                          
            }else if(contPc == 5){
                tarefa.cancel();
                        new frmPerdendo(nome).setVisible(true);
                        setVisible(false);
            }else{
                limpar();
                escolher();
            }      
    }
    
    private void funcao(){//função que chama outras funções
        tarefa.cancel(); 
        JOptionPane.showMessageDialog(this,"Você Acertou");
        limpar();
        contJ++;
        placar();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        lbltext = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        lblAzul = new javax.swing.JLabel();
        lblVermelho = new javax.swing.JLabel();
        lblVerde = new javax.swing.JLabel();
        lblAmarelo = new javax.swing.JLabel();
        lblMarrom = new javax.swing.JLabel();
        lblCinza = new javax.swing.JLabel();
        lblJog1 = new javax.swing.JLabel();
        lblJog2 = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        lblContPc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblContJ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reciclando :D");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFechar.setText("Sair do Jogo");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel2.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 695, -1, -1));

        lbltext.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        lbltext.setText("Para qual lixeira isso deve ir?");
        jPanel2.add(lbltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblImagem.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 450, 350));

        lblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/papel.png"))); // NOI18N
        lblAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAzulMouseClicked(evt);
            }
        });
        jPanel2.add(lblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        lblVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plastico.png"))); // NOI18N
        lblVermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVermelhoMouseClicked(evt);
            }
        });
        jPanel2.add(lblVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        lblVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vidro.png"))); // NOI18N
        lblVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerdeMouseClicked(evt);
            }
        });
        jPanel2.add(lblVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        lblAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/metal.png"))); // NOI18N
        lblAmarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmareloMouseClicked(evt);
            }
        });
        jPanel2.add(lblAmarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        lblMarrom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/organico.png"))); // NOI18N
        lblMarrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMarromMouseClicked(evt);
            }
        });
        jPanel2.add(lblMarrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        lblCinza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/naoReciclavel.png"))); // NOI18N
        lblCinza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCinzaMouseClicked(evt);
            }
        });
        jPanel2.add(lblCinza, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, 200));
        jPanel2.add(lblJog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 90, 30, 20));
        jPanel2.add(lblJog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 168, 30, 20));

        lblTimer.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 0, 0));
        lblTimer.setText("Tempo:");
        jPanel2.add(lblTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 52));

        lblContPc.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        lblContPc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblContPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 210, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setText("X");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, 50));

        lblContJ.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        lblContJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContJ.setText("Jogador 1");
        jPanel2.add(lblContJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 230, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/espalha.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 210, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gif/Wiki-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.setVisible(true);
       System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void lblAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAzulMouseClicked
        clickAzul++;
        click();
    }//GEN-LAST:event_lblAzulMouseClicked

    private void lblVermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVermelhoMouseClicked
        clickVermelho++;
        click();
    }//GEN-LAST:event_lblVermelhoMouseClicked

    private void lblVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerdeMouseClicked
        clickVerde++;
        click();
    }//GEN-LAST:event_lblVerdeMouseClicked

    private void lblAmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmareloMouseClicked
        clickAmarelo++;
        click();
    }//GEN-LAST:event_lblAmareloMouseClicked

    private void lblMarromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMarromMouseClicked
        clickMarrom++;
        click();
    }//GEN-LAST:event_lblMarromMouseClicked

    private void lblCinzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCinzaMouseClicked
        clickCinza++;
        click();
    }//GEN-LAST:event_lblCinzaMouseClicked

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
            java.util.logging.Logger.getLogger(frmJogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmJogo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAmarelo;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblCinza;
    private javax.swing.JLabel lblContJ;
    private javax.swing.JLabel lblContPc;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblJog1;
    private javax.swing.JLabel lblJog2;
    private javax.swing.JLabel lblMarrom;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JLabel lblVermelho;
    private javax.swing.JLabel lbltext;
    // End of variables declaration//GEN-END:variables
}
