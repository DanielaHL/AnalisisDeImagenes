/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisisEspacial;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;
import open.AbrirImagen;

/**
 *
 * @author Daniela
 */
//public class Suavizado {
//    public static Image agregarRuidoAditivo(Image io, int p){
///*
//        int dim = io.getWidth(null)*io.getHeight(null);
//        int cp = dim/100*p;
//        BufferedImage bi = AbrirImagen.toBufferedImage(io);
//        Random ran = new Random(); 
//       
//        for(int x=0; x<cp;x++){
//            int r = ran.nextInt(bi.getHeight());
//            int c = ran.nextInt(bi.getWidth());
//            bi.setRGB( c,r, Color.WHITE.getRGB());
//        }
//        return AbrirImagen.toImage(bi);
//    }
//
//    public static Image agregarRuidoSustractivo(Image io, int p){
//
//        int dim = io.getWidth(null)*io.getHeight(null);
//        int cp = dim/100*p;
//        BufferedImage bi = AbrirImagen.toBufferedImage(io);
//        Random ran = new Random(); 
//       
//        for(int x=0; x<cp;x++){
//            int r = ran.nextInt(bi.getHeight());
//            int c = ran.nextInt(bi.getWidth());
//            bi.setRGB(c,r, Color.BLACK.getRGB());
//        }
//        return AbrirImagen.toImage(bi);
//    }
//    
//    public static Image agregarRuidoMezclado(Image io, int p){
//
//        int dim = io.getWidth(null)*io.getHeight(null);
//        int cp = dim/100*p;
//        BufferedImage bi = AbrirImagen.toBufferedImage(io);
//        Random ran = new Random(); 
//       
//        for(int x=0; x<cp;x++){
//            int r = ran.nextInt(bi.getHeight());
//            int c = ran.nextInt(bi.getWidth());
//            bi.setRGB(c,r, Color.BLACK.getRGB());
//            bi.setRGB(c,r, Color.WHITE.getRGB());
//        }
//        return AbrirImagen.toImage(bi);
//    }
//    
//    public static Image(Image io, int[][] mascara){
//        
//        BufferedImage bi = AbrirImagen.toBufferedImage(io);
//        BufferedImage bnuevo = new BufferedImage(bi.getWidth(),bi.getHeight(),BufferedImage.TYPE_INT_RGB);
//        //Recorrer el buffer
//        for(int x=0;x<bi.getWidth();x++){
//            for(int y=0;y<bi.getHeight();y++){
//                int rgb = calcularNuevoTono(x,y,bi,mascara);
//            
//            }
//        
//        }
//        return ;    
//    }
//
//    private static int calcularNuevoTono(int x, int y, BufferedImage bi, int[][] mascara) {
//        //recorrer la mascara
//        int r=x-1;
//        int c=y-1;
//        int auxR=0;
//        int auxG=0;
//        int auxB=0;
//      
//        for(){//renglon
//            for(){//columna
//                if(mascara[i][j]){
//                    try{
//                        int rgb = bi.getRGB(r, c);
//                        color = new Color(rgb);
//                        auxR+=color.
//                    }catch(Exception e){
//                        
//                   
//                    }
//                }
//            }
//        }
//        return 0;
//    } 
//*/
//
//}
//
////ruido mezclado