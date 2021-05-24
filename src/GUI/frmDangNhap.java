package GUI;

import Entity.DangNhapEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import BLL.DangNhapBLL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmDangNhap extends javax.swing.JInternalFrame 
{

    DangNhapBLL dangnhap = new DangNhapBLL();
    public frmDangNhap() 
    {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//Lấy độ dài của màn hình

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setTitle("Đăng nhập");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Đăng nhập"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Tên đăng nhập");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Mật khẩu");

        txtUserName.setText("admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(0, 0, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(btnThoat))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        DangNhapEntity dangnhapEntity = new DangNhapEntity();
        dangnhapEntity.setUsername(txtUserName.getText());//gán giá trị cho username là textfield Username
        dangnhapEntity.setPwd(txtPassWord.getText());//gán giá trị cho password là textfield password
        try {
            if(dangnhap.KiemtraTaiKhoan(dangnhapEntity).next() == false)//Nếu như resultSet không trả về hàng nào
            {
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thất bại");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công");
                //Quay về form cha (main)
                javax.swing.JFrame main_frame = (javax.swing.JFrame)this.getTopLevelAncestor();
                //Hiện tất cả các menu 
                main_frame.getJMenuBar().getMenu(0).setEnabled(true);
                main_frame.getJMenuBar().getMenu(1).setEnabled(true);
                main_frame.getJMenuBar().getMenu(2).setEnabled(true);
                main_frame.getJMenuBar().getMenu(3).setEnabled(true);
                main_frame.getJMenuBar().getMenu(4).setEnabled(true);
                main_frame.getJMenuBar().getMenu(5).getMenuComponent(0).setVisible(false);//tắt item Đăng nhập
                main_frame.getJMenuBar().getMenu(5).getMenuComponent(1).setVisible(true);//Hiện Item Đổi mật khẩu
                main_frame.getJMenuBar().getMenu(5).getMenuComponent(2).setVisible(true);//Hiện Item đăng xuất
                this.dispose();//Tắt form
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    //nút thoát
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
