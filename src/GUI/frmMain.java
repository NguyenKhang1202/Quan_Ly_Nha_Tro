package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {        
    public frmMain() 
    {
        initComponents();
        this.setExtendedState(frmMain.MAXIMIZED_BOTH); // đặt kích thước màn hình 
        this.setVisible(true);
        
        this.getJMenuBar().getMenu(5).getMenuComponent(1).setVisible(false);//Tắt Item Đổi mật khẩu
        this.getJMenuBar().getMenu(5).getMenuComponent(2).setVisible(false);// Tắt Item đăng xuất
    }


    @SuppressWarnings("uncheck")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItemThoat = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem8.setText("jMenuItem8");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý phòng trọ ");

        menuBar.setForeground(new java.awt.Color(51, 255, 51));

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user-group-icon.png"))); // NOI18N
        fileMenu.setMnemonic('k');
        fileMenu.setText("Khách thuê");
        fileMenu.setEnabled(false);

        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user_female_info.png"))); // NOI18N
        openMenuItem.setMnemonic('K');
        openMenuItem.setText("Thông tin khách thuê");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        menuBar.add(fileMenu);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/motel.png"))); // NOI18N
        jMenu3.setText("Phòng trọ");
        jMenu3.setEnabled(false);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/home.png"))); // NOI18N
        jMenuItem2.setText("Thông tin phòng trọ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/contract.png"))); // NOI18N
        jMenuItem4.setText("Đăng ký phòng");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        menuBar.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/e24f1be346a.png"))); // NOI18N
        jMenu5.setText("Hóa đơn");
        jMenu5.setEnabled(false);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/information.png"))); // NOI18N
        jMenuItem5.setText("Thông tin hóa đơn");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        menuBar.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/order-1.png"))); // NOI18N
        jMenu6.setText("Bảng giá");
        jMenu6.setEnabled(false);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Home_1.png"))); // NOI18N
        jMenuItem7.setText("Bảng giá phòng trọ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/30e9d39543d14e5821889fda236fad5d.png"))); // NOI18N
        jMenuItem6.setText("Bảng giá dịch vụ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        menuBar.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/kchart.png"))); // NOI18N
        jMenu4.setText("Thống kê");
        jMenu4.setEnabled(false);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/1368245115_total_plan_cost.png"))); // NOI18N
        jMenuItem3.setText("Thống kê hóa đơn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        menuBar.add(jMenu4);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icon-ols.png"))); // NOI18N
        jMenu8.setText("Tài khoản");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Login.png"))); // NOI18N
        jMenuItem9.setText("Đăng nhập");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/[assword.png"))); // NOI18N
        jMenuItem11.setText("Đổi mật khẩu");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/logout.png"))); // NOI18N
        jMenuItem10.setText("Đăng xuất");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenuItemThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/exit.png"))); // NOI18N
        jMenuItemThoat.setText("Thoát");
        jMenuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThoatActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemThoat);

        menuBar.add(jMenu8);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Quản lý khách thuê phòng trọ"))//Nếu như có form nào trùng tên với form đang được bật
            return;
        //Nếu như form đó chưa được mở
        frmKhachThue f = new frmKhachThue();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Đăng ký phòng"))//Nếu như có form nào trùng tên với form đang được bật
            return;
        //Nếu như form đó chưa được mở
        frmDangKyPhong f = new frmDangKyPhong();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Hóa đơn dịch vụ"))//Nếu như có form nào trùng tên với form đang được bật
            return;
        //Nếu như form đó chưa được mở
        frmHoaDonDichVu f = new frmHoaDonDichVu();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
            if(f.getTitle().equals("Thông Tin Dịch Vụ"))//Nếu như có form nào trùng tên với form đang được bật
                return;
        //Nếu như form đó chưa được mở
        frmBangGiaDichVu f = new frmBangGiaDichVu();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())
            if(f.getTitle().equals("Bảng giá phòng trọ"))
                return;
        frmBangGiaPhongTro f = new frmBangGiaPhongTro();
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Thông tin phòng trọ"))//Nếu như có form nào trùng tên với form đang được bật
        return;
        //Nếu như form đó chưa được mở
        frmPhongTro f = new frmPhongTro();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Thống kê hóa đơn"))//Nếu như có form nào trùng tên với form đang được bật
        return;
        //Nếu như form đó chưa được mở
        frmThongKe f = new frmThongKe();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Đăng nhập"))//Nếu như có form nào trùng tên với form đang được bật
        return;
        //Nếu như form đó chưa được mở
        frmDangNhap f = new frmDangNhap();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.getJMenuBar().getMenu(0).setEnabled(false);
        this.getJMenuBar().getMenu(1).setEnabled(false);
        this.getJMenuBar().getMenu(2).setEnabled(false);
        this.getJMenuBar().getMenu(3).setEnabled(false);
        this.getJMenuBar().getMenu(4).setEnabled(false);
        this.getJMenuBar().getMenu(5).getMenuComponent(0).setVisible(true);//Hiện item Đăng nhập
        this.getJMenuBar().getMenu(5).getMenuComponent(1).setVisible(false);//tắt Item Đổi mật khẩu
        this.getJMenuBar().getMenu(5).getMenuComponent(2).setVisible(false);//tắt Item đăng xuất
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        for(JInternalFrame f:desktopPane.getAllFrames())//Lặp tất cả các JInternal Frame trong desktop Pane
        if(f.getTitle().equals("Đổi mật khẩu"))//Nếu như có form nào trùng tên với form đang được bật
        return;
        //Nếu như form đó chưa được mở
        frmDoiMatKhau f = new frmDoiMatKhau();//Tạo mới
        desktopPane.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThoatActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn thoát?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) 
        {
          System.exit(0);
        }
        else 
        {
           return;           
        }
    }//GEN-LAST:event_jMenuItemThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new frmMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemThoat;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables
}
