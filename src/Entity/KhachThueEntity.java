package Entity;

public class KhachThueEntity 
{
    private String makhach;
    private String tenkhach;
    private String phai;
    private String cmnd;
    private String quequan;
    private String nghenghiep;
    private String taikhoan;
    private String matkhau;
    
    public KhachThueEntity()
    {
        makhach = tenkhach = cmnd = quequan = nghenghiep = phai= matkhau = taikhoan = "";
    }
    
    public KhachThueEntity(String _makhach, String _tenkhach, String _phai, String _cmnd, String _quequan, String _nghenghiep, String _taikhoan, String _matkhau)
    {
        makhach = _makhach;
        tenkhach = _tenkhach;
        phai = _phai;
        cmnd = _cmnd;
        quequan = _quequan;
        nghenghiep = _nghenghiep;
        taikhoan = _taikhoan;
        matkhau = _matkhau;
    }
    //Mã khách
    public String getMaKhach()
    {
        return makhach;
    }
    
    public void setMaKhach(String _makhach)
    {
        makhach = _makhach;
    }
    //Tên phái
    public String getTenKhach()
    {
        return tenkhach;
    }
    
    public void setTenKhach(String _tenkhach)
    {
        tenkhach = _tenkhach;
    }
    //Phái
    public String getPhai()
    {
        return phai;
    }
    
    public void setPhai(String _phai)
    {
        phai = _phai;
    }
    //CMND
    public String getCmnd()
    {
        return cmnd;
    }
    
    public void setCmnd(String _cmnd)
    {
        cmnd = _cmnd;
    }
    //Nghề nghiệp
    public String getNgheNghiep()
    {
        return nghenghiep;
    }
    
    public void setNghenghiep(String _Nghenghiep)
    {
        nghenghiep = _Nghenghiep;
    }
    //Quê quán
    public String getQuequan()
    {
        return quequan;
    }
    
    public void setQuequan(String _quequan)
    {
        quequan = _quequan;
    }
    
    //Mật khẩu
    public String getmatkhau()
    {
        return matkhau;
    }
    
    public void setmatkhau(String _matkhau)
    {
        matkhau = _matkhau;
    }
    
    //Tài khoản
    public String getTaikhoan()
    {
        return taikhoan;
    }
    
    public void setTaiKhoan(String _taikhoan)
    {
        taikhoan = _taikhoan;
    }    
}
