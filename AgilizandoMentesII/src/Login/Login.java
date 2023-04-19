/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Login;

import Main.Main;
import java.awt.Color;
import Ajustes.*;
import java.awt.Container;
/**
 *
 * @author carra
 */
public class Login extends javax.swing.JPanel {
    /**
     * Creates new form Login
     */
    public Login() {
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

        background = new javax.swing.JPanel();
        iniciar = new javax.swing.JLabel();
        tienes = new javax.swing.JLabel();
        registra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLContra = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        PWF = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        JLUsuario = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        Boton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1070, 720));
        setSize(new java.awt.Dimension(1070, 720));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciar.setFont(Estilos.getFuenteCuerpo());
        iniciar.setText("INICIAR SESIÓN");
        background.add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        tienes.setFont(Estilos.getFuenteCuerpo());
        tienes.setText("¿NO TIENES CUENTA?");
        background.add(tienes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        registra.setFont(Estilos.getFuenteCuerpo());
        registra.setForeground(new java.awt.Color(0, 153, 255));
        registra.setText("Registrate aquí.");
        registra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registraMouseEntered(evt);
            }
        });
        background.add(registra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        JLContra.setFont(Estilos.getFuenteCuerpo());
        JLContra.setText("Contraseña");

        PWF.setForeground(new java.awt.Color(204, 204, 204));
        PWF.setText("********");
        PWF.setBorder(null);
        PWF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PWFMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLContra)
                            .addComponent(PWF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PWF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JLUsuario.setFont(Estilos.getFuenteCuerpo());
        JLUsuario.setText("Usuario");

        TFUsuario.setFont(Estilos.getFuenteCuerpo());
        TFUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TFUsuario.setText("Inserte su nombre de usuario");
        TFUsuario.setBorder(null);
        TFUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TFUsuarioMousePressed(evt);
            }
        });
        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLUsuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 60));

        Boton.setBackground(new java.awt.Color(0, 155, 155));
        Boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMouseExited(evt);
            }
        });

        jLabel1.setFont(Estilos.getFuenteCuerpo());
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRAR");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BotonLayout = new javax.swing.GroupLayout(Boton);
        Boton.setLayout(BotonLayout);
        BotonLayout.setHorizontalGroup(
            BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        BotonLayout.setVerticalGroup(
            BotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        background.add(Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void BotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseEntered
        Boton.setBackground(new Color(69, 212, 252));
    }//GEN-LAST:event_BotonMouseEntered

    private void BotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseExited
        Boton.setBackground(new Color(0, 155, 155));
    }//GEN-LAST:event_BotonMouseExited

    private void TFUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFUsuarioMousePressed
        if (TFUsuario.getText().equals("Inserte su nombre de usuario")) {
            TFUsuario.setText("");
            TFUsuario.setForeground(Color.black);
        }
        if (String.valueOf(PWF.getPassword()).isEmpty()) {
            PWF.setText("********");
            PWF.setForeground(Color.gray);
        }

    }//GEN-LAST:event_TFUsuarioMousePressed

    private void PWFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PWFMousePressed
        if (String.valueOf(PWF.getPassword()).equals("********")) {
            PWF.setText("");
            PWF.setForeground(Color.black);
        }
        if (TFUsuario.getText().isEmpty()) {
            TFUsuario.setText("Inserte su nombre de usuario");
            TFUsuario.setForeground(Color.gray);
        }


    }//GEN-LAST:event_PWFMousePressed

    private void BotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseClicked
        Main Alumno =new Main();
        Alumno.setVisible(true); 
        
    }//GEN-LAST:event_BotonMouseClicked

    private void registraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraMouseEntered
        registra.setFont(Estilos.getFuenteCuerpo());
    }//GEN-LAST:event_registraMouseEntered

    private void registraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraMouseClicked
        Container Cuerpo2 = this.getParent();   
        Register r1 = new Register();
        r1.setSize(1070,720);
        r1.setLocation(0, 0);
        Cuerpo2.removeAll();
        Cuerpo2.add(r1);
        Cuerpo2.revalidate();
        Cuerpo2.repaint();
        
    }//GEN-LAST:event_registraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boton;
    private javax.swing.JLabel JLContra;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JPasswordField PWF;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JPanel background;
    private javax.swing.JLabel iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel registra;
    private javax.swing.JLabel tienes;
    // End of variables declaration//GEN-END:variables
}
