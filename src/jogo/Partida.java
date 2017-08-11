/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import conteudo.ConjuntoImagem;
import conteudo.Imagem;
import controle.Fase;
import controle.Jogos;
import controle.Nivel;
import controle.Parametros;
import controle.Publico;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencv.core.Core;
import static org.opencv.core.Core.FONT_HERSHEY_COMPLEX;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgproc.Imgproc.putText;
import parsers.ParserPublics;

/**
 *
 * @author Mayco, Matheus, Henrique
 */
public class Partida implements Cloneable{
    private Player player;
    private ConjuntoImagem conjuntoImagem;
    private Fase fase;
    private Nivel nivel;
    private Jogos jogo;
    private Publico publico;
    private Vector<Imagem> filaElementos;
    private Vector<Imagem> filaElementosReferencia;
    private Parametros parametros;
    private int pontuacao;
    private List jogadasDoNivel = new ArrayList();
    
//    int ptsEstrela1 = 20;
//    int ptsEstrela2 = 50;
//    int ptsEstrela3 = 150;
//    int ptsEstrela4 = 180;
//    int ptsEstrela5 = 540;
    
//Mat estrela = Imgcodecs.imread("Resources/images/estrela.png",1);
Mat estrelaNegra = Imgcodecs.imread("Resources/images/Estrela-CinzaB.png",1);
Mat vidasAtivas = Imgcodecs.imread("Resources/images/Vida_bom2.png",1);
Mat vidasPerdidas = Imgcodecs.imread("Resources/images/vida-cinza.png",1);
Mat barraBordas = Imgcodecs.imread("Resources/images/ref-background.png", 1);
Mat escadaSubindo = Imgcodecs.imread("Resources/images/escada-subindo.png", 1);
Mat escadaDescendo = Imgcodecs.imread("Resources/images/escada-descendo.png", 1);
    
    
            
public List geraJogadasDoNivel(int nivelSelecionado){
    
    int linhaNivelSelecionado;
    linhaNivelSelecionado = (nivelSelecionado-1)*4;
    int aux = linhaNivelSelecionado;
    for(int i=0;i<4;i++){
            jogadasDoNivel.add(aux);
            aux ++;            
        }
    
    Collections.shuffle(jogadasDoNivel);
    return jogadasDoNivel;
       
}
    
public int selecionaLinhaNivel(int nivelSelecionado){
    int linhaNivelSelecionado;
    linhaNivelSelecionado = (nivelSelecionado-1)*4;
    return linhaNivelSelecionado;
}
    
//    public int contaLinhas (Nivel nivel){
//        int linhaAtual = 0;
//            
//        
//        
//        return linhaAtual;
//    }
    
    public String [] imagensDaCena(int faseAtual, Nivel nivel){
        
        System.out.println("----------" + move4math.Move4Math.indiceFaseAtual);
        
        int tamanho = nivel.getQIS();
        String imagensCena[] = new String[tamanho];
        if(faseAtual == 1){
            imagensCena = nivel.getPrimeiroICC().split(" ");
        }else{
            imagensCena = nivel.getSegundoICC().split(" ");
        }
        //System.out.println("nivel: " + nivel.getNumero());
        //System.out.println("icc: " + nivel.getICC());
        //System.out.println("nivel -> " + nivel.getICC());

        for (int i=0;i<imagensCena.length;i++){
            //System.out.println(imagensCena[i]);
        }

        //filaElementosReferencia.add(imagensCena.)
        
        return imagensCena;
        
        //for (i=0;aux.getICC().)
        
    }
    
////    public void geraTodasImagens(){
////        filaElementos.clear();
////        filaElementosReferencia.clear();
////        Vector<Imagem> im = new Vector<Imagem>();
////        //String imagens[] = partida
////        System.out.println("Entrou no 'geraTodasImagens' ");
////        for (int i=0;i<nivel.getQIS();i++){
////            
////        }
//        
//        System.out.println("QTD" + im.size() + "CNDO" + im.toString());
//        
//        for(int i=0;i<im.size();i++){
//            filaElementos.add(im.elementAt(i));
//            filaElementosReferencia.add(im.elementAt(0));
//        }
//        
//        Collections.shuffle(filaElementos);
//    }
    
/*    public void geraNovaFilaReferencias(){
        filaElementosReferencia.clear();
        Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
        imagens = conjuntoImagem.getImagens();
        MTRandom random = new MTRandom();
        int posicao;
        int tamanho;
        
        for(int i=0;i<imagens.size();i++){
            filaElementosReferencia.add(imagens.elementAt(i).elementAt(0));
            tamanho = imagens.elementAt(i).size();
            if(tamanho>1){
                posicao = 1+(random.nextInt((tamanho-1)));
                filaElementosReferencia.add(imagens.elementAt(i).elementAt(posicao));
            }else{
                filaElementosReferencia.add(imagens.elementAt(i).elementAt(0));
            }
        }
        
        Collections.shuffle(filaElementosReferencia);
        atualizaFilaElementos(filaElementosReferencia.firstElement().getGrupo());
        
    }*/
    
