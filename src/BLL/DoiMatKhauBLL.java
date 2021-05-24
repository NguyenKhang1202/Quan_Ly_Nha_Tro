package BLL;
import DAL.DoiMatKhauDAL;
import Entity.DoiMatKhauEntity;
import java.sql.ResultSet;

public class DoiMatKhauBLL 
{
    DoiMatKhauDAL doimatkhau = new DoiMatKhauDAL();
    
    //Kiểm tra tồn tại của tài khoản
    public ResultSet KiemtraTaiKhoan(DoiMatKhauEntity doimatkhauEntity) throws Exception
    {
        return doimatkhau.KiemtraTaiKhoan(doimatkhauEntity);
    }
    
    //Đổi mật khẩu AMDIN
    public int DoiMatKhauADMIN(DoiMatKhauEntity doimatkhauEntity) throws Exception
    {
        return doimatkhau.DoiMatKhauADMIN(doimatkhauEntity);
    }
}
