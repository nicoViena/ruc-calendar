package com.sistema_contable.vista.general;

import com.sistema_contable.Implements.ClienteDaoImpl;
import com.sistema_contable.Implements.VencimientosDaoImpl;
import com.sistema_contable.interfaces.IClienteDao;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.sistema_contable.model.Cliente;
import com.sistema_contable.model.Vencimientos;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class General extends javax.swing.JPanel {

    IClienteDao CDao = new ClienteDaoImpl();
    Cliente c=new Cliente();
    
    public General() {
        initComponents();
        CargarClientes();
    }
    
    public void CargarClientes(){
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

        pnl_print = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_general = new javax.swing.JTable();
        txt_periodo = new javax.swing.JTextField();
        lb_periodo = new javax.swing.JLabel();
        pnl_action = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_excel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(690, 450));

        pnl_print.setBackground(new java.awt.Color(204, 204, 204));

        tbl_general.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_general.setForeground(new java.awt.Color(0, 0, 0));
        tbl_general.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CLIENTE", "RUC", "VENCIMIENTO", "PLE"
            }
        ));
        jScrollPane1.setViewportView(tbl_general);
        if (tbl_general.getColumnModel().getColumnCount() > 0) {
            tbl_general.getColumnModel().getColumn(1).setMinWidth(87);
            tbl_general.getColumnModel().getColumn(1).setMaxWidth(87);
            tbl_general.getColumnModel().getColumn(2).setMinWidth(89);
            tbl_general.getColumnModel().getColumn(2).setMaxWidth(89);
            tbl_general.getColumnModel().getColumn(3).setMinWidth(50);
            tbl_general.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        txt_periodo.setBackground(new java.awt.Color(255, 255, 255));
        txt_periodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lb_periodo.setBackground(new java.awt.Color(204, 204, 204));
        lb_periodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_periodo.setForeground(new java.awt.Color(0, 0, 0));
        lb_periodo.setText("Periodo:");

        javax.swing.GroupLayout pnl_printLayout = new javax.swing.GroupLayout(pnl_print);
        pnl_print.setLayout(pnl_printLayout);
        pnl_printLayout.setHorizontalGroup(
            pnl_printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_printLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lb_periodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(416, 416, 416))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_printLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnl_printLayout.setVerticalGroup(
            pnl_printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_printLayout.createSequentialGroup()
                .addGroup(pnl_printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_periodo)
                    .addComponent(txt_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

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

        btn_limpiar.setBackground(new java.awt.Color(24, 115, 48));
        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_print.setBackground(new java.awt.Color(102, 102, 102));
        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_print.setForeground(new java.awt.Color(0, 0, 0));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora .png"))); // NOI18N
        btn_print.setText("Imprimir");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_excel.setBackground(new java.awt.Color(1, 115, 64));
        btn_excel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_excel.setForeground(new java.awt.Color(255, 255, 255));
        btn_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel.png"))); // NOI18N
        btn_excel.setText("Excel");
        btn_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excelActionPerformed(evt);
            }
        });

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
                .addGap(33, 33, 33)
                .addGroup(pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_actionLayout.createSequentialGroup()
                        .addComponent(btn_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_print)
                        .addGap(18, 18, 18)
                        .addComponent(btn_excel))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnl_actionLayout.setVerticalGroup(
            pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_actionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_print)
                    .addComponent(btn_excel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_print, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excelActionPerformed
        try {
            // ================= FILECHOOSER =================
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Guardar Excel");
            chooser.setSelectedFile(new File("Cronograma.xlsx"));
            if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) {
                return;
            }
            File file = chooser.getSelectedFile();
            String path = file.getAbsolutePath();
            if (!path.toLowerCase().endsWith(".xlsx")) {
                path += ".xlsx";
            }
            // ================= PERIODO =================
            int year = 2026; // puedes hacerlo dinámico
            String periodoExcel = periodo_Excel(txt_periodo.getText(), year);

            if (periodoExcel == null) {
                JOptionPane.showMessageDialog(null, "Periodo inválido");
                return;
            }
            TableModel model = tbl_general.getModel();
            // ================= WORKBOOK =================
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Cronograma");
            int startRow = 0;
            int totalCols = model.getColumnCount() + 4; // A,B + tabla + G,H
            // ================= ESTILOS =================
            CellStyle borderStyle = workbook.createCellStyle();
            borderStyle.setBorderTop(BorderStyle.THIN);
            borderStyle.setBorderBottom(BorderStyle.THIN);
            borderStyle.setBorderLeft(BorderStyle.THIN);
            borderStyle.setBorderRight(BorderStyle.THIN);
            // ---- TITULO ----
            CellStyle titleStyle = workbook.createCellStyle();
            titleStyle.cloneStyleFrom(borderStyle);
            titleStyle.setAlignment(HorizontalAlignment.CENTER);
            titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            XSSFFont titleFont = workbook.createFont();
            titleFont.setBold(true);
            titleFont.setFontHeightInPoints((short) 13);
            titleStyle.setFont(titleFont);
            // ---- ENCABEZADOS ----
            CellStyle headerStyle = workbook.createCellStyle();
            headerStyle.cloneStyleFrom(borderStyle);
            headerStyle.setAlignment(HorizontalAlignment.CENTER);
            XSSFFont headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerStyle.setFont(headerFont);
            // ---- CENTRADO ----
            CellStyle centerStyle = workbook.createCellStyle();
            centerStyle.cloneStyleFrom(borderStyle);
            centerStyle.setAlignment(HorizontalAlignment.CENTER);
            // ================= TITULO =================
            Row titleRow = sheet.createRow(startRow);
            Cell titleCell = titleRow.createCell(0);
            titleCell.setCellValue(
                "CRONOGRAMA DE VENCIMIENTO MENSUAL (PERIODO: " + periodoExcel + ")"
            );
            titleCell.setCellStyle(titleStyle);
            // Merge de A hasta H
            sheet.addMergedRegion(
                new CellRangeAddress(startRow, startRow, 0, totalCols - 1)
            );
            // Aplicar estilo a toda la fila del título
            for (int c = 0; c < totalCols; c++) {
                Cell cell = titleRow.getCell(c);
                if (cell == null) {
                    cell = titleRow.createCell(c);
                }
                cell.setCellStyle(titleStyle);
            }
            // ================= ENCABEZADOS =================
            Row headerRow = sheet.createRow(startRow + 1);
            // Columnas A y B vacías con borde
            for (int c = 0; c < 2; c++) {
                Cell cell = headerRow.createCell(c);
                cell.setCellStyle(borderStyle);
            }
            // Encabezados reales del JTable
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = headerRow.createCell(col + 2);
                cell.setCellValue(model.getColumnName(col));
                cell.setCellStyle(headerStyle);
            }
            // Columnas G y H vacías con borde
            for (int c = model.getColumnCount() + 2; c < totalCols; c++) {
                Cell cell = headerRow.createCell(c);
                cell.setCellStyle(borderStyle);
            }
            // ================= DATOS =================
            for (int row = 0; row < model.getRowCount(); row++) {
                Row excelRow = sheet.createRow(startRow + 2 + row);
                // Columnas A y B vacías con borde
                for (int c = 0; c < 2; c++) {
                    Cell cell = excelRow.createCell(c);
                    cell.setCellStyle(borderStyle);
                }
                // Datos del JTable
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Cell cell = excelRow.createCell(col + 2);
                    Object value = model.getValueAt(row, col);
                    if (value != null) {
                        cell.setCellValue(value.toString());
                    }
                    if (model.getColumnName(col).equalsIgnoreCase("Vencimiento")) {
                        cell.setCellStyle(centerStyle);
                    } else {
                        cell.setCellStyle(borderStyle);
                    }
                }
                // Columnas G y H vacías con borde
                for (int c = model.getColumnCount() + 2; c < totalCols; c++) {
                    Cell cell = excelRow.createCell(c);
                    cell.setCellStyle(borderStyle);
                }
            }
            // ================= AUTO SIZE =================
            for (int c = 0; c < totalCols; c++) {
                sheet.autoSizeColumn(c);
            }
            // ================= GUARDAR =================
            try (FileOutputStream out = new FileOutputStream(path)) {
                workbook.write(out);
            }
            workbook.close();
            JOptionPane.showMessageDialog(null, "Excel generado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al exportar a Excel","ERROR", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_excelActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {
            String periodo = txt_periodo.getText().trim();
            MessageFormat header = new MessageFormat("Periodo: " + periodo);
            MessageFormat footer = new MessageFormat("Página {0}");
            tbl_general.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        //TABLA GENERAL
        DefaultTableModel model=(DefaultTableModel)tbl_general.getModel();
        int filas=model.getRowCount();
        int columnas=model.getColumnCount();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                model.setValueAt("", i, j);
            }
        }
        txt_periodo.setText("");
        //TABLA CLIENTES
        DefaultTableModel modelC=(DefaultTableModel)tbl_clientes.getModel();
        for (int i = 0; i < modelC.getRowCount(); i++) {
            modelC.setValueAt(false, i, 0);
        }
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            //MODELO ACTUALIZADO
            String periodo=txt_periodo.getText().trim();
            if (periodo.contains("-")) {
                periodo=periodo.split("-")[0];
            }
            if (periodo.isEmpty()) {
                mostrarMensaje("Ingrese el periodo");
                return;
            }
            String mes = obtenerMes(periodo);
            if (mes == null) {
                mostrarMensaje("Periodo Invalido");
                return;
            }
            System.out.println("Mes columna: "+mes);
            // 🔹 1. OBTENER CLIENTES SELECCIONADOS (RUC)
            List<String> rucsSeleccionados=new ArrayList<>();
            DefaultTableModel modelClientes=(DefaultTableModel) tbl_clientes.getModel();
            for (int i = 0; i < modelClientes.getRowCount(); i++) {
                Boolean sel=(Boolean) modelClientes.getValueAt(i, 0);
                if (Boolean.TRUE.equals(sel)) {
                    rucsSeleccionados.add(
                        modelClientes.getValueAt(i, 2).toString() // columna RUC
                    );
                }
            }
            VencimientosDaoImpl VDao=new VencimientosDaoImpl();