    // refazer, criando um vetor de imagens de 4 posições, onde cada posição é a primeira imagem contida em ICC
    public void geraNovaFilaReferencias(String[] imagensCena){
        filaElementosReferencia.clear();
       // Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
        Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
        imagens = conjuntoImagem.getImagens();
        MTRandom random = new MTRandom();
        int posicao;
        int tamanho;
        
        for(int i=0;i<imagens.size();i++){
            filaElementosReferencia.add(imagens.elementAt(i).elementAt(0));
            tamanho = imagens.elementAt(i).size();
 
            if(tamanho>1){
                posicao = 1+(random.nextInt((tamanho-1)));
                filaElementosReferencia.add(imagens.elementAt(i).elementAt(posicao));
            }else{
                filaElementosReferencia.add(imagens.elementAt(i).elementAt(0));
            }
        }
        
        Collections.shuffle(filaElementosReferencia);
        atualizaFilaElementos(filaElementosReferencia.firstElement().getGrupo());
        
    }
    
//    //não utilizado
//        public void geraFilaFixaReferencias(){
//            
//        filaElementosReferencia.clear();
//        Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
//        //nivel.getAIO()
//        imagens = conjuntoImagem.getImagens();
//        int posicao = 1;
//        int tamanho;
//        
//        for(int i=0;i<imagens.size();i++){
//            //if(imagens.elementAt(i).elementAt(0).)
//            filaElementosReferencia.add(imagens.elementAt(i).elementAt(0));
//            tamanho = imagens.elementAt(i).size();
//            if(tamanho>1){
//                posicao++;
//                filaElementosReferencia.add(imagens.elementAt(i).elementAt(posicao));
//            }else{
//                filaElementosReferencia.add(imagens.elementAt(i).elementAt(0));
//            }
//        }
//    }
    
    public void atualizaFilaElementos(int indiceParaIgnorar){
        filaElementos.clear();
        Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
        imagens = conjuntoImagem.getImagens();
        
        Vector<Vector<Imagem>> imagensAux = (Vector<Vector<Imagem>>) imagens.clone();
        Imagem imgRef;
        
        String iccPrimeiro[] = nivel.getPrimeiroICC().split(" ");
        String iccSegundo[] = nivel.getSegundoICC().split(" ");
        
        
        
        if(move4math.Move4Math.indiceFaseAtual == 1){
            for(int i=0;i<imagens.size();i++){
                //if(i!=indiceParaIgnorar){ //remover este if
                    for(int j=0;j<imagens.elementAt(i).size();j++){
                       for(int k=0; k<iccPrimeiro.length; k++){
                           if (Integer.parseInt(iccPrimeiro[k]) == (imagens.elementAt(i).elementAt(j).getId())){
                               if (k==0){
                                   try {
                                       imgRef = imagens.elementAt(i).elementAt(j).clone();
                                       filaElementos.add(imgRef);
                                   } catch (CloneNotSupportedException ex) {
                                       Logger.getLogger(Partida.class.getName()).log(Level.SEVERE, null, ex);
                                   }


                                }else{
                                    filaElementos.add(imagens.elementAt(i).elementAt(j));
                                }

                            } 
                        }
                        //verificar se o id pertence ao idsDoICC e, se sim, adicionar na filaElementos
                    }
                //}
            }
        }else{
        for(int i=0;i<imagens.size();i++){
            //if(i!=indiceParaIgnorar){ //remover este if
                for(int j=0;j<imagens.elementAt(i).size();j++){
                   for(int k=0; k<iccSegundo.length; k++){
                       if (Integer.parseInt(iccSegundo[k]) == (imagens.elementAt(i).elementAt(j).getId())){
                           if (k==0){
                               try {
                                   imgRef = imagens.elementAt(i).elementAt(j).clone();
                                   filaElementos.add(imgRef);
                               } catch (CloneNotSupportedException ex) {
                                   Logger.getLogger(Partida.class.getName()).log(Level.SEVERE, null, ex);
                               }
                               
                               
                            }else{
                                filaElementos.add(imagens.elementAt(i).elementAt(j));
                            }
                                
                        } 
                    }
                    //verificar se o id pertence ao idsDoICC e, se sim, adicionar na filaElementos
                }
            //}
        }
            
        }
        
        
        
        //Collections.shuffle(filaElementos);
        //System.out.println("filaElementos: ");
        for (int i=0; i<filaElementos.size(); i++){
            //System.out.println(filaElementos.elementAt(i).getId());
        }
        
    }
    
