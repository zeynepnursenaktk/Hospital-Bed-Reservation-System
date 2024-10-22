
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Zeynep Nursena
 */
public class PatientWindow extends javax.swing.JFrame {

    /**
     * Creates new form PatientWindow
     */
    public PatientWindow() {
        initComponents();
        date();
        times();
    }

    public void date() {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dd = sdf.format(dt);
        lbl_date.setText(dd);
    }

    Timer t;
    SimpleDateFormat st;

    public void times() {

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                String tt = st.format(dt);
                lbl_times.setText(tt);

            }
        });
        t.start();
    }

    private void showPopUp(MouseEvent e) {
        popUp.show(this, e.getX(), e.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        main = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        btn_deleteSelected = new javax.swing.JButton();
        lbl_png = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientsTable = new javax.swing.JTable();
        panelInsert = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        rbtn_female = new javax.swing.JRadioButton();
        rbtn_male = new javax.swing.JRadioButton();
        cb_hasInsurance = new javax.swing.JCheckBox();
        txt_age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_insertRecord = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_date = new javax.swing.JLabel();
        lbl_times = new javax.swing.JLabel();
        rbtn_darkMode = new javax.swing.JRadioButton();

        main.setText("Back To Main Menu");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        popUp.add(main);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        popUp.add(exit);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });

        btn_deleteSelected.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btn_deleteSelected.setForeground(new java.awt.Color(35, 119, 166));
        btn_deleteSelected.setText("DELETE SELECTED");
        btn_deleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSelectedActionPerformed(evt);
            }
        });

        lbl_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acibadem-logo.jpg"))); // NOI18N

        patientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Surname", "Age", "Gender", "Insurance"
            }
        ));
        jScrollPane1.setViewportView(patientsTable);

        jScrollPane2.setViewportView(jScrollPane1);

        panelInsert.setBackground(new java.awt.Color(255, 255, 255));
        panelInsert.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.activeCaption));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 119, 166));
        jLabel1.setText("Insert New Patient");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 119, 166));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 119, 166));
        jLabel3.setText("Surname");

        buttonGroup1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rbtn_female.setForeground(new java.awt.Color(35, 119, 166));
        rbtn_female.setText("FEMALE");

        buttonGroup1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rbtn_male.setForeground(new java.awt.Color(35, 119, 166));
        rbtn_male.setText("MALE");

        cb_hasInsurance.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        cb_hasInsurance.setForeground(new java.awt.Color(35, 119, 166));
        cb_hasInsurance.setText("HAS INSURANCE? ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 119, 166));
        jLabel4.setText("Age");

        btn_insertRecord.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btn_insertRecord.setForeground(new java.awt.Color(35, 119, 166));
        btn_insertRecord.setText("INSERT RECORD");
        btn_insertRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertRecordActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(35, 119, 166));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInsertLayout = new javax.swing.GroupLayout(panelInsert);
        panelInsert.setLayout(panelInsertLayout);
        panelInsertLayout.setHorizontalGroup(
            panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsertLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInsertLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInsertLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_female)
                    .addComponent(rbtn_male))
                .addGap(151, 151, 151)
                .addGroup(panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInsertLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_hasInsurance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addGroup(panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_insertRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInsertLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(546, 546, 546))
        );
        panelInsertLayout.setVerticalGroup(
            panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_female)
                    .addComponent(cb_hasInsurance)
                    .addComponent(btn_insertRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_male)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_clear))
                .addGap(29, 29, 29))
        );

        lbl_date.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbl_date.setForeground(java.awt.SystemColor.activeCaption);

        lbl_times.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbl_times.setForeground(java.awt.SystemColor.activeCaption);

        rbtn_darkMode.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rbtn_darkMode.setForeground(java.awt.SystemColor.activeCaption);
        rbtn_darkMode.setText("Dark Mode");
        rbtn_darkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_darkModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_times, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166)
                        .addComponent(lbl_png)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtn_darkMode))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_deleteSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(panelInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_png, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lbl_times, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbtn_darkMode))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_deleteSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertRecordActionPerformed
        String age = txt_age.getText();                                                                                          //String tipinde üç değişken tanımladım : age, name ve surname.
        String name = txt_name.getText();                                                                                        //bunları jframe üzerindeki textlerden getText ile çektim.
        String surname = txt_surname.getText();
        if (age.matches("^[0-9]{1,2}$")) {                                                                                       // age, bir veya iki basamaklı sayı ile eşleşiyorsa bu if bloğu çalışır                                  
            if (name.matches("^[A-z ]+$") && surname.matches("^[A-z ]+$")) {                                                     // name ve surname a-z arası harflerden oluşuyor ve eşleşiyorsa bu blok çalışır.
                int insurance = cb_hasInsurance.isSelected() ? 1 : 0;                                                            //Sigortalı olma durumuna baktık eğer sigortalıysa 1, değilse 0 olacak int değerimiz.
                String gender = rbtn_male.isSelected() ? "Male" : "Female";                                                      //Eğer male butonu seçildiyse male , bu buton seçilmediyse de female olacak string gender değerimiz.
                Database.RunCommand("INSERT INTO Patient(name,surname,age,gender,insurance) VALUES('" + name + "','" + surname + "'," + age + ",'" + gender + "'," + insurance + ")");
                                                                                                                                 //Database e bu verileri kaydediyorum.
                if (Integer.parseInt(age) < 18) {                                                                                //Eğer age 18 den küçükse
                    JOptionPane.showMessageDialog(null, "Patient is younger than 18, please be sure that parents with him/her."); // "yanında ebeveyni olmalı" uyarısı verilir.
                }
                Database.ShowTable("SELECT id,name,surname,age,gender, CASE WHEN insurance=1 THEN 'Has Insurance' ELSE 'No Insurance' END as insurance"
                        + " FROM Patient", new String[]{"#", "name", "surname", "age", "gender", "insurance"}, patientsTable, 6);
            } else {                                                                                                              // name ve surname a-z arası harflerden oluşmuyorsa bu else bloğu çalışır. (mesele ş harfini ya da ı harfi girilirse çalışmaz, türkçe karakter almıyor.)
                JOptionPane.showMessageDialog(null, "Name and Surname will only contain alphabetic characters");                  //Alfabedeki harfleri içerebilir şeklinde uyarı alırız
            }
        } else {                                                                                                                 //Eğer age im regex dışındaki bi değer olarak girildiyse
            JOptionPane.showMessageDialog(null, "Invalid age value entered");                                                    //geçerli yaş giriniz uyarısı verilir.
        }
     }//GEN-LAST:event_btn_insertRecordActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_name.setText("");                                                                                                   //yazılan yazıları clear tuşuna basınca silmek istediğim için
        txt_surname.setText("");                                                                                                //set textlerini boş bırakıyorum.
        txt_age.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSelectedActionPerformed
        try {
            int selection;
            selection = Integer.parseInt(patientsTable.getModel().getValueAt(patientsTable.getSelectedRow(), 0).toString());
            Database.RunCommand("DELETE FROM Patient WHERE id=" + selection);
            Database.ShowTable("SELECT id,name,surname,age,gender, CASE WHEN insurance=1 THEN 'Has Insurance' ELSE 'No Insurance' END as insurance"
                    + " FROM Patient", new String[]{"#", "name", "surname", "age", "gender", "insurance"}, patientsTable, 6);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btn_deleteSelectedActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();                                                                                                    //Penceredeki x işaretine basıldığında bütün framelerin değil de sadece tıkladığım framein
                                                                                                                           //kapanmasını, diğer açılan framelerin kapanmamasını önlemek için de windowClosing'i kullandım.
    }//GEN-LAST:event_formWindowClosing

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();                                                                                                    //popUp menü ile frame kapatılır. 
    }//GEN-LAST:event_exitActionPerformed

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        if (evt.isPopupTrigger()) {                                                                                        //mouse a basıldığında
            showPopUp(evt);
        }
    }//GEN-LAST:event_panelMousePressed

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
        if (evt.isPopupTrigger()) {                                                                                        //ve mouse bırakıldığında popup menü görünür olur.
            showPopUp(evt);
        }
    }//GEN-LAST:event_panelMouseReleased

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        this.dispose();                                                                                                   //Bu frame kapanır ve ana menüye geri dönmek için 
        MainWindow mainWindow = new MainWindow();                                                                         //MainWindowdan main oluşturulur
        mainWindow.setVisible(true);                                                                                      //ve oluşturulan bu main framei görünür yapılır.
    }//GEN-LAST:event_mainActionPerformed

    private void rbtn_darkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_darkModeActionPerformed
        if (rbtn_darkMode.isSelected()) {                                                                                 //Eğer darkMode radio butonu seçildiyse if bloğu çalışır
            panel.setBackground(Color.BLACK);                                                                             //Paneller, combobox ve butonlar siyaha, table ve textler griye set edilerek karanlık mod ayarlanır.
            ImageIcon icon = new ImageIcon("C:\\Users\\zeyne\\OneDrive\\Belgeler\\NetBeansProjects\\HospitalBedReservationSystem\\src\\images (1).png");
                                                                                                                          //Orijinal logonun backgroundı beyaz olduğu için burda kendim siyaha çevirdiğim logoyu kullandım.
            lbl_png.setIcon(icon);
            panel.setBackground(Color.BLACK);
            patientsTable.setBackground(Color.GRAY);
            panelInsert.setBackground(Color.BLACK);
            cb_hasInsurance.setBackground(Color.BLACK);
            btn_clear.setBackground(Color.BLACK);
            btn_deleteSelected.setBackground(Color.BLACK);
            btn_insertRecord.setBackground(Color.BLACK);
            txt_age.setBackground(Color.GRAY);
            txt_name.setBackground(Color.GRAY);
            txt_surname.setBackground(Color.GRAY);

        } else {                                                                                                        //Eğer darkMode radio butonu seçilmediyse else bloğu çalışır
            panel.setBackground(Color.WHITE);                                                                           //Frameim eski haline döndürülür. Paneller,table, combobox, buton ve textlerin rengi beyaza set edilir.
            ImageIcon icon = new ImageIcon("C:\\Users\\zeyne\\OneDrive\\Belgeler\\NetBeansProjects\\HospitalBedReservationSystem\\src\\acibadem-logo.jpg");
                                                                                                                        //buton seçilip seçim kaldırılınca icon değişmediği için burda tekrardan backgroundı beyaz olan logoyu kullandım.
            lbl_png.setIcon(icon);
            patientsTable.setBackground(Color.WHITE);
            panelInsert.setBackground(Color.WHITE);
            cb_hasInsurance.setBackground(Color.WHITE);
            btn_clear.setBackground(Color.WHITE);
            btn_deleteSelected.setBackground(Color.WHITE);
            btn_insertRecord.setBackground(Color.WHITE);
            txt_age.setBackground(Color.WHITE);
            txt_name.setBackground(Color.WHITE);
            txt_surname.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_rbtn_darkModeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientWindow().setVisible(true);
                try {
                    Database.Initialize();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_deleteSelected;
    private javax.swing.JButton btn_insertRecord;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_hasInsurance;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_png;
    private javax.swing.JLabel lbl_times;
    private javax.swing.JMenuItem main;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelInsert;
    private javax.swing.JTable patientsTable;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JRadioButton rbtn_darkMode;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
