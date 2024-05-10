package Procesos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Juego extends JPanel {

    private int anchoCI;
    private int alturaCI;
    private int margen;
    private Color colorTablero;
    private Color cuadroCI;
    private FiguraImagen jugadorActual;

    private Jugador jugador1;
    private Jugador jugador2;

    private ArrayList<Cuadro> cuadros;

    public Juego() {
        init();

    }

    private void init() {
        anchoCI = 80;
        alturaCI = 80;
        cuadroCI = Color.BLUE;
        colorTablero = Color.RED;
        margen = 6;
        jugador1 = new Jugador();
        jugador2 = new Jugador();
        cuadros = new ArrayList();
        jugadorActual = FiguraImagen.EQUIS;
    }

    public void crearTablero3x3() {
        setLayout(null);
        setSize(anchoCI * 3 + margen * 4, alturaCI * 3 + margen * 4);
        setBackground(colorTablero);
        crearCruadoCI3x3();
    }

    public void crearTablero4x4() {
        setLayout(null);
        setSize(anchoCI * 4 + margen * 5, alturaCI * 4 + margen * 5);
        setBackground(colorTablero);
        crearCruadoCI4x4();
    }

    public void crearTablero5x5() {
        setLayout(null);
        setSize(anchoCI * 5 + margen * 6, alturaCI * 5 + margen * 6);
        setBackground(colorTablero);
        crearCruadoCI5x5();
    }

    private void crearCruadoCI5x5() {
        int x = margen;
        int y = margen;

        for (int i = 0; i < 5; i++) {
            x = margen;
            for (int j = 0; j < 5; j++) {
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, cuadroCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x, y);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadros(cuadro);

                x += (anchoCI + margen);

            }
            y += (alturaCI + margen);
        }
    }

    private void crearCruadoCI3x3() {
        int x = margen;
        int y = margen;

        for (int i = 0; i < 3; i++) {
            x = margen;
            for (int j = 0; j < 3; j++) {
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, cuadroCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x, y);
                cuadro.setI(i);
                cuadro.setJ(j);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadros(cuadro);

                x += (anchoCI + margen);

            }
            y += (alturaCI + margen);
        }
    }

    private void crearCruadoCI4x4() {
        int x = margen;
        int y = margen;

        for (int i = 0; i < 4; i++) {
            x = margen;
            for (int j = 0; j < 4; j++) {
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, cuadroCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x, y);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadros(cuadro);

                x += anchoCI + margen;
            }
            y += alturaCI + margen;
        }
    }

    public void crearEventosCuadros(Cuadro cuadro) {
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (cuadro.isDibujado()) {
                    return;
                }

                if (jugadorActual == FiguraImagen.EQUIS) {
                    cuadro.setFiguraimagen(FiguraImagen.EQUIS);
                    jugador2.getTablero()[cuadro.getI()][cuadro.getJ()] = 1;
                    jugadorActual = FiguraImagen.CIRCULO;
                } else if (jugadorActual == FiguraImagen.CIRCULO) {
                    cuadro.setFiguraimagen(FiguraImagen.CIRCULO);
                    jugador1.getTablero()[cuadro.getI()][cuadro.getJ()] = 1;
                    jugadorActual = FiguraImagen.EQUIS;
                }

                cuadro.setDibujado(true);
                cuadro.repaint();

                // Verifica si el tablero está lleno y no hay ganador
                if (esEmpate()) {
                    // Muestra un mensaje de empate
                    JOptionPane.showMessageDialog(null, "El juego ha terminado en empate.");
                    // Opcionalmente, puedes reiniciar el juego aquí o realizar otras acciones
                }else if (!esEmpate())System.out.println("Hay un ganador");
                
                
            }

                    // Método para verificar si el tablero está lleno
            private boolean esEmpate() {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (jugador1.getTablero()[i][j] == 0 && jugador2.getTablero()[i][j] == 0) {
                            return false;
                        }
                    }
                }
                return true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        cuadro.addMouseListener(evento);
    }

    public FiguraImagen getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(FiguraImagen jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getCuadroCI() {
        return cuadroCI;
    }

    public void setCuadroCI(Color cuadroCI) {
        this.cuadroCI = cuadroCI;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

}
