/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move4math;

import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLWriter;
import jogo.Player;
import jogo.Sessao;
import parsers.ParserUsers;

/**
 *
 * @author Mayco, Matheus, Henrique
 */
public class Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
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

        jPanel1 = new javax.swing.JPanel();
        cmbPublico = new javax.swing.JComboBox();
        lSexo = new javax.swing.JLabel();
        jDataNascimento = new javax.swing.JLabel();
        txtNomeJogador = new javax.swing.JTextField();
        lNomeJogador = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lTipoPublico = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        dtNascimento = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textJustPublico = new javax.swing.JTextArea();
        lJustPublico = new javax.swing.JLabel();
        lFaseAlfabetizacao = new javax.swing.JLabel();
        cmbAlfabetizacao = new javax.swing.JComboBox();
        lJustAlfabetizacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textJustAlfabetizacao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(380, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbPublico.setName("cmbPublico"); // NOI18N
        cmbPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPublicoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 115, 245, 25));

        lSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lSexo.setText("Sexo:");
        jPanel1.add(lSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, 20));

        jDataNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jDataNascimento.setText("Data Nascimento:");
        jPanel1.add(jDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 20));

        txtNomeJogador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txtNomeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 45, 245, 25));

        lNomeJogador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lNomeJogador.setText("Nome do Jogador:");
        jPanel1.add(lNomeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, 20));

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 430, 100, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastro de Jogadores");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, -1));

        lTipoPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lTipoPublico.setText("Tipo de Público:");
        jPanel1.add(lTipoPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, 20));

        cmbSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        cmbSexo.setSelectedIndex(-1);
        jPanel1.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 95, 25));

        dtNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dtNascimento.setMaxSelectableDate(new java.util.Date(253370775697000L));
        jPanel1.add(dtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, 25));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textJustPublico.setColumns(20);
        textJustPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textJustPublico.setLineWrap(true);
        textJustPublico.setRows(5);
        textJustPublico.setText("Justifique aqui o motivo de ter classificado o jogador com este público");
        textJustPublico.setToolTipText("Justifique aqui o motivo de ter classificado o jogador com este público");
        textJustPublico.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textJustPublico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 245, 110));

        lJustPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lJustPublico.setText("Justificativa Público:");
        lJustPublico.setToolTipText("");
        jPanel1.add(lJustPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lFaseAlfabetizacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lFaseAlfabetizacao.setText("Fase da Alfabetização:");
        jPanel1.add(lFaseAlfabetizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        cmbAlfabetizacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbAlfabetizacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não Desenvolvido", "Em Desenvolvimento", "Parcialmente Desenvolvido", "Desenvolvido" }));
        cmbAlfabetizacao.setSelectedIndex(-1);
        cmbAlfabetizacao.setName("cmbPublico"); // NOI18N
        cmbAlfabetizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlfabetizacaoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlfabetizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 245, 25));

        lJustAlfabetizacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lJustAlfabetizacao.setText("Justificativa Fase Alf.");
        lJustAlfabetizacao.setToolTipText("");
        jPanel1.add(lJustAlfabetizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, -1));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textJustAlfabetizacao.setColumns(20);
        textJustAlfabetizacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textJustAlfabetizacao.setLineWrap(true);
        textJustAlfabetizacao.setRows(5);
        textJustAlfabetizacao.setText("Justifique aqui o motivo de ter classificado o jogador com esta fase da alfabetização");
        textJustAlfabetizacao.setToolTipText("");
        textJustAlfabetizacao.setWrapStyleWord(true);
        jScrollPane2.setViewportView(textJustAlfabetizacao);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 245, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPublicoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        
            File[] arquivos = new File("Users/").listFiles();
            Player player = new Player();

            player.setId((arquivos.length/3)+1);
            player.setNome(txtNomeJogador.getText());
            //player.setIdade(Integer.parseInt(txtIdade.getText()));

            Format formatter = new SimpleDateFormat("dd/MM/yyyy");
            String sDtNascimento = formatter.format(dtNascimento.getDate());

            player.setDataNascimento(sDtNascimento);
            
            SimpleDateFormat sdfCadastro = new SimpleDateFormat("dd/MM/yyyy");
            String dataCadastro = sdfCadastro.format(new Date());
            player.setDataCadastro(dataCadastro);
