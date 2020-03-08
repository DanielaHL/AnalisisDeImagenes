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
public class FiltrosEspaciales {
     public static Image generarImagenGrises(Image io){

        BufferedImage bi = AbrirImagen.toBufferedImage(io);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int prom = (color.getRed()+color.getGreen()+color.getBlue())/3;
            color = new Color(prom,prom,prom);
            bi.setRGB(x, y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }

    public static Image generarImagenNegativa(Image io){

        BufferedImage bi = AbrirImagen.toBufferedImage(io);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            
            color = new Color(255-color.getRed()
                            ,255-color.getGreen()
                            ,255-color.getBlue());
            bi.setRGB(x, y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }

    public static Image iluminarImagen(Image imagen, int alpha){

        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int r = color.getRed() + alpha;
            int g = color.getGreen() + alpha;
            int b = color.getBlue() + alpha;
            color = new Color(validarLimites(r),
            validarLimites(g),
            validarLimites(b));
            bi.setRGB(x,y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }
    
    public static Image expansionLineal(int r1, int r2, Image imagen){

        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int r = (color.getRed()-r1)*(255/r2-r1);
            int g = (color.getGreen()-r1)*(255/r2-r1);
            int b = (color.getBlue()-r1)*(255/r2-r1);
            color = new Color(validarLimites(r),
            validarLimites(g),
            validarLimites(b));
            bi.setRGB(x,y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }
    
    public static Image expansionLineal(Histograma h, Image imagen){

         BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int r = (color.getRed()-h.getMinR())*(255/h.getMaxR()-h.getMinR());
            int g = (color.getGreen()-h.getMinG())*(255/h.getMaxG()-h.getMinG());
            int b = (color.getBlue()-h.getMinB())*(255/h.getMaxB()-h.getMinB());
            color = new Color(validarLimites(r),
            validarLimites(g),
            validarLimites(b));
            bi.setRGB(x,y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }
    
     public static Image expansionLogaritmica(Image imagen, int v ){
        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for(int x=0;x<bi.getWidth();x++){
            for(int y=0; y<bi.getHeight();y++){
                 Color pixel = new Color(bi.getRGB(x, y));
                 int r = (int)((255*Math.log(v+pixel.getRed()))/(Math.log(256)));
                 int g = (int)(255*Math.log(v+pixel.getGreen())/(Math.log(256)));
                 int b = (int)(255*Math.log(v+pixel.getBlue())/(Math.log(256)));
                 
                 color = new Color(validarLimites(r),validarLimites(g),validarLimites(b));
                 bi.setRGB(x, y, color.getRGB());
                 
            }
        }
        
        return AbrirImagen.toImage(bi);
    }
    
    public static Image expansionExponencial(Image imagen, double z){
        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for (int x=0; x< bi.getWidth();x++)
            for(int y=0; y< bi.getHeight();y++){
                  Color pixel = new Color(bi.getRGB(x, y));
                  int r = ((int)(Math.pow(1+z,pixel.getRed())/z));
                  int g = ((int)(Math.pow(1+z,pixel.getGreen())/z));
                  int b = ((int)(Math.pow(1+z,pixel.getBlue())/z));

                    color = new Color(validarLimites(r),validarLimites(g),validarLimites(b));
                    bi.setRGB(x, y, color.getRGB());
            }
        
        return AbrirImagen.toImage(bi);
    
    
    }
    
     public static Image expansionDanis(int r1, int r2, Image imagen){

        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int r = ((r2-r1)*(color.getRed()-1))/(int)Math.pow((r2),0.5);
            int g = ((r2-r1)*(color.getGreen()-1))/(int)Math.pow((r2),0.5);
            int b = ((r2-r1)*(color.getBlue()-1))/(int)Math.pow((r2),0.5);
     
            color = new Color(validarLimites(r),
            validarLimites(g),
            validarLimites(b));
            bi.setRGB(x,y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }
    
   

    public static Image modificarTemperatura(Image imagen, int alpha){

        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color;
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int r = color.getRed() + alpha;
            int g = color.getGreen();
            int b = color.getBlue() - alpha;
            color = new Color(validarLimites(r),
            validarLimites(g),
            validarLimites(b));
            bi.setRGB(x,y,color.getRGB());
        }
        return AbrirImagen.toImage(bi);
    }

    public static int validarLimites (int aux){

        if (aux<0)return 0;
        if (aux>255)return 255;
        return aux;

    }
    
    public static int obtenerMin(double[] h){

        for(int x=0; x<h.length;x++){
            if(h[x]!=0) return x;
        }
     return -1;
    }

    public static int obtenerMax(double[] h){

        for(int x=h.length-1; x>=0;x--){
            if(h[x]!=0) return x;
        }
     return -1;
    }

    public static Image segmentarImagen(Image imagen, int umbral){

        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color, colorFondo;
        colorFondo = new Color(255,255,255);
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int prom = (color.getRed()+ color.getGreen()+color.getBlue())/3;
            if (prom>umbral){
                bi.setRGB(x,y,colorFondo.getRGB());
            }
                       
        }
        return AbrirImagen.toImage(bi);
    }

    public static Image segmentarImagen(Image imagen, int u1, int u2){
        // TODO: garantizar  que el u2>u1
        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color, colorFondo;
        colorFondo = new Color(255,255,255);
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int prom = (color.getRed()+ color.getGreen()+color.getBlue())/3;
            if (!(prom>= u1 && prom<=u2)){
                bi.setRGB(x,y,colorFondo.getRGB());
            }
                       
        }
        return AbrirImagen.toImage(bi);
    }
    
    //Imagen en escala de grises
    public static Image ecualizarImagen(Image imagen){
        //Dimensiones de la imagen
        int nxm = imagen.getWidth(null)*imagen.getHeight(null);
        Histograma h = new Histograma(imagen);
        //ho -> histograma original
        double[] ho = h.getHRed();
        //Distribucion acumulada de frecuencias
        int[] daf = new int[256];
        //nuevo tono
        int[] nt = new int[256];
        daf[0] =(int)ho[0];
        nt[0] = Math.round((daf[0]/nxm)*255);
        //recorremos el histograma para acumular
        for(int x=1;x<ho.length;x++){
            daf[x]=(int)(ho[x]+daf[x-1]);
            //temporal
            int tmp = Math.round((daf[x]/nxm)*255);
            nt[x]=tmp;
        }
        return null;
    }
    
   
    
    public static Image binarizarImagen(Image imagen, int umbral){
        
        BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color, colorFondo, colorObjeto;
        colorFondo = new Color(255,255,255);
        colorObjeto = new Color(0,0,0);
        
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            
            int prom = (color.getRed()+ color.getGreen()+color.getBlue())/3;
            if (prom>umbral){
                bi.setRGB(x,y,colorFondo.getRGB());
            }else if(prom<umbral){
            bi.setRGB(x,y,colorObjeto.getRGB());
            }          
        }
         return AbrirImagen.toImage(bi);
    }
    
     public static Image binarizarImagen(Image imagen, int u1, int u2){
       BufferedImage bi = AbrirImagen.toBufferedImage(imagen);
        Color color, colorFondo;
        colorFondo = new Color(255,255,255);
        generarImagenGrises(bi);
        for(int x=0; x<bi.getWidth();x++)
            for(int y=0; y<bi.getHeight();y++){
            color = new Color(bi.getRGB(x, y));
            int prom = (color.getRed()+ color.getGreen()+color.getBlue())/3;
            if (!(prom>= u1 && prom<=u2)){
                bi.setRGB(x,y,colorFondo.getRGB());
            }
                       
        }
        return AbrirImagen.toImage(bi);
        
     }
     
     
     //Técnica de binarizacion automatica
     
      public static int metodoIterativo(double[] histograma){
    
        int ui = calcularUmbralInicial(histograma);
        int uNuevo=0;
        System.out.println(ui);
        do{
        uNuevo = ui;
        ui = reajustarUmbral(ui,histograma);
        System.out.println(ui);
        }while(uNuevo!=ui);
        
        return ui;
        
    }

    private static int calcularUmbralInicial(double[] histograma) {
        int numPixels = 0;
        int suma = 0;
        for(int x=0;x<histograma.length;x++){
        numPixels+=histograma[x];
        suma+=histograma[x]*x;
        }
        return (int)(suma/numPixels);
    }

    private static int reajustarUmbral(int ui, double[] histograma) {
       int u1,u2;
       int a1=0,a2=0,n1=0,n2=0;
       a1+=histograma[0];
       for(int x=1;x<ui;x++){
        a1+=histograma[x]*x;
        n1+=histograma[x];
       }
       
        for(int y=ui;y<=255;y++){
        a2+=histograma[y]*y;
        n2+=histograma[y];
       }
        if (n1==0 || n2==0) return 0;
        u1 = a1/n1;
        u2 = a2/n2;
       return (int)((u1+u2)/2);
    }
    
}
