package Procesos;

public class Jugador {
    private String nombre;
    private String color; 
    private String figura;
    private FiguraImagen figuraimagen;
    private int tablero[][];
    
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
    
    public void tresEnRaya(){
        if(tablero[0][0] == 1&&tablero[0][1] == 1&&tablero [0][2] == 1){
            
        }
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
