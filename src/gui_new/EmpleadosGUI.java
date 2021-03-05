package gui_new;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Crud.IDAO;
import Crud.FactoryDAO;
import Crud.Empleado;

/**
 *
 * @author jahaziel1999
 */
public class EmpleadosGUI extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    private static EmpleadosGUI empleadogui = null;

    public static EmpleadosGUI getInstance() {
        if (empleadogui == null) {
            empleadogui = new EmpleadosGUI();
        }
        return empleadogui;
    }

    private Empleado empleado;
    IDAO idao;
    private String msg;
    private List<Empleado> empleados;

    public EmpleadosGUI() {
        initComponents();
        idao = FactoryDAO.create(FactoryDAO.TypeDAO.EMPLEADO);
        empleados = new ArrayList();
        modelo = new DefaultTableModel();
    }

    public void limpiar() {
        txtClave.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public void limpiarTabla() {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            modelo.removeRow(0);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarEmp = new javax.swing.JToolBar();
        btoGuardar = new javax.swing.JButton();
        btoActualizar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        btoBuscar = new javax.swing.JButton();
        btoMostrar = new javax.swing.JButton();
        desktopEmp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpl = new javax.swing.JTable();

        setClosable(true);
        setTitle("Formulario Empleado");
        setMinimumSize(new java.awt.Dimension(35, 33));
        setNormalBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(600, 450));

        menuBarEmp.setBackground(java.awt.Color.white);
        menuBarEmp.setFloatable(false);
        menuBarEmp.setRollover(true);

        btoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/nuevo.png"))); // NOI18N
        btoGuardar.setToolTipText("Guardar");
        btoGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoGuardar);

        btoActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/pencil.png"))); // NOI18N
        btoActualizar.setToolTipText("Actualizar");
        btoActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoActualizar.setFocusable(false);
        btoActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoActualizarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoActualizar);

        btoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/eliminar.png"))); // NOI18N
        btoEliminar.setToolTipText("Eliminar");
        btoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoEliminar);

        btoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/buscar.png"))); // NOI18N
        btoBuscar.setToolTipText("Buscar por ID");
        btoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoBuscar.setFocusable(false);
        btoBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoBuscar);

        btoMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/uv/resource/lista.png"))); // NOI18N
        btoMostrar.setToolTipText("Mostrar Todos");
        btoMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoMostrar.setFocusable(false);
        btoMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoMostrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoMostrarActionPerformed(evt);
            }
        });
        menuBarEmp.add(btoMostrar);

        getContentPane().add(menuBarEmp, java.awt.BorderLayout.PAGE_START);

        desktopEmp.setBackground(java.awt.Color.white);
        desktopEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopEmp.setMaximumSize(new java.awt.Dimension(600, 450));
        desktopEmp.setMinimumSize(new java.awt.Dimension(600, 450));
        desktopEmp.setPreferredSize(new java.awt.Dimension(600, 450));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nombre:");

        mostrar.setEditable(false);
        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Direcccion:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Telefono:");

        tablaEmpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DIRECCION", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEmpl);
        if (tablaEmpl.getColumnModel().getColumnCount() > 0) {
            tablaEmpl.getColumnModel().getColumn(0).setResizable(false);
            tablaEmpl.getColumnModel().getColumn(0).setPreferredWidth(3);
            tablaEmpl.getColumnModel().getColumn(1).setResizable(false);
            tablaEmpl.getColumnModel().getColumn(2).setResizable(false);
            tablaEmpl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout desktopEmpLayout = new javax.swing.GroupLayout(desktopEmp);
        desktopEmp.setLayout(desktopEmpLayout);
        desktopEmpLayout.setHorizontalGroup(
            desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopEmpLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopEmpLayout.createSequentialGroup()
                        .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktopEmpLayout.setVerticalGroup(
            desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopEmpLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(desktopEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(desktopEmp, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoActualizarActionPerformed
        try {
            empleado = new Empleado();
            empleado.setId(txtClave.getText());
            empleado.setNombre(txtNombre.getText());
            empleado.setDireccion(txtDireccion.getText());
            empleado.setTelefono(txtTelefono.getText());
            idao.actualizar(empleado);
            limpiar();
            msg = "REGISTRO ACTUALIZADO: \n"
                    + "ID: " + empleado.getId() + "\n"
                    + "NOMBRE: " + empleado.getNombre() + "\n"
                    + "DIRECCION: " + empleado.getDireccion() + "\n"
                    + "TELEFONO: " + empleado.getTelefono() + "\n";
        } catch (Exception e) {
            msg = "Error al actualizar sus datos"
                    + "\n Campos vacios o Registro no existe";
            Logger logger = Logger.getLogger(EmpleadosGUI.class.getName());
            LogRecord r = new LogRecord(Level.INFO, msg + e.getMessage());
            logger.log(r);
        }
        mostrar.setText(msg);
    }//GEN-LAST:event_btoActualizarActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        try {
            empleado = new Empleado();
            empleado.setId(txtClave.getText());
            empleado.setNombre(txtNombre.getText());
            empleado.setDireccion(txtDireccion.getText());
            empleado.setTelefono(txtTelefono.getText());
            idao.ingresar(empleado);
            limpiar();
            msg = "NUEVO REGISTRO: \n"
                    + "ID: " + empleado.getId() + "\n"
                    + "NOMBRE: " + empleado.getNombre() + "\n"
                    + "DIRECCION: " + empleado.getDireccion() + "\n"
                    + "TELEFONO: " + empleado.getTelefono() + "\n";
        } catch (Exception e) {
            msg = "Error al crear registro"
                    + "\n Campos vacios";
            Logger logger = Logger.getLogger(EmpleadosGUI.class.getName());
            LogRecord r = new LogRecord(Level.INFO, msg + e.getMessage());
            logger.log(r);
        }
        mostrar.setText(msg);
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        try {
            idao.eliminar(txtClave.getText());
            limpiar();
            msg = "REGISTRO ELIMINADO: \n"
                    + "ID: " + empleado.getId() + "\n"
                    + "NOMBRE: " + empleado.getNombre() + "\n"
                    + "DIRECCION: " + empleado.getDireccion() + "\n"
                    + "TELEFONO: " + empleado.getTelefono() + "\n";
        } catch (Exception e) {
            msg = "Error al eliminar registro";
            Logger logger = Logger.getLogger(EmpleadosGUI.class.getName());
            LogRecord r = new LogRecord(Level.INFO, msg + e.getMessage());
            logger.log(r);
        }
        mostrar.setText(msg);
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void btoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoMostrarActionPerformed
        empleados = idao.mostrarAll();
        String [] lista = new String [4];
        for (int i = 0; i < empleados.size(); i++) {
            Empleado getEmpleado = (Empleado) empleados.get(i);
            tablaEmpl.setValueAt(getEmpleado.getId(), i, 0);
            tablaEmpl.setValueAt(getEmpleado.getNombre(), i, 1);
            tablaEmpl.setValueAt(getEmpleado.getDireccion(), i, 2);
            tablaEmpl.setValueAt(getEmpleado.getTelefono(), i, 3);
            modelo.addRow(lista);
        }
        limpiarTabla();
    }//GEN-LAST:event_btoMostrarActionPerformed

    private void btoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarActionPerformed
        
        empleado = (Empleado) idao.mostrarById(txtClave.getText());
        empleados.add(empleado);
        for (int i = 0; i < empleados.size(); i++) {
            Empleado getEmpleado = (Empleado) empleados.get(i);
            tablaEmpl.setValueAt(getEmpleado.getId(), i, 0);
            tablaEmpl.setValueAt(getEmpleado.getNombre(), i, 1);
            tablaEmpl.setValueAt(getEmpleado.getDireccion(), i, 2);
            tablaEmpl.setValueAt(getEmpleado.getTelefono(), i, 3);
        }
        limpiarTabla();
    }//GEN-LAST:event_btoBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoActualizar;
    private javax.swing.JButton btoBuscar;
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoMostrar;
    private javax.swing.JPanel desktopEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar menuBarEmp;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JTable tablaEmpl;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
