/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move4math;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import controle.Publico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jogo.Game;
import org.opencv.videoio.VideoCapture;

/**
 *
 * @author Mayco, Matheus, Henrique
 */
public class MainWindow extends javax.swing.JFrame {
    
    public static KeyEvent tecla;

    Game gameWindow = new Game();
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
    }

    MainWindow(String moviPensando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMovi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbPublico = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoJogo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbNome = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbFase = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnComecar = new javax.swing.JButton();
        brnCadastrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblParceiro = new javax.swing.JLabel();
        lblUdesc = new javax.swing.JLabel();
        lblUdesc1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Move4Math");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frmPrincipal"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        lblMovi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logoMove4Math.png"))); // NOI18N

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(380, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbPublico.setName("cmbPublico"); // NOI18N
        cmbPublico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPublicoItemStateChanged(evt);
            }
        });
        cmbPublico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPublicoMouseClicked(evt);
            }
        });
        cmbPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPublicoActionPerformed(evt);
            }
        });
        cmbPublico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbPublicoPropertyChange(evt);
            }
        });
        jPanel1.add(cmbPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 220, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Público:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Habilidade Cognitiva:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 25));

        cmbTipoJogo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbTipoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoJogoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 220, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome do Jogador:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 25));

        cmbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbNome.setName("cmbNome"); // NOI18N
        cmbNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNomeItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 220, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Fase:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 25));

        cmbFase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(cmbFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 70, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nível:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 130, -1, 25));

        cmbNivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(cmbNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 70, 25));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setMaximumSize(new java.awt.Dimension(380, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComecar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnComecar.setText("Começar Jogo!");
        btnComecar.setToolTipText("");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });
        jPanel3.add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 300, 70));

        brnCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        brnCadastrar.setText("Cadastrar Novo Jogador");
        brnCadastrar.setPreferredSize(new java.awt.Dimension(150, 50));
        brnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(brnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, 40));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblParceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logoParceiro.jpg"))); // NOI18N
        jPanel4.add(lblParceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 132, 150));

        lblUdesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logoUdesc.png"))); // NOI18N
        jPanel4.add(lblUdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 132, 150));

        lblUdesc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo_larva.png"))); // NOI18N
        jPanel4.add(lblUdesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 132, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMovi, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPublicoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbPublicoActionPerformed

    private void cmbPublicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPublicoItemStateChanged
        // TODO add your handling code here:
        //System.out.println("hue");
        atualizaComboPlayers();
        atualizaComboFaseNivel();
    }//GEN-LAST:event_cmbPublicoItemStateChanged

    private void cmbPublicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPublicoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbPublicoMouseClicked

    private void brnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCadastrarActionPerformed
        // TODO add your handling code here:
        Cadastrar janelaCadastrar = new Cadastrar();
        janelaCadastrar.setLocationRelativeTo(null);
        janelaCadastrar.setVisible(true);
        
        janelaCadastrar.atualizaComboPublico();
        
    }//GEN-LAST:event_brnCadastrarActionPerformed

    private void cmbPublicoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbPublicoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPublicoPropertyChange

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        // TODO add your handling code here:
        int indexPublico=0;
        int indexPlayer=-1;
        int indexFase=0;
        int indexNivel=0;
        int i;
        int indexJogo;
        
        //System.out.println("JJJJJ:   " + Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId());
        
        indexJogo = Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId();
        Move4Math.indiceJogoAtual = indexJogo;
        
        System.out.println("Atual" + Move4Math.indiceJogoAtual);
        
        indexPublico = Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getId();
        Move4Math.indicePublicoAtual = indexPublico;
        //MoviPensando.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getPlayers().get()
        //(cmbPublico.getSelectedItem()).
//        System.out.println("XX"+Move4Math.players.size());
        for(i=0;i<Move4Math.players.size();i++){
  //          System.out.println("huehue");
            if(Move4Math.players.elementAt(i).getNome().equals(cmbNome.getSelectedItem().toString())){
    //            System.out.println("AAA");
                indexPlayer=i;
                Move4Math.indicePlayerAtual = indexPlayer;
                break;
            }
            
        }
