package GUI;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class loadTable
{
    public void loadJtable(ResultSet rs, JTable Tablename)
    {
        try 
            {            
                DefaultTableModel tableModel = new DefaultTableModel();//Tạo một model table là DefaultTableModel
                ResultSet result = rs;// Tạo biến resultSet 
                ResultSetMetaData metadata = result.getMetaData();
                int columnCount = metadata.getColumnCount();//Tạo biến int để đếm số cột
                ArrayList<String> arrayColumns = new ArrayList<String>();//Tạo mảng để chứ tên cột
                for (int i = 1; i <= columnCount; i++) 
                {
                    arrayColumns.add(metadata.getColumnName(i));//Add lần lượt tên cột vào Jtable
                }
                //Set title cho mỗi cột
                tableModel.setColumnIdentifiers(arrayColumns.toArray());//Tạo một mảng kiểu object để lưu trữ từng dòng dữ liệu
                
                ArrayList<Object> arrayRow = new ArrayList<Object>();
                while(result.next()) //Duyệt từng dòng trong ResultSet
                {                
                    for (int i = 1; i <= columnCount; i++) 
                    {
                        arrayRow.add((result.getObject(i)));//Add dữ liệu vào mảng ArrayList<Object>
                    }
                    tableModel.addRow(arrayRow.toArray());//Add 1 dòng dữ liệu vào DefaultTableModel
                    arrayRow.clear();//Clear mảng ArrayList<Object>
                }
                //SetModel cho table
                Tablename.setModel(tableModel);
                result.close();//Đóng ResultSet
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(frmKhachThue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //hàm load dữ liệu vào combobox: bao gồm 3 giá trị: resultSet, tên combobox, tên cột cần lấy giá trị
    public void loadJcombobox(ResultSet _rs, JComboBox cbb, String tencot) throws SQLException
    {
        ResultSet rs =_rs;//Khởi tạo 1 biến resultSet
        cbb.removeAllItems();
            while (rs.next())//Chạy từng hàng trong resultSet
            {                
                cbb.addItem(rs.getString(tencot));//Add từng hàng vào combobox
            }
    }
}

