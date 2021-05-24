package DAL;
import java.sql.ResultSet;
import Entity.DoiMatKhauEntity;

public class DoiMatKhauDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //kiểm tra sự tồn tại của tài khoản
    public ResultSet KiemtraTaiKhoan(DoiMatKhauEntity doimatkhauEntity) throws Exception
    {        
        String sql = "select * from USER_KHACHTHUE where Username = '"+doimatkhauEntity.getTaikhoan()+"' and pwd = '"+doimatkhauEntity.getMatkhau()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //đổi mật khẩu cho admin
    public int DoiMatKhauADMIN(DoiMatKhauEntity doimatkhau) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = doimatkhau.getTaikhoan();
        giatri[1] = doimatkhau.getMatkhaumoi();
        
        return data.Update("{call DoiMatKhauADMIN(?,?)}", giatri, thamso);
    }
}
