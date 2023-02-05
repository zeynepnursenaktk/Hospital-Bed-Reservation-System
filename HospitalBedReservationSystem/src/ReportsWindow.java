
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Zeynep Nursena
 */
public class ReportsWindow {
    
    public JFrame frame;
    
    public ReportsWindow() {
        initialize();
    }
    
    private void initialize() {
        frame = new JFrame("MALE/FEMALE PATIENT RATIO BY GRAPH");                //Jframe oluşturum set metotları ile ayarlamalarını yaptım.
        frame.setBounds(100, 100, 600, 600);
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                    //EXIT yapmasaydım frame de çarpı işaretine basıldığında frame kapanmayacaktı.
        frame.getContentPane().setLayout(null);
        
        JLabel lblRoomCount = new JLabel("Bed Count:");                          //Beş adet label oluşturup font ayarlamalarını yaptım. Daha sonra add ile frame e ekledim.
        lblRoomCount.setForeground(new Color(35, 119, 166));
        lblRoomCount.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        lblRoomCount.setBounds(190, 11, 414, 32);
        frame.getContentPane().add(lblRoomCount);
        
        JLabel lblPatientCount = new JLabel("Patient Count:");
        lblPatientCount.setForeground(new Color(35, 119, 166));
        
        lblPatientCount.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        lblPatientCount.setBounds(190, 54, 414, 32);
        frame.getContentPane().add(lblPatientCount);
        
        JLabel lblReservationCount = new JLabel("Reservation Count:");
        lblReservationCount.setForeground(new Color(35, 119, 166));
        lblReservationCount.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        lblReservationCount.setBounds(190, 97, 414, 32);
        frame.getContentPane().add(lblReservationCount);
        
        JLabel lblTotalIncome = new JLabel("Total Income:");
        lblTotalIncome.setForeground(new Color(35, 119, 166));
        lblTotalIncome.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        lblTotalIncome.setBounds(190, 140, 414, 32);
        frame.getContentPane().add(lblTotalIncome);

        
        JPopupMenu popUp = new JPopupMenu();                                      //PopUp menümü oluşturup itemler ile menuye seçenekler ekledim.
        JMenuItem main = new JMenuItem("Back To Main Menu");
        JMenuItem exit = new JMenuItem("Exit");
         
        frame.addMouseListener(new MouseAdapter() {    
            @Override
            public void mouseClicked(MouseEvent e) {
                popUp.show(frame, e.getX(), e.getY());
            }
        });
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                         //exit popUp ı için frame i kapamasını söyledim bu dispose ile sağlanır.
                frame.dispose();   
            }
        });
        
        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();                                                 //mainMenuye geçiş popUp ı içinde MainWindowdan main oluşturup görünür yaptım.
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(true);
            }
        });
        popUp.add(main);                                                         //popUplara bu itemleri add ile ekledim.
        popUp.add(exit);
        frame.add(popUp);                                                        //ve bu popUpın frame üzerinde olması için frame de add ile ekledim.
        
        PieChart panelGraph = new PieChart();                                    //Yazdığım grafik sınıfından panelGraph adında panel oluşturdum.
        
        panelGraph.setBounds(150, 220, 300, 300);                                //Boyut ayarlamalarını yapıp görünürlüğü true olarak ayarladım.
        frame.getContentPane().add(panelGraph);
        frame.setLocationByPlatform(true);
        panelGraph.setVisible(true);
        panelGraph.repaint();                                                    //repaintle de bilgiler eklendikçe grafiğin güncellenmesini sağladım.
        
        lblRoomCount.setText("Bed Count: " + Database.GetString("SELECT COUNT(*) FROM Bed"));                     //Database de oluşturduğum getString metoduyla da ilgili labellere
                                                                                                                  //ilgili bilgileri databaseden çekerek ekrana yazdırdım.
        lblPatientCount.setText("Patient Count: " + Database.GetString("SELECT COUNT(*) FROM Patient"));
        lblReservationCount.setText("Reservation Count: " + Database.GetString("SELECT COUNT(*) FROM Payment"));
        lblTotalIncome.setText("Total Income: " + Database.GetString("SELECT SUM(total) FROM Payment"));
    }
    
}
