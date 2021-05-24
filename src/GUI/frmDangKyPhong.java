package GUI;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import BLL.DangKyPhongBLL;
import GUI.loadTable;
import Entity.DangKyPhongEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class frmDangKyPhong extends javax.swing.JInternalFrame 
{
    loadTable loadtable = new loadTable();
    DangKyPhongBLL dangkyphong = new DangKyPhongBLL();

    public frmDangKyPhong() 
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

        btnGb = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhach = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhongCoKhachThue = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachKhachThue = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        rbtnKhachThueMoi = new javax.swing.JRadioButton();
        rbtnKhachOGhep = new javax.swing.JRadioButton();
        gbKhachThuePhongMoi = new javax.swing.JPanel();
        cbbDanhSachPhongTrong = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        gbKhachOGhep = new javax.swing.JPanel();
        cbbDanhSachPhongOGhep = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnThemKhach = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        setClosable(true);
        setTitle("Đăng ký phòng");
        setToolTipText("");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách khách chưa có phòng"));

        tblKhach.setAutoCreateRowSorter(true);
        tblKhach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblKhach);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết khách thuê phòng"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Phòng có khách thuê"));

        tblPhongCoKhachThue.setAutoCreateRowSorter(true);
        tblPhongCoKhachThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPhongCoKhachThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongCoKhachThueMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPhongCoKhachThue);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách khách thuê phòng"));

        tblDanhSachKhachThue.setAutoCreateRowSorter(true);
        tblDanhSachKhachThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDanhSachKhachThue);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm khách thuê"));

        buttonGroup1.add(rbtnKhachThueMoi);
        rbtnKhachThueMoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtnKhachThueMoi.setForeground(new java.awt.Color(153, 153, 255));
        rbtnKhachThueMoi.setText("Khách thuê phòng mới");
        rbtnKhachThueMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnKhachThueMoiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnKhachOGhep);
        rbtnKhachOGhep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtnKhachOGhep.setForeground(new java.awt.Color(153, 153, 255));
        rbtnKhachOGhep.setText("Khách ở ghép");
        rbtnKhachOGhep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnKhachOGhepActionPerformed(evt);
            }
        });

        gbKhachThuePhongMoi.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách thuê phòng mới"));

        cbbDanhSachPhongTrong.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Danh sách phòng còn trống");

        javax.swing.GroupLayout gbKhachThuePhongMoiLayout = new javax.swing.GroupLayout(gbKhachThuePhongMoi);
        gbKhachThuePhongMoi.setLayout(gbKhachThuePhongMoiLayout);
        gbKhachThuePhongMoiLayout.setHorizontalGroup(
            gbKhachThuePhongMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbKhachThuePhongMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbbDanhSachPhongTrong, 0, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        gbKhachThuePhongMoiLayout.setVerticalGroup(
            gbKhachThuePhongMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbKhachThuePhongMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gbKhachThuePhongMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbDanhSachPhongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        gbKhachOGhep.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách Ở ghép"));

        cbbDanhSachPhongOGhep.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Danh sách phòng ");

        javax.swing.GroupLayout gbKhachOGhepLayout = new javax.swing.GroupLayout(gbKhachOGhep);
        gbKhachOGhep.setLayout(gbKhachOGhepLayout);
        gbKhachOGhepLayout.setHorizontalGroup(
            gbKhachOGhepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gbKhachOGhepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbbDanhSachPhongOGhep, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gbKhachOGhepLayout.setVerticalGroup(
            gbKhachOGhepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbKhachOGhepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gbKhachOGhepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbDanhSachPhongOGhep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThemKhach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemKhach.setForeground(new java.awt.Color(0, 0, 255));
        btnThemKhach.setText("Thêm khách");
        btnThemKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gbKhachThuePhongMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnKhachThueMoi)
                            .addComponent(rbtnKhachOGhep))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(gbKhachOGhep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemKhach)
                .addGap(92, 92, 92))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnKhachThueMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnKhachOGhep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbKhachThuePhongMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gbKhachOGhep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnThemKhach)
                .addGap(21, 21, 21))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("ĐĂNG KÝ THUÊ PHÒNG");

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 0, 0));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try 
        {
            loadtable.loadJtable(dangkyphong.loadKhachThueChuaCoPhong(), tblKhach);//Load các khách thuê chưa có phòng
            loadtable.loadJtable(dangkyphong.LoadPhongDaCoKhach(), tblPhongCoKhachThue);//load các phòng đã có khách
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmDangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblPhongCoKhachThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongCoKhachThueMouseClicked
        //Sự kiện MouseClick khi click vào hàng trong bảng phòng có khách thuê
        try 
        {
            int index = tblPhongCoKhachThue.getSelectedRow();//Lấy index tại hàng khi click chuột
            DangKyPhongEntity dangkyphongEntity = new DangKyPhongEntity();
            dangkyphongEntity.setMaPhong((String) tblPhongCoKhachThue.getValueAt(index,0));// lấy mã phòng tại hàng thứ index và cột thứ 0
            loadtable.loadJtable(dangkyphong.loadChiTietKhachThue(dangkyphongEntity), tblDanhSachKhachThue);//load các khách thuê với tham số đầu vào là mã phòng
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmDangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblPhongCoKhachThueMouseClicked

    private void rbtnKhachOGhepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnKhachOGhepActionPerformed
        //Load thông tin mã phòng có khách cho khác muốn ở ghép vào combobox
        try 
        {
            cbbDanhSachPhongTrong.setEnabled(false);//disable combobox danh sách phòng trông
            cbbDanhSachPhongOGhep.setEnabled(true);//enable combobox danh sách phòng có người
            btnThemKhach.setEnabled(true);//enable nút thêm khách
            loadtable.loadJcombobox(dangkyphong.loadMaPhongOGhep(), cbbDanhSachPhongOGhep, "MaPhong");//load dữ liệu vào combobox và lấy cột Mã phòng
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmDangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnKhachOGhepActionPerformed

    private void rbtnKhachThueMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnKhachThueMoiActionPerformed
        //Load thông tin mã phòng trống combobox
        try 
        {
                cbbDanhSachPhongTrong.setEnabled(true);//enable combobox danh sách phòng trông
                cbbDanhSachPhongOGhep.setEnabled(false);//disable combobox danh sách phòng có người
                btnThemKhach.setEnabled(true);//enable nút thêm khách
                loadtable.loadJcombobox(dangkyphong.LoadMaPhongMoi(), cbbDanhSachPhongTrong, "MaPhong");//load dữ liệu vào combobox và lấy cột Mã phòng
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmDangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnKhachThueMoiActionPerformed

    private void btnThemKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachActionPerformed
        
        int index = tblKhach.getSelectedRow();//Tạo biến index để xác định đang ở dòng nào trong table
        int row  = tblKhach.getSelectedRow();//xác định index dòng được chọn
        int col  = tblKhach.getSelectedColumn();//xác định index cột được chọn
        Date ngayvaophong=new Date(System.currentTimeMillis()); //Lấy ngày hệ thống        
        java.text.SimpleDateFormat dayFormat= new java.text.SimpleDateFormat("dd/MM/yyyy"); //Khai báo định dạng ngày tháng
        
        if(tblKhach.isCellSelected(row, col))//Nếu như ô trên table được chọn tại vị trí (row, col)
        {
            if(rbtnKhachThueMoi.isSelected())//Nếu như radiobutton được chọn
            {
                try {
                    DangKyPhongEntity dangkyphongEntity = new DangKyPhongEntity();
                            dangkyphongEntity.setMaKhach((String) tblKhach.getValueAt(index, 0));//lấy giá trị tại hàng index và cột 0
                            dangkyphongEntity.setMaPhong((String)cbbDanhSachPhongTrong.getSelectedItem());//set mã phòng là giá trị được chọn của combobox
                            
                            //Lấy ngày hiện tại
                            
                            dangkyphongEntity.setNgayVaoPhong(dayFormat.format(ngayvaophong.getTime()));
                            if(dangkyphong.ThemKhachThueVaoPhongMoi(dangkyphongEntity)>0)
                            {
                                JOptionPane.showMessageDialog(rootPane, "Đăng kí phòng thành công");
                                //load lại các khách thuê chưa có phòng và phong đã có khách
                                loadtable.loadJtable(dangkyphong.loadKhachThueChuaCoPhong(), tblKhach);
                                loadtable.loadJtable(dangkyphong.LoadPhongDaCoKhach(), tblPhongCoKhachThue);
                            }
                            else
                                JOptionPane.showMessageDialog(rootPane, "Đăng kí phòng thất bại");
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmDangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(rbtnKhachOGhep.isSelected())//Nếu như radiobutton được chọn
            {
                try {
                    DangKyPhongEntity dangkyphongEntity = new DangKyPhongEntity();
                        dangkyphongEntity.setMaKhach((String) tblKhach.getValueAt(index, 0));//Lấy mã khách ở hàng thứ index và cột thứ 0
                        dangkyphongEntity.setMaPhong((String)cbbDanhSachPhongOGhep.getSelectedItem());//lấy giá trị mã phòng là giá trị được chọn trong combobox
                        
                        dangkyphongEntity.setNgayVaoPhong(dayFormat.format(ngayvaophong.getTime()));//lấy ngày - giờ hiện tại
                        if(dangkyphong.ThemKhachOghep(dangkyphongEntity)>0)
                        {
                            JOptionPane.showMessageDialog(rootPane, "Đăng kí phòng thành công");
                            loadtable.loadJtable(dangkyphong.loadKhachThueChuaCoPhong(), tblKhach);//load lại bảng khách chưa có phòng
                        }
                        else
                            JOptionPane.showMessageDialog(rootPane, "Đăng kí phòng thất bại");
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmDangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        else//Nếu như ô trên table chưa được chọn => xuất thông báo
            JOptionPane.showMessageDialog(rootPane, "Xin hãy chọn khách thuê cần thêm");
    }//GEN-LAST:event_btnThemKhachActionPerformed

    //nút thoát cho form
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGb;
    private javax.swing.JButton btnThemKhach;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbbDanhSachPhongOGhep;
    private javax.swing.JComboBox cbbDanhSachPhongTrong;
    private javax.swing.JPanel gbKhachOGhep;
    private javax.swing.JPanel gbKhachThuePhongMoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbtnKhachOGhep;
    private javax.swing.JRadioButton rbtnKhachThueMoi;
    private javax.swing.JTable tblDanhSachKhachThue;
    private javax.swing.JTable tblKhach;
    private javax.swing.JTable tblPhongCoKhachThue;
    // End of variables declaration//GEN-END:variables
}