    public void shuffleElements(){
        Collections.shuffle(filaElementos);
    }
    public void geraFilaAleatoria(){
        filaElementos.clear();
        Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
        imagens = conjuntoImagem.getImagens();
        
       MTRandom number = new MTRandom();
       int referencia = number.nextInt(imagens.size());
       //System.out.println("Entrou no geraFilaAleatoria");
       
       String bufferPrimeiro[] = nivel.getPrimeiroICC().split(" ");
       String bufferSegundo[] = nivel.getSegundoICC().split(" ");

//       for (int a=0; a< buffer.length; a++){
//            System.out.println(buffer[a]);
//       }
        

        if(move4math.Move4Math.indiceFaseAtual == 1){
            for(int i=0;i<imagens.size();i++){
                    for(int j=0;j<imagens.elementAt(i).size();j++){
                        for(int k=0; k<jogadasDoNivel.size(); k++){
                            if (Integer.parseInt(bufferPrimeiro[k]) == (imagens.elementAt(i).elementAt(j).getId())){
                            filaElementos.add(imagens.elementAt(i).elementAt(j));
                            }
                        }
                    }
            }
        }else{
            for(int i=0;i<imagens.size();i++){
                    for(int j=0;j<imagens.elementAt(i).size();j++){
                        for(int k=0; k<jogadasDoNivel.size(); k++){
                            if (Integer.parseInt(bufferSegundo[k]) == (imagens.elementAt(i).elementAt(j).getId())){
                            filaElementos.add(imagens.elementAt(i).elementAt(j));
                            }
                        }
                    }
            }
        }

        
        
        //System.out.println("--");
        
       // Collections.shuffle(filaElementos);
       // System.out.println("Fila elementos:");
        for(int a=0;a<filaElementos.size();a++){
       //     System.out.println(filaElementos.elementAt(a).getId());
        }
        
        geraFilaReferenciaAleatoria(referencia);
        
        
    }
    public void geraFilaReferenciaAleatoria(int referencia){
        filaElementosReferencia.clear();
        Vector<Vector<Imagem>> imagens = new Vector<Vector<Imagem>>();
        imagens = conjuntoImagem.getImagens();
        
        Vector<Vector<Imagem>> imagensAux = new Vector<Vector<Imagem>>();
        imagensAux = conjuntoImagem.getImagens();
        
        //System.out.println("Entrou no geraFilaReferenciaAleatoria");
        String idsDoICC[] = imagensDaCena(move4math.Move4Math.indiceFaseAtual,nivel);
        //System.out.println(" id da referencia desejada: " + idsDoICC[0]);

        //Tipo de Jogo
        int iTipoJogoSelecionado = move4math.Move4Math.indiceJogoAtual;
        System.out.println("Jogo: " + iTipoJogoSelecionado);

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Se o jogo for classificação, o primeiro ID do ICC é a imagem que será o objetivo
        // Se for o jogo de ordenação, contagem ou anterior e proximo, os primeiros 3 IDs do
        // ICC serão posicionados como objetivo da linha
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       /*
        if (iTipoJogoSelecionado == 0){ //Jogo de Classificação
            for(int i=0;i<imagens.elementAt(referencia).size();i++){
                if (Integer.parseInt(idsDoICC[0]) == imagens.elementAt(referencia).elementAt(i).getId()){
                    filaElementosReferencia.add(imagens.elementAt(referencia).elementAt(i));
                }
            }
        } else { // Jogo de Ordenação, Contagem ou Anterior e Próximo
            for(int i=0;i<imagens.elementAt(referencia).size();i++){
                if ((Integer.parseInt(idsDoICC[0]) == imagens.elementAt(referencia).elementAt(i).getId()) || 
                        (Integer.parseInt(idsDoICC[1]) == imagens.elementAt(referencia).elementAt(i).getId()) ||
                        (Integer.parseInt(idsDoICC[2]) == imagens.elementAt(referencia).elementAt(i).getId())){
                    filaElementosReferencia.add(imagens.elementAt(referencia).elementAt(i));
                }
            }
        }
        */
        for(int i=0;i<imagens.elementAt(referencia).size();i++){
            
          if (Integer.parseInt(idsDoICC[0]) == imagens.elementAt(referencia).elementAt(i).getId()){
              filaElementosReferencia.add(imagens.elementAt(referencia).elementAt(i));
              //filaElementosReferencia.add(imagensAux.elementAt(referencia).elementAt(5)); // teste porque não pode haver apenas um elemento na fila
          }
          
        }
        //filaElementosReferencia.add(imagens.elementAt(referencia).elementAt(0));
       // System.out.println("FilaElementosReferencia: ");
        for(int i=0;i<filaElementosReferencia.size();i++){
           // System.out.println(filaElementosReferencia.elementAt(i).getId());
        }
        //Collections.shuffle(filaElementosReferencia);
        
    }
    public void mostrarPontuacao(Mat cenario){
        String pontos;
        
        Mat roiPontos = cenario.submat(new Rect(new Point(500, 10), new Point(630, 110)));
        putText( roiPontos ,"Pontos", new Point(0,60), Core.FONT_HERSHEY_SIMPLEX,0.5,new Scalar(0,0,0),1,8,false );
        pontos = String.valueOf(pontuacao);
        putText( roiPontos , pontos, new Point(80,60), Core.FONT_HERSHEY_SIMPLEX,0.5,new Scalar(0,0,0),1,8,false );
    }
    
//    public void mostrarEstrelas(Mat cenario, int pontos){
//        Mat dst;
//        Imgproc.resize(estrela, estrela, new Size(30.0, 30.0));
//        if(pontos == 1 || pontos == 2){
//            dst = new Mat();
//            Mat roiEstrela1 = cenario.submat(new Rect(new Point(455, 15), new Point(485, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(455,485).rowRange(15,45));
//        }
//        if(pontos == 3 || pontos == 4){
//            dst = new Mat();
//            Mat roiEstrela1 = cenario.submat(new Rect(new Point(455, 15), new Point(485, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(455,485).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela2 = cenario.submat(new Rect(new Point(485, 15), new Point(515, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(485,515).rowRange(15,45));
//        }
//        if(pontos == 5 || pontos == 6){
//            dst = new Mat();
//            Mat roiEstrela1 = cenario.submat(new Rect(new Point(455, 15), new Point(485, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(455,485).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela2 = cenario.submat(new Rect(new Point(485, 15), new Point(515, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(485,515).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela3 = cenario.submat(new Rect(new Point(515, 15), new Point(545, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela3,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(515,545).rowRange(15,45));
//        }
//        if(pontos == 7 || pontos == 8){
//            dst = new Mat();
//            Mat roiEstrela1 = cenario.submat(new Rect(new Point(455, 15), new Point(485, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(455,485).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela2 = cenario.submat(new Rect(new Point(485, 15), new Point(515, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(485,515).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela3 = cenario.submat(new Rect(new Point(515, 15), new Point(545, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela3,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(515,545).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela4 = cenario.submat(new Rect(new Point(545, 15), new Point(575, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela4,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(545,575).rowRange(15,45));
//        }
//        if(pontos == 9 || pontos == 10){
//            dst = new Mat();
//            Mat roiEstrela1 = cenario.submat(new Rect(new Point(455, 15), new Point(485, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(455,485).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela2 = cenario.submat(new Rect(new Point(485, 15), new Point(515, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(485,515).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela3 = cenario.submat(new Rect(new Point(515, 15), new Point(545, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela3,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(515,545).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela4 = cenario.submat(new Rect(new Point(545, 15), new Point(575, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela4,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(545,575).rowRange(15,45));
//
//            dst = new Mat();
//            Mat roiEstrela5 = cenario.submat(new Rect(new Point(575, 15), new Point(605, 45)));
//            Core.addWeighted(estrela,1.0,roiEstrela5,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(575,605).rowRange(15,45));
//        }
//        
//    }
    
