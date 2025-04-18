/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package carrobrumbum.views;

import carrobrumbrum.exceptions.DetenidoException;
import carrobrumbrum.exceptions.PatinarException;
import carrobrumbrum.models.Vehiculo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class Frenar extends javax.swing.JDialog {
    private Vehiculo automovil;
    private VehiculoVentana ventanaPrincipal;
    
    public Frenar(java.awt.Frame parent, boolean modal,Vehiculo automovil,VehiculoVentana ventana) {
        super(parent, modal);
        initComponents();
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/carrobrumbrum/images/carro.png")).getImage());
        }catch(Exception e){

        } 
        this.automovil = automovil;
        this.ventanaPrincipal = ventana;                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFrenar = new javax.swing.JTextField();
        txtSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setText("Cuanto va a frenar?(km/h)");

        txtSiguiente.setText("Siguiente");
        txtSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSiguienteMouseClicked(evt);
            }
        });
        txtSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiguienteActionPerformed

    private void txtSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSiguienteMouseClicked
        try{
            int valorFrenado = Integer.parseInt(txtFrenar.getText());           
            this.automovil.frenarBruscamente(valorFrenado);
            ventanaPrincipal.actualizar();           
            this.dispose();
        }catch(DetenidoException e){
            this.dispose();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(PatinarException e){
            this.dispose();
            gifPatinando ventanaPatinando = new gifPatinando (ventanaPrincipal,true);
            ventanaPatinando.setVisible(true);          
        }
    }//GEN-LAST:event_txtSiguienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFrenar;
    private javax.swing.JButton txtSiguiente;
    // End of variables declaration//GEN-END:variables
}
