package BLL;
import DAL.DangNhapDAL;
import Entity.DangNhapEntity;
import java.sql.ResultSet;
// controller 
public class DangNhapBLL 
{
    DangNhapDAL dangnhap = new DangNhapDAL();
    
    public ResultSet KiemtraTaiKhoan(DangNhapEntity dangnhapentity) throws Exception
    {
        return dangnhap.KiemtraTaiKhoan(dangnhapentity);
    }
}
