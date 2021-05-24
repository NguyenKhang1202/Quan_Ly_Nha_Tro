package Entity;

public class PhongTroEntity 
{
    private String maphong;
    private String trangthai;
    private String thongtinphong;
    private int songuoi;
    private String ngayvaophong;
    
    public PhongTroEntity()
    {
        maphong = trangthai = thongtinphong = ngayvaophong="";
        songuoi = 0;
    }
    
    public PhongTroEntity(String _maphong, String _trangthai, String _thongtinphong, int _songuoi, String _ngayvaophong)
    {
        maphong = _maphong;
        trangthai = _trangthai;
        thongtinphong = _thongtinphong;
        songuoi = _songuoi;
        ngayvaophong = _ngayvaophong;
    }
    
    //mã phòng
    public String getMaPhong()
    {
        return maphong;
    }
    
    public void setMaPhong(String _maphong)
    {
        maphong = _maphong;
    }
    
    //trạng thái phòng
    public String getTrangThai()
    {
        return trangthai;
    }
    
    public void setTrangThai(String _trangthai)
    {
        trangthai = _trangthai;
    }
    
    //Thông tin phòng
    public String getThongTinPhong()
    {
        return thongtinphong;
    }
    
    public void setThongTinPhong(String _Thongtinphong)
    {
        thongtinphong = _Thongtinphong;
    }
    
    //số người
    public int getsonguoi()
    {
        return songuoi;
    }
    
    public void setThongTinPhong(int _songuoi)
    {
        songuoi = _songuoi;
    }
    
    // ngày vào phòng
    public String getngayvaophong()
    {
        return ngayvaophong;
    }
    
    public void setNgayvaophong(String _ngayvaophong)
    {
        ngayvaophong = _ngayvaophong;
    }
}
