/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisisDeImagenes;
import AnalisisEspacial.Convolucion;
import AnalisisEspacial.FiltrosEspaciales;
import AnalisisEspacial.Graficar;
import AnalisisEspacial.Histograma;
//import AnalisisEspacial.Suavizado;
import gui.JFrameImagen;
import gui.JFrameSegmentacion;
import open.AbrirImagen;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Daniela
 */
public class Main {
      public static void main(String[] args) {

       /* Image imagen = AbrirImagen.openImage();
        
        JFrameImagen frame = new JFrameImagen(imagen); 
        frame.setTitle("Imagen Original");
        
        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        
        
        //int rgb = bi.getRGB(50,50);
        Color color = new Color(57,255,20);
        
          //Dibujar Circulo
        int centroEjeX = (int)bi.getWidth()/2;
        int centroEjeY = (int)bi.getHeight()/2;
        int radio = 35;
        
        for(int i = centroEjeX-radio; i<=centroEjeX+radio;i++){
            bi.setRGB(i,(int)Math.sqrt(Math.pow(radio,2)-Math.pow(i-centroEjeX,2))+centroEjeY,color.getRGB());
            bi.setRGB(i,-(int)Math.sqrt(Math.pow(radio,2)-Math.pow(i-centroEjeX,2))+centroEjeY,color.getRGB());
        }
                
        JFrameImagen frame2 = new JFrameImagen(AbrirImagen.toImage(bi));
        frame2.setTitle("Imagen Modificada");
        System.out.println();
        */
       
//       Image imagen = AbrirImagen.openImage();
//        JFrameImagen frame = new JFrameImagen(imagen); 
//        Histograma hi = new Histograma(imagen);
//        hi.graficarHistogramaGrises();
//        hi.graficarHistogramaAzul(); 
//        hi.graficarHistogramaRojo();
//        hi.graficarHistogramaVerde();
//        hi.graficarHistogramas();
//        
//        Image imagen = AbrirImagen.openImage();
//        JFrameImagen frame = new JFrameImagen(imagen);
//        frame.setTitle("Imagen Original");
//        
//        Image imagen1 = FiltrosEspaciales.modificarTemperatura(imagen,-60);
//        JFrameImagen frame2 = new JFrameImagen(imagen1);
//        frame2.setTitle("Temperatura");
//        
//        Image imagen2 = FiltrosEspaciales.iluminarImagen(imagen,-60);
//        JFrameImagen frame3 = new JFrameImagen(imagen2);
//        
//        frame3.setTitle("Iluminacion");
//        
//        Histograma h = new Histograma(imagen1);
//        h.graficarHistogramas();
//        
//        Histograma h2 = new Histograma(imagen2);
//        h2.graficarHistogramas();
       
       
        
    /*    Image imagen = AbrirImagen.openImage();
        
        Histograma h = new Histograma(imagen);
        h.graficarHistogramas();
        
        Image imagen2 = FiltrosEspaciales.iluminarImagen(imagen, 90);
        JFrameImagen frame3 = new JFrameImagen(imagen2);
        
        frame3.setTitle("Umbral");
    */    
        

     /*   Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas(); 
        JFrameSegmentacion frame = new JFrameSegmentacion("Segementacion",imagen);
     */   
     /*   
     Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas();
        JFrameImagen fi = new JFrameImagen(imagen);
        Image contraste = FiltrosEspaciales.expansionLineal(h, imagen);
        JFrameImagen fic = new JFrameImagen(contraste);
        Histograma h1 = new  Histograma(contraste);
        h1.graficarHistogramas();  
       */
        
     
    /*
     //Expansion logaritmica
        Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas();
        JFrameImagen fi = new JFrameImagen(imagen);
        Image log = FiltrosEspaciales.expansionLogaritmica(imagen,5);
        JFrameImagen fic = new JFrameImagen(log);
        Histograma h1 = new  Histograma(log);
        h1.graficarHistogramas();
    */ 
    /*
    //Expansion Exponencial
        Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas();
        JFrameImagen fi = new JFrameImagen(imagen);
        Image exp = FiltrosEspaciales.expansionExponencial(imagen,0.1);
        JFrameImagen fic = new JFrameImagen(exp);
        Histograma h1 = new  Histograma(exp);
        h1.graficarHistogramas();
   */
     ///*
     // Expansion lineal
//         Image imagen = AbrirImagen.openImage();
//        Histograma h = new  Histograma(imagen);
//        h.graficarHistogramas();
//        JFrameImagen fi = new JFrameImagen(imagen);
//        Image contraste = FiltrosEspaciales.expansionLineal(h, imagen);
//        JFrameImagen fic = new JFrameImagen(contraste);
//        Histograma h1 = new  Histograma(contraste);
//        h1.graficarHistogramas();
     //*/
     
     //Expansion
//        Image imagen = AbrirImagen.openImage();
//        Histograma h = new  Histograma(imagen);
//        h.graficarHistogramas();
//        JFrameImagen fi = new JFrameImagen(imagen);
//        Image contraste = FiltrosEspaciales.expansionDanis(5, 30, imagen);
//        JFrameImagen fic = new JFrameImagen(contraste);
//        Histograma h1 = new  Histograma(contraste);
//        h1.graficarHistogramas();
        //Binarizacion
     /*Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas();
        JFrameImagen fi = new JFrameImagen(imagen);
        Image binarizacion = FiltrosEspaciales.binarizarImagen(imagen, 40);
        JFrameImagen fic = new JFrameImagen(binarizacion);
        Histograma h1 = new  Histograma(binarizacion);
        h1.graficarHistogramas();  
     */
        /*  
     //Binarizacion automatica
        Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas();
        JFrameImagen fi = new JFrameImagen(imagen);
        
        Image ig = FiltrosEspaciales.generarImagenGrises(imagen);
        JFrameImagen fic = new JFrameImagen(ig);
        Histograma hGrises = new  Histograma(ig);
        hGrises.graficarHistogramas();
        
        double his[]=hGrises.getHBlue();
        
       // Image ip = FiltrosEspaciales.metodoIterativo(his);
        
        */
        
//             Image imagen = AbrirImagen.openImage();
//        Histograma h = new  Histograma(imagen);
//        h.graficarHistogramas();
//        JFrameImagen fi = new JFrameImagen(imagen);
//        Image contraste = FiltrosEspaciales.iluminarImagen(imagen, -150);
//        JFrameImagen fic = new JFrameImagen(contraste);
//        Histograma h1 = new  Histograma(contraste);
//        h1.graficarHistogramas();

    
    //Convolucion
    Image imagen = AbrirImagen.openImage();
        JFrameImagen frame = new JFrameImagen(imagen);
        Histograma ho = new Histograma(imagen);
        ho.graficarHistogramas();
    
        int[][] mascara = new int[][]{{-2,-1,0},{-1,1,1},{0,1,2}};
        Image imagenSuavizada = Convolucion.aplicarConvolucion(imagen, mascara, 1, 0);
               
        JFrameImagen frame3 = new JFrameImagen(imagenSuavizada);
        Histograma his = new Histograma(imagenSuavizada);
        his.graficarHistogramas();
      }
}
