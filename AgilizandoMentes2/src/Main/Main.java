/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;
//package Images;

import Ajustes.*;
import BBDD.ConexionBBDD;
import Login.*;
import Usuario.Cambio;
import java.awt.*;
import Usuario.Usuario;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Grupo1 Cafe Con Palito
 * @author Carmen, Ramiro, Albano, Daniel
 */
public class Main extends javax.swing.JFrame {

    private static boolean islogin = false;

    int xMouse, yMouse;

    private static ConexionBBDD conBD = new ConexionBBDD();
    private static Connection con = conBD.conectar();

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/logo.png"));
        return retValue;
    }

    public static Connection getCon() {
        return con;
    }

    public static boolean isIslogin() {
        return islogin;
    }

    public static void setIslogin(boolean islogin) {
        Main.islogin = islogin;
    }

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Login l1 = new Login();
        l1.setSize(1070, 720);
        l1.setLocation(0, 0);

        AjustesLogin aj1 = new AjustesLogin();
        aj1.setSize(210, 50);
        aj1.setLocation(0, 0);

        Cuerpo.removeAll();
        Cuerpo.add(l1);
        Cuerpo.revalidate();
        Cuerpo.repaint();

        Ajustes.removeAll();
        Ajustes.add(aj1);
        Ajustes.revalidate();
        Ajustes.repaint();

        //Abrir conexion con base de datos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelVacio = new javax.swing.JPanel();
        Ajustes = new javax.swing.JPanel();
        u2 = new javax.swing.JPanel();
        LoginTXT = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        xtxt = new javax.swing.JLabel();
        Cuerpo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));

        Fondo.setPreferredSize(new java.awt.Dimension(1280, 720));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(Estilos.getColorPanel());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/augusto-logo-peq.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        PanelVacio.setBackground(Estilos.getColorPanel());
        PanelVacio.setName("panelVacio"); // NOI18N

        javax.swing.GroupLayout PanelVacioLayout = new javax.swing.GroupLayout(PanelVacio);
        PanelVacio.setLayout(PanelVacioLayout);
        PanelVacioLayout.setHorizontalGroup(
            PanelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelVacioLayout.setVerticalGroup(
            PanelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Ajustes.setBackground(Estilos.getColorPanel());
        Ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ajustes.setPreferredSize(new java.awt.Dimension(210, 50));
        Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjustesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AjustesLayout = new javax.swing.GroupLayout(Ajustes);
        Ajustes.setLayout(AjustesLayout);
        AjustesLayout.setHorizontalGroup(
            AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        AjustesLayout.setVerticalGroup(
            AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        u2.setBackground(Estilos.getColorPanel());
        u2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        u2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                u2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                u2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                u2MouseExited(evt);
            }
        });

        LoginTXT.setFont(Estilos.getFuentePanel());
        LoginTXT.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTXT.setText("Usuario ");
        LoginTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout u2Layout = new javax.swing.GroupLayout(u2);
        u2.setLayout(u2Layout);
        u2Layout.setHorizontalGroup(
            u2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        u2Layout.setVerticalGroup(
            u2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(u2Layout.createSequentialGroup()
                .addComponent(LoginTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(PanelVacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        Fondo.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 720));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        header.setOpaque(false);
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        xtxt.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        xtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xtxt.setText("X");
        xtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 1252, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        Cuerpo.setBackground(new java.awt.Color(255, 255, 255));
        Cuerpo.setName("blabla"); // NOI18N

        javax.swing.GroupLayout CuerpoLayout = new javax.swing.GroupLayout(Cuerpo);
        Cuerpo.setLayout(CuerpoLayout);
        CuerpoLayout.setHorizontalGroup(
            CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        CuerpoLayout.setVerticalGroup(
            CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        Fondo.add(Cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1070, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesMouseClicked
        Ajustes A1 = new Ajustes();
        A1.setSize(1070, 720);
        A1.setLocation(0, 0);
        Cuerpo.removeAll();
        Cuerpo.add(A1, BorderLayout.CENTER);
        Cuerpo.revalidate();
        Cuerpo.repaint();
    }//GEN-LAST:event_AjustesMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.iesaglinares.com/"));
        } catch (IOException ex) {
            //System.err.println("Ha ocurrido una IOException");
        } catch (URISyntaxException ex) {
            //System.err.println("No ha encontrado la URL");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void u2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u2MouseClicked
        if (!islogin) {
            Login L1 = new Login();
            L1.setSize(1070, 720);
            L1.setLocation(0, 0);
            Cuerpo.removeAll();
            Cuerpo.add(L1, BorderLayout.CENTER);
            Cuerpo.revalidate();
            Cuerpo.repaint();
        } else {
            Cambio c1 = new Cambio();
            c1.setSize(1070, 720);
            c1.setLocation(0, 0);
            Cuerpo.removeAll();
            Cuerpo.add(c1);
            Cuerpo.revalidate();
            Cuerpo.repaint();
        }
    }//GEN-LAST:event_u2MouseClicked

    private void u2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u2MouseEntered
        u2.setBackground(Estilos.getColorSobreBoton());
        if (Configuracion.isSonido()) {
            Configuracion.sonar("usuario");
        }
    }//GEN-LAST:event_u2MouseEntered

    private void u2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u2MouseExited
        u2.setBackground(Estilos.getColorPanel());
        Configuracion.parar();
    }//GEN-LAST:event_u2MouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        exit.setOpaque(true);
        exit.setBackground(Color.red);
        xtxt.setForeground(Color.white);
        exit.repaint();
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        //exit.setBackground(Color.white);
        exit.setOpaque(false);
        xtxt.setForeground(Color.black);
        exit.repaint();
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        try {
            con.close();
        } catch (SQLException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public static JPanel getCuerpo() {
        return Cuerpo;
    }

    public static JPanel getPanelVacio() {
        return PanelVacio;
    }

    public static JPanel getAjustes() {
        return Ajustes;
    }

    public static void setAjustes(JPanel Ajustes) {
        Main.Ajustes = Ajustes;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Ajustes;
    private static javax.swing.JPanel BarraLateral;
    private static javax.swing.JPanel Cuerpo;
    private static javax.swing.JPanel Fondo;
    private static javax.swing.JLabel LoginTXT;
    private static javax.swing.JPanel PanelVacio;
    private static javax.swing.JPanel exit;
    private static javax.swing.JPanel header;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JPanel u2;
    private static javax.swing.JLabel xtxt;
    // End of variables declaration//GEN-END:variables
}
