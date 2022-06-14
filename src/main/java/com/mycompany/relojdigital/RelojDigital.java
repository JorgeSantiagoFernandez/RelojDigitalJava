package com.mycompany.relojdigital;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RelojDigital extends javax.swing.JFrame implements Runnable {

    public RelojDigital() {
        initComponents();
        Thread hilo = new Thread(this);
        hilo.start();
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void run() {
        while(true){
            actualizar();
        }
    }
    
    private void actualizar() {
        int h, m, s;
        String hora, minuto, segundo;
        Date fechaHoy = new Date();
        Calendar calendario = new GregorianCalendar();
        calendario.setTime(fechaHoy);
        
        h = calendario.get(Calendar.HOUR_OF_DAY);
        m = calendario.get(Calendar.MINUTE);
        s = calendario.get(Calendar.SECOND);
        
        hora = h > 9 ? "" +h : "0" +h;
        minuto = m > 9 ? "" +m : "0" +m;
        segundo = s > 9 ? "" +s : "0" +s;
        
        lblReloj.setText(hora +":"+ minuto +":"+ segundo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblReloj.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        RelojDigital relojdigital = new RelojDigital();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblReloj;
    // End of variables declaration//GEN-END:variables

    

    
}