    public void mostrarVidas (Mat cenario, int tipoPublico){
        Mat dst;
        Imgproc.resize(vidasAtivas, vidasAtivas, new Size(30.0, 30.0));
        Imgproc.resize(vidasPerdidas, vidasPerdidas, new Size(30.0, 30.0));
        
        
        if(tipoPublico == 1 || tipoPublico == 3){ //caso o publico seja Adulto Especial ou Crianca Especial, o jogador tem 5 vidas
            int x1 = 25, x2 = 55;
            int x3 = 145, x4 = 175;
            System.out.println("player.getVidas(): " + player.getVidas());
            //player.setVidas(2);
            for (int i=0; i<player.getVidas(); i++){ //desenha as vidas 
                dst = new Mat();            
                Mat vida1 = cenario.submat(new Rect(new Point(x1, 5),new Point(x2, 35)));
                Core.addWeighted(vidasAtivas,1.5,vida1,-0.5,0.0,dst);
                dst.copyTo(cenario.colRange(x1,x2).rowRange(5,35));
                x1 += 30;
                x2 += 30;
            }
            for (int i = player.getVidas(); i<5; i++){ //preenche o restante com sombras
                dst = new Mat();            
                Mat vida2 = cenario.submat(new Rect(new Point(x3, 5),new Point(x4, 35)));
                Core.addWeighted(vidasPerdidas,1.5,vida2,-0.02,0.0,dst);
                dst.copyTo(cenario.colRange(x3,x4).rowRange(5,35));
                x3 -= 30;
                x4 -= 30;
            }
        }else{ // caso contrário (adulto ou crianca), o jogador possui 3 vidas
            int x1 = 25, x2 = 55;
            int x3 = 85, x4 = 115;
            //System.out.println("player.getVidas(): " + player.getVidas());
            //player.setVidas(1);
            //vidas
            for (int i=0; i<player.getVidas(); i++){
                dst = new Mat();            
                Mat vida1 = cenario.submat(new Rect(new Point(x1, 5),new Point(x2, 35)));
                Core.addWeighted(vidasAtivas,1.5,vida1,-0.5,0.0,dst);
                dst.copyTo(cenario.colRange(x1,x2).rowRange(5,35));
                x1 += 30;
                x2 += 30;
            }
            //sombras
            for (int i = player.getVidas(); i<3; i++){
                dst = new Mat();            
                Mat vida2 = cenario.submat(new Rect(new Point(x3, 5),new Point(x4, 35)));
                Core.addWeighted(vidasPerdidas,1.5,vida2,-0.02,0.0,dst);
                dst.copyTo(cenario.colRange(x3,x4).rowRange(5,35));
                x3 -= 30;
                x4 -= 30;
            }
        }
//            
//            
//            dst = new Mat();            
//            Mat vida2 = cenario.submat(new Rect(new Point(55, 15),new Point(85, 45)));
//            Core.addWeighted(vidasAtivas,1.5,vida2,-0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(55,85).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida3 = cenario.submat(new Rect(new Point(85, 15),new Point(115, 45)));
//            Core.addWeighted(vidasAtivas,1.5,vida3,-0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(85,115).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida4 = cenario.submat(new Rect(new Point(115, 15),new Point(145, 45)));
//            Core.addWeighted(vidasAtivas,1.0,vida4,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(115,145).rowRange(15,45));
//
//            dst = new Mat();            
//            Mat vida5 = cenario.submat(new Rect(new Point(145, 15),new Point(175, 45)));
//            Core.addWeighted(vidasAtivas,1.0,vida5,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(145,175).rowRange(15,45));
//        }else{
//            dst = new Mat();            
//            Mat vida1 = cenario.submat(new Rect(new Point(25, 15),new Point(55, 45)));
//            Core.addWeighted(vidasAtivas,1.0,vida1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(25,55).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida2 = cenario.submat(new Rect(new Point(55, 15),new Point(85, 45)));
//            Core.addWeighted(vidasAtivas,1.0,vida2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(55,85).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida3 = cenario.submat(new Rect(new Point(85, 15),new Point(115, 45)));
//            Core.addWeighted(vidasAtivas,1.0,vida3,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(85,115).rowRange(15,45));
//        }
    }

