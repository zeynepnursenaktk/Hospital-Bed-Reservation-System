
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Database {

    static Connection con = null;

    public static void Initialize() {
        String driver = "com.mysql.cj.jdbc.Driver";

        String connection = "jdbc:mysql://localhost/hospitalbedreservationsystem";

        String user = "root";
        String password = "";

        try {
            Class.forName(driver);                                                  //Sürücü sınıfını ekledim.
            con = DriverManager.getConnection(connection, user, password);          //database ile bağlantı sağladım.
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void RunCommand(String sql) { 
        Statement statement;
        try {
            statement = con.createStatement();
            statement.executeUpdate(sql);                                          //Veri ekleme, veri güncelleme ve veri silme işlemi sonrası eklenen,
                                                                                   //güncellenen veya silinen kayıt sayısı bilgisi için executeUpdate metodunu kullandım.

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occured, please check your input.");
            e.printStackTrace();
        }
    }

    public static boolean Login(String username, String password) {
        boolean result = false;
        Statement stmt;
        try {
            stmt = con.createStatement();                                          //database'e sql komutlarını göndermek için createStatement kullandım.
            ResultSet rs;                                                          //veri çekme işlemi sonrasında veri listelemek için ResultSet sınıfı kullanılır.
            rs = stmt.executeQuery("SELECT * FROM User WHERE username='" + username + "' AND password='" + password + "'"); //Doğrudan veri çekme(SELECT) veya veri listeme işlemi için kullanılır.
            if (rs.next()) {                                                       //verileri dolaşıyor eğer sonraki satırda veri yoksa false döndürüyor, varsa true döndürüyor.
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
 



    public static ArrayList<String> GetData(String sql) {                         //Databaseden alınan dataların  arrayliste alınması için oluşturduğum metot.
        ArrayList<String> data = new ArrayList<String>();                         //String tipinde veri alan ArrayList oluşturdum.
        Statement stmt;                                    
        try {
            stmt = con.createStatement();                                         //database'e sql komutlarını göndermek için createStatement kullandım.
            ResultSet rs;                                                         //veri çekme işlemi sonrasında veri listelemek için ResultSet sınıfı kullanılır.
            rs = stmt.executeQuery(sql);                                          //Doğrudan veri çekme(SELECT) veya veri listeme işlemi için kullanılır.
            while (rs.next()) {                                                   //while döngüm rs de veri kalmayana kadar devam ediyor     
                data.add(rs.getString(1));                                        //bunları da data adlı arrayliste ekliyor.(1=sütun indeksi)
            }                                                                     //getString() metodu geçerli satırın belirtilen sütun indeksinin verilerini String olarak döndürmek için kullanılır.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String GetString(String sql) {
        String data = "";
        Statement stmt;
        try {
            stmt = con.createStatement();                                          //database'e sql komutlarını göndermek için createStatement kullandım.
            ResultSet rs;                                                          //veri çekme işlemi sonrasında veri listelemek için ResultSet sınıfı kullanılır.
            rs = stmt.executeQuery(sql);                                           //Doğrudan veri çekme(SELECT) veya veri listeme işlemi için kullanılır.
            if (rs.next()) {                                                       //eğer rs de veri varsa if bloğu çalışır yoksa çalışmaz
                data = (rs.getString(1));                                          //geçerli satırın belirtilen sütun indeksinin verilerini String olarak döndürmek için kullanılır.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void ShowTable(String command, String[] columns, JTable table, int colCount) {
        DefaultTableModel model = new DefaultTableModel(null, columns);            
        table.setModel(model);                                                     //JTable ı kullanabilmek için defaultModele set ettim.
        Statement stmt;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);
            while (rs.next()) {                                                    //while döngüm rs de veri kalmayana kadar devam ediyor     
                String[] data = new String[colCount];                              //String tipinde veri alan data adında array oluşturdum. sütun sayım kadar veri alabiliyor.
                for (int i = 1; i <= colCount; i++) {                              //for döngümle sütun sayısı kadar dönüp
                    data[i - 1] = rs.getString(i);                                 //datamın i-1.indeksine (i yi 1 verdiğim için i-1 dedim.) rs.getStringini yazdırıyorum.
                }
                model.addRow(data);                                                //bu tableımın satırlarına da data arrayimdeki verileri ekliyorum. 
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
