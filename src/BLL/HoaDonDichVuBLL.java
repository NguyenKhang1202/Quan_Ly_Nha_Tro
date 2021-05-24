package BLL;
import DAL.HoaDonDichVuDAL;
import Entity.HoaDonDichVuEntity;
import java.sql.ResultSet;

public class HoaDonDichVuBLL 
{
    HoaDonDichVuDAL hoadon = new HoaDonDichVuDAL();
    public ResultSet loadDichVu() throws Exception
    {
        return hoadon.loadDichVu();
    }
    
    public ResultSet loadDichVuTheoMa(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.loadDichVuTheoMa(hoadondichvu);
    }
    
    public ResultSet loadPhongChuaCoHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.loadPhongChuaCoHoaDon(hoadondichvu);
    }
    
    public ResultSet loadPhongDaCoHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.loadPhongDaCoHoaDon(hoadondichvu);
    }
    
    public ResultSet loadCT_dichvu(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.loadCT_dichvu(hoadondichvu);
    }
    
    public int ThemHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.ThemHoaDon(hoadondichvu);
    }
    
    public int ThemChiTietDichVu(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.ThemChiTietDichVu(hoadondichvu);
    }
    
    public int XoaHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {
        return hoadon.XoaHoaDon(hoadondichvu);
    }
}
