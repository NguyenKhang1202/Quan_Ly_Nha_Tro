package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

// thực hiện connect và đóng gói tất cả vào trong hàm này 
// khi cần dùng truy vấn chỉ cần gọi đối tượng và 
public class DBAccess {
    
    Connection conn ;
    String hostname="";
    String dbname="";
    String username="";
    String password="";
    Statement statement = null;
    ResultSet result = null;

    public DBAccess() 
    {
        conn = null;
        dbname = "QUANLYPHONGTRO";
        username = "sa";
        password = "123";
    }

    //Phương thức lấy chuỗi kết nối
    public Connection getConnection() 
    {
        //Kiểm tra driver
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        //get connection
        try 
        {
            conn = DriverManager.getConnection("jdbc:sqlserver://"+hostname+":1433;"+"databaseName="+dbname, username, password);
        } catch (SQLException ex) 
        {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public Connection getConnection(String _hostname,String _dbname,String _username,String _password) {

        //Kiểm tra driver
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Lấy connection
        try 
        {
            conn = DriverManager.getConnection("jdbc:sqlserver://"+_hostname+":1433;"+"databaseName="+_dbname, _username, _password);
        } catch (SQLException ex) 
        {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    //close connection
    public void Close() 
    {
        if (conn != null) 
        {
            try {
                if (!conn.isClosed()) 
                {
                    conn.close();
                }
            } catch (SQLException ex) 
            {
                Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conn = null;
    }
    
    //Load dữ liệu không có tham số truyền vào
    public ResultSet LayDuLieu(String procName) 
    {
        ResultSet result = null;
        Connection con = getConnection();
        if(con != null) 
        {
            try 
            {
                CallableStatement cstm = null;
                cstm = con.prepareCall(procName);
                result = cstm.executeQuery();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    //Load dữ liệu có tham số truyền vào (tìm kiếm) -  Sử dụng procedure
    public ResultSet LayDuLieu(String procName, Object[] giatri, int thamso) 
    {
        Connection con = getConnection();
        if(con != null) 
        {
            try 
            {
                CallableStatement cstm = null;
                cstm = con.prepareCall(procName);
                for (int i = 1; i <= thamso; i++) 
                {
                    cstm.setObject(i, giatri[i-1]);
                }
                result = cstm.executeQuery();
            } catch (SQLException ex) 
            {
                Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    //Hàm update tổng quát(thêm - xóa - sửa) -  Sử dụng procedure
    public int Update(String procName, Object[] giatri, int thamso) 
    {
        Connection con = getConnection();
        int kq = 0;
        if (con != null) 
        {
            try {
                CallableStatement cstm = con.prepareCall(procName);
                for (int i = 1; i <= thamso; i++) 
                {
                    cstm.setObject(i, giatri[i-1]);
                }
                kq = cstm.executeUpdate();
            } catch (SQLException ex) 
            {
                Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
                System.out.printf("loi tai update: "+ex.getMessage());
            }
        }
        return kq;
    }
    
    //Tạo Statement để thực thi Query
    public Statement getStatement() throws SQLException 
    {
        //Kiểm tra Statement nếu =null hoặc đã đóng
        if(this.statement==null? true:this.statement.isClosed())
        {
            //khởi tạo 1 statement mới
            this.statement=this.getConnection().createStatement();
        }
        //trả statement ra ngoài
        return this.statement;
    }
    
    //Hàm thực thi câu lệnh select lấy dữ liệu từ CSDL
    public ResultSet executeQuery(String Query)throws Exception
    {
        try
        {
            this.result=getStatement().executeQuery(Query);
        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
        return this.result;
    }
    
    //Các phương thức getter và setter
    public void setHostName(String hostname) 
    {
        this.hostname = hostname;
    }

    public void setDbName(String dbname) 
    {
        this.dbname = dbname;
    }

    public void setUserName(String usename) 
    {
        this.username = usename;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
}
