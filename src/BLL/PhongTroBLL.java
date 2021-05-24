package BLL;
import DAL.PhongTroDAL;
import Entity.KhachThueEntity;
import Entity.PhongTroEntity;
import java.sql.ResultSet;

public class PhongTroBLL 
{
    PhongTroDAL data = new PhongTroDAL();
    
    public ResultSet loadThongTinPhong() throws Exception
    {
        return data.LoadThongTinPhong();
    }
    
    public ResultSet LoadChiTietThuePhong(PhongTroEntity phongtro) throws Exception
    {
        return data.LoadChiTietThuePhong(phongtro);
    }
}
