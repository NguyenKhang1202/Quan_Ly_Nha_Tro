package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Entity.PhongTroEntity;

public class PhongTroDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //load thông tin các phòng
    public ResultSet LoadThongTinPhong() throws Exception
    {        
        String sql = "select MaPhong, (case when TrangThai = '1' THEN N'Phòng đã thuê' else N'Phòng còn trống' end) as TrangThai, ThongTinPhong, (case when SoNguoi IS NULL THEN 0 else SoNguoi end) as SoNguoi from PHONG_TRO";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //load chi tiết khách thuê phòng
    public ResultSet LoadChiTietThuePhong(PhongTroEntity phongtro) throws Exception
    {        
        String sql = "select PHONG_TRO.MaPhong, CT_KHACH_THUE.MaKhach, TenKhach, Phai, NgheNghiep, NgayVaoPhong from PHONG_TRO, CT_KHACH_THUE, KHACH_THUE where PHONG_TRO.MaPhong = CT_KHACH_THUE.MaPhong and	CT_KHACH_THUE.MaKhach = KHACH_THUE.MaKhach and PHONG_TRO.MaPhong = '"+phongtro.getMaPhong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
}
