package Entity;


public class BangGiaPhongTroEntity 
{
    private int songuoi;
    private int giatien;
    
    public BangGiaPhongTroEntity()
    {
        songuoi = giatien = 0;
    }
    
    public BangGiaPhongTroEntity(int _songuoi, int _giatien)
    {
        giatien = _giatien;
        songuoi = _songuoi;
    }
    
    //Giá tiền
    public int getGiaTien()
    {
        return giatien;
    }
    
    public void setGiaTien(int _giatien)
    {
        giatien = _giatien;
    }
    
    //Số người
    public int getSoNguoi()
    {
        return songuoi;
    }
    
    public void setSoNguoi(int _songuoi)
    {
        songuoi = _songuoi;
    }
}
