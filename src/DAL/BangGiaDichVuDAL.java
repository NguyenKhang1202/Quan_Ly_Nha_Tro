package DAL;

import Entity.BangGiaPhongTroEntity;
import Entity.BangGiaDichVuEntity;
import java.sql.ResultSet;


public class BangGiaDichVuDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    public ResultSet LoadThongTinDichVu() throws Exception
    {        
        String sql = "SELECT MaDichVu, DichVu, PARSENAME(convert(varchar,convert(money,GiaDichVu),1),2 ) AS GIADICHVU, MaLoaiDichVu, QuyCach FROM DICH_VU";
        rs = data.executeQuery(sql);
        return rs;
    }
    public ResultSet loadMaLoaiDichVu() throws Exception
    {
        String sql = "select MaLoaiDichVu from LOAI_DICH_VU";
        rs = data.executeQuery(sql);
        return rs;
    }
    //Thêm dịch vụ mới vào bảng dịch vụ
    public int ThemDichVu(BangGiaDichVuEntity dichvu) 
    {
        int thamso = 5;
        Object[] giatri = new Object[thamso];
        giatri[0] = dichvu.getMadichvu();
        giatri[1] = dichvu.getTendichvu();
        giatri[2] = dichvu.getGiatien();
        giatri[3] = dichvu.getMaloaidichvu();
        giatri[4] = dichvu.getQuycach();
        
        return data.Update("{call ThemDichVu(?,?,?,?,?)}", giatri, thamso);
    }
    
    public int SuaDichVu(BangGiaDichVuEntity dichvu) 
    {
        int thamso = 5;
        Object[] giatri = new Object[thamso];
        giatri[0] = dichvu.getMadichvu();
        giatri[1] = dichvu.getTendichvu();
        giatri[2] = dichvu.getGiatien();
        giatri[3] = dichvu.getMaloaidichvu();
        giatri[4] = dichvu.getQuycach();
        
        return data.Update("{call SuaDichVu(?,?,?,?,?)}", giatri, thamso);
    }
    public int XoaDichVu(BangGiaDichVuEntity dichvu) 
    {
        int thamso = 1;
        Object[] giatri = new Object[thamso];
        giatri[0] = dichvu.getMadichvu();

        return data.Update("{call XoaDichVu(?)}", giatri, thamso);
    }
}
