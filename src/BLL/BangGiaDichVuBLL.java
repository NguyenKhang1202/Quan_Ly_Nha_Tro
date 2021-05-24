package BLL;

import DAL.BangGiaDichVuDAL;
import Entity.BangGiaDichVuEntity;
import java.sql.ResultSet;

public class BangGiaDichVuBLL 
{
     BangGiaDichVuDAL data = new BangGiaDichVuDAL();
    
    public ResultSet LoadThongTinDichVu() throws Exception
    {
        return data.LoadThongTinDichVu();
    }
    
    public int ThemDichVu(BangGiaDichVuEntity dichvu) throws Exception
    {
        return data.ThemDichVu(dichvu);
    }
    
    public int SuaDichVu(BangGiaDichVuEntity dichvu) throws Exception
    {
        return data.SuaDichVu(dichvu);
    }
    public ResultSet loadMaLoaiDichVu() throws Exception
    {
        return data.loadMaLoaiDichVu();
    }
     public int XoaDichVu(BangGiaDichVuEntity dichvu) throws Exception
    {
        return data.XoaDichVu(dichvu);
    }
}