//            List<Vencimientos> lista=VDao.buscarPorPeriodo(mes);
//            if (lista == null || lista.isEmpty()) {
//                mostrarMensaje("No hay vencimientos para este periodo");
//                return;
//            }
//            DefaultTableModel model=(DefaultTableModel) tbl_general.getModel();
//            model.setRowCount(0);
//            // 🔹 2. SI NO HAY SELECCIONADOS → MOSTRAR TODOS
//            if (rucsSeleccionados.isEmpty()) {
//                for (Vencimientos v : lista) {
//                    model.addRow(new Object[]{
//                        v.getCliente().getNombre(),
//                        v.getCliente().getRUC(),
//                        v.getVencimiento(),
//                        v.getPle().getVencimiento_ple()
//                    });
//                }
//            } // 🔹 3. SI HAY SELECCIONADOS → FILTRAR
//            else {
//                for (Vencimientos v : lista) {
//                    if (rucsSeleccionados.contains(v.getCliente().getRUC())) {
//                        model.addRow(new Object[]{
//                            v.getCliente().getNombre(),
//                            v.getCliente().getRUC(),
//                            v.getVencimiento(),
//                            v.getPle().getVencimiento_ple()
//                        });
//                    }
//                }
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la busqueda","ERROR", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private String periodo_Excel(String textoPeriodo, int year){
        String mes_complet=obtenerMes(textoPeriodo);
        if (mes_complet==null) {
            return null;
        }
        String mes_excel;
        switch (mes_complet) {
            case "enero": mes_excel = "Ene"; break;
            case "febrero": mes_excel = "Feb"; break;
            case "marzo": mes_excel = "Mar"; break;
            case "abril": mes_excel = "Abr"; break;
            case "mayo": mes_excel = "May"; break;
            case "junio": mes_excel = "Jun"; break;
            case "julio": mes_excel = "Jul"; break;
            case "agosto": mes_excel = "Ago"; break;
            case "septiembre": mes_excel = "Sep"; break;
            case "octubre": mes_excel = "Oct"; break;
            case "noviembre": mes_excel = "Nov"; break;
            case "diciembre": mes_excel = "Dic"; break;
            default: return null;
        }
        return mes_excel + "-" + year;
    }
    
    private String obtenerMes(String mes){
        if (mes==null||mes.length()<3) {
            return null;
        }
        mes=mes.substring(0,3).toLowerCase();
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
    
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_excel;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_print;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_periodo;
    private javax.swing.JPanel pnl_action;
    private javax.swing.JPanel pnl_print;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTable tbl_general;
    private javax.swing.JTextField txt_periodo;
    // End of variables declaration//GEN-END:variables
}