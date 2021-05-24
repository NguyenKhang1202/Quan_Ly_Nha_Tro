package DAL;
import Entity.HoaDonDichVuEntity;
import java.sql.ResultSet;


public class HoaDonDichVuDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //load dữ liệu dịch vụ vào table
    public ResultSet loadDichVu() throws Exception
    {        
        String sql = "select DichVu from DICH_VU";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load dịch vụ theo mã khi click vào từng hàng trên table sẽ xuất ra tương ứng vào các textfiled
    public ResultSet loadDichVuTheoMa(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select MaDichVu, DichVu,PARSENAME(convert(varchar,convert(money,GiaDichVu),1),2 ) as GiaDichVu, QuyCach from DICH_VU where DichVu =  N'"+hoadondichvu.getDichvu()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách các phòng đang thuê và chưa có hóa đơn của ngày (tháng) hiện tại
    public ResultSet loadPhongChuaCoHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select maphong from PHONG_TRO where MaPhong in(select MaPhong from CT_KHACH_THUE) and MaPhong not in (select MaPhong from HOA_DON where right(convert(varchar(10),  NgayLap,103),7) = right(convert(varchar(10),  '"+hoadondichvu.getNgaylaphoadon()+"',103),7))";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách các phòng đang thuê và ĐÃ có hóa đơn của ngày (tháng) hiện tại()
    public ResultSet loadPhongDaCoHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select maphong from PHONG_TRO where MaPhong in(	select MaPhong from CT_KHACH_THUE) and MaPhong in (select MaPhong from HOA_DON where right(convert(varchar(10),  NgayLap,103),7) = right(convert(varchar(10), '"+hoadondichvu.getNgaylaphoadon()+"',103),7))";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách chi tiết dịch vụ của phòng đã sử dụng trong tháng khi click vào phóng đã có hóa đơn
    public ResultSet loadCT_dichvu(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select HOA_DON.MaHoaDon, right(convert(varchar(10),  NgayLap,103),7) as ngaylap, MaPhong, CT_DICHVU.MaDichVu, PARSENAME(convert(varchar,convert(money,DonViSuDung*GiaDichVu),1),2 ) as chiphi from HOA_DON, CT_DICHVU, DICH_VU where HOA_DON.MaHoaDon = CT_DICHVU.MaHoaDon and DICH_VU.MaDichVu = CT_DICHVU.MaDichVu and right(convert(varchar(10),  NgayLap,103),7) = right(convert(varchar(10),  '"+hoadondichvu.getNgaylaphoadon()+"',103),7) and MaPhong = '"+hoadondichvu.getMaphong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Thêm mới 1 hóa đơn
    public int ThemHoaDon(HoaDonDichVuEntity hoadondichvu) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = hoadondichvu.getMaphong();
        giatri[1] = hoadondichvu.getNgaylaphoadon();
        
        return data.Update("{call ThemHoaDon(?,?)}", giatri, thamso);
    }
    
    //Thêm mới chi tiết sử dụng dịch vụ
    public int ThemChiTietDichVu(HoaDonDichVuEntity hoadondichvu) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = hoadondichvu.getMadichvu();
        giatri[1] = hoadondichvu.getDonvisudung();
        
        return data.Update("{call ThemChiTietDichVu(?,?)}", giatri, thamso);
    }
    
    //Xóa hóa đơn theo mã
    public int XoaHoaDon(HoaDonDichVuEntity hoadondichvu) 
    {
        int thamso = 1;
        Object[] giatri = new Object[thamso];
        giatri[0] = hoadondichvu.getMahoadon();
        
        return data.Update("{call XoaHoaDon(?)}", giatri, thamso);
    }
}
