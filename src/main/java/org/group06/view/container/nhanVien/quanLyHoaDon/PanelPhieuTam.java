/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.group06.view.container.nhanVien.quanLyHoaDon;

import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_ChiTietPhieuDat;
import org.group06.db.dao.DAO_PhieuDat;
import org.group06.db.dao.DAO_QuanAo;
import org.group06.model.entity.ChiTietPhieuDat;
import org.group06.model.entity.PhieuDat;
import org.group06.model.entity.QuanAo;
import org.group06.utils.DateStandard;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * @author Le Minh Bao
 */
public class PanelPhieuTam extends javax.swing.JPanel {

    private Connection connection = DatabaseConstant.getConnection();
    private DAO_PhieuDat dao_PhieuDat = new DAO_PhieuDat(connection);
    private ArrayList<PhieuDat> dsPD;

    /**
     * Creates new form PanelHoaDon
     */
    public PanelPhieuTam() {
        initComponents();
        dchTimTheoNgayDat.setLocale(new Locale("vi", "VN"));
        dchTimTheoNgayNhan.setLocale(new Locale("vi", "VN"));
        dsPD = dao_PhieuDat.getAll();
        loadDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleDSHoaDon = new javax.swing.JLabel();
        pnlTimHD = new javax.swing.JPanel();
        lblTimTheoTenKH = new javax.swing.JLabel();
        lblTimTheoNgayDat = new javax.swing.JLabel();
        txtTimTheoTenKH = new javax.swing.JTextField();
        dchTimTheoNgayDat = new com.toedter.calendar.JDateChooser();
        btnLamMoi = new javax.swing.JButton();
        lblTimTheoTenNV = new javax.swing.JLabel();
        txtTimTheoTenNV = new javax.swing.JTextField();
        lblTimTheoNgayNhan = new javax.swing.JLabel();
        dchTimTheoNgayNhan = new com.toedter.calendar.JDateChooser();
        srcPhieuDat = new javax.swing.JScrollPane();
        tblPhieuDat = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitleDSHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTitleDSHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDSHoaDon.setText("Danh sách phiếu đặt hàng");

        pnlTimHD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tìm Kiếm Phiếu Đặt Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblTimTheoTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTenKH.setText("Tìm theo tên khách hàng");

        lblTimTheoNgayDat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoNgayDat.setText("Tìm theo ngày tạo phiếu đặt");

        txtTimTheoTenKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTenKH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTenKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenKHKeyReleased(evt);
            }
        });

        dchTimTheoNgayDat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTimTheoNgayDat.setPreferredSize(new java.awt.Dimension(64, 29));
        dchTimTheoNgayDat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTimTheoNgayDatPropertyChange(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        lblTimTheoTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoTenNV.setText("Tìm theo tên nhân viên");

        txtTimTheoTenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTimTheoTenNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTimTheoTenNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimTheoTenNVKeyReleased(evt);
            }
        });

        lblTimTheoNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTimTheoNgayNhan.setText("Tìm theo ngày nhận quần áo");

        dchTimTheoNgayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dchTimTheoNgayNhan.setPreferredSize(new java.awt.Dimension(64, 29));
        dchTimTheoNgayNhan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dchTimTheoNgayNhanPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTimHDLayout = new javax.swing.GroupLayout(pnlTimHD);
        pnlTimHD.setLayout(pnlTimHDLayout);
        pnlTimHDLayout.setHorizontalGroup(
                pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTimHDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTimTheoTenKH)
                                        .addComponent(lblTimTheoTenNV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTimTheoTenNV)
                                        .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTimTheoNgayNhan)
                                        .addComponent(lblTimTheoNgayDat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dchTimTheoNgayDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dchTimTheoNgayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLamMoi)
                                .addContainerGap())
        );
        pnlTimHDLayout.setVerticalGroup(
                pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTimHDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTimHDLayout.createSequentialGroup()
                                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(lblTimTheoNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTimTheoTenKH)
                                                        .addComponent(txtTimTheoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dchTimTheoNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnlTimHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(lblTimTheoTenNV)
                                                        .addComponent(txtTimTheoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTimTheoNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dchTimTheoNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        dchTimTheoNgayDat.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchTimTheoNgayDat.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchTimTheoNgayDat.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);
        dchTimTheoNgayNhan.getCalendarButton().setIcon(org.group06.utils.ImagePath.loadIcon(org.group06.utils.ImagePath.ICON_CALENDAR));

        dchTimTheoNgayNhan.getDateEditor().setEnabled(false);

        ((com.toedter.calendar.JTextFieldDateEditor) dchTimTheoNgayNhan.getDateEditor()).setDisabledTextColor(java.awt.Color.BLACK);

        srcPhieuDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblPhieuDat.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Mã phiếu đặt", "Ngày tạo", "Ngày nhận", "Tên khách hàng", "Tên nhân viên", "Tổng tiền", "Khuyến mãi", "Ghi chú"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblPhieuDat.setRowHeight(50);
        tblPhieuDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuDatMouseClicked(evt);
            }
        });
        srcPhieuDat.setViewportView(tblPhieuDat);
        if (tblPhieuDat.getColumnModel().getColumnCount() > 0) {
            tblPhieuDat.getColumnModel().getColumn(0).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(1).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(2).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(3).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(4).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(5).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(6).setResizable(false);
            tblPhieuDat.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(srcPhieuDat, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlTimHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblTitleDSHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitleDSHoaDon)
                                .addGap(2, 2, 2)
                                .addComponent(pnlTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(srcPhieuDat, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimTheoTenKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenKHKeyReleased
        String tenKH = txtTimTheoTenKH.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenKH.equals("")) {
                if (checkRegexTenKH()) {
                    ArrayList<PhieuDat> dsPD = new DAO_PhieuDat(connection).getByNameKH(tenKH);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblPhieuDat.getModel();
                    modelKH.setRowCount(0);
                    for (PhieuDat pd : dsPD) {
                        String ngayTao = DateStandard.formatDate(pd.getNgayTao());
                        String ngayNhan = DateStandard.formatDate(pd.getNgayNhan());
                        String ttt = loadTongThanhTien(pd.getMaPhieuDat());
                        String ghiChu = loadGhiChu(pd);
                        Object[] data = {pd.getMaPhieuDat(), ngayTao, ngayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), ttt, pd.getKhuyenMai() != null ? pd.getKhuyenMai().getTenCTKM() : "", ghiChu};
                        modelKH.addRow(data);
                    }
                    txtTimTheoTenNV.setText("");
                    dchTimTheoNgayDat.setDate(null);
                    dchTimTheoNgayNhan.setDate(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên khách hàng cần tìm");
                    loadDataTable();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoTenKHKeyReleased

    private boolean checkRegexTenKH() {
        String tenKH = txtTimTheoTenKH.getText().trim();
        if (tenKH.equals("") || !tenKH.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkRegexTenNV() {
        String tenNV = txtTimTheoTenNV.getText().trim();
        if (tenNV.equals("") || !tenNV.matches("^[\\p{L}\\s]+$")) {
            return false;
        } else {
            return true;
        }
    }

    private void txtTimTheoTenNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimTheoTenNVKeyReleased
        String tenNV = txtTimTheoTenNV.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tenNV.equals("")) {
                if (checkRegexTenNV()) {
                    ArrayList<PhieuDat> dsPD = dao_PhieuDat.getByNameNV(tenNV);
                    DefaultTableModel modelKH = (DefaultTableModel) this.tblPhieuDat.getModel();
                    modelKH.setRowCount(0);
                    for (PhieuDat pd : dsPD) {
                        String ngayTao = DateStandard.formatDate(pd.getNgayTao());
                        String ngayNhan = DateStandard.formatDate(pd.getNgayNhan());
                        String ttt = loadTongThanhTien(pd.getMaPhieuDat());
                        String ghiChu = loadGhiChu(pd);
                        Object[] data = {pd.getMaPhieuDat(), ngayTao, ngayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), ttt, pd.getKhuyenMai() != null ? pd.getKhuyenMai().getTenCTKM() : "", ghiChu};
                        modelKH.addRow(data);
                    }
                    txtTimTheoTenKH.setText("");
                    dchTimTheoNgayDat.setDate(null);
                    dchTimTheoNgayNhan.setDate(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Nhập lại tên nhân viên cần tìm");
                    loadDataTable();
                }
            } else {
                loadDataTable();
            }
        }
    }//GEN-LAST:event_txtTimTheoTenNVKeyReleased

    private void callFrameChiTietHoaDon() {
        FrameChiTietDonDatHang frCTDDH = new FrameChiTietDonDatHang(this.getSelectedPhieuDat(), this);
        frCTDDH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frCTDDH.setResizable(false);
        frCTDDH.setVisible(true);
    }

    private void tblPhieuDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuDatMouseClicked
        if (evt.getClickCount() == 2) {
            callFrameChiTietHoaDon();
        }
    }//GEN-LAST:event_tblPhieuDatMouseClicked

    private void dchTimTheoNgayDatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTimTheoNgayDatPropertyChange
        if (evt.getPropertyName().equals("date")) {
            Date ngayDat = (Date) evt.getNewValue();
            Date ngayNhan = dchTimTheoNgayNhan.getDate();
            java.util.Date dateNow = new java.util.Date();
            if (ngayDat != null) {
                if (ngayDat.after(dateNow)) {
                    JOptionPane.showMessageDialog(null, "Chọn ngày không hợp lệ");
                    resetDay();
                } else {
                    if (ngayNhan == null) {
                        loadDataNgayDat(ngayDat);
                        txtTimTheoTenKH.setText("");
                        txtTimTheoTenNV.setText("");
                    } else if (ngayNhan.before(ngayDat)) {
                        JOptionPane.showMessageDialog(null, "Ngày nhận không hợp lệ");
                        resetDay();
                    } else {
                        loadDataTheo2Ngay(ngayDat, ngayNhan);
                        txtTimTheoTenKH.setText("");
                        txtTimTheoTenNV.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_dchTimTheoNgayDatPropertyChange

    private void dchTimTheoNgayNhanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dchTimTheoNgayNhanPropertyChange
        if (evt.getPropertyName().equals("date")) {
            if ("date".equals(evt.getPropertyName())) {
                Date ngayNhan = (Date) evt.getNewValue();
                Date ngayDat = dchTimTheoNgayDat.getDate();
                if (ngayNhan != null) {
                    if (ngayDat == null) {
                        loadDataNgayNhan(ngayNhan);
                        txtTimTheoTenKH.setText("");
                        txtTimTheoTenNV.setText("");
                    } else {
                        if (ngayDat.after(ngayNhan)) {
                            JOptionPane.showMessageDialog(null, "Ngày nhận không hợp lệ");
                            resetDay();
                        } else {
                            loadDataTheo2Ngay(ngayDat, ngayNhan);
                            txtTimTheoTenKH.setText("");
                            txtTimTheoTenNV.setText("");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_dchTimTheoNgayNhanPropertyChange

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtTimTheoTenKH.setText("");
        txtTimTheoTenNV.setText("");
        dchTimTheoNgayDat.setDate(null);
        dchTimTheoNgayNhan.setDate(null);
        loadDataTable();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void loadDataNgayDat(Date formatDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formatDayDat = sdf.format(formatDay);
        ArrayList<PhieuDat> dsPD = dao_PhieuDat.getByDateDat(formatDayDat);
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String newFormatNgayTao = DateStandard.formatDate(pd.getNgayTao());
            String newFormatNgayNhan = DateStandard.formatDate(pd.getNgayNhan());
            String ttt = loadTongThanhTien(pd.getMaPhieuDat());
            String ghiChu = loadGhiChu(pd);
            Object[] data = {pd.getMaPhieuDat(), newFormatNgayTao, newFormatNgayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), ttt, pd.getKhuyenMai() != null ? pd.getKhuyenMai().getTenCTKM() : "", ghiChu};
            modelPD.addRow(data);
        }
    }

    private void loadDataNgayNhan(Date formatDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formatDayNhan = sdf.format(formatDay);
        ArrayList<PhieuDat> dsPD = dao_PhieuDat.getByDateNhan(formatDayNhan);
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String newFormatNgayTao = DateStandard.formatDate(pd.getNgayTao());
            String newFormatNgayNhan = DateStandard.formatDate(pd.getNgayNhan());
            String ttt = loadTongThanhTien(pd.getMaPhieuDat());
            String ghiChu = loadGhiChu(pd);
            Object[] data = {pd.getMaPhieuDat(), newFormatNgayTao, newFormatNgayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), ttt, pd.getKhuyenMai() != null ? pd.getKhuyenMai().getTenCTKM() : "", ghiChu};
            modelPD.addRow(data);
        }
    }

    private void loadDataTheo2Ngay(Date day1, Date day2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formatDayDat = sdf.format(day1);
        String formatDayNhan = sdf.format(day2);
        ArrayList<PhieuDat> dsPD = dao_PhieuDat.getByDateDatAndDateNhan(formatDayDat, formatDayNhan);
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String newFormatNgayTao = DateStandard.formatDate(pd.getNgayTao());
            String newFormatNgayNhan = DateStandard.formatDate(pd.getNgayNhan());
            String ttt = loadTongThanhTien(pd.getMaPhieuDat());

            String ghiChu = loadGhiChu(pd);

            Object[] data = {pd.getMaPhieuDat(), newFormatNgayTao, newFormatNgayNhan, pd.getKhachHang().getTenKH(), pd.getNhanVien().getTenNV(), ttt, pd.getKhuyenMai() != null ? pd.getKhuyenMai().getTenCTKM() : "", ghiChu};
            modelPD.addRow(data);
        }
    }

    private void resetDay() {
        dchTimTheoNgayDat.setDate(null);
        dchTimTheoNgayNhan.setDate(null);
        loadDataTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private com.toedter.calendar.JDateChooser dchTimTheoNgayDat;
    private com.toedter.calendar.JDateChooser dchTimTheoNgayNhan;
    private javax.swing.JLabel lblTimTheoNgayDat;
    private javax.swing.JLabel lblTimTheoNgayNhan;
    private javax.swing.JLabel lblTimTheoTenKH;
    private javax.swing.JLabel lblTimTheoTenNV;
    private javax.swing.JLabel lblTitleDSHoaDon;
    private javax.swing.JPanel pnlTimHD;
    private javax.swing.JScrollPane srcPhieuDat;
    private javax.swing.JTable tblPhieuDat;
    private javax.swing.JTextField txtTimTheoTenKH;
    private javax.swing.JTextField txtTimTheoTenNV;
    // End of variables declaration//GEN-END:variables

    private PhieuDat getSelectedPhieuDat() {
        String maPD = tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 0).toString();

        PhieuDat phieuDat = null;

        for (PhieuDat pd : dsPD) {
            if (pd.getMaPhieuDat().equals(tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 0).toString())) {
                phieuDat = pd;
            }
        }

        if (tblPhieuDat.getSelectedRow() == -1) {
            return null;
        } else {
            return phieuDat;
        }
    }


    public void loadDataTable() {
        DefaultTableModel modelPD = (DefaultTableModel) this.tblPhieuDat.getModel();
        modelPD.setRowCount(0);
        for (PhieuDat pd : dsPD) {
            String maPD = pd.getMaPhieuDat();
            String dateNhan = DateStandard.formatDate(pd.getNgayNhan());
            String dateDat = DateStandard.formatDate(pd.getNgayTao());
            String tenKH = (pd.getKhachHang() == null) ? "Khách vãng lai" : pd.getKhachHang().getTenKH();
            String tenNV = pd.getNhanVien().getTenNV();
            String ttt = loadTongThanhTien(pd.getMaPhieuDat());
            String khuyenMai = (pd.getKhuyenMai() == null) ? "" : pd.getKhuyenMai().getTenCTKM();

            if (pd.getTrangThai() == PhieuDat.CHUA_DEN_HEN) {
                LocalDate ngayNhan = pd.getNgayNhan().toLocalDate();
                LocalDate ngayHienTai = LocalDate.now();
                long daysBetween = ChronoUnit.DAYS.between(ngayNhan, ngayHienTai);
                if (daysBetween>= 0 && daysBetween <= 7) {
                    pd.setTrangThai(PhieuDat.CHO_NHAN_HANG);
                    dao_PhieuDat.update(pd);
                } else if (daysBetween > 7) {
                    pd.setTrangThai(PhieuDat.DA_QUA_HAN);
                    DAO_QuanAo dao_quanAo = new DAO_QuanAo(connection);
                    for (ChiTietPhieuDat ctpd : new DAO_ChiTietPhieuDat(connection).getAllByID(maPD)) {
                        QuanAo quanAo = dao_quanAo.getByID(ctpd.getQuanAo().getMaQA());
                        quanAo.setSoLuong(quanAo.getSoLuong() + ctpd.getSoLuong());
                        dao_quanAo.update(quanAo);
                    }
                }
            }

            String ghiChu = loadGhiChu(pd);

            Object[] data = {maPD, dateDat, dateNhan, tenKH, tenNV, ttt, khuyenMai, ghiChu};
            modelPD.addRow(data);
        }
    }

    private String loadTongThanhTien(String pd) {
        double tinhTongThanhTien = 0, mucGiamGia = 0;
        ArrayList<ChiTietPhieuDat> dsCTPD = new DAO_ChiTietPhieuDat(connection).getAllByID(pd);
        DecimalFormat dfMoney = new DecimalFormat("##,### VNĐ");
        for (ChiTietPhieuDat ctpd : dsCTPD) {
            double tinhThanhTien = ctpd.getGiaBan();
            tinhTongThanhTien += tinhThanhTien;

            if (ctpd.getPhieuDat().getKhuyenMai() != null) {
                mucGiamGia = (ctpd.getPhieuDat().getKhuyenMai().getMucGiamGia()) / 100;
            }
        }

        double tongTienSauVAT = tinhTongThanhTien + (tinhTongThanhTien * 0.08);
        double ttt = (tongTienSauVAT - (tongTienSauVAT * mucGiamGia));
        String tongThanhTien = dfMoney.format(ttt);
        return tongThanhTien;
    }

    private static String loadGhiChu(PhieuDat pd) {
        String ghiChu = "";
        if (pd.getTrangThai() == PhieuDat.CHUA_DEN_HEN) {
            ghiChu = "Chưa đến hạn nhận hàng";
        } else if (pd.getTrangThai() == PhieuDat.CHO_NHAN_HANG) {
            ghiChu = "Có thể nhận hàng";
        } else if (pd.getTrangThai() == PhieuDat.DA_QUA_HAN) {
            ghiChu = "Quá hạn nhận hàng";
        }
        return ghiChu;
    }
}
