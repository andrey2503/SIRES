/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class PanelPagos extends javax.swing.JPanel {

    /**
     * Creates new form PanelPagos
     */
    public PanelPagos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_pagar = new javax.swing.JButton();
        btn_cancelarpago = new javax.swing.JButton();

        setBackground(new java.awt.Color(111, 180, 43));

        btn_pagar.setText("Pagar mensualidad");

        btn_cancelarpago.setText("Cancelar Pago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_pagar)
                .addGap(37, 37, 37)
                .addComponent(btn_cancelarpago)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pagar)
                    .addComponent(btn_cancelarpago))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarpago;
    private javax.swing.JButton btn_pagar;
    // End of variables declaration//GEN-END:variables

public void escucharBotones(ActionListener control)
{
btn_cancelarpago.addActionListener(control);
btn_pagar.addActionListener(control);
}
    
public static final String BTN_CANCELARPAGO="Cancelar Pago";
public static final String BTN_PAGARMENSUALIDAD="Pagar mensualidad";

}
