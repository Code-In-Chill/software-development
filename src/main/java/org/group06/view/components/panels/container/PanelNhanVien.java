/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.components.panels.container;

import org.group06.model.entity.NhanVien;
import org.group06.utils.ColorConstant;
import org.group06.utils.FontConstant;

import javax.swing.*;

/**
 *
 * @author Dell
 */
public class PanelNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form PanelNhanVien
     */
    public PanelNhanVien() {
        initComponents();
        tblNhanVien.getTableHeader().setFont(FontConstant.FONT_TABLE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGioiTinh = new javax.swing.ButtonGroup();
        lblTitleTTNV = new javax.swing.JLabel();
        scrNhanVien = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        pnlCN = new javax.swing.JPanel();
        lblTimTheoTen = new javax.swing.JLabel();
        lblTimTheoMa = new javax.swing.JLabel();
        btnThem = new org.group06.view.components.buttons.StaticRoundButton("", ColorConstant.BUTTON_LOGIN_NORMAL, ColorConstant.BUTTON_LOGIN_HOVER, ColorConstant.BUTTON_LOGIN_CLICK);
        cboLoc = new javax.swing.JComboBox<>();
        lblLoc = new javax.swing.JLabel();
        txtTimTheoTen = new org.group06.view.components.textFields.TextField();
        txtTimTheoTen2 = new org.group06.view.components.textFields.TextField();

        lblTitleTTNV.setFont(FontConstant.FONT_HEADER);
        lblTitleTTNV.setText("Danh sách nhân viên");

        scrNhanVien.setBorder(null);
        scrNhanVien.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrNhanVien.setFont(org.group06.utils.FontConstant.FONT_LABEL);

        tblNhanVien.setAutoCreateRowSorter(true);
        tblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NV01", "Trương Quốc Bảo", "123456789", "Nam", "123456789012", "47/48 đường số 19 phường 8 Gò Vấp", "0762818855", "Làm việc", "Nhân viên thu ngân"},
                {"NV02", "Lê Minh Bảo", "123456789", "Nam", "123456789999", "XXX/XX ACB XYZ", "0123456789", "Đã nghỉ", "Nhân viên quản lí"},
                {"NV03", "Lê Hoàng Nam", "999999999", "Nữ", "000000111222", "XX/XXX XYZ ABC", "7774445552", "Làm việc", "Nhân viên quản lí"}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Mật khẩu", "Giới tính", "Căn cước công dân", "Địa chỉ", "Số điện thoại", "Trạng thái", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNhanVien.setFillsViewportHeight(true);
        tblNhanVien.setGridColor(org.group06.utils.ColorConstant.BLACK);
        tblNhanVien.setRowHeight(50);
        tblNhanVien.setSelectionBackground(org.group06.utils.ColorConstant.BACKGROUND_SIDEBAR);
        tblNhanVien.setSelectionForeground(org.group06.utils.ColorConstant.WHITE);
        tblNhanVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblNhanVien.setShowGrid(true);
        tblNhanVien.getTableHeader().setResizingAllowed(false);
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        scrNhanVien.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblNhanVien.getColumnModel().getColumn(1).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblNhanVien.getColumnModel().getColumn(2).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(3).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(4).setPreferredWidth(130);
            tblNhanVien.getColumnModel().getColumn(5).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblNhanVien.getColumnModel().getColumn(6).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(7).setResizable(false);
            tblNhanVien.getColumnModel().getColumn(8).setResizable(false);
        }

        lblTimTheoTen.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTimTheoTen.setText("Tìm theo tên");

        lblTimTheoMa.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTimTheoMa.setText("Tìm theo mã");

        btnThem.setFont(FontConstant.FONT_BUTTON);
        btnThem.setForeground(ColorConstant.WHITE);
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        cboLoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Nam", "Nữ", "Làm việc", "Đã nghỉ" }));

        lblLoc.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblLoc.setText("Lọc");

        txtTimTheoTen.setFont(FontConstant.FONT_TEXT);
        txtTimTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTheoTenActionPerformed(evt);
            }
        });

        txtTimTheoTen2.setFont(FontConstant.FONT_TEXT);
        txtTimTheoTen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTheoTen2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCNLayout = new javax.swing.GroupLayout(pnlCN);
        pnlCN.setLayout(pnlCNLayout);
        pnlCNLayout.setHorizontalGroup(
            pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCNLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblTimTheoTen)
                .addGap(18, 18, 18)
                .addComponent(txtTimTheoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblTimTheoMa)
                .addGap(18, 18, 18)
                .addComponent(txtTimTheoTen2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        pnlCNLayout.setVerticalGroup(
            pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCNLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCNLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTimTheoTen)
                                .addComponent(lblTimTheoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTimTheoTen2)
                                .addComponent(lblTimTheoMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblLoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrNhanVien))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitleTTNV, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(119, 119, 119)
                        .addComponent(pnlCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleTTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private NhanVien getSelectedNV() {
        boolean gioiTinh = false;
        if(tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 3).toString().equals("Nam"))
            gioiTinh = true;

        if(tblNhanVien.getSelectedRow() == -1)
            return null;
        else {
            return new NhanVien(
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 0).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 1).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 2).toString(),
                    gioiTinh,
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 4).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 5).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 6).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 7).toString(),
                    tblNhanVien.getValueAt(tblNhanVien.getSelectedRow(), 8).toString());
        }
    }

    private void callPanelTTNV() {
        FrameTTNV frTTNV = new FrameTTNV(getSelectedNV());
        frTTNV.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frTTNV.setResizable(false);
        frTTNV.setVisible(true);
    }

    private void callPanelThemNV() {
        FrameThemNhanVien frThemNV = new FrameThemNhanVien();
        frThemNV.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frThemNV.setResizable(false);
        frThemNV.setVisible(true);
    }
    
    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if(evt.getClickCount() == 2) {
            callPanelTTNV();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        callPanelThemNV();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTheoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimTheoTenActionPerformed

    private void txtTimTheoTen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTheoTen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimTheoTen2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboLoc;
    private javax.swing.ButtonGroup grpGioiTinh;
    private javax.swing.JLabel lblLoc;
    private javax.swing.JLabel lblTimTheoMa;
    private javax.swing.JLabel lblTimTheoTen;
    private javax.swing.JLabel lblTitleTTNV;
    private javax.swing.JPanel pnlCN;
    private javax.swing.JScrollPane scrNhanVien;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtTimTheoTen;
    private javax.swing.JTextField txtTimTheoTen2;
    // End of variables declaration//GEN-END:variables
}
