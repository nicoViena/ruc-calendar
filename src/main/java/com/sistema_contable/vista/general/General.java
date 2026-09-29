package com.sistema_contable.vista.general;

import com.sistema_contable.Implements.ClienteDaoImpl;
import com.sistema_contable.Implements.VencimientosDaoImpl;
import com.sistema_contable.interfaces.IClienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.sistema_contable.model.Cliente;
import com.sistema_contable.model.Vencimientos;

public class General extends javax.swing.JPanel {

    IClienteDao CDao = new ClienteDaoImpl();
    Cliente c = new Cliente();

    public General() {
        initComponents();
        CargarClientes();
    }

    public void CargarClientes() {
        List<Cliente> lista = CDao.listar();
        DefaultTableModel table = (DefaultTableModel) tbl_clientes.getModel();
        table.setNumRows(0);
        for (Cliente c : lista) {
            Object[] rowData = {
                false,
                c.getNombre(),
                c.getRUC()
            };
            table.addRow(rowData);
        }
        tbl_clientes.setModel(table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_action = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        lb_periodo = new javax.swing.JLabel();
        txt_periodo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(690, 450));

        pnl_action.setBackground(new java.awt.Color(204, 204, 204));

        btn_buscar.setBackground(new java.awt.Color(242, 242, 242));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lb_periodo.setBackground(new java.awt.Color(204, 204, 204));
        lb_periodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_periodo.setForeground(new java.awt.Color(0, 0, 0));
        lb_periodo.setText("Periodo:");

        txt_periodo.setBackground(new java.awt.Color(255, 255, 255));
        txt_periodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tbl_clientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_clientes.setForeground(new java.awt.Color(0, 0, 0));
        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SEL", "NOMBRE", "RUC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_clientes);
        if (tbl_clientes.getColumnModel().getColumnCount() > 0) {
            tbl_clientes.getColumnModel().getColumn(0).setMinWidth(30);
            tbl_clientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_clientes.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_clientes.getColumnModel().getColumn(2).setMinWidth(103);
            tbl_clientes.getColumnModel().getColumn(2).setMaxWidth(103);
        }

        javax.swing.GroupLayout pnl_actionLayout = new javax.swing.GroupLayout(pnl_action);
        pnl_action.setLayout(pnl_actionLayout);
        pnl_actionLayout.setHorizontalGroup(
            pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_actionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_actionLayout.createSequentialGroup()
                        .addComponent(lb_periodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_actionLayout.setVerticalGroup(
            pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_actionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_periodo)
                    .addComponent(txt_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(pnl_action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            String periodo = txt_periodo.getText().trim();
            if (periodo.isEmpty()) {
                mostrarMensaje("Ingrese el periodo");
                return;
            }
            String mes = obtenerMes(periodo);
            if (mes == null) {
                mostrarMensaje("Periodo Invalido");
                return;
            }
            int año = obtenerAño(periodo);
            if (año == -1) {
                mostrarMensaje("Ingrese el año junto al periodo");
                return;
            }
            System.out.println("Mes columna: " + mes);
            System.out.println("Año: " + año);
            List<String> rucsSeleccionados = new ArrayList<>();
            DefaultTableModel modelClientes = (DefaultTableModel) tbl_clientes.getModel();
            for (int i = 0; i < modelClientes.getRowCount(); i++) {
                Boolean sel = (Boolean) modelClientes.getValueAt(i, 0);
                if (Boolean.TRUE.equals(sel)) {
                    rucsSeleccionados.add(
                            modelClientes.getValueAt(i, 2).toString() // columna RUC
                    );
                }
            }
            VencimientosDaoImpl VDao = new VencimientosDaoImpl();
            List<Vencimientos> lista = VDao.buscarPorPeriodo(mes, año);
            if (lista == null || lista.isEmpty()) {
                mostrarMensaje("No hay vencimientos para este periodo");
                return;
            }
            // LISTA QUE SE ENVIARÁ A LA VENTANA DE RESULTADOS
            List<Vencimientos> listaMostrar = new ArrayList<>();
            // SI NO HAY CLIENTES SELECCIONADOS → MOSTRAR TODOS
            if (rucsSeleccionados.isEmpty()) {
                listaMostrar.addAll(lista);
            } else {
                // SI HAY CLIENTES SELECCIONADOS → MOSTRAR SOLO ESOS
                for (Vencimientos v : lista) {

                    if (rucsSeleccionados.contains(
                            v.getCliente().getRUC())) {
                        listaMostrar.add(v);
                    }
                }
            }
            // ABRIR VENTANA DE RESULTADOS
            java.awt.Frame parent = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);
            ResultadoBusqueda ventana = new ResultadoBusqueda(
                    parent,
                    true,
                    listaMostrar,
                    mes,
                    año,
                    periodo
            );

            // LIMPIAR PERIODO
            txt_periodo.setText("");
            // QUITAR LOS CHECKS DE CLIENTES
            for (int i = 0; i < modelClientes.getRowCount(); i++) {
                modelClientes.setValueAt(false, i, 0);
            }
            // MOSTRAR JDialog
            ventana.setLocationRelativeTo(this);
            ventana.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error al realizar la busqueda",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE
            );
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private String obtenerMes(String mes) {
        if (mes == null || mes.length() < 3) {
            return null;
        }
        mes = mes.substring(0, 3).toLowerCase();
        if (mes.equals("ene")) {
            return "enero";
        } else if (mes.equals("feb")) {
            return "febrero";
        } else if (mes.equals("mar")) {
            return "marzo";
        } else if (mes.equals("abr")) {
            return "abril";
        } else if (mes.equals("may")) {
            return "mayo";
        } else if (mes.equals("jun")) {
            return "junio";
        } else if (mes.equals("jul")) {
            return "julio";
        } else if (mes.equals("ago")) {
            return "agosto";
        } else if (mes.equals("sep")) {
            return "septiembre";
        } else if (mes.equals("oct")) {
            return "octubre";
        } else if (mes.equals("nov")) {
            return "noviembre";
        } else if (mes.equals("dic")) {
            return "diciembre";
        } else {
            return null;
        }
    }

    private int obtenerAño(String periodo) {
        String numeros = periodo.replaceAll("\\D", "");
        if (numeros.length() == 4) {
            return Integer.parseInt(numeros);
        }
        return -1;
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_periodo;
    private javax.swing.JPanel pnl_action;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_periodo;
    // End of variables declaration//GEN-END:variables
}
