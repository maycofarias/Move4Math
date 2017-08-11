/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move4math;

import conteudo.ConjuntoImagem;
import controle.Jogos;
import controle.Publico;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import jogo.Player;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import parsers.ParserJogos;
import parsers.ParserPublics;
import parsers.ParserTables;
import parsers.ParserUsers;

/**
 *
 * @author Mayco, Matheus, Henrique
 */
public class Move4Math {
    
    static Vector<ConjuntoImagem> conjuntosDeTrabalho;
    static Vector<Publico> publicos;
    static Vector<Player> players;
    static Vector<Jogos> jogos;
    static public int webcamWidth = 640;
    static public int webcamHeight = 480;
    static public int indiceJogoAtual;
    static public int indicePublicoAtual;
    static public int indicePlayerAtual;
    static public int indiceFaseAtual;
    static public int indiceNivelAtual;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
 public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // TODO code application logic here
        
        String jogo;
        
        MainWindow janelaPrincipal = new MainWindow();
        janelaPrincipal.setLocationRelativeTo(null);
        //janelaPrincipal.dispose();
        janelaPrincipal.setVisible(true);
        
        jogos = ParserJogos.loadJogos();
        
        //System.out.println(jogo);
        
        conjuntosDeTrabalho = ParserTables.parserTabelas();
        //publicos = ParserPublics.loadPublicos();
        players = ParserUsers.parserUsuarios();
        
        //System.out.println(players.elementAt(0).getSessoes().size());
        //System.out.println(players.elementAt(0).getPublico());
        janelaPrincipal.atualizaComboJogos();
        
        janelaPrincipal.atualizaComboPublico();
        
        //System.out.println(conjuntosDeTrabalho.size());
        //System.out.println(conjuntosDeTrabalho.elementAt(0).getImagens().size());
        //System.out.println(conjuntosDeTrabalho.elementAt(0).getImagens().elementAt(0).size());
        /*
        for(int i=0; i<conjuntosDeTrabalho.elementAt(0).getImagens().size();i++){
            for(int j=0;j<conjuntosDeTrabalho.elementAt(0).getImagens().get(i).size();j++)
                System.out.print(" "+ conjuntosDeTrabalho.elementAt(0).getImagens().get(i).get(j).getId()+ " ");
            System.out.println("");
        }
                
        */
        
}
        
    public static Publico getPublicoId(int id){
        System.out.println(publicos.size());
        
        for (Publico publico: publicos){
            if(publico.getId()==id)
                return publico;
            
        }
        
        return null;
        
    }         
     
    public static Jogos getJogoNome(String nome){
        for (Jogos jogo: jogos){
            if(jogo.getNome()==nome)
                return jogo;
        }
        
        return null;
    }
}
