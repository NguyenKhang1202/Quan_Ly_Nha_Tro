package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import BLL.DoiMatKhauBLL;
import Entity.DoiMatKhauEntity;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmDoiMatKhau extends javax.swing.JInternalFrame 
{
    DoiMatKhauBLL doimatkhau = new DoiMatKhauBLL();

    public frmDoiMatKhau() 
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtNhapLaiMatKhauMoi = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtTaiKhoan = new javax.swing.JTextField();
        btnDoiMatKhau = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setResizable(true);
        setTitle("Đổi mật khẩu");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Đổi mật khẩu"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Tài khoản");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Mật khẩu hiện tại");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Mật khẩu mới");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Nhập lại mật khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhapLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNhapLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDoiMatKhau.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(0, 0, 255));
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
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
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDoiMatKhau)
                .addGap(53, 53, 53)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoiMatKhau)
                    .addComponent(btnThoat))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //nút thoát
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        try {
            //Không được để trống các thông tin nhập vào
            if(txtMatKhau.getText().equals("")|| txtTaiKhoan.getText().equals("")||txtMatKhauMoi.getText().equals("")||txtNhapLaiMatKhauMoi.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
                return;
            }
            DoiMatKhauEntity doimatkhauEntity = new DoiMatKhauEntity();
            doimatkhauEntity.setTaikhoan(txtTaiKhoan.getText());//gán giá trị usernam là textfield username
            doimatkhauEntity.setMatkhau(txtMatKhau.getText());//gán giá trị của password là textfield password
            doimatkhauEntity.setMatkhaumoi(txtNhapLaiMatKhauMoi.getText());
            if(doimatkhau.KiemtraTaiKhoan(doimatkhauEntity).next()== false)//Kiểm tra sự tồn tại của tài khoản
            {//tài khoản không tồn tại thì xuất thông báo và return;
                JOptionPane.showMessageDialog(rootPane, "Tài khoản không hợp lệ");
                return;
            }
            else//nếu tài khoản tồn tại
            {
                if(txtMatKhauMoi.getText().equals(txtNhapLaiMatKhauMoi.getText()))//Kiểm tra mật khẩu mới và gõ lại mật khẩu mới có trùng nhau không
                {
                    if(doimatkhau.DoiMatKhauADMIN(doimatkhauEntity)>0)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công");
                    }
                }
                else
                    JOptionPane.showMessageDialog(rootPane, "Mật khẩu mới không trùng khớp");
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmDoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMatKhauMoi;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
