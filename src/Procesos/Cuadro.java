package Procesos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Cuadro extends JPanel {
    private int ancho;
    private int altura;
    private Color color;
    private FiguraImagen figuraimagen;
    private boolean dibujado;
    private int i;
    private int j;
    
    public Cuadro(int ancho, int altura, Color color){
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
        dibujado = false;
        init();
    }
    public void init(){
        setSize(ancho,altura);
        setBackground(color);
    }

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg); 
        Graphics2D g = (Graphics2D)gg;
        
        ImageIcon imagen = new ImageIcon();
        if(figuraimagen == FiguraImagen.CIRCULO)
            imagen = new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if(figuraimagen == FiguraImagen.EQUIS)
            imagen = new ImageIcon(getClass().getResource(Ruta.EQUIS));
        g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
    }

    
    
    
    
    
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean isDibujado() {
        return dibujado;
    }

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }
    
    
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FiguraImagen getFiguraimagen() {
        return figuraimagen;
    }

    public void setFiguraimagen(FiguraImagen figuraimagen) {
        this.figuraimagen = figuraimagen;
    }
    
}
