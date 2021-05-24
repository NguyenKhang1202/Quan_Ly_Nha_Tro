package GUI;

import BLL.BangGiaDichVuBLL;
import Entity.BangGiaDichVuEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import GUI.loadTable;
import GUI.loadTable;

public class frmBangGiaDichVu extends javax.swing.JInternalFrame 
{
    loadTable loadtable = new loadTable();
    BangGiaDichVuBLL dichvu = new BangGiaDichVuBLL();

    public frmBangGiaDichVu() 
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

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenDichVu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbMaLoaiDichVu = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtQuyCach = new javax.swing.JTextField();
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(java.awt.Color.blue);
        setTitle("Thông Tin Dịch Vụ");
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton2");

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

        tblDichVu.setAutoCreateRowSorter(true);
        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDichVu);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Mã Dịch Vụ");

        txtMaDichVu.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Tên Dịch Vụ");

        txtTenDichVu.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Giá Tiền");

        txtGiaTien.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Mã Loại Dịch Vụ");

        cbbMaLoaiDichVu.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Quy Cách");

        txtQuyCach.setEnabled(false);

        btnThemMoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(0, 0, 255));
        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.setEnabled(false);
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 200, 0));
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setEnabled(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtTenDichVu)
                            .addComponent(txtMaDichVu))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThemMoi)
                                .addGap(27, 27, 27)
                                .addComponent(btnCapNhat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbMaLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuyCach, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbbMaLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuyCach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemMoi)
                        .addComponent(btnCapNhat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbbMaLoaiDichVu.getAccessibleContext().setAccessibleName("cbbMaLoaiDichvu");
        cbbMaLoaiDichVu.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("THÔNG TIN DỊCH VỤ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(177, 177, 177)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addGap(257, 257, 257)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(jButton1))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        jButton1.getAccessibleContext().setAccessibleName("btnThoat");
        jButton1.getAccessibleContext().setAccessibleDescription("");
        btnThem.getAccessibleContext().setAccessibleName("btnThem");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //nút thoát
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try 
        {//load thông tin vào bảng dịch vụ và combobox mã loại dịch vụ khi load form
            loadtable.loadJtable(dichvu.LoadThongTinDichVu(), tblDichVu);
            loadtable.loadJcombobox(dichvu.loadMaLoaiDichVu(), cbbMaLoaiDichVu, "MaLoaiDichVu");
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Hiện ẩn các button, gán giá trị rỗng cho các textfield
        btnThemMoi.setEnabled(true);
        btnCapNhat.setEnabled(false);
        txtMaDichVu.setEnabled(true);
        txtTenDichVu.setEnabled(true);
        txtGiaTien.setEnabled(true);
        txtQuyCach.setEnabled(true);
        cbbMaLoaiDichVu.getItemAt(0);
        cbbMaLoaiDichVu.setEnabled(true);
        txtMaDichVu.setText("");
        txtTenDichVu.setText("");
        txtQuyCach.setText("");
        txtGiaTien.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //enable và disable các button và  textfield
        btnThemMoi.setEnabled(false);
        btnCapNhat.setEnabled(true);
        txtMaDichVu.setEnabled(false);
        txtTenDichVu.setEnabled(true);
        txtGiaTien.setEnabled(true);
        txtQuyCach.setEnabled(true);
        cbbMaLoaiDichVu.setEnabled(false);
        //Lấy index của bảng DIchVu khi click chuột vào
        int index=tblDichVu.getSelectedRow();
        //lấy giá tiền
        txtGiaTien.setText(String.valueOf(tblDichVu.getValueAt(index,2)).replaceAll(",",""));
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDichVuMouseClicked
        //Sự kiện click vào các hàng trong table
        txtMaDichVu.setEnabled(false);
        txtTenDichVu.setEnabled(false);
        txtGiaTien.setEnabled(false);
        txtQuyCach.setEnabled(false);
        cbbMaLoaiDichVu.setEnabled(false);
        int index=tblDichVu.getSelectedRow();
        txtMaDichVu.setText((String) tblDichVu.getValueAt(index,0));
        txtTenDichVu.setText((String) tblDichVu.getValueAt(index,1));
        txtGiaTien.setText(String.valueOf(tblDichVu.getValueAt(index,2)).replaceAll(",",""));
        txtQuyCach.setText((String) tblDichVu.getValueAt(index,4));
        cbbMaLoaiDichVu.setSelectedItem(tblDichVu.getValueAt(index, 3));
    }//GEN-LAST:event_tblDichVuMouseClicked

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        //Thông tin nhập vào không được để trống
        if(txtMaDichVu.getText().equals("")|| txtTenDichVu.getText().equals("") || txtGiaTien.getText().equals("") || txtQuyCach.getText().equals("") )
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        }
            else
            {          
                BangGiaDichVuEntity dichvuEntity = new BangGiaDichVuEntity();
                dichvuEntity.setMadichvu(txtMaDichVu.getText());
                dichvuEntity.setTendichvu(txtTenDichVu.getText());
                dichvuEntity.setGiatien(Integer.parseInt(txtGiaTien.getText()));
                dichvuEntity.setMaloaidichvu(cbbMaLoaiDichVu.getSelectedItem().toString());
                dichvuEntity.setQuycach(txtQuyCach.getText());
                try {
                        if(dichvu.ThemDichVu(dichvuEntity)>0)//Nếu thành công
                        {
                            JOptionPane.showMessageDialog(rootPane, "Thêm mới dịch vụ thành công");
                            loadtable.loadJtable(dichvu.LoadThongTinDichVu(),tblDichVu);//Load lại table Thông tin dịch vụ
                        }
                        else
                            JOptionPane.showMessageDialog(rootPane, "Thêm mới dịch vụ thất bại");         
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
             }
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if(txtMaDichVu.getText().equals("")|| txtTenDichVu.getText().equals("") || txtGiaTien.getText().equals("") || txtQuyCach.getText().equals("") )
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        }
        else
            {
                BangGiaDichVuEntity dichvuEntity = new BangGiaDichVuEntity();
                dichvuEntity.setMadichvu(txtMaDichVu.getText());
                dichvuEntity.setTendichvu(txtTenDichVu.getText());
                dichvuEntity.setGiatien(Integer.parseInt(txtGiaTien.getText()));
                dichvuEntity.setMaloaidichvu(cbbMaLoaiDichVu.getSelectedItem().toString());
                dichvuEntity.setQuycach(txtQuyCach.getText());
                try 
                {
                    if(dichvu.SuaDichVu(dichvuEntity)>0)//Nếu như sửa thành công
                    {
                        JOptionPane.showMessageDialog(rootPane, "Sửa dịch vụ thành công");
                        loadtable.loadJtable(dichvu.LoadThongTinDichVu(),tblDichVu);//Load lại table Thông tin dịch vụ
                    }
                    else
                        JOptionPane.showMessageDialog(rootPane, "Sửa dịch vụ thất bại");         
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JComboBox cbbMaLoaiDichVu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtQuyCach;
    private javax.swing.JTextField txtTenDichVu;
    // End of variables declaration//GEN-END:variables
}