//        System.out.println("FASE"+Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().get(cmbFase.getSelectedIndex()).getNome());
//        System.out.println("NIVEL"+Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().get(cmbNivel.getSelectedIndex()).getNumero());
        
        //indexFase= Integer.parseInt(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().get(cmbFase.getSelectedIndex()).getNome());
        indexFase= Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().get(cmbFase.getSelectedIndex()).getNumeroFase();
        Move4Math.indiceFaseAtual = indexFase;
        //indexNivel=Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().get(cmbNivel.getSelectedIndex()).getNumero();
        System.out.println("idxNivel --- 01: " + cmbNivel.getSelectedItem().toString());
        //indexNivel=Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().get(cmbNivel.getSelectedIndex()).getNumeroLinha();
        indexNivel = Integer.parseInt(cmbNivel.getSelectedItem().toString());
        Move4Math.indiceNivelAtual = indexNivel;
        
//Removido da janela principal e trocado o nome do combo para cmbTipoJogo
//        tempo = Integer.parseInt(cmbTempo.getSelectedItem().toString().substring(0,1));
        
//        System.out.println(indexJogo);
//        System.out.println(indexPublico);
//        System.out.println(indexPlayer);
//        System.out.println(indexFase);
//        System.out.println(indexNivel);
        
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        
        //Game gameWindow = new Game();
        //gameWindow.setLocationRelativeTo(null);
        gameWindow.setSize(width, height);
        gameWindow.dispose();
        gameWindow.setUndecorated(true);
        gameWindow.setVisible(true);
        
        gameWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameWindow.addKeyListener(new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //if ((e.getKeyCode() == KeyEvent.VK_A) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                //System.out.println("gamewindow!");
            tecla = e;
            //}
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    });
        
        
        VideoCapture webSource= new VideoCapture(0);
        if(!webSource.isOpened()){
                JOptionPane.showMessageDialog(null,"Webcam não encontrada!");
                gameWindow.dispose();
        }
        
        else{
            webSource.release();
            
            System.out.println("Player: " + indexPlayer);
            
            if(indexPlayer == -1){
                JOptionPane.showMessageDialog(null,"Jogador não selecionado!");
                //move4math.MainWindow.dainWindow.dispose();
                gameWindow.dispose();
            }else{
            
                try {
                    //System.out.println(indexJogo+" "+ indexPublico+" "+ indexPlayer+" "+ indexFase+" "+ indexNivel);
    //                
    //                System.out.println("GAME" + gameWindow);
                   // System.out.println("JOGO"+ "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getId() + "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getNome());
                   // System.out.println("PUBLICO"+Move4Math.getPublicoId(Move4Math.indicePublicoAtual).getNome());
                   // System.out.println("PLAYER"+Move4Math.players.elementAt(Move4Math.indicePlayerAtual).getNome());
    //                System.out.println("OUTROS"+Move4Math.conjuntosDeTrabalho +","+ indexFase +","+ indexNivel);
    //                gameWindow.Iniciar(gameWindow,"Classificacao",1, 1, Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                    //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getId(),Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbTipoJogo.getSelectedIndex()).getId(), Move4Math.players.elementAt(cmbNome.getSelectedIndex()).getId(), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                    //NOVO
                    System.out.println("mainwindow: " + Move4Math.indiceNivelAtual + "     " +Move4Math.indiceJogoAtual);
                    gameWindow.Iniciar(gameWindow, Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual),Move4Math.getPublicoId(Move4Math.indicePublicoAtual), Move4Math.players.elementAt(Move4Math.indicePlayerAtual), Move4Math.conjuntosDeTrabalho, Move4Math.indiceFaseAtual, Move4Math.indiceNivelAtual);
                    //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(indexJogo),Move4Math.getPublicoId(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                    //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId()),Move4Math.publicos.elementAt(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getId()), Move4Math.players.elementAt(cmbNome.getSelectedIndex()), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                    //ANTIGO
                    //gameWindow.Iniciar(gameWindow,Move4Math.publicos.elementAt(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel, tempo);
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex.getStackTrace());                
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex.getStackTrace());
                }
            }
        }//fim else
        
        //gameWindow.dispose();
        
        
    }//GEN-LAST:event_btnComecarActionPerformed

    private void cmbTipoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoJogoActionPerformed
        // TODO add your handling code here:
        //atualizaComboPublico();
        
    }//GEN-LAST:event_cmbTipoJogoActionPerformed

    private void cmbNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNomeItemStateChanged
        // TODO add your handling code here:
        atualizaComboFaseNivel();
    }//GEN-LAST:event_cmbNomeItemStateChanged

    public String getTipoJogo(){
        return cmbTipoJogo.getSelectedItem().toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try {
            javax.swing.UIManager.setLookAndFeel(new WindowsLookAndFeel());

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        }
        );
    }

    public void atualizaComboJogos(){
        
        //cmbPublico.removeAllItems();
        //cmbPublico.addItem("");
        int i;
        for(i=0;i<Move4Math.jogos.size();i++){
            cmbTipoJogo.addItem(Move4Math.jogos.elementAt(i).getNome());
        }
    }
    
    public void atualizaComboPublico(){
        
//        LinkedHashMap<String,Publico> hashPublico = new LinkedHashMap();
//        
//        
        Move4Math.publicos = new Vector ();
        int i;
//        System.out.println("AAA" + Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().size());
        for(i=0;i<Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().size();i++){
//            hashPublico.put(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i).getNome(), Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i));
//            Move4Math.publicos.add(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i));
//            cmbPublico.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i).getNome());
 //           System.out.println("CCC" + i +"" +hashPublico);
            //if(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i).getNome())
            cmbPublico.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i).getNome());
            Move4Math.publicos.add(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i));
        }
