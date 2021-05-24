package GUI;
import BLL.BangGiaPhongTroBLL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import BLL.BangGiaPhongTroBLL;
import GUI.loadTable;
import Entity.BangGiaPhongTroEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class frmBangGiaPhongTro extends javax.swing.JInternalFrame 
{
    loadTable loadtable = new loadTable();
    BangGiaPhongTroBLL banggia = new BangGiaPhongTroBLL();

    public frmBangGiaPhongTro() 
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
        tblBangGia = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoNguoi = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Bảng giá phòng trọ");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bảng giá phòng trọ"));

        tblBangGia.setAutoCreateRowSorter(true);
        tblBangGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBangGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBangGia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Số người");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Giá tiền");

        txtSoNguoi.setEnabled(false);

        txtGiaTien.setEnabled(false);

        btnThemMoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(0, 0, 255));
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.setEnabled(false);
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 200, 0));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setEnabled(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 0, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 0, 0));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("BẢNG GIÁ THUÊ PHÒNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnThem)
                        .addGap(31, 31, 31)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThoat)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try 
        {
            loadtable.loadJtable(banggia.LoadThongTinGiaThue(), tblBangGia);//Load thông tin giá thuê khi form được mở
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmBangGiaPhongTro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Bật tắt các button, textfield
        txtSoNguoi.setText("");
        txtGiaTien.setText("");
        btnThemMoi.setEnabled(true);
        btnCapNhat.setEnabled(false);
        txtGiaTien.setEnabled(true);
        txtSoNguoi.setEnabled(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //Bật tắt các button, textfield
        btnThemMoi.setEnabled(false);
        btnCapNhat.setEnabled(true);
        txtSoNguoi.setEnabled(false);
        txtGiaTien.setEnabled(true);
        int index=tblBangGia.getSelectedRow();
        txtSoNguoi.setText(String.valueOf(tblBangGia.getValueAt(index,0)));
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblBangGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangGiaMouseClicked
        //Sự kiện mouseClick khi ấn chuột vào các hàng trên table thì giá trị sẽ được load vào các textfield
        txtSoNguoi.setEnabled(false);
        txtGiaTien.setEnabled(false);
        
        int index=tblBangGia.getSelectedRow();

        txtSoNguoi.setText(String.valueOf(tblBangGia.getValueAt(index,0)));
        txtGiaTien.setText(String.valueOf(tblBangGia.getValueAt(index,1)).replaceAll(",",""));
    }//GEN-LAST:event_tblBangGiaMouseClicked

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        //Thông tin nhập vào không được để trống
        if(txtSoNguoi.equals("")|| txtGiaTien.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        }
            else
            {
            try {
                    BangGiaPhongTroEntity banggiaEntity = new BangGiaPhongTroEntity();
                    banggiaEntity.setSoNguoi(Integer.parseInt(txtSoNguoi.getText()));
                    banggiaEntity.setGiaTien(Integer.parseInt(txtGiaTien.getText()));
                                
                if(banggia.ThemPhong(banggiaEntity)>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Thêm mới phòng thành công");
                    loadtable.loadJtable(banggia.LoadThongTinGiaThue(),tblBangGia);//load lại bảng thông tin giá thuê
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Thêm mới phòng thất bại");
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(frmBangGiaPhongTro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        //Thông tin nhập vào không được để trống
        if(txtSoNguoi.equals("")|| txtGiaTien.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        }
            else
            {
                try {
                    BangGiaPhongTroEntity banggiaEntity = new BangGiaPhongTroEntity();
                    banggiaEntity.setSoNguoi(Integer.parseInt(txtSoNguoi.getText()));
                    banggiaEntity.setGiaTien(Integer.parseInt(txtGiaTien.getText()));

                    if(banggia.SuaPhong(banggiaEntity)>0)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Sửa giá phòng thành công");
                        loadtable.loadJtable(banggia.LoadThongTinGiaThue(),tblBangGia);
                    }
                    else
                        JOptionPane.showMessageDialog(rootPane, "Sửa giá phòng thất bại");
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmBangGiaPhongTro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBangGia;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtSoNguoi;
    // End of variables declaration//GEN-END:variables
}