    public void mostrarSombras (Mat cenario, int tipoPublico){
        Mat dst;
        
        //Vidas - Começo
//        Imgproc.resize(vidasPerdidas, vidasPerdidas, new Size(30.0, 30.0));
//
//        if(tipoPublico == 0 || tipoPublico == 2){
//            dst = new Mat();            
//            Mat vida1 = cenario.submat(new Rect(new Point(25, 15),new Point(55, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(25,55).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida2 = cenario.submat(new Rect(new Point(55, 15),new Point(85, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(55,85).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida3 = cenario.submat(new Rect(new Point(85, 15),new Point(115, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida3,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(85,115).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida4 = cenario.submat(new Rect(new Point(115, 15),new Point(145, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida4,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(115,145).rowRange(15,45));
//
//            dst = new Mat();            
//            Mat vida5 = cenario.submat(new Rect(new Point(145, 15),new Point(175, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida5,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(145,175).rowRange(15,45));
//
//        }else{
//            dst = new Mat();            
//            Mat vida1 = cenario.submat(new Rect(new Point(25, 15),new Point(55, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida1,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(25,55).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida2 = cenario.submat(new Rect(new Point(55, 15),new Point(85, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida2,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(55,85).rowRange(15,45));
//            
//            dst = new Mat();            
//            Mat vida3 = cenario.submat(new Rect(new Point(85, 15),new Point(115, 45)));
//            Core.addWeighted(vidasPerdidas,1.0,vida3,0.5,0.0,dst);
//            dst.copyTo(cenario.colRange(85,115).rowRange(15,45));
//        }
        //Vidas - Término

        //Tempo - Começo
        Imgproc.resize(barraBordas, barraBordas, new Size(206.0, 7.0));
        dst = new Mat();
        Mat roiBarra = cenario.submat(new Rect(new Point(220, 65), new Point(426, 72)));
        Core.addWeighted(barraBordas,1.0,roiBarra,0.65,0.0,dst);
        dst.copyTo(cenario.colRange(220,426).rowRange(65,72));
        //Tempo - Término
        
        //Estrela - Começo
        Imgproc.resize(estrelaNegra, estrelaNegra, new Size(30.0, 30.0));
        dst = new Mat();
        Mat roiEstrela1 = cenario.submat(new Rect(new Point(470, 5), new Point(500, 35)));
        Core.addWeighted(estrelaNegra,1.5,roiEstrela1,-0.02,0.0,dst);
        dst.copyTo(cenario.colRange(470,500).rowRange(5,35));
        dst = new Mat();
        Mat roiEstrela2 = cenario.submat(new Rect(new Point(500, 5), new Point(530, 35)));
        Core.addWeighted(estrelaNegra,1.5,roiEstrela2,-0.02,0.0,dst);
        dst.copyTo(cenario.colRange(500,530).rowRange(5,35));
        dst = new Mat();
        Mat roiEstrela3 = cenario.submat(new Rect(new Point(530, 5), new Point(560, 35)));
        Core.addWeighted(estrelaNegra,1.5,roiEstrela3,-0.02,0.0,dst);
        dst.copyTo(cenario.colRange(530,560).rowRange(5,35));
        dst = new Mat();
        Mat roiEstrela4 = cenario.submat(new Rect(new Point(560, 5), new Point(590, 35)));
        Core.addWeighted(estrelaNegra,1.5,roiEstrela4,-0.02,0.0,dst);
        dst.copyTo(cenario.colRange(560,590).rowRange(5,35));
        dst = new Mat();
        Mat roiEstrela5 = cenario.submat(new Rect(new Point(590, 5), new Point(620, 35)));
        Core.addWeighted(estrelaNegra,1.5,roiEstrela5,-0.02,0.0,dst);
        dst.copyTo(cenario.colRange(590,620).rowRange(5,35));
        //Estrela - Término
        
    }

