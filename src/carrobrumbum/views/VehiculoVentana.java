/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrobrumbum.views;

import carrobrumbrum.exceptions.ApagadoException;
import carrobrumbrum.exceptions.EncendidoException;
import carrobrumbrum.exceptions.velocidadMayor60Exception;
import carrobrumbrum.models.Llanta;
import carrobrumbrum.models.Motor;
import carrobrumbrum.models.Vehiculo;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author edgar
 */
public class VehiculoVentana extends javax.swing.JFrame {
    private Vehiculo automovil;

    public VehiculoVentana(Vehiculo automovil) {
        initComponents();
        this.automovil = automovil;
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/carrobrumbrum/images/carro.png")).getImage());
        }catch(Exception e){

        }        
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
        btnFrenar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnApagar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnEncender = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAcelerar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTipoLlantas = new javax.swing.JLabel();
        lblLimiteLlantas = new javax.swing.JLabel();
        lblTipoMotor = new javax.swing.JLabel();
        lblLimiteMotor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnFrenar.setBackground(new java.awt.Color(0, 0, 0));
        btnFrenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrenarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFrenarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFrenarMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrobrumbrum/images/pedalFreno.png"))); // NOI18N

        javax.swing.GroupLayout btnFrenarLayout = new javax.swing.GroupLayout(btnFrenar);
        btnFrenar.setLayout(btnFrenarLayout);
        btnFrenarLayout.setHorizontalGroup(
            btnFrenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFrenarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(129, 129, 129))
        );
        btnFrenarLayout.setVerticalGroup(
            btnFrenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrobrumbrum/images/interior.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nico y nessa");

        btnApagar.setBackground(new java.awt.Color(0, 0, 0));
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApagarMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrobrumbrum/images/apagar.png"))); // NOI18N

        javax.swing.GroupLayout btnApagarLayout = new javax.swing.GroupLayout(btnApagar);
        btnApagar.setLayout(btnApagarLayout);
        btnApagarLayout.setHorizontalGroup(
            btnApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnApagarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        btnApagarLayout.setVerticalGroup(
            btnApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEncender.setBackground(new java.awt.Color(0, 0, 0));
        btnEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncenderMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrobrumbrum/images/encender.png"))); // NOI18N

        javax.swing.GroupLayout btnEncenderLayout = new javax.swing.GroupLayout(btnEncender);
        btnEncender.setLayout(btnEncenderLayout);
        btnEncenderLayout.setHorizontalGroup(
            btnEncenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEncenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEncenderLayout.setVerticalGroup(
            btnEncenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEncenderLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Llantas");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Limite:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Velocidad actual");

        btnAcelerar.setBackground(new java.awt.Color(0, 0, 0));
        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrobrumbrum/images/pedalAcelerar.png"))); // NOI18N

        javax.swing.GroupLayout btnAcelerarLayout = new javax.swing.GroupLayout(btnAcelerar);
        btnAcelerar.setLayout(btnAcelerarLayout);
        btnAcelerarLayout.setHorizontalGroup(
            btnAcelerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAcelerarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        btnAcelerarLayout.setVerticalGroup(
            btnAcelerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAcelerarLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblVelocidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        lblVelocidad.setText(".");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado:");

        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText(".");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Motor");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipo:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Limite:");

        lblTipoLlantas.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoLlantas.setText(".");

        lblLimiteLlantas.setForeground(new java.awt.Color(255, 255, 255));
        lblLimiteLlantas.setText(".");

        lblTipoMotor.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoMotor.setText(".");

        lblLimiteMotor.setForeground(new java.awt.Color(255, 255, 255));
        lblLimiteMotor.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(315, 315, 315)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTipoLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLimiteLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTipoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLimiteMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVelocidad)
                                    .addComponent(lblEstado)))
                            .addComponent(btnAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEncender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblTipoLlantas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblLimiteLlantas))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblTipoMotor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblLimiteMotor))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFrenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseClicked
        Frenar ventanaFrenar = new Frenar (this,true,this.automovil,this);
        ventanaFrenar.setVisible(true);
        actualizar();
    }//GEN-LAST:event_btnFrenarMouseClicked

    private void btnFrenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseEntered
        mouseEntered(btnFrenar);
    }//GEN-LAST:event_btnFrenarMouseEntered

    private void btnFrenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseExited
        mouseExited(btnFrenar);
    }//GEN-LAST:event_btnFrenarMouseExited

    private void btnAcelerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseClicked
        Acelerar ventanaAcelerar = new Acelerar (this,true,this.automovil,this);
        ventanaAcelerar.setVisible(true);
        actualizar();
    }//GEN-LAST:event_btnAcelerarMouseClicked

    private void btnAcelerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseEntered
        mouseEntered(btnAcelerar);
    }//GEN-LAST:event_btnAcelerarMouseEntered

    private void btnAcelerarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseExited
        mouseExited(btnAcelerar);
    }//GEN-LAST:event_btnAcelerarMouseExited

    private void btnEncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseClicked
        Llanta llanta = automovil.getLlanta();
        lblTipoLlantas.setText(llanta.getTipo());
        lblLimiteLlantas.setText(String.valueOf(llanta.getLimiteVelocidad()));
        
        Motor motorm = automovil.getMotor();
        lblTipoMotor.setText(String.valueOf(motorm.getCilindraje()));
        lblTipoMotor.setText(String.valueOf(motorm.getVelocidadMax()));
 
        try{
            this.automovil.encender();
            gifEncender ventanaEncender = new gifEncender (this,true);
            ventanaEncender.setVisible(true);
        } catch (EncendidoException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());          
        }
        actualizar();
    }//GEN-LAST:event_btnEncenderMouseClicked

    private void btnEncenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseEntered
        mouseEntered(btnEncender);
    }//GEN-LAST:event_btnEncenderMouseEntered

    private void btnEncenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseExited
        mouseExited(btnEncender);
    }//GEN-LAST:event_btnEncenderMouseExited

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        try{
            this.automovil.apagar();
            gifApagar ventanaApagar = new gifApagar (this,true);
            ventanaApagar.setVisible(true);
        } catch (ApagadoException e) {
            JOptionPane.showMessageDialog(this,e.getMessage());                
        } catch (velocidadMayor60Exception e){
            gifAccidente ventanaAccidente = new gifAccidente (this,true);
            ventanaAccidente.setVisible(true);
            JOptionPane.showMessageDialog(this,e.getMessage());                          
        }        
        
    }//GEN-LAST:event_btnApagarMouseClicked

    private void btnApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseEntered
        mouseEntered(btnApagar);
    }//GEN-LAST:event_btnApagarMouseEntered

    private void btnApagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseExited
        mouseExited(btnApagar);
    }//GEN-LAST:event_btnApagarMouseExited
    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(0,0,0));
     }
     
     private void mouseExited(JPanel panel){
        panel.setBackground(new Color(0,0,0));
     }
     
     public void actualizar(){
         Motor motor = automovil.getMotor();
         lblVelocidad.setText(String.valueOf(motor.getVelocidadActual()));
         if (automovil.isEncendido()){
            lblEstado.setText("Encendido");     
         }else{
            lblEstado.setText("Apagado");
         }       
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAcelerar;
    private javax.swing.JPanel btnApagar;
    private javax.swing.JPanel btnEncender;
    private javax.swing.JPanel btnFrenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLimiteLlantas;
    private javax.swing.JLabel lblLimiteMotor;
    private javax.swing.JLabel lblTipoLlantas;
    private javax.swing.JLabel lblTipoMotor;
    private javax.swing.JLabel lblVelocidad;
    // End of variables declaration//GEN-END:variables
}
