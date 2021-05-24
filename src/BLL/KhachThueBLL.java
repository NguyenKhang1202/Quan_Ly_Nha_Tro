package BLL;
import DAL.KhachThueDAL;
import Entity.KhachThueEntity;
import java.sql.ResultSet;

public class KhachThueBLL 
{
    KhachThueDAL khachthue = new KhachThueDAL();
    
    public ResultSet LoadKhachThue() throws Exception
    {
        return khachthue.Loadall();
    }
    
    public ResultSet loadkhachthuedatphong() throws Exception
    {
        return khachthue.loadkhachthuedatphong();
    }

    
    //Thêm khách thuê không đặt phòng trước
    public int ThemKhachThue(KhachThueEntity khachthueEntity)
    {
        return khachthue.ThemKhachthue(khachthueEntity);
    }
    
    //Thêm khách thuê có đặt phòng trước
    public int ThemKhachThueDatPhong(KhachThueEntity khachthueEntity)
    {
        return khachthue.ThemKhachThueDatPhong(khachthueEntity);
    }
    
    public int SuaKhachThue(KhachThueEntity khachthueEntity)
    {
        return khachthue.SuaKhachthue(khachthueEntity);
    }
    
    public int XoaKhachThue(KhachThueEntity khachthueEntity)
    {
        return khachthue.XoaKhach(khachthueEntity);
    }
    
    public ResultSet TimKhachThueTheoTen(KhachThueEntity khachthueEntity) throws Exception
    {
        return khachthue.TimKhachThueTheoTen(khachthueEntity);
    }
    
    public ResultSet TimKhachThueTheoMa(KhachThueEntity khachthueEntity)throws Exception
    {
        return khachthue.TimKhachThueTheoMa(khachthueEntity);
    }
    
    public ResultSet TimKhachThueTheoNghe(KhachThueEntity khachthueEntity)throws Exception
    {
        return khachthue.TimKhachThueTheoNgheNghiep(khachthueEntity);
    }
    
    public ResultSet TimKhachThueTheoQueQuan(KhachThueEntity khachthueEntity)throws Exception
    {
        return khachthue.TimKhachThueTheoQueQuan(khachthueEntity);
    }
}
