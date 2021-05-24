package BLL;
import DAL.DangKyPhongDAL;
import Entity.DangKyPhongEntity;
import java.sql.ResultSet;

public class DangKyPhongBLL 
{
    DangKyPhongDAL data = new DangKyPhongDAL();
    
    public ResultSet loadKhachThueChuaCoPhong() throws Exception
    {
        return data.loadKhachThueChuaCoPhong();
    }
    
    public ResultSet LoadPhongChuaCOKhach() throws Exception
    {
        return data.LoadPhongChuaCOKhach();
    }
    
    public ResultSet LoadPhongDaCoKhach() throws Exception
    {
        return data.LoadPhongDaCoKhach();
    }
    
    public ResultSet loadChiTietKhachThue(DangKyPhongEntity dangKyPhong) throws Exception
    {
        return data.loadChiTietKhachThue(dangKyPhong);
    }
    
    //Thêm khách ở ghép
    public int ThemKhachOghep(DangKyPhongEntity dangKyPhong) throws Exception
    {
        return data.ThemKhachOghep(dangKyPhong);
    }
    
    //Thêm khách ở phòng mới
    public int ThemKhachThueVaoPhongMoi(DangKyPhongEntity dangKyPhong) throws Exception
    {
        return data.ThemKhachThueVaoPhongMoi(dangKyPhong);
    }
    
    //Load danh sách phòng có thể ở ghép
    public ResultSet loadMaPhongOGhep() throws Exception
    {
        return data.loadMaPhongOGhep();
    }
    
    //Load danh sách phòng có thể thuê mới
    public ResultSet LoadMaPhongMoi() throws Exception
    {
        return data.LoadMaPhongMoi();
    }
}