    void mostraEscada (Mat cenario){
        Mat dst;
        
        Imgproc.resize(escadaSubindo, escadaSubindo, new Size(50.0, 50.0));
        Imgproc.resize(escadaDescendo, escadaDescendo, new Size(50.0, 50.0));
        
        int iSentido = nivel.getOTI();
        
        if (iSentido == 1){
            dst = new Mat();            
            Mat subindo = cenario.submat(new Rect(new Point(200, 15),new Point(250, 65)));
            Core.addWeighted(escadaSubindo,1.0,subindo,0.5,0.0,dst);
            dst.copyTo(cenario.colRange(200,250).rowRange(15,65));            
        }else{
            dst = new Mat();            
            Mat descendo = cenario.submat(new Rect(new Point(200, 15),new Point(250, 65)));
            Core.addWeighted(escadaDescendo,1.0,descendo,0.5,0.0,dst);
            dst.copyTo(cenario.colRange(200,250).rowRange(15,65));            
        }
    }
    
     void removeElementoDaFila (Vector<Imagem> filaElementos){
         filaElementos.remove(0);
     }   
        
    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * @return the conjuntoImagem
     */
    public ConjuntoImagem getConjuntoImagem() {
        return conjuntoImagem;
    }

    /**
     * @param conjuntoImagem the conjuntoImagem to set
     */
    public void setConjuntoImagem(ConjuntoImagem conjuntoImagem) {
        this.conjuntoImagem = conjuntoImagem;
    }

