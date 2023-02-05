
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Zeynep Nursena
 */
public class PieChart extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        g = (Graphics2D) g;
        super.paintComponent(g);

        int maleCount = Integer.parseInt(Database.GetString("SELECT COUNT(*) FROM Patient WHERE Gender='Male'"));        //Databaseden cinsiyeti male olanlar çekilir.
        int femaleCount = Integer.parseInt(Database.GetString("SELECT COUNT(*) FROM Patient WHERE Gender='Female'"));    //Databaseden cinsiyeti female olanlar çekilir.
                                                                                                                         //Oranların veri tipini float olarak verdim.
        float maleRatio = maleCount * 100 / (maleCount + femaleCount);                                                   //oran hesaplama işlemi yapılır. erkek hastaların sayısı * 100 / bütün hastaların toplamı
        float femaleRatio = femaleCount * 100 / (maleCount + femaleCount);                                               //üstteki hesabın aynısını kadınlar için de yapılır.

        Rectangle area = this.getVisibleRect();                                                                          //Dikdörtgen bir alanı görünür yapıyoruz.                    

        float total = maleRatio + femaleRatio;                                                                           //totali kadın ve erkek oranını toplayarak buluyoruz
        int startAngle = 0;                                                                                              //başlangıç açısını 0 verdim
        float curValue = 0;                                                                                              //mevcut açı değerine de 0 verdim

        startAngle = (int) (curValue * 360 / total);                                                                     //başlangıç açısını daire grafiği üzerinde gösterebilmek için derecesini ayarlamamız gerekiyor.
                                                                                                                         //çemberin merkezi 360 derecelik yayı gördüğü için mevcut açı değerini 360 ile çarpıp totale bölersek
                                                                                                                         //grafik üzerindeki açı değerini buluyoruz.
        int arc = (int) (maleRatio * 360 / total);                                                                       //in tipinde yay tanımladım. ve buna erkek oranımı 360 ile çarpıp totale bölüp inte cast ederek buluyoruz.

        g.setColor(Color.blue);                                                                                          //rengi mavi olarak ayarlıyoruz ve bu erkek oranını belli ediyor.
        g.fillArc(area.x, area.y, area.width, area.height, startAngle, arc);                                             //yayın bu parametlere göre maviye boyanır.

        curValue += maleRatio;                                                                                           //artık mevcut açı değerim erkek oranına eşit.
        startAngle = (int) (curValue * 360 / total);                                                                     //aynı işlemleri kadın oranı için yapılır. 
                                                                                                                         //ve bu sefer renk pembe olarak ayarlanıp yayın içi doldurulur.
        arc = (int) (femaleRatio * 360 / total);

        g.setColor(Color.pink);
        g.fillArc(area.x, area.y, area.width, area.height, startAngle, arc);

    }
    
    
}