//    for( Publico publico : hashPublico.values()){
//       cmbPublico.addItem(publico.getNome());
////cmbPublico.addItem(hashPublico.
//    }

//        atualizaComboPlayers();
        atualizaComboFaseNivel();
    }

    public void atualizaComboPlayers(){
        cmbNome.removeAllItems();
        //cmbNome.addItem("");
        int i;
        //System.out.println(Move4Math.players.size());
        for(i=0;i<Move4Math.players.size();i++){
            if(Move4Math.players.elementAt(i).getPublico().equals(cmbPublico.getSelectedItem())){
                cmbNome.addItem(Move4Math.players.elementAt(i).getNome());
            }
        }
    }
    
    public void atualizaComboFaseNivel(){
        cmbFase.removeAllItems();
        cmbNivel.removeAllItems();
        int i,j;

        for(i=0;i<Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().size();i++){
            cmbFase.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().elementAt(i).getNumeroFase());
            //cmbFase.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().elementAt(i).getNome());
        }
        
        for(j=0;j<Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().size()/4;j++){
            //if(j % 4 == 0);
            //{
              //  System.out.println("resto = " + j%4 + Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().elementAt(j).getNumero());
                cmbNivel.addItem(j+1);
            //}            
        }
        
        
        /*
        for(j=0;j<Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().size();j++){
            cmbNivel.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().elementAt(j).getNumero());
        }
*/
        for(i=0;i<Move4Math.players.size();i++){
            //System.out.println("huehue");
            if(Move4Math.players.elementAt(i).getNome().equals(cmbNome.getSelectedItem())){ //Procura o jogador selecionado no vetor de players
                
                if(!Move4Math.players.elementAt(i).getSessoes().isEmpty()){                  //se há pelo menos uma sessao jogada
                    if(!Move4Math.players.elementAt(i).getSessoes().lastElement().getRodadas().isEmpty()){ //se há pelo menos uma rodada jogada
                        //System.out.println("la");
                        cmbFase.setSelectedItem(Move4Math.players.elementAt(i).getSessoes().lastElement().getFase());
                       // System.out.println(Move4Math.players.elementAt(i).getSessoes().lastElement().getRodadas().lastElement().getNivel());
                        cmbNivel.setSelectedItem(Move4Math.players.elementAt(i).getSessoes().lastElement().getRodadas().lastElement().getNivel());
                    }else{
                        //System.out.println("lala");
                        cmbFase.setSelectedItem(Move4Math.players.elementAt(i).getSessoes().lastElement().getFase());
                    }
                    
                }
                break;
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCadastrar;
    private javax.swing.JButton btnComecar;
    private javax.swing.JComboBox cmbFase;
    private javax.swing.JComboBox cmbNivel;
    private javax.swing.JComboBox cmbNome;
    private javax.swing.JComboBox cmbPublico;
    private javax.swing.JComboBox cmbTipoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMovi;
    private javax.swing.JLabel lblParceiro;
    private javax.swing.JLabel lblUdesc;
    private javax.swing.JLabel lblUdesc1;
    // End of variables declaration//GEN-END:variables

}
