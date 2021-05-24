package Entity;


public class DangNhapEntity 
{
    private String Username;
    private String Pwd;
    private int IsAdmin;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    public int getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(int IsAdmin) {
        this.IsAdmin = IsAdmin;
    }
}
