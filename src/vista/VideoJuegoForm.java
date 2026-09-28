package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.VideoJuego;

public class VideoJuegoForm extends javax.swing.JFrame {

    private ArrayList<VideoJuego> listaVideoJuego = new ArrayList<>();
    DefaultTableModel tb;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VideoJuegoForm.class.getName());

    public VideoJuegoForm() {
        initComponents();

        String[] titulo = {"Titulo", "Genero", "Precio"};
        tb = new DefaultTableModel(null, titulo) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbSalida.setModel(tb);

        cbxGenero.addItem("Terror");
        cbxGenero.addItem("Novela Visual");
        cbxGenero.addItem("Roblox");
        cbxGenero.addItem("Comedia");
        cbxGenero.addItem("Otro");

        actualizarCantidad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSalida = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE VIDEOJUEGOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Videojuego"));

        txtTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulo"));

        cbxGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero"));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));

        btnRegistrar.setBackground(new java.awt.Color(102, 255, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("AGREGAR");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnLimpiar.setBackground(new java.awt.Color(200, 242, 253));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, 208, Short.MAX_VALUE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 330));

        tbSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbSalida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 310, 270));

        btnEliminar.setBackground(new java.awt.Color(249, 31, 88));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 160, 30));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(102, 102, 102));
        lblCantidad.setText("Cant. registrada: ");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 170, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void mostrarMensaje(String mensaje, int tipo) {
        JOptionPane.showMessageDialog(this, mensaje, "Registro de Videojuegos", tipo);
    }

    public void Limpiar() {
        txtTitulo.setText("");
        cbxGenero.setSelectedIndex(0);
        txtPrecio.setText("");
        txtTitulo.requestFocus();
    }

    private void actualizarCantidad() {
        lblCantidad.setText("Cant. registrada: " + listaVideoJuego.size());
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            String titulo = txtTitulo.getText().trim();
            String precioTxt = txtPrecio.getText().trim();

            if (titulo.isEmpty() || precioTxt.isEmpty()) {
                mostrarMensaje("Complete todos los campos.", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double precio = Double.parseDouble(precioTxt);
            String genero = cbxGenero.getSelectedItem().toString();

            VideoJuego vj = new VideoJuego(titulo, genero, precio);

            listaVideoJuego.add(vj);
            tb.addRow(vj.registrarDatos());
            actualizarCantidad();

            mostrarMensaje("Videojuego agregado correctamente.");
            Limpiar();

        } catch (NumberFormatException e) {
            mostrarMensaje("El precio debe ser un número válido (ej. 59.90).", JOptionPane.ERROR_MESSAGE);
            txtPrecio.requestFocus();
        } catch (IllegalArgumentException e) {
            mostrarMensaje(e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            mostrarMensaje("Error inesperado: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int fila = tbSalida.getSelectedRow();

        if (fila < 0) {
            mostrarMensaje("Seleccione un videojuego de la tabla.", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            VideoJuego vj = listaVideoJuego.get(fila);
            int opcion = JOptionPane.showConfirmDialog(this,
                    "¿Deseas eliminar \"" + vj.getTitulo() + "\"?",
                    "Eliminar", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                listaVideoJuego.remove(fila);  // remove() del ArrayList
                tb.removeRow(fila);
                actualizarCantidad();          // size()
                mostrarMensaje("Videojuego eliminado.");
            }
        } catch (IndexOutOfBoundsException e) {
            mostrarMensaje("No se pudo eliminar: la fila no existe.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new VideoJuegoForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTable tbSalida;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
