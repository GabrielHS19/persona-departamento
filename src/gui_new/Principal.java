package gui_new;

import java.awt.Component;

public class Principal extends javax.swing.JFrame {
private DepartamentosGUI dep;
private EmpleadosGUI emp;
    public Principal() {
        initComponents();
        dep=DepartamentosGUI.getInstance();
        emp=EmpleadosGUI.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        btoInicio = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        btoOpciones = new javax.swing.JMenu();
        Empleado = new javax.swing.JMenuItem();
        Departamentos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setMinimumSize(new java.awt.Dimension(750, 450));

        desktop.setBackground(java.awt.Color.white);
        desktop.setMaximumSize(new java.awt.Dimension(600, 450));
        desktop.setMinimumSize(new java.awt.Dimension(600, 450));
        desktop.setPreferredSize(new java.awt.Dimension(600, 450));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        btoInicio.setText("Inicio");

        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        btoInicio.add(salir);

        menu.add(btoInicio);

        btoOpciones.setText("opciones");

        Empleado.setText("Empleado");
        Empleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActionPerformed(evt);
            }
        });
        btoOpciones.add(Empleado);

        Departamentos.setText("Departamentos");
        Departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartamentosActionPerformed(evt);
            }
        });
        btoOpciones.add(Departamentos);

        menu.add(btoOpciones);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
        EmpleadosGUI emp = EmpleadosGUI.getInstance();
        emp.setVisible(true);
        for (Component com : desktop.getComponents()) {
            if (com.equals(emp)) {
                return;
            }
        }
        desktop.add(emp);
    }//GEN-LAST:event_EmpleadoActionPerformed

    private void DepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentosActionPerformed
        DepartamentosGUI dep = DepartamentosGUI.getInstance();
        dep.setVisible(true);
        for (Component com: desktop.getComponents()) {
            if (com.equals(dep)) {
                return;
            }
        }
        desktop.add(dep);
    }//GEN-LAST:event_DepartamentosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Departamentos;
    private javax.swing.JMenuItem Empleado;
    private javax.swing.JMenu btoInicio;
    private javax.swing.JMenu btoOpciones;
    private javax.swing.JPanel desktop;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