    /**
     * @return the fase
     */
    public Fase getFase() {
        return fase;
    }

    /**
     * @param fase the fase to set
     */
    public void setFase(Fase fase) {
        this.fase = fase;
    }

    /**
     * @return the nivel
     */
    public Nivel getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the filaElementos
     */
    public Vector<Imagem> getFilaElementos() {
        return filaElementos;
    }

    /**
     * @param filaElementos the filaElementos to set
     */
    public void setFilaElementos(Vector<Imagem> filaElementos) {
        this.filaElementos = filaElementos;
    }

    /**
     * @return the filaElementosReferencia
     */
    public Vector<Imagem> getFilaElementosReferencia() {
        return filaElementosReferencia;
    }

    /**
     * @param filaElementosReferencia the filaElementosReferencia to set
     */
    public void setFilaElementosReferencia(Vector<Imagem> filaElementosReferencia) {
        this.filaElementosReferencia = filaElementosReferencia;
    }

    /**
     * @return the parametros
     */
    public Parametros getParametros() {
        return parametros;
    }

    /**
     * @param parametros the parametros to set
     */
    public void setParametros(Parametros parametros) {
        this.parametros = parametros;
    }

    /**
     * @return the pontuacao
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * @return the jogo
     */
    public Jogos getJogo() {
        return jogo;
    }

    /**
     * @param jogo the jogo to set
     */
    public void setJogo(Jogos jogo) {
        this.jogo = jogo;
    }

    /**
     * @return the publico
     */
    public Publico getPublico() {
        return publico;
    }

    /**
     * @param publico the publico to set
     */
    public void setPublico(Publico publico) {
        this.publico = publico;
    }
    
}
