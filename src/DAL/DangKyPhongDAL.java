package DAL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Entity.DangKyPhongEntity;

public class DangKyPhongDAL 
{    
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //Load các khách thuê chưa có phòng
    public ResultSet loadKhachThueChuaCoPhong() throws Exception
    {        
        String sql = "select Makhach, TenKhach, Phai, QueQuan, NgheNghiep from KHACH_THUE where MaKhach not in (select MaKhach from CT_KHACH_THUE)";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load các phòng chưa có khách vào combobox
    public ResultSet LoadPhongChuaCOKhach() throws Exception
    {
        String sql = "select MaPhong from PHONG_TRO where SoNguoi IS NULL";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load các phòng đã có khách vào combobox
    public ResultSet LoadPhongDaCoKhach() throws Exception
    {
        String sql = "select MaPhong from PHONG_TRO where SoNguoi IS NOT NULL";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load danh sách các khách
    public ResultSet loadChiTietKhachThue(DangKyPhongEntity dangkyphong) throws Exception
    {
        String sql = "select TenKhach, Phai, NgheNghiep, Convert(varchar,NgayVaoPhong,103) as NgayVaoPhong from CT_KHACH_THUE, KHACH_THUE where CT_KHACH_THUE.MaKhach = KHACH_THUE.MaKhach and MaPhong = '"+dangkyphong.getMaPhong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Thêm khách ở ghép
    public int ThemKhachOghep(DangKyPhongEntity dangkyphong) 
    {
        int thamso = 3;
        Object[] giatri = new Object[thamso];
        giatri[0] = dangkyphong.getMaKhach();
        giatri[1] = dangkyphong.getMaPhong();
        giatri[2] = dangkyphong.getNgayVaoPhong();
        
        return data.Update("{call ThemKhachThueVaooGhep(?,?,?)}", giatri, thamso);
    }
    
    //Thêm khách ở phòng mới
    public int ThemKhachThueVaoPhongMoi(DangKyPhongEntity dangkyphong) 
    {
        int thamso = 3;
        Object[] giatri = new Object[thamso];
        giatri[0] = dangkyphong.getMaKhach();
        giatri[1] = dangkyphong.getMaPhong();
        giatri[2] = dangkyphong.getNgayVaoPhong();
        
        return data.Update("{call ThemKhachThueVaoPhongMoi(?,?,?)}", giatri, thamso);
    }
    
    //Lấy danh sách các phòng còn chỗ trống cho khách mới ở ghép
    public ResultSet loadMaPhongOGhep() throws Exception
    {
        String sql = "select MaPhong from PHONG_TRO where MaPhong in (select MaPhong from CT_KHACH_THUE)";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách các phòng còn chỗ trống cho khách mới thuê
    public ResultSet LoadMaPhongMoi() throws Exception
    {
        String sql = "select MaPhong from PHONG_TRO where MaPhong not in (select MaPhong from CT_KHACH_THUE)";
        rs = data.executeQuery(sql);
        return rs;
    }
}
