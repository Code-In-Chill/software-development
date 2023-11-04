/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.container.khachHang;

/**
 *
 * @author Le Minh Bao
 */
public class PanelThongKeKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form PanelThongKe
     */
    public PanelThongKeKhachHang() {
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

        lblTitle = new javax.swing.JLabel();
        tabLuaChonHienThi = new javax.swing.JTabbedPane();
        tabHienThiDanhSach = new javax.swing.JTabbedPane();
        pnlDanhSachTheoNgay = new javax.swing.JPanel();
        scrQuanAo = new javax.swing.JScrollPane();
        tblQuanAo = new javax.swing.JTable();
        pnlDanhSachTheoThang = new javax.swing.JPanel();
        pnlDanhSachTheoNam = new javax.swing.JPanel();
        tabHienThiBieuDo = new javax.swing.JTabbedPane();
        pnlBieuDoTheoNgay = new javax.swing.JPanel();
        pnlBieuDoTheoThang = new javax.swing.JPanel();
        pnlBieuDoTheoNam = new javax.swing.JPanel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thống Kê Chi Tiêu Khách Hàng");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        scrQuanAo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh Sách Quần Áo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        scrQuanAo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblQuanAo.setAutoCreateRowSorter(true);
        tblQuanAo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Quần Áo", "Tên Quần Áo", "Loại Quần Áo", "Size", "Nhà Cung Cấp", "Số Lượng Còn", "Giá Bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuanAo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblQuanAo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblQuanAo.setFillsViewportHeight(true);
        tblQuanAo.setGridColor(new java.awt.Color(0, 0, 0));
        tblQuanAo.setRowHeight(50);
        tblQuanAo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblQuanAo.setShowGrid(true);
        tblQuanAo.getTableHeader().setResizingAllowed(false);
        tblQuanAo.getTableHeader().setReorderingAllowed(false);
        scrQuanAo.setViewportView(tblQuanAo);

        javax.swing.GroupLayout pnlDanhSachTheoNgayLayout = new javax.swing.GroupLayout(pnlDanhSachTheoNgay);
        pnlDanhSachTheoNgay.setLayout(pnlDanhSachTheoNgayLayout);
        pnlDanhSachTheoNgayLayout.setHorizontalGroup(
            pnlDanhSachTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachTheoNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhSachTheoNgayLayout.setVerticalGroup(
            pnlDanhSachTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachTheoNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrQuanAo, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabHienThiDanhSach.addTab("Danh Sách Theo Ngày", pnlDanhSachTheoNgay);

        javax.swing.GroupLayout pnlDanhSachTheoThangLayout = new javax.swing.GroupLayout(pnlDanhSachTheoThang);
        pnlDanhSachTheoThang.setLayout(pnlDanhSachTheoThangLayout);
        pnlDanhSachTheoThangLayout.setHorizontalGroup(
            pnlDanhSachTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        pnlDanhSachTheoThangLayout.setVerticalGroup(
            pnlDanhSachTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        tabHienThiDanhSach.addTab("Danh Sách Theo Tháng", pnlDanhSachTheoThang);

        javax.swing.GroupLayout pnlDanhSachTheoNamLayout = new javax.swing.GroupLayout(pnlDanhSachTheoNam);
        pnlDanhSachTheoNam.setLayout(pnlDanhSachTheoNamLayout);
        pnlDanhSachTheoNamLayout.setHorizontalGroup(
            pnlDanhSachTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        pnlDanhSachTheoNamLayout.setVerticalGroup(
            pnlDanhSachTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        tabHienThiDanhSach.addTab("Danh Sách Theo Năm", pnlDanhSachTheoNam);

        tabLuaChonHienThi.addTab("Danh Sách Chi Tiết", tabHienThiDanhSach);

        javax.swing.GroupLayout pnlBieuDoTheoNgayLayout = new javax.swing.GroupLayout(pnlBieuDoTheoNgay);
        pnlBieuDoTheoNgay.setLayout(pnlBieuDoTheoNgayLayout);
        pnlBieuDoTheoNgayLayout.setHorizontalGroup(
            pnlBieuDoTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        pnlBieuDoTheoNgayLayout.setVerticalGroup(
            pnlBieuDoTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        tabHienThiBieuDo.addTab("Biểu Đồ Theo Ngày", pnlBieuDoTheoNgay);

        javax.swing.GroupLayout pnlBieuDoTheoThangLayout = new javax.swing.GroupLayout(pnlBieuDoTheoThang);
        pnlBieuDoTheoThang.setLayout(pnlBieuDoTheoThangLayout);
        pnlBieuDoTheoThangLayout.setHorizontalGroup(
            pnlBieuDoTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        pnlBieuDoTheoThangLayout.setVerticalGroup(
            pnlBieuDoTheoThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        tabHienThiBieuDo.addTab("Biều Đồ Theo Tháng", pnlBieuDoTheoThang);

        javax.swing.GroupLayout pnlBieuDoTheoNamLayout = new javax.swing.GroupLayout(pnlBieuDoTheoNam);
        pnlBieuDoTheoNam.setLayout(pnlBieuDoTheoNamLayout);
        pnlBieuDoTheoNamLayout.setHorizontalGroup(
            pnlBieuDoTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        pnlBieuDoTheoNamLayout.setVerticalGroup(
            pnlBieuDoTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        tabHienThiBieuDo.addTab("Biểu Đồ Theo Năm", pnlBieuDoTheoNam);

        tabLuaChonHienThi.addTab("Biểu Đồ Trực Quan", tabHienThiBieuDo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabLuaChonHienThi)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLuaChonHienThi)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBieuDoTheoNam;
    private javax.swing.JPanel pnlBieuDoTheoNgay;
    private javax.swing.JPanel pnlBieuDoTheoThang;
    private javax.swing.JPanel pnlDanhSachTheoNam;
    private javax.swing.JPanel pnlDanhSachTheoNgay;
    private javax.swing.JPanel pnlDanhSachTheoThang;
    private javax.swing.JScrollPane scrQuanAo;
    private javax.swing.JTabbedPane tabHienThiBieuDo;
    private javax.swing.JTabbedPane tabHienThiDanhSach;
    private javax.swing.JTabbedPane tabLuaChonHienThi;
    private javax.swing.JTable tblQuanAo;
    // End of variables declaration//GEN-END:variables
}