//            player.setNomeMae(txtNomeMae.getText());
//            player.setNomeEspecialista(txtNomeEspecialista.getText());
            player.setSexo(String.valueOf(cmbSexo.getSelectedItem()));
            player.setPublico(String.valueOf(cmbPublico.getSelectedItem()));
            //Quantidade de vidas pelo publico
            if(cmbPublico.getSelectedIndex() == 0 || cmbPublico.getSelectedIndex() == 2){
                player.setVidas(3);
            } else{
                player.setVidas(5);
            }
            player.setJustificativaPublico(textJustPublico.getText()); //Alterado por causa do campo observações
            player.setFaseAlfabetizacao(String.valueOf(cmbAlfabetizacao.getSelectedItem()));
            player.setJustificativafaseAlfabetizacao(textJustAlfabetizacao.getText());
                
        Vector<Sessao> sessoes = new Vector<Sessao>();
        player.setSessoes(sessoes);
        
        try {
            //if (txtNome.getText() != null && cmbPublico.getSelectedItem()!= null)
                criarPlayer(player);
        } catch (IOException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!.");
        try {
            Move4Math.players = ParserUsers.parserUsuarios();
        } catch (IOException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtNomeJogador.setText(null);
//        txtIdade.setText(null);
//        txtNomeMae.setText(null);
//        txtNomeEspecialista.setText(null);
        dtNascimento.setDate(null);
        cmbSexo.setSelectedIndex(-1);
        cmbPublico.setSelectedIndex(-1);
        textJustPublico.setText(null);
        cmbAlfabetizacao.setSelectedIndex(-1);
        textJustAlfabetizacao.setText(null);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cmbAlfabetizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlfabetizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAlfabetizacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }
    
    public static void criarPlayer(Player player) throws IOException{
        
        HTMLDocument doc = new HTMLDocument();
        String arquivo = "Users/"+String.valueOf(player.getId())+"_"+String.valueOf(player.getNome())+".csv";
        String arquivoDetalhado = "Users/"+String.valueOf(player.getId())+"_"+String.valueOf(player.getNome())+"_detalhado.csv";
        String arquivoErrosHtml = "Users/"+String.valueOf(player.getId())+"_"+String.valueOf(player.getNome())+"_erros.HTML";
                
        CSVWriter writer = new CSVWriter(new FileWriter(arquivo),';',CSVWriter.NO_QUOTE_CHARACTER);
        CSVWriter writerDet = new CSVWriter(new FileWriter(arquivoDetalhado),';',CSVWriter.NO_QUOTE_CHARACTER);
        HTMLWriter writerHtml = new HTMLWriter(new FileWriter(arquivoErrosHtml),doc);
        
        FileWriter fw = new FileWriter(arquivoErrosHtml, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append("<html><head> <meta charset='utf-8'></head><body><h1 align = 'center'>Relatório de Erros</h1><br>"
                + "<h2>Nome: " + player.getNome() + "&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;Data de Nascimento: " + player.getDataNascimento() + "&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;"
                + "Publico:  " + player.getPublico() + "</h2><hr>"
                );
        
        bw.close();
        
        String[] record = {"Data Cadastro:",player.getDataCadastro()};
        writer.writeNext(record);
        
        record = new String[]{"Nome:",player.getNome()};
        writer.writeNext(record);
        
        //record = new String[]{"Idade:",String.valueOf(player.getIdade())};
        //writer.writeNext(record);
        //incluido por Eder
        record = new String[]{"Data Nascimento:",String.valueOf(player.getDataNascimento())};
        writer.writeNext(record);
        //fim incluido por Eder
        record = new String[]{"Sexo:",player.getSexo()};
        writer.writeNext(record);
//        record = new String[]{"Nome Mae:",player.getNomeMae()};
//        writer.writeNext(record);
//        record = new String[]{"Nome Especialista:",player.getNomeEspecialista()};
//        writer.writeNext(record);
        record = new String[]{"Publico:",player.getPublico()};
        writer.writeNext(record);
        record = new String[]{"Vidas:",Integer.toString(player.getVidas())};
        writer.writeNext(record);
        record = new String[]{"Justificativa Público:",player.getJustificativaPublico()}; //Alterado por causa do campo observações
        writer.writeNext(record);
        record = new String[]{"Fase Alfabetização Matemática:",player.getFaseAlfabetizacao()}; //Alterado por causa do campo observações
        writer.writeNext(record);
        record = new String[]{"Justificativa Fase Alfabetização Matemática:",player.getJustificativafaseAlfabetizacao()}; //Alterado por causa do campo observações
        writer.writeNext(record);
        record = new String[]{"# Sessao","Data de Uso","Hora Inicio","Jogo","Fase","Nivel","Pontuacao Geral da Tela","Tempo Total (min)"};
        writer.writeNext(record);
        
        writer.close();
        
        record = new String[]{"# Sessao","Data de Uso","Hora Inicio","Jogo","Fase","Nivel","Linha Escolhida","Imagem Objetivo","Imagem Tocada","Tempo de Toque","Acao","Pontos Motor","Pontos Cognitivo"};
        
        writerDet.writeNext(record);
        writerDet.close();
    }
    
    public void atualizaComboPublico(){
        cmbPublico.removeAllItems();
        int i;
        for(i=0;i<Move4Math.jogos.elementAt(0).getPublico().size();i++){
            cmbPublico.addItem(Move4Math.jogos.elementAt(0).getPublico().elementAt(i).getNome());
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox cmbAlfabetizacao;
    private javax.swing.JComboBox cmbPublico;
    private javax.swing.JComboBox cmbSexo;
    private com.toedter.calendar.JDateChooser dtNascimento;
    private javax.swing.JLabel jDataNascimento;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lFaseAlfabetizacao;
    private javax.swing.JLabel lJustAlfabetizacao;
    private javax.swing.JLabel lJustPublico;
    private javax.swing.JLabel lNomeJogador;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lTipoPublico;
    private javax.swing.JTextArea textJustAlfabetizacao;
    private javax.swing.JTextArea textJustPublico;
    private javax.swing.JTextField txtNomeJogador;
    // End of variables declaration//GEN-END:variables
}
