package DAL;
import Entity.BangGiaPhongTroEntity;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Entity.PhongTroEntity;

public class BangGiaPhongTroDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadThongTinGiaThue() throws Exception
    {        
        String sql = "select SoNguoi, PARSENAME(convert(varchar,convert(money,GiaTien),1),2 ) as giatien from GIA_THUE";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Thêm phòng mới vào bảng giá phòng
    public int ThemPhong(BangGiaPhongTroEntity banggia) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = banggia.getSoNguoi();
        giatri[1] = banggia.getGiaTien();
        
        return data.Update("{call ThemPhong(?,?)}", giatri, thamso);
    }
    
    public int SuaPhong(BangGiaPhongTroEntity banggia) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = banggia.getSoNguoi();
        giatri[1] = banggia.getGiaTien();
        
        return data.Update("{call SuaPhong(?,?)}", giatri, thamso);
    }
}
