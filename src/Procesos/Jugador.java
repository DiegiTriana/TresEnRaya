package Procesos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Jugador {
    private String nombre;
    private String color; 
    private String figura;
    private FiguraImagen figuraimagen;
    private int tablero[][];
    private Juego juego;
    public Jugador(){
        tablero = new int[3][3];
        limpiarTablero();
    }
    public Jugador(FiguraImagen figuraimagen){
        this.figuraimagen = figuraimagen;
        tablero = new int[3][3];
        limpiarTablero();
    }
    public Jugador(String nombre, FiguraImagen figuraimagen){
        this.nombre = nombre;
        this.figuraimagen = figuraimagen;
        tablero = new int[3][3];
        limpiarTablero();
    }
    public void limpiarTablero(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tablero[i][j]=0;
            
            }
        }
    }
    
    public void tresEnRaya(Jugador jugadorRival){
    // Verifica la primera fila para una línea ganadora.
    if(tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1){
        dibujarLineaGanadora(0, 0, 0, 2);
         return;
    }
    // Verifica la segunda fila para una línea ganadora.
    if(tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1){
        dibujarLineaGanadora(1, 0, 1, 2);
         return;
    }
    // Verifica la tercera fila para una línea ganadora.
    if(tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1){
        dibujarLineaGanadora(2, 0, 2, 2);
        return;
    }

    // Verifica las columnas para una línea ganadora.
    if(tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1){
        dibujarLineaGanadora(0, 0, 2, 0);
         return;
    }
    if(tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1){
        dibujarLineaGanadora(0, 1, 2, 1);
         return;
    }
    if(tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1){
        dibujarLineaGanadora(0, 2, 2, 2);
         return;
    }

    // Verifica las diagonales para una línea ganadora.
    if(tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1){
        dibujarLineaGanadora(0, 0, 2, 2);
         return;
    }
    if(tablero[2][0] == 1 && tablero[1][1] == 1 && tablero[0][2] == 1){
        dibujarLineaGanadora(2, 0, 0, 2);
         return;
    }

    // Verifica empate.
    int contador = 0;
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            if(tablero[i][j] == 1 || jugadorRival.getTablero()[i][j] == 1) {
                contador++;
            }
        }
    }

    if (contador == 9) {
        // Mostrar un JOptionPane cuando se detecta un empate.
        JOptionPane.showMessageDialog(null, "¡Es un empate!", "Empate", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    private void dibujarLineaGanadora(int startX, int startY, int endX, int endY) {
    // Puedes calcular las coordenadas exactas en el tablero con los índices dados
    // Por ejemplo, puedes obtener las posiciones de los cuadros y luego dibujar la línea
    // entre ellos usando Graphics o Graphics2D
    int startXPos = juego.getCuadros().get(startX * 3 + startY).getX() + juego.getCuadros().get(startX * 3 + startY).getWidth() / 2;
    int startYPos = juego.getCuadros().get(startX * 3 + startY).getY() + juego.getCuadros().get(startX * 3 + startY).getHeight() / 2;
    int endXPos = juego.getCuadros().get(endX * 3 + endY).getX() + juego.getCuadros().get(endX * 3 + endY).getWidth() / 2;
    int endYPos = juego.getCuadros().get(endX * 3 + endY).getY() + juego.getCuadros().get(endX * 3 + endY).getHeight() / 2;

    // Dibuja la línea blanca
    Graphics g = juego.getGraphics();
    g.setColor(Color.WHITE);
    g.drawLine(startXPos, startYPos, endXPos, endYPos);
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
        
    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FiguraImagen getFiguraimagen() {
        return figuraimagen;
    }

    public void setFiguraimagen(FiguraImagen figuraimagen) {
        this.figuraimagen = figuraimagen;
    }
    
}
