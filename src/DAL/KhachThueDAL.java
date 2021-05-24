package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Entity.KhachThueEntity;

public class KhachThueDAL {

    ResultSet rs = null;
    DBAccess data = new DBAccess();

    //load tất cả các khách thuê
    public ResultSet Loadall() throws Exception {
        String sql = "select KHACH_THUE .*, Username from KHACH_THUE left join USER_KHACHTHUE on KHACH_THUE.MaKhach = USER_KHACHTHUE.MaKhach";
        rs = data.executeQuery(sql);
        return rs;
    }

    //Load khách thuê đặt phòng
    public ResultSet loadkhachthuedatphong() throws Exception {
        String sql = "select username, Tenkhach, email, phai, cmnd, quequan, nghenghiep, dienthoai  from USER_KHACHTHUE where Tinhtrang = 1";
        rs = data.executeQuery(sql);
        return rs;
    }

    //Tìm khách thuê theo tên
    public ResultSet TimKhachThueTheoTen(KhachThueEntity khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where TenKhach like N'%" + khachthue.getTenKhach() + "%'";
        rs = data.executeQuery(sql);
        return rs;
    }

    //Tìm khách thuê theo mã khách thuê
    public ResultSet TimKhachThueTheoMa(KhachThueEntity khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where MaKhach like N'%" + khachthue.getMaKhach() + "%'";
        rs = data.executeQuery(sql);
        return rs;
    }

    //Tìm khách thuê theo quê quán
    public ResultSet TimKhachThueTheoQueQuan(KhachThueEntity khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where QueQuan like N'%" + khachthue.getQuequan() + "%'";
        rs = data.executeQuery(sql);
        return rs;
    }

    //Tìm khách thuê theo nghề nghiệp
    public ResultSet TimKhachThueTheoNgheNghiep(KhachThueEntity khachthue) throws Exception {
        String sql = "select * from KHACH_THUE where NgheNghiep like N'%" + khachthue.getNgheNghiep() + "%'";
        rs = data.executeQuery(sql);
        return rs;
    }

    //thêm khách thuê không đặt phòng trước
    public int ThemKhachthue(KhachThueEntity khachthue) {
        int thamso = 7;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        giatri[2] = khachthue.getPhai();
        giatri[3] = khachthue.getCmnd();
        giatri[4] = khachthue.getQuequan();
        giatri[5] = khachthue.getNgheNghiep();
        giatri[6] = khachthue.getTaikhoan();
        return data.Update("{call ThemKhachThue(?,?,?,?,?,?,?)}", giatri, thamso);
    }

    //thêm khách thuê có đặt phòng trước
    public int ThemKhachThueDatPhong(KhachThueEntity khachthue) {
        int thamso = 7;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        giatri[2] = khachthue.getPhai();
        giatri[3] = khachthue.getCmnd();
        giatri[4] = khachthue.getQuequan();
        giatri[5] = khachthue.getNgheNghiep();
        giatri[6] = khachthue.getTaikhoan();
        return data.Update("{call ThemKhachThueDatPhong(?,?,?,?,?,?,?)}", giatri, thamso);
    }

    //Xóa khách thuê
    public int XoaKhach(KhachThueEntity khachthue) {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTaikhoan();

        return data.Update("{call XoaKhach(?,?)}", giatri, thamso);
    }

    //Sửa khách thuê
    public int SuaKhachthue(KhachThueEntity khachthue) {
        int thamso = 6;
        Object[] giatri = new Object[thamso];
        giatri[0] = khachthue.getMaKhach();
        giatri[1] = khachthue.getTenKhach();
        giatri[2] = khachthue.getPhai();
        giatri[3] = khachthue.getCmnd();
        giatri[4] = khachthue.getQuequan();
        giatri[5] = khachthue.getNgheNghiep();
        return data.Update("{call SuaKhachThue(?,?,?,?,?,?)}", giatri, thamso);
    }

}
