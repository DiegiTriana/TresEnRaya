package Vista;

import Procesos.Juego;
import Procesos.Jugador;
import java.awt.Color;

public class Tablero4x4 extends javax.swing.JFrame {

private Jugador jugador1;
private Jugador jugador2;
private Juego juego;
    
    public Tablero4x4(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        init();
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        lblJugador1.setText(jugador1.getNombre());
        lblJugador2.setText(jugador2.getNombre());
        
        juego = new Juego();
        juego.setJugador1(jugador1);
        juego.setJugador2(jugador2);
        juego.setAlturaCI(100);
        juego.setAnchoCI(100);
        juego.setMargen(5);
        juego.setCuadroCI(new Color(14,19,43));
        juego.setColorTablero(new Color(239,180,255));
        juego.setLocation(40, 150);
        juego.crearTablero();
        juego.setVisible(true);
        
        panelFondo.add(juego);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblpuntajeJ2 = new javax.swing.JLabel();
        lblpuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setForeground(new java.awt.Color(14, 19, 46));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(380, 0, 40, 30);

        lblJugador2.setBackground(new java.awt.Color(255, 255, 255));
        lblJugador2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador2.setText("NAME");
        lblJugador2.setOpaque(true);
        panelFondo.add(lblJugador2);
        lblJugador2.setBounds(300, 60, 90, 30);

        lblJugador1.setBackground(new java.awt.Color(255, 255, 255));
        lblJugador1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(0, 0, 0));
        lblJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador1.setText("NAME");
        lblJugador1.setOpaque(true);
        panelFondo.add(lblJugador1);
        lblJugador1.setBounds(30, 60, 90, 30);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(190, 50, 40, 50);

        lblpuntajeJ2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblpuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblpuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpuntajeJ2.setText("0");
        panelFondo.add(lblpuntajeJ2);
        lblpuntajeJ2.setBounds(240, 50, 40, 50);

        lblpuntajeJ1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblpuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblpuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpuntajeJ1.setText("0");
        panelFondo.add(lblpuntajeJ1);
        lblpuntajeJ1.setBounds(140, 50, 40, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblpuntajeJ1;
    private javax.swing.JLabel lblpuntajeJ2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
