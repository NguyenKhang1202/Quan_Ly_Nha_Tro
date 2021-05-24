package DAL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Entity.KhachThueEntity;
import Entity.ThongKeEntity;

public class ThongKeDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //Load tháng/năm
    public ResultSet loadthang() throws Exception
    {        
        String sql = "select RIGHT(CONVERT(varchar(10), ngaylap, 103),7) as thang from HOA_DON group by RIGHT(CONVERT(varchar(10), ngaylap, 103),7)";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load hóa đơn theo tháng/năm
    public ResultSet loadHDtheoThang(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select MaHoaDon, CONVERT(varchar(10), NgayLap, 103) as ngaylap, MaPhong from HOA_DON where RIGHT(CONVERT(varchar(10), ngaylap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongke.getNgaylap()+"', 103),7)";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load tiền phòng theo mã phòng
    public ResultSet loadTienPhongTheoMa(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select MaPhong, PARSENAME(convert(varchar,convert(money,GiaTien),1),2 ) as giatien from GIA_THUE, PHONG_TRO where GIA_THUE.SoNguoi = PHONG_TRO.SoNguoi and MaPhong = '"+thongke.getMaphong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load tiền dịch vụ theo mã phòng
    public ResultSet loadTienDichVuTheoMa(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select MaPhong, HOA_DON.MaHoaDon, DichVu,  PARSENAME(convert(varchar,convert(money,DonViSuDung*GiaDichVu),1),2 ) as giatien from CT_DICHVU, DICH_VU, HOA_DON where CT_DICHVU.MaDichVu = DICH_VU.MaDichVu and HOA_DON.MaHoaDon = CT_DICHVU.MaHoaDon and MaPhong = '"+thongke.getMaphong()+"' and RIGHT(CONVERT(varchar(10), NgayLap, 103),7) =  RIGHT(CONVERT(varchar(10),  '"+thongke.getNgaylap()+"', 103),7)";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy tổng trị giá tiền
    public ResultSet TongTien() throws Exception
    {        
        return data.LayDuLieu("{call TinhTien}");
    }
    
    //Lấy tổng doanh thu theo tháng
    public ResultSet TongTienTheoThang(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select  PARSENAME(convert(varchar,convert(money, sum(tinhtienphong.giatien+ tinhtiendichvu.giatien)),1),2 ) as giatien from tinhtienphong, tinhtiendichvu where tinhtienphong.maphong = tinhtiendichvu.maphong and RIGHT(CONVERT(varchar(10), tinhtiendichvu.NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongke.getNgaylap()+"', 103),7) and RIGHT(CONVERT(varchar(10), tinhtienphong.NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongke.getNgaylap()+"', 103),7) group by tinhtienphong.ngaylap ";
        rs = data.executeQuery(sql);
        return rs;
    }

    public ResultSet TongTienTheoThangCuaPhong(ThongKeEntity thongke) throws Exception
    {        
        
        String sql = "select PARSENAME(convert(varchar,convert(money,((sum(GiaDichVu*DonViSuDung))+GIA_THUE.GiaTien)),1),2 ) as giatien from CT_DICHVU, DICH_VU, HOA_DON, PHONG_TRO, GIA_THUE where CT_DICHVU.MaDichVu = DICH_VU.MaDichVu and CT_DICHVU.MaHoaDon = HOA_DON.MaHoaDon and GIA_THUE.SoNguoi = PHONG_TRO.SoNguoi and PHONG_TRO.MaPhong = HOA_DON.MaPhong and PHONG_TRO.MaPhong = '"+thongke.getMaphong()+"' and RIGHT(CONVERT(varchar(10), NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongke.getNgaylap()+"', 103),7) group by HOA_DON.MaHoaDon, ngaylap, HOA_DON.MaPhong, PHONG_TRO.SoNguoi, GIA_THUE.GiaTien";
        rs = data.executeQuery(sql);
        return rs;
    }
}
