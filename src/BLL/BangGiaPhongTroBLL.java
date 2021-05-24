package BLL;

import DAL.BangGiaPhongTroDAL;
import Entity.BangGiaPhongTroEntity;
import java.sql.ResultSet;

public class BangGiaPhongTroBLL 
{
    BangGiaPhongTroDAL data = new BangGiaPhongTroDAL();
    
    public ResultSet LoadThongTinGiaThue() throws Exception
    {
        return data.LoadThongTinGiaThue();
    }
    
    public int ThemPhong(BangGiaPhongTroEntity banggia) throws Exception
    {
        return data.ThemPhong(banggia);
    }
    
    public int SuaPhong(BangGiaPhongTroEntity banggia) throws Exception
    {
        return data.SuaPhong(banggia);
    }
}
