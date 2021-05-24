        package GUI;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import BLL.ThongKeBLL;
import GUI.loadTable;
import Entity.ThongKeEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class frmThongKe extends javax.swing.JInternalFrame 
{
    loadTable loadtable = new loadTable();
    ThongKeBLL thongke = new ThongKeBLL();

    public frmThongKe() 
    {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;//Chiều dài form
        int h = this.getSize().height;//Chiều cao form
        int x = (dim.width-w)/2;//canh chiều ngang
        int y = (dim.height-h)/2;//canh chiều dọc

        // Đặt vị trí theo tọa độ x,y
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhsachHoaDon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTienPhong = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTienDichVu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDoanhThuThang = new javax.swing.JTextField();
        txtTongDoanhThu = new javax.swing.JTextField();
        lbltongTienPhong = new javax.swing.JLabel();
        txtTienTheoPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        lblthang = new javax.swing.JLabel();
        lblPhong = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Thống kê hóa đơn");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tháng"));

        tblThang.setAutoCreateRowSorter(true);
        tblThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách hóa đơn"));
        jPanel2.setToolTipText("");

        tblDanhsachHoaDon.setAutoCreateRowSorter(true);
        tblDanhsachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDanhsachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhsachHoaDon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiền phòng"));

        tblTienPhong.setAutoCreateRowSorter(true);
        tblTienPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblTienPhong);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiền dịch vụ"));

        tblTienDichVu.setAutoCreateRowSorter(true);
        tblTienDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblTienDichVu);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Tổng doanh thu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Tổng doanh thu tháng");

        lbltongTienPhong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbltongTienPhong.setForeground(new java.awt.Color(153, 153, 255));
        lbltongTienPhong.setText("Tổng tiền phòng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("THỐNG KÊ HÓA ĐƠN");

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 0, 0));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblthang.setText("jLabel4");

        lblPhong.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblthang)
                .addGap(102, 102, 102)
                .addComponent(lbltongTienPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhong))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtDoanhThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(txtTienTheoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(btnThoat))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblthang))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltongTienPhong)
                        .addComponent(lblPhong)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoanhThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienTheoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try 
        {
            loadtable.loadJtable(thongke.loadthang(), tblThang);//load table tháng khi mở form
            tinhtientongdoanhthu();
            lblthang.setVisible(false);//ẩn biến hiện tháng
            lblPhong.setVisible(false);//ẩn label hiện phòng
            
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened
    
    //tính tổng doanh thu của các phòng trọ
    private void tinhtientongdoanhthu() throws Exception
    {
        ResultSet rs = thongke.TongTien();
        while(rs.next())//lặp tất cả các hàng trong resultSet
        {
            txtTongDoanhThu.setText(rs.getString(1)+" vnđ");//gán cho textfield giá trị ô đầu tiên
        }
    }
    
       
    private void tblThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThangMouseClicked
        try 
        {
            int index = tblThang.getSelectedRow();//lấy index của hàng được chọn
            //load tên tháng vào label
            lblthang.setText((String) tblThang.getValueAt(index, 0));
            
            ThongKeEntity thongkeEntity = new ThongKeEntity();
            thongkeEntity.setNgaylap((String) tblThang.getValueAt(index, 0));//gán giá trị ngày lao56 ở hàng index cột 0
            loadtable.loadJtable(thongke.loadHDTheothang(thongkeEntity), tblDanhsachHoaDon);//load bảng danh sách hóa đơn
            
            ResultSet rs = thongke.TongTienTheoThang(thongkeEntity);
            while(rs.next())//lặp tất cả các hàng trong resultSet
            {
                txtDoanhThuThang.setText(rs.getString(1)+" vnđ");//gán giá trị cho textfild là ô đầu tiên trong resultSet
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblThangMouseClicked

    private void tblDanhsachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachHoaDonMouseClicked
        try 
        {
            int indexHD = tblDanhsachHoaDon.getSelectedRow();//lấy index của hàng được chọn
            ThongKeEntity thongkeEntity = new ThongKeEntity();
            thongkeEntity.setMaphong((String) tblDanhsachHoaDon.getValueAt(indexHD, 2));//mã phòng là giá trị hàng indexHD cột 2
            thongkeEntity.setNgaylap((String) tblDanhsachHoaDon.getValueAt(indexHD, 1));//ngày lập là giá trị hàng indexHD cột 1
            //load lại 2 bảng tiền phòng và địch vụ
            loadtable.loadJtable(thongke.loadTienPhongTheoMa(thongkeEntity), tblTienPhong);
            loadtable.loadJtable(thongke.loadTienDichVuTheoMa(thongkeEntity), tblTienDichVu);
            lblthang.setVisible(true);//hiện labelThang lên
            TongTienTheoThangCuaPhong();//tính tiền theo tháng của phòng
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblDanhsachHoaDonMouseClicked
    //thoát
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void TongTienTheoThangCuaPhong() throws SQLException
    {
        try {
                    int index = tblDanhsachHoaDon.getSelectedRow();//lấy idex hàng được chọn
                    ThongKeEntity thongkeEntity = new ThongKeEntity();

                    thongkeEntity.setMaphong((String)tblDanhsachHoaDon.getValueAt(index, 2));//mã phòng là giá trị hàng index cột 2
                    thongkeEntity.setNgaylap((String)tblDanhsachHoaDon.getValueAt(index, 1));//ngày lập là giá trị hàng index cột 1
                    ResultSet rs = thongke.TongTienTheoThangCuaPhong(thongkeEntity);
                    lblPhong.setText((String) tblDanhsachHoaDon.getValueAt(index, 2));//label được gán giá trị ở hàng thứ index cột 2
                    lblPhong.setVisible(true);//hiện label 
                    while(rs.next())//lặp tất cả hàng trong resultSet
                    {
                        txtTienTheoPhong.setText(rs.getString(1)+" vnđ");//gán giá trị ở ô đầu tiên trong resultSet
                    }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblPhong;
    private javax.swing.JLabel lblthang;
    private javax.swing.JLabel lbltongTienPhong;
    private javax.swing.JTable tblDanhsachHoaDon;
    private javax.swing.JTable tblThang;
    private javax.swing.JTable tblTienDichVu;
    private javax.swing.JTable tblTienPhong;
    private javax.swing.JTextField txtDoanhThuThang;
    private javax.swing.JTextField txtTienTheoPhong;
    private javax.swing.JTextField txtTongDoanhThu;
    // End of variables declaration//GEN-END:variables
}
