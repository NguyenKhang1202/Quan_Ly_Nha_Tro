package BLL;
import DAL.ThongKeDAL;
import Entity.ThongKeEntity;
import java.sql.ResultSet;

public class ThongKeBLL 
{
    ThongKeDAL khachthue = new ThongKeDAL();
    
    public ResultSet loadthang() throws Exception
    {
        return khachthue.loadthang();
    }
    
    public ResultSet loadHDTheothang(ThongKeEntity thongke) throws Exception
    {
        return khachthue.loadHDtheoThang(thongke);
    }
    
    //Load tiền phòng theo mã
    public ResultSet loadTienPhongTheoMa(ThongKeEntity thongke) throws Exception
    {
        return khachthue.loadTienPhongTheoMa(thongke);
    }
    
    //Load tiền dịch vụ theo mã
    public ResultSet loadTienDichVuTheoMa(ThongKeEntity thongke) throws Exception
    {
        return khachthue.loadTienDichVuTheoMa(thongke);
    }
    
    //Tổng tiền
    public ResultSet TongTien() throws Exception
    {
        return khachthue.TongTien();
    }
    
    //Tổng tiền theo tháng
    public ResultSet TongTienTheoThang(ThongKeEntity thongke) throws Exception
    {
        return khachthue.TongTienTheoThang(thongke);
    }
    
    //Tổng tiền theo tháng của phòng
    public ResultSet TongTienTheoThangCuaPhong(ThongKeEntity thongke) throws Exception
    {
        return khachthue.TongTienTheoThangCuaPhong(thongke);
    }
}
