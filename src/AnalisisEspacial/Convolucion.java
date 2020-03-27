/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisisEspacial;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import open.AbrirImagen;

/**
 *
 * @author Daniela
 */
public class Convolucion {
    public static Image aplicarConvolucion(Image io,int[][] mascara, int div, int offset){

        BufferedImage bi = AbrirImagen.toBufferedImage(io);
        BufferedImage bnuevo = new BufferedImage(bi.getWidth(),bi.getHeight(),BufferedImage.TYPE_INT_RGB);
        // recorres el buffer
        for(int x=0; x < bi.getWidth();x++){
            for(int y=0; y < bi.getHeight();y++){
            int rgb = calcularNuevoTono(x,y,bi,mascara, div, offset);
            //buffer nuevo
            bnuevo.setRGB(x, y, rgb);
            }
        }
        return AbrirImagen.toImage(bnuevo);
    }

    private static int calcularNuevoTono(int x, int y, BufferedImage bi, int[][] mascara, int div, int offset) {
        
        // recorrer la mascara
        // int r = x -1;
        //int c = y -1;
        int auxR = 0, auxG = 0, auxB = 0;
        Color color = null;
        int k = 0;
        for(int i = 0 , r = x -1; i<mascara.length;i++, r++){
            for(int j = 0, c = y -1; j < mascara[0].length;j++, c++){
                            
                    try {
                        int rgb = bi.getRGB(r, c);
                        color = new Color(rgb);
                        auxR+= color.getRed()*mascara[i][j];
                        auxG+= color.getGreen()*mascara[i][j];
                        auxB+= color.getBlue()*mascara[i][j];
                        
                    } catch (Exception e) {
                        // nada de nada 
                    }
            }
        }
        
        auxR/=div;
        auxG/=div;
        auxB/=div;
        
       // validarLimites();
        
        color = new Color(validarLimites(auxR+offset),validarLimites(auxG+offset),validarLimites(auxB+offset));
       
        return color.getRGB();
    }
    
    public static int validarLimites (int aux){

        if (aux<0)return 0;
        if (aux>255)return 255;
        return aux;

    }
}
