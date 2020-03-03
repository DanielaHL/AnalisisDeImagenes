/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisisDeImagenes;
import AnalisisEspacial.FiltrosEspaciales;
import AnalisisEspacial.Graficar;
import AnalisisEspacial.Histograma;
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
        Image imagen = AbrirImagen.openImage();
        Histograma h = new  Histograma(imagen);
        h.graficarHistogramas();
        JFrameImagen fi = new JFrameImagen(imagen);
        Image binarizacion = FiltrosEspaciales.binarizarImagen(imagen, 40);
        JFrameImagen fic = new JFrameImagen(binarizacion);
        Histograma h1 = new  Histograma(binarizacion);
        h1.graficarHistogramas();  
     
        System.out.println();
    }
}
