/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlo Ponti
 */
public class Dashboard extends javax.swing.JFrame {

    ButtonGroup grp = new ButtonGroup();

    public Dashboard() {
        initComponents();

        setTitle("Barangay Record Keeping for Sta. Elena Hagonoy, Bulacan");
        setLocationRelativeTo(null);
        setsIcon();

        MainPanel.setVisible(true);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        officialP.setVisible(false);
        editProfile.setVisible(false);

        //officials
        CaptField.setVisible(true);
        SecField.setVisible(true);
        Kag1Field.setVisible(true);
        Kag5Field.setVisible(true);
        Kag6Field.setVisible(true);
        Kag2Field.setVisible(true);
        Kag3Field.setVisible(true);
        Kag7Field.setVisible(true);
        TresField.setVisible(true);
        Kag4Field.setVisible(true);

        proLabel.setVisible(false);

        captSur.setVisible(false);
        captFirst.setVisible(false);
        captMid.setVisible(false);

        secSur.setVisible(false);
        secFirst.setVisible(false);
        secMid.setVisible(false);

        tresSur.setVisible(false);
        tresFirst.setVisible(false);
        tresMid.setVisible(false);

        kag1Sur.setVisible(false);
        kag1First.setVisible(false);
        kag1Mid.setVisible(false);

        kag2Sur.setVisible(false);
        kag2First.setVisible(false);
        kag2Mid.setVisible(false);

        kag3Sur.setVisible(false);
        kag3First.setVisible(false);
        kag3Mid.setVisible(false);

        kag4Sur.setVisible(false);
        kag4First.setVisible(false);
        kag4Mid.setVisible(false);

        kag5Sur.setVisible(false);
        kag5First.setVisible(false);
        kag5Mid.setVisible(false);

        kag6Sur.setVisible(false);
        kag6First.setVisible(false);
        kag6Mid.setVisible(false);

        kag7Sur.setVisible(false);
        kag7First.setVisible(false);
        kag7Mid.setVisible(false);

        //officials
        HomeBtn.setBackground(new Color(0, 152, 0));
        HomeBtn.setFont(font);

        maleRadio.setSelected(true);
        recordsTable.setFont(new Font("Century Gothic", Font.PLAIN, 13));

//        searchCombo.setUI(new BasicComboBoxUI() {
//            protected JButton createArrowButton() {
//                return new JButton() {
//                    public int getWidth() {
//                        return 0;
//                    }
//                };
//            }
//        });
//        searchCombo.addItem(" ");
//
//        AutoCompleteDecorator.decorate(searchCombo);
        recordsTable.setRowHeight(20);

        grp.add(maleRadio);
        grp.add(femaleRadio);
    }//const

    public void autocomplete(String txt) {
        String complete = "";
        int start = txt.length();
        int last = txt.length();
        for (int x = 0; x < Variables.Fullname.size(); x++) {
            if (Variables.Fullname.get(x).toLowerCase().startsWith(txt.toLowerCase())) {
                complete = Variables.Fullname.get(x);
                last = complete.length();
                break;
            }
        }
        if (last > start) {
            searchAuto.setText(complete);
            searchAuto.setCaretPosition(last);
            searchAuto.moveCaretPosition(start);
        }
    }

    public void showRecords() {
        String col[] = new String[]{"Full Name", "Birthday", "Zone"};
//        DefaultTableModel model = new DefaultTableModel(col, 0) {
//            @Override
//            public boolean isCellEditable(int row, int col) {
//                return false;
//            }
//        };
        //recordsTable.removeEditor();
        DefaultTableModel model = (DefaultTableModel) recordsTable.getModel();
        Object rowData[] = new Object[4];

        DefaultTableModel dm = (DefaultTableModel) recordsTable.getModel();
        dm.getDataVector().removeAllElements();
        revalidate();

        for (int x = 0; x < Variables.Fullname.size(); x++) {
            rowData[0] = Variables.Fullname.get(x);
            rowData[1] = Variables.Birthday.get(x);
            rowData[2] = Variables.Gender.get(x);
            rowData[3] = Variables.Zone.get(x);
            model.addRow(rowData);
        }
        recordsTable.setModel(model);

//        TableRowSorter <DefaultTableModel>sorter = new TableRowSorter<>(model);
//        recordsTable.setRowSorter(sorter);
    }//showRecords

    public static int counter = 0;

    Font font = new Font("Century Gothic", Font.BOLD, 15);
    Font font2 = new Font("Century Gothic", Font.PLAIN, 14);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ProfilePanel = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        FullnameLbl = new javax.swing.JLabel();
        BirthdayLbl = new javax.swing.JLabel();
        GenderLbl = new javax.swing.JLabel();
        CivilStatLbl = new javax.swing.JLabel();
        FullAddressLbl = new javax.swing.JLabel();
        FatNameLbl = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        ReligionLbl = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        MotNameLbl = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        picP = new javax.swing.JPanel();
        picLbl = new javax.swing.JLabel();
        removePicBtn = new javax.swing.JButton();
        changePicBtn = new javax.swing.JButton();
        EditProfile = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        RecordsPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        searchAuto = new javax.swing.JTextField();
        searchCombo = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        editProfile = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        middleField1 = new javax.swing.JTextField();
        surnameField1 = new javax.swing.JTextField();
        firstField1 = new javax.swing.JTextField();
        houseNumField1 = new javax.swing.JTextField();
        religionField1 = new javax.swing.JTextField();
        surmotherField1 = new javax.swing.JTextField();
        surfatherField1 = new javax.swing.JTextField();
        femaleRadio1 = new javax.swing.JRadioButton();
        maleRadio1 = new javax.swing.JRadioButton();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        civilCombo1 = new javax.swing.JComboBox<>();
        zoneCombo = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        bdayField1 = new javax.swing.JTextField();
        firstmotherField1 = new javax.swing.JTextField();
        firstfatherField1 = new javax.swing.JTextField();
        midmotherField1 = new javax.swing.JTextField();
        midfatherField1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        SubmitBtn1 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        AddCitizenPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        middleField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        firstField = new javax.swing.JTextField();
        houseNumField = new javax.swing.JTextField();
        religionField = new javax.swing.JTextField();
        surnameMField = new javax.swing.JTextField();
        firstMField = new javax.swing.JTextField();
        middleMField = new javax.swing.JTextField();
        surnameFField = new javax.swing.JTextField();
        firstFField = new javax.swing.JTextField();
        middleFField = new javax.swing.JTextField();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        yearSpinner = new javax.swing.JSpinner();
        monthSpinner = new javax.swing.JSpinner();
        daySpinner = new javax.swing.JSpinner();
        civilCombo = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        CensusPanel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PeoLbl1 = new javax.swing.JLabel();
        FamLbl1 = new javax.swing.JLabel();
        HouLbl1 = new javax.swing.JLabel();
        PeoLbl2 = new javax.swing.JLabel();
        HouLbl2 = new javax.swing.JLabel();
        FamLbl2 = new javax.swing.JLabel();
        PeoLbl3 = new javax.swing.JLabel();
        HouLbl3 = new javax.swing.JLabel();
        FamLbl3 = new javax.swing.JLabel();
        FamLbl4 = new javax.swing.JLabel();
        HouLbl4 = new javax.swing.JLabel();
        PeoLbl4 = new javax.swing.JLabel();
        FamLbl5 = new javax.swing.JLabel();
        HouLbl5 = new javax.swing.JLabel();
        PeoLbl5 = new javax.swing.JLabel();
        FamLbl6 = new javax.swing.JLabel();
        HouLbl6 = new javax.swing.JLabel();
        PeoLbl6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        officialP = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        kag7Sur = new javax.swing.JTextField();
        kag7First = new javax.swing.JTextField();
        kag7Mid = new javax.swing.JTextField();
        kag6Sur = new javax.swing.JTextField();
        kag6First = new javax.swing.JTextField();
        kag6Mid = new javax.swing.JTextField();
        kag5Sur = new javax.swing.JTextField();
        kag5First = new javax.swing.JTextField();
        kag5Mid = new javax.swing.JTextField();
        kag4Sur = new javax.swing.JTextField();
        kag4First = new javax.swing.JTextField();
        kag4Mid = new javax.swing.JTextField();
        kag3Sur = new javax.swing.JTextField();
        kag3First = new javax.swing.JTextField();
        kag3Mid = new javax.swing.JTextField();
        kag2Sur = new javax.swing.JTextField();
        kag2First = new javax.swing.JTextField();
        kag2Mid = new javax.swing.JTextField();
        kag1Sur = new javax.swing.JTextField();
        kag1First = new javax.swing.JTextField();
        kag1Mid = new javax.swing.JTextField();
        tresSur = new javax.swing.JTextField();
        tresFirst = new javax.swing.JTextField();
        tresMid = new javax.swing.JTextField();
        secSur = new javax.swing.JTextField();
        secFirst = new javax.swing.JTextField();
        secMid = new javax.swing.JTextField();
        captSur = new javax.swing.JTextField();
        captFirst = new javax.swing.JTextField();
        captMid = new javax.swing.JTextField();
        CaptField = new javax.swing.JTextField();
        SecField = new javax.swing.JTextField();
        TresField = new javax.swing.JTextField();
        Kag1Field = new javax.swing.JTextField();
        Kag2Field = new javax.swing.JTextField();
        Kag3Field = new javax.swing.JTextField();
        Kag4Field = new javax.swing.JTextField();
        Kag5Field = new javax.swing.JTextField();
        Kag6Field = new javax.swing.JTextField();
        Kag7Field = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        oficialLabel = new javax.swing.JLabel();
        proLabel = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        CensusBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        OffView = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfilePanel.setBackground(new java.awt.Color(204, 204, 204));
        ProfilePanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        ProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Citizen's Profile");
        ProfilePanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 790, 40));

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel58.setText("Mother's Name:");
        ProfilePanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 40));

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel59.setText("Birthday:");
        ProfilePanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 40));

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel60.setText("Father's Name:");
        ProfilePanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 40));

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel61.setText("Fullname:");
        ProfilePanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 40));

        FullnameLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FullnameLbl.setText("FullnameLbl");
        ProfilePanel.add(FullnameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 320, 40));

        BirthdayLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BirthdayLbl.setText("BirhtdayLbl");
        ProfilePanel.add(BirthdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 240, 40));

        GenderLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        GenderLbl.setText("GenderLbl");
        ProfilePanel.add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 240, 40));

        CivilStatLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CivilStatLbl.setText("CivilStatLbl");
        ProfilePanel.add(CivilStatLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 40));

        FullAddressLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FullAddressLbl.setText("FullAddressLbl");
        ProfilePanel.add(FullAddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 610, 40));

        FatNameLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FatNameLbl.setText("FatNameLbl");
        ProfilePanel.add(FatNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 320, 40));

        jLabel62.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel62.setText("Gender:");
        ProfilePanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 90, 40));

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel63.setText("Full Address:");
        ProfilePanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 150, 40));

        jLabel64.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel64.setText("Religion:");
        ProfilePanel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 90, 40));

        ReligionLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ReligionLbl.setText("ReligionLbl");
        ProfilePanel.add(ReligionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 240, 40));

        jLabel65.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel65.setText("Civil Status:");
        ProfilePanel.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, 40));

        MotNameLbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MotNameLbl.setText("MotNameLbl");
        ProfilePanel.add(MotNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 320, 40));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        ProfilePanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 150, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Create Document");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ProfilePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 160, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton3.setText("Records");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ProfilePanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 160, 40));

        picP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout picPLayout = new javax.swing.GroupLayout(picP);
        picP.setLayout(picPLayout);
        picPLayout.setHorizontalGroup(
            picPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        picPLayout.setVerticalGroup(
            picPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        ProfilePanel.add(picP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 120, 120));

        removePicBtn.setBackground(new java.awt.Color(255, 255, 255));
        removePicBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        removePicBtn.setText("Remove Picture");
        removePicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePicBtnActionPerformed(evt);
            }
        });
        ProfilePanel.add(removePicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 120, 40));

        changePicBtn.setBackground(new java.awt.Color(255, 255, 255));
        changePicBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        changePicBtn.setText("Change Picture");
        changePicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePicBtnActionPerformed(evt);
            }
        });
        ProfilePanel.add(changePicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 120, 40));

        EditProfile.setBackground(new java.awt.Color(255, 255, 255));
        EditProfile.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        EditProfile.setText("Edit Profile");
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });
        ProfilePanel.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 120, 40));
        ProfilePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 150, 20));

        jPanel3.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 760, 540));

        RecordsPanel.setBackground(new java.awt.Color(255, 255, 255));
        RecordsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Birthday", "Gender", "Zone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recordsTable);
        if (recordsTable.getColumnModel().getColumnCount() > 0) {
            recordsTable.getColumnModel().getColumn(0).setResizable(false);
            recordsTable.getColumnModel().getColumn(0).setPreferredWidth(240);
            recordsTable.getColumnModel().getColumn(1).setResizable(false);
            recordsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            recordsTable.getColumnModel().getColumn(2).setResizable(false);
            recordsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        RecordsPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 750, 510));

        searchAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchAutoKeyPressed(evt);
            }
        });
        RecordsPanel.add(searchAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 310, 30));

        searchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboActionPerformed(evt);
            }
        });
        RecordsPanel.add(searchCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 310, 30));

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setToolTipText("");
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        RecordsPanel.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 13, -1, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("View All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        RecordsPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 13, -1, 30));

        jPanel3.add(RecordsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 580));

        editProfile.setBackground(new java.awt.Color(255, 255, 255));
        editProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        editProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        middleField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        middleField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(middleField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, 30));

        surnameField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        surnameField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(surnameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, 30));

        firstField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(firstField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 190, 30));

        houseNumField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        houseNumField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(houseNumField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 30));

        religionField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(religionField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 190, 30));

        surmotherField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        surmotherField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(surmotherField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, 30));

        surfatherField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        surfatherField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(surfatherField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 190, 30));

        femaleRadio1.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadio1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        femaleRadio1.setText("Female");
        femaleRadio1.setEnabled(false);
        jPanel8.add(femaleRadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 30));

        maleRadio1.setBackground(new java.awt.Color(255, 255, 255));
        maleRadio1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        maleRadio1.setText("Male");
        maleRadio1.setEnabled(false);
        jPanel8.add(maleRadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 30));

        jLabel87.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("MI");
        jLabel87.setToolTipText("");
        jPanel8.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 130, 30));

        jLabel88.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel88.setText("Civil Status:");
        jLabel88.setToolTipText("");
        jPanel8.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, 30));

        jLabel89.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("First name");
        jLabel89.setToolTipText("");
        jPanel8.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 190, 30));

        civilCombo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        civilCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        jPanel8.add(civilCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 140, 30));

        zoneCombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        zoneCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zone 1", "Zone 2", "Zone 3", "Zone 4", "Zone 5", "Zone Buga" }));
        jPanel8.add(zoneCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 140, 30));

        jLabel90.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel90.setText("Gender:");
        jLabel90.setToolTipText("");
        jPanel8.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        jLabel91.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Surname");
        jLabel91.setToolTipText("");
        jPanel8.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, 30));

        jLabel92.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel92.setText("Full Name:");
        jLabel92.setToolTipText("");
        jPanel8.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 30));

        jLabel93.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel93.setText("Birthday:");
        jLabel93.setToolTipText("");
        jPanel8.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 30));

        jLabel94.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel94.setText("House Zone:");
        jLabel94.setToolTipText("");
        jPanel8.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 100, 30));

        jLabel95.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel95.setText("House Number:");
        jLabel95.setToolTipText("");
        jPanel8.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        jLabel96.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel96.setText("Religion:");
        jLabel96.setToolTipText("");
        jPanel8.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, 30));

        jLabel97.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel97.setText("Mother's Name:");
        jLabel97.setToolTipText("");
        jPanel8.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 30));

        jLabel100.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel100.setText("Father's Name:");
        jLabel100.setToolTipText("");
        jPanel8.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, 30));

        bdayField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bdayField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bdayField1.setEnabled(false);
        jPanel8.add(bdayField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 280, 30));

        firstmotherField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstmotherField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(firstmotherField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 190, 30));

        firstfatherField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstfatherField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(firstfatherField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 190, 30));

        midmotherField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        midmotherField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(midmotherField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 130, 30));

        midfatherField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        midfatherField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(midfatherField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 130, 30));

        jLabel98.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Surname");
        jLabel98.setToolTipText("");
        jPanel8.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 190, 30));

        jLabel99.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("First name");
        jLabel99.setToolTipText("");
        jPanel8.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 190, 30));

        jLabel101.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("MI");
        jLabel101.setToolTipText("");
        jPanel8.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 130, 30));

        jLabel102.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Surname");
        jLabel102.setToolTipText("");
        jPanel8.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 190, 30));

        jLabel103.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("First name");
        jLabel103.setToolTipText("");
        jPanel8.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 190, 30));

        jLabel105.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("MI");
        jLabel105.setToolTipText("");
        jPanel8.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 130, 30));

        editProfile.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 450));

        SubmitBtn1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SubmitBtn1.setText("Submit");
        SubmitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtn1ActionPerformed(evt);
            }
        });
        editProfile.add(SubmitBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 150, 35));

        jLabel104.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Edit Profile");
        editProfile.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 10, 730, 40));

        jPanel3.add(editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 600));

        AddCitizenPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddCitizenPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        AddCitizenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        middleField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        middleField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(middleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, 30));

        surnameField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        surnameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(surnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, 30));

        firstField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(firstField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 190, 30));

        houseNumField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        houseNumField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(houseNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, 30));

        religionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(religionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 190, 30));

        surnameMField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        surnameMField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(surnameMField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 200, 30));

        firstMField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstMField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(firstMField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 190, 30));

        middleMField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        middleMField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(middleMField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 110, 30));

        surnameFField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        surnameFField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(surnameFField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 200, 30));

        firstFField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        firstFField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(firstFField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 190, 30));

        middleFField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        middleFField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(middleFField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 110, 30));

        femaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        femaleRadio.setText("Female");
        jPanel1.add(femaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 30));

        maleRadio.setBackground(new java.awt.Color(255, 255, 255));
        maleRadio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        maleRadio.setText("Male");
        jPanel1.add(maleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 30));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("First name");
        jLabel38.setToolTipText("");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 190, 30));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("MI");
        jLabel39.setToolTipText("");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 130, 30));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Civil Status:");
        jLabel40.setToolTipText("");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, 30));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("First name");
        jLabel41.setToolTipText("");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 190, 30));

        yearSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));
        jPanel1.add(yearSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 80, 30));

        monthSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        jPanel1.add(monthSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, 30));

        daySpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        jPanel1.add(daySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, 30));

        civilCombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        civilCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));
        jPanel1.add(civilCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 140, 30));

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zone 1", "Zone 2", "Zone 3", "Zone 4", "Zone 5", "Zone Buga" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 140, 30));

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Gender:");
        jLabel42.setToolTipText("");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Surname");
        jLabel43.setToolTipText("");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, 30));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Full Name:");
        jLabel44.setToolTipText("");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 30));

        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Birthday:");
        jLabel45.setToolTipText("");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 30));

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("House Zone:");
        jLabel46.setToolTipText("");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 100, 30));

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("House Number:");
        jLabel47.setToolTipText("");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Religion:");
        jLabel48.setToolTipText("");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, 30));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("Mother's Name:");
        jLabel49.setToolTipText("");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 30));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Surname");
        jLabel50.setToolTipText("");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 200, 30));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("MI");
        jLabel51.setToolTipText("");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 110, 30));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("Father's Name:");
        jLabel52.setToolTipText("");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, 30));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Surname");
        jLabel53.setToolTipText("");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 200, 30));

        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("First name");
        jLabel54.setToolTipText("");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 190, 30));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("MI");
        jLabel55.setToolTipText("");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 110, 30));

        AddCitizenPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 450));

        SubmitBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        AddCitizenPanel.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 150, 35));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Register Citizen");
        AddCitizenPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 10, 730, 40));

        jPanel3.add(AddCitizenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 600));

        CensusPanel.setBackground(new java.awt.Color(255, 255, 255));
        CensusPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        CensusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Census per Zone of Sta. Elena Hagonoy, Bulacan");
        CensusPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 750, 50));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Census of Barangay Sta. Elena Hagonoy, Bulacan");
        CensusPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 750, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel28.setText("Number of Family:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setText("Sitio Buga");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 90, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setText("Zone 1");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 50, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setText("Zone 2");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setText("Zone 3");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 50, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setText("Zone 4");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 50, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel10.setText("Zone 5");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel11.setText("Number of People:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel12.setText("Number of Family:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel13.setText("Number of Houses:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel14.setText("Number of People:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel15.setText("Number of Houses:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel16.setText("Number of Family:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel17.setText("Number of People:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel18.setText("Number of Houses:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel19.setText("Number of Family:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel20.setText("Number of People:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel21.setText("Number of Houses:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, 30));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel22.setText("Number of Family:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 30));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel23.setText("Number of People:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 30));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel24.setText("Number of Houses:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 30));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel25.setText("Number of Family:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 30));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel26.setText("Number of People:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 30));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel27.setText("Number of Houses:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, 30));

        PeoLbl1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        PeoLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeoLbl1.setText("835");
        jPanel4.add(PeoLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 50, 30));

        FamLbl1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        FamLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FamLbl1.setText("266");
        jPanel4.add(FamLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 30));

        HouLbl1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        HouLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouLbl1.setText("167");
        jPanel4.add(HouLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 50, 30));

        PeoLbl2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        PeoLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeoLbl2.setText("883");
        jPanel4.add(PeoLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 50, 30));

        HouLbl2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        HouLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouLbl2.setText("177");
        jPanel4.add(HouLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 50, 30));

        FamLbl2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        FamLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FamLbl2.setText("278");
        jPanel4.add(FamLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 50, 30));

        PeoLbl3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        PeoLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeoLbl3.setText("826");
        jPanel4.add(PeoLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 50, 30));

        HouLbl3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        HouLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouLbl3.setText("165");
        jPanel4.add(HouLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 50, 30));

        FamLbl3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        FamLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FamLbl3.setText("264");
        jPanel4.add(FamLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 50, 30));

        FamLbl4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        FamLbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FamLbl4.setText("240");
        jPanel4.add(FamLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 50, 30));

        HouLbl4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        HouLbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouLbl4.setText("146");
        jPanel4.add(HouLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 50, 30));

        PeoLbl4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        PeoLbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeoLbl4.setText("732");
        jPanel4.add(PeoLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, 30));

        FamLbl5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        FamLbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FamLbl5.setText("253");
        jPanel4.add(FamLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 50, 30));

        HouLbl5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        HouLbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouLbl5.setText("157");
        jPanel4.add(HouLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 50, 30));

        PeoLbl5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        PeoLbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeoLbl5.setText("784");
        jPanel4.add(PeoLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 50, 30));

        FamLbl6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        FamLbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FamLbl6.setText("322");
        jPanel4.add(FamLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 50, 30));

        HouLbl6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        HouLbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouLbl6.setText("211");
        jPanel4.add(HouLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 50, 30));

        PeoLbl6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        PeoLbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PeoLbl6.setText("1,056");
        jPanel4.add(PeoLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 50, 30));

        CensusPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 300));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Number of Family");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 40));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Number of Houses");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 240, 40));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Number of People");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 240, 40));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("5,116");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 240, 30));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("1,623");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 30));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("1,023");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 240, 30));

        CensusPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 750, 130));

        jPanel3.add(CensusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 580));

        officialP.setBackground(new java.awt.Color(255, 255, 255));
        officialP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        officialP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Barangay Captain");
        officialP.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 170, 30));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Kagawad");
        officialP.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 170, 40));

        jLabel68.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Kagawad");
        officialP.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 170, 40));

        jLabel69.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Treasurer");
        officialP.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 170, 20));

        jLabel70.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Kagawad");
        officialP.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 170, 30));

        jLabel71.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Kagawad");
        officialP.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 40));

        jLabel72.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Kagawad");
        officialP.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 30));

        jLabel73.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Kagawad");
        officialP.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 170, 30));

        jLabel74.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Kagawad");
        officialP.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 170, 40));

        jLabel75.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Secretary");
        officialP.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 20));

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 170, -1));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 170, -1));

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, -1));

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, -1));

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 170, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 170, -1));

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 170, -1));

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, -1));

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Icon.png"))); // NOI18N
        officialP.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, -1));

        kag7Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag7Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 70, 30));

        kag7First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag7First, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 510, 70, 30));

        kag7Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag7Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 40, 30));

        kag6Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag6Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 70, 30));

        kag6First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag6First, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 510, 70, 30));

        kag6Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag6Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 40, 30));

        kag5Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag5Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 70, 30));

        kag5First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag5First, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 510, 70, 30));

        kag5Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag5Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 40, 30));

        kag4Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag4Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 70, 30));

        kag4First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag4First, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 380, 70, 30));

        kag4Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag4Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 380, 40, 30));

        kag3Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag3Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 70, 30));

        kag3First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag3First, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 380, 70, 30));

        kag3Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag3Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 380, 40, 30));

        kag2Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag2Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 70, 30));

        kag2First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag2First, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 380, 70, 30));

        kag2Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag2Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 380, 40, 30));

        kag1Sur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag1Sur, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 380, 70, 30));

        kag1First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag1First, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 380, 70, 30));

        kag1Mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(kag1Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 380, 40, 30));

        tresSur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(tresSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 70, 30));

        tresFirst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(tresFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 260, 70, 30));

        tresMid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(tresMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 40, 30));

        secSur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(secSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 30));

        secFirst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(secFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 260, 70, 30));

        secMid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(secMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 40, 30));

        captSur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(captSur, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 70, 30));

        captFirst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(captFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 170, 70, 30));

        captMid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officialP.add(captMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 170, 40, 30));

        CaptField.setEditable(false);
        CaptField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CaptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CaptField.setText("Doroteo M. Reyes III");
        CaptField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CaptField.setOpaque(false);
        officialP.add(CaptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 190, 30));

        SecField.setEditable(false);
        SecField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SecField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SecField.setText("Ronaldo M. Del Rosario");
        SecField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SecField.setOpaque(false);
        officialP.add(SecField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 30));

        TresField.setEditable(false);
        TresField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TresField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TresField.setText("Alvin D. Dalmacio");
        TresField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TresField.setOpaque(false);
        officialP.add(TresField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 190, 30));

        Kag1Field.setEditable(false);
        Kag1Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag1Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag1Field.setText("Liberto F. Martin");
        Kag1Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag1Field.setOpaque(false);
        officialP.add(Kag1Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 380, 180, 30));

        Kag2Field.setEditable(false);
        Kag2Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag2Field.setText("Daniel T. Magbitang");
        Kag2Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag2Field.setOpaque(false);
        officialP.add(Kag2Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 185, 30));

        Kag3Field.setEditable(false);
        Kag3Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag3Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag3Field.setText("Leonora R. Alfonso");
        Kag3Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag3Field.setOpaque(false);
        officialP.add(Kag3Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 187, 30));

        Kag4Field.setEditable(false);
        Kag4Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag4Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag4Field.setText("Carolina F. Miranda");
        Kag4Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag4Field.setOpaque(false);
        officialP.add(Kag4Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 186, 30));

        Kag5Field.setEditable(false);
        Kag5Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag5Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag5Field.setText("Marcelino F. Agulto");
        Kag5Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag5Field.setOpaque(false);
        officialP.add(Kag5Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 510, 190, 30));

        Kag6Field.setEditable(false);
        Kag6Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag6Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag6Field.setText("Herminio A. Dalmacio Sr.");
        Kag6Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag6Field.setOpaque(false);
        officialP.add(Kag6Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 190, 30));

        Kag7Field.setEditable(false);
        Kag7Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Kag7Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kag7Field.setText("Arturo A. Vistan");
        Kag7Field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Kag7Field.setOpaque(false);
        officialP.add(Kag7Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 30));

        jPanel15.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 230, 5));

        jPanel14.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 510, 5));

        jPanel16.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 230, 5));

        jPanel17.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 150, 5));

        jPanel18.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 350, 165, 5));

        jPanel19.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 160, 5));

        jPanel20.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 5, 120));

        jPanel21.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 5, 130));

        jPanel22.setBackground(new java.awt.Color(153, 0, 0));
        officialP.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 350, 5, 130));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/edit.png"))); // NOI18N
        editBtn.setToolTipText("Edit");
        editBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        editBtn.setContentAreaFilled(false);
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.setFocusPainted(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        officialP.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 50, 40));

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/save.png"))); // NOI18N
        saveBtn.setToolTipText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        saveBtn.setContentAreaFilled(false);
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.setFocusPainted(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        officialP.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 50, 40));

        oficialLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        oficialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oficialLabel.setText("Barangay Offcials of Sta. Elena Hagonoy, Bulacan");
        officialP.add(oficialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 760, 50));

        proLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        proLabel.setForeground(new java.awt.Color(255, 51, 51));
        proLabel.setText("SURNAME, FIRST NAME and MIDDLE NAME");
        officialP.add(proLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jPanel3.add(officialP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 600));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/midLogo.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        MainPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 500));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Main");
        MainPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 750, 50));

        jPanel3.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 580));

        SidePanel.setBackground(new java.awt.Color(255, 255, 255));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CensusBtn.setBackground(new java.awt.Color(255, 255, 255));
        CensusBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CensusBtn.setMnemonic('c');
        CensusBtn.setText("Census");
        CensusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CensusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CensusBtnActionPerformed(evt);
            }
        });
        SidePanel.add(CensusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 150, 40));

        ViewBtn.setBackground(new java.awt.Color(255, 255, 255));
        ViewBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ViewBtn.setMnemonic('v');
        ViewBtn.setText("View Records");
        ViewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        SidePanel.add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 40));

        AddBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        AddBtn.setMnemonic('a');
        AddBtn.setText("Add Citizen");
        AddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddBtnMouseReleased(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        AddBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddBtnKeyReleased(evt);
            }
        });
        SidePanel.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 40));

        HomeBtn.setBackground(new java.awt.Color(255, 255, 255));
        HomeBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        HomeBtn.setMnemonic('h');
        HomeBtn.setText("Home");
        HomeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        SidePanel.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        SidePanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 5));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        SidePanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 140, 5));
        SidePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 190, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hagonoy, Bulacan");
        SidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Brgy. Sta. Elena ");
        SidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/topLogo.png"))); // NOI18N
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, 70));
        SidePanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, 20));
        SidePanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, 20));
        SidePanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 20));

        jPanel3.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 590));

        jMenu2.setText("Officials");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        OffView.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        OffView.setText("View");
        OffView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffViewActionPerformed(evt);
            }
        });
        jMenu2.add(OffView);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Settings");
        jMenu4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Admin Settings");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Others");
        jMenu3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("About Us");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed

//        if(!religionField.getText().equals("") || !surnameMField.getText().equals("") || !middleMField.getText().equals("") ||
//                !firstMField.getText().equals("") || !surnameFField.getText().equals("") || !middleFField.getText().equals("") ||
//                !firstFField.getText().equals("") || !houseNumField.getText().equals("") || !surnameField.getText().equals("") ||
//                !firstField.getText().equals("") || !middleField.getText().equals("") || !monthSpinner.getModel().getValue().toString().equals("January") ||
//                !daySpinner.getModel().getValue().toString().equals("1") || !yearSpinner.getModel().getValue().toString().equals("1970") ||
//                civilCombo.getSelectedIndex()!=0 || jComboBox2.getSelectedIndex()!=0)
//        {
//            int x= JOptionPane.showConfirmDialog(null, "The Data will be disregard\ndo you want to continue?", "NOTICE!", JOptionPane.INFORMATION_MESSAGE);
//            if(x==0)
//            {
//                HomeBtn.setBackground(new Color(0, 152, 0));
//                ViewBtn.setBackground(new Color(255, 255, 255));
//                CensusBtn.setBackground(new Color(255, 255, 255));
//                AddBtn.setBackground(new Color(255, 255, 255));
//
//                HomeBtn.setFont(font);
//                ViewBtn.setFont(font2);
//                CensusBtn.setFont(font2);
//                AddBtn.setFont(font2);
//
//                CensusPanel.setVisible(false);
//                MainPanel.setVisible(true);
//                AddCitizenPanel.setVisible(false);
//                RecordsPanel.setVisible(false);
//            }
//        }
//        else
//        {
//            HomeBtn.setBackground(new Color(0, 152, 0));
//                ViewBtn.setBackground(new Color(255, 255, 255));
//                CensusBtn.setBackground(new Color(255, 255, 255));
//                AddBtn.setBackground(new Color(255, 255, 255));
//
//                HomeBtn.setFont(font);
//                ViewBtn.setFont(font2);
//                CensusBtn.setFont(font2);
//                AddBtn.setFont(font2);
//
//                CensusPanel.setVisible(false);
//                MainPanel.setVisible(true);
//                AddCitizenPanel.setVisible(false);
//                RecordsPanel.setVisible(false);
//        }
        HomeBtn.setBackground(new Color(0, 152, 0));
        ViewBtn.setBackground(new Color(255, 255, 255));
        CensusBtn.setBackground(new Color(255, 255, 255));
        AddBtn.setBackground(new Color(255, 255, 255));

        HomeBtn.setFont(font);
        ViewBtn.setFont(font2);
        CensusBtn.setFont(font2);
        AddBtn.setFont(font2);

        MainPanel.setVisible(true);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        officialP.setVisible(false);
        editProfile.setVisible(false);


    }//GEN-LAST:event_HomeBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        HomeBtn.setBackground(new Color(255, 255, 255));
        ViewBtn.setBackground(new Color(0, 152, 0));
        CensusBtn.setBackground(new Color(255, 255, 255));
        AddBtn.setBackground(new Color(255, 255, 255));

        HomeBtn.setFont(font2);
        ViewBtn.setFont(font);
        CensusBtn.setFont(font2);
        AddBtn.setFont(font2);

        MainPanel.setVisible(false);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(true);
        ProfilePanel.setVisible(false);
        officialP.setVisible(false);
        editProfile.setVisible(false);
        recordsTable.clearSelection();

        searchAuto.setText("");
        showRecords();
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void CensusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CensusBtnActionPerformed
        HomeBtn.setBackground(new Color(255, 255, 255));
        ViewBtn.setBackground(new Color(255, 255, 255));
        CensusBtn.setBackground(new Color(0, 152, 0));
        AddBtn.setBackground(new Color(255, 255, 255));

        HomeBtn.setFont(font2);
        ViewBtn.setFont(font2);
        CensusBtn.setFont(font);
        AddBtn.setFont(font2);

        MainPanel.setVisible(false);
        CensusPanel.setVisible(true);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        officialP.setVisible(false);
        editProfile.setVisible(false);
    }//GEN-LAST:event_CensusBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        surnameField.requestFocusInWindow();
        HomeBtn.setBackground(new Color(255, 255, 255));
        ViewBtn.setBackground(new Color(255, 255, 255));
        CensusBtn.setBackground(new Color(255, 255, 255));
        AddBtn.setBackground(new Color(0, 152, 0));

        HomeBtn.setFont(font2);
        ViewBtn.setFont(font2);
        CensusBtn.setFont(font2);
        AddBtn.setFont(font);

        MainPanel.setVisible(false);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(true);
        RecordsPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        officialP.setVisible(false);
        editProfile.setVisible(false);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void OffViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffViewActionPerformed
        MainPanel.setVisible(true);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        officialP.setVisible(true);
        editProfile.setVisible(false);

        editBtn.setVisible(true);

        CaptField.setVisible(true);
        SecField.setVisible(true);
        Kag1Field.setVisible(true);
        Kag5Field.setVisible(true);
        Kag6Field.setVisible(true);
        Kag2Field.setVisible(true);
        Kag3Field.setVisible(true);
        Kag7Field.setVisible(true);
        TresField.setVisible(true);
        Kag4Field.setVisible(true);
        SubmitBtn.setVisible(true);

        proLabel.setVisible(false);

        captSur.setVisible(false);
        captFirst.setVisible(false);
        captMid.setVisible(false);

        secSur.setVisible(false);
        secFirst.setVisible(false);
        secMid.setVisible(false);

        tresSur.setVisible(false);
        tresFirst.setVisible(false);
        tresMid.setVisible(false);

        kag1Sur.setVisible(false);
        kag1First.setVisible(false);
        kag1Mid.setVisible(false);

        kag2Sur.setVisible(false);
        kag2First.setVisible(false);
        kag2Mid.setVisible(false);

        kag3Sur.setVisible(false);
        kag3First.setVisible(false);
        kag3Mid.setVisible(false);

        kag4Sur.setVisible(false);
        kag4First.setVisible(false);
        kag4Mid.setVisible(false);

        kag5Sur.setVisible(false);
        kag5First.setVisible(false);
        kag5Mid.setVisible(false);

        kag6Sur.setVisible(false);
        kag6First.setVisible(false);
        kag6Mid.setVisible(false);

        kag7Sur.setVisible(false);
        kag7First.setVisible(false);
        kag7Mid.setVisible(false);

        CaptField.setText(Variables.captFullname);
        TresField.setText(Variables.tresFullname);
        SecField.setText(Variables.secFullname);
        Kag1Field.setText(Variables.kag1Fullname);
        Kag2Field.setText(Variables.kag2Fullname);
        Kag3Field.setText(Variables.kag3Fullname);
        Kag4Field.setText(Variables.kag4Fullname);
        Kag5Field.setText(Variables.kag5Fullname);
        Kag6Field.setText(Variables.kag6Fullname);
        Kag7Field.setText(Variables.kag7Fullname);


    }//GEN-LAST:event_OffViewActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        aboutUs ab = new aboutUs();
        ab.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed

        boolean trapping = false;

        String religion = religionField.getText().trim();
        String motherL = surnameMField.getText().trim();
        String motherM = middleMField.getText().trim();
        String motherF = firstMField.getText().trim();

        String fatherL = surnameFField.getText().trim();
        String fatherM = middleFField.getText().trim();
        String fatherF = firstFField.getText().trim();

        String house = houseNumField.getText().trim();
        String l = surnameField.getText().trim();
        String f = firstField.getText().trim();
        String m = middleField.getText().trim();

        String lastName = "";
        String firstName = "";
        String middleName = "";

        String lastNameF = "";
        String firstNameF = "";
        String middleNameF = "";

        String lastNameM = "";
        String firstNameM = "";
        String middleNameM = "";

        if (religion.equals("") || motherF.equals("") || motherL.equals("") || motherM.equals("")
                || fatherF.equals("") || fatherL.equals("") || fatherM.equals("") || house.equals("")
                || l.equals("") || m.equals("") || f.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill up all the fields..", "Notice", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Successfully added..", "Notice", JOptionPane.INFORMATION_MESSAGE);
            int mark = 1;
            if (mark == 1) {

                if (m.equals("")) {
                    middleName = "*";
                } else {
                    if (m.contains(".")) {
                        String toUp = m.toUpperCase();
                        int len = toUp.length();
                        String midName = toUp.charAt(0) + "";
                        for (int x = 0; x < len; x++) {
                            try {
                                if (toUp.charAt(x) == '.') {
                                    midName += toUp.charAt(x + 1);
                                }
                            } catch (Exception e) {

                            }
                        }
                        midName.replaceAll(" ", "");
                        midName += ".";
                        middleName = midName;
                    } else if (m.contains(" ")) {

                        String toUp = m.toUpperCase();
                        int len = toUp.length();
                        String mid = toUp.charAt(0) + "";
                        for (int x = 0; x < len; x++) {
                            if (toUp.charAt(x) == ' ') {
                                mid += toUp.charAt(x + 1);
                            }
                        }
                        mid += ".";
                        mid.replaceAll(" ", "");
                        middleName = mid;
                    } else {
                        char startM;
                        int lenM = 0;
                        String upM = m.toUpperCase();
                        startM = upM.charAt(0);
                        lenM = m.length();
                        String lastM = m.substring(1, lenM);
                        middleName = startM + ". ";
                    }
                }
                char startL;
                char startF;
                //char startM;

                int lenL = 0;
                int lenF = 0;
                //int lenM=0;

                String upL = l.toUpperCase();
                startL = upL.charAt(0);

                String upF = f.toUpperCase();
                startF = upF.charAt(0);

                //String upM = m.toUpperCase();
                //startM = upM.charAt(0);
                String lowL = l.toLowerCase();
                String lowF = f.toLowerCase();
                String lowM = m.toLowerCase();

                lenL = l.length();
                lenF = f.length();
                //lenM = m.length();

                String lastL = lowL.substring(1, lenL);
                String lastF = lowF.substring(1, lenF);
                //String lastM = m.substring(1, lenM);

                lastName = startL + lastL;
                firstName = startF + lastF;
                //middleName = startM+". ";

                if (lastName.contains(" ")) {
                    int len = lastName.length();
                    for (int x = 0; x < len; x++) {
                        if (lastName.charAt(x) == ' ') {
                            String rep = " " + lastName.charAt(x + 1);
                            String repp = rep.toUpperCase();
                            String temp = lastName.replace(rep, repp);
                            lastName = temp;
                        }
                    }
                }
                if (firstName.contains(" ")) {
                    int len = firstName.length();
                    for (int x = 0; x < len; x++) {
                        if (firstName.charAt(x) == ' ') {
                            String rep = " " + firstName.charAt(x + 1);
                            String repp = rep.toUpperCase();
                            String temp = firstName.replace(rep, repp);
                            firstName = temp;
                        }
                    }
                }
                System.out.println(lastName + ", " + firstName + " " + middleName);
                mark++;
            }
            if (mark == 2) {

                if (fatherM.contains(".")) {
                    String toUp = fatherM.toUpperCase();
                    int len = toUp.length();
                    String midName = toUp.charAt(0) + "";
                    for (int x = 0; x < len; x++) {
                        try {
                            if (toUp.charAt(x) == '.') {
                                midName += toUp.charAt(x + 1);
                            }
                        } catch (Exception e) {

                        }
                    }
                    midName.replaceAll(" ", "");
                    midName += ".";
                    middleNameF = midName;
                } else if (fatherM.contains(" ")) {

                    String toUp = fatherM.toUpperCase();
                    int len = toUp.length();
                    String mid = toUp.charAt(0) + "";
                    for (int x = 0; x < len; x++) {
                        if (toUp.charAt(x) == ' ') {
                            mid += toUp.charAt(x + 1);
                        }
                    }
                    mid += ".";
                    mid.replaceAll(" ", "");
                    middleNameF = mid;
                } else {
                    char startM;
                    int lenM = 0;
                    String upM = fatherM.toUpperCase();
                    startM = upM.charAt(0);
                    lenM = fatherM.length();
                    String lastM = fatherM.substring(1, lenM);
                    middleNameF = startM + ". ";
                }
                char startL;
                char startF;
                //char startM;

                int lenL = 0;
                int lenF = 0;
                //int lenM=0;

                String upL = fatherL.toUpperCase();
                startL = upL.charAt(0);

                String upF = fatherF.toUpperCase();
                startF = upF.charAt(0);

                //String upM = fatherM.toUpperCase();
                //startM = upM.charAt(0);
                String lowL = fatherL.toLowerCase();
                String lowF = fatherF.toLowerCase();
                String lowM = fatherM.toLowerCase();

                lenL = fatherL.length();
                lenF = fatherF.length();
                //lenM = fatherM.length();

                String lastL = lowL.substring(1, lenL);
                String lastF = lowF.substring(1, lenF);
                //String lastM = fatherM.substring(1, lenM);

                lastNameF = startL + lastL;
                firstNameF = startF + lastF;
                //middleNameF = startM+". ";

                if (lastNameF.contains(" ")) {
                    int len = lastNameF.length();
                    for (int x = 0; x < len; x++) {
                        if (lastNameF.charAt(x) == ' ') {
                            String rep = " " + lastNameF.charAt(x + 1);
                            String repp = rep.toUpperCase();
                            String temp = lastNameF.replace(rep, repp);
                            lastNameF = temp;
                        }
                    }
                }
                if (firstNameF.contains(" ")) {
                    int len = firstNameF.length();
                    for (int x = 0; x < len; x++) {
                        if (firstNameF.charAt(x) == ' ') {
                            String rep = " " + firstNameF.charAt(x + 1);
                            String repp = rep.toUpperCase();
                            String temp = firstNameF.replace(rep, repp);
                            firstNameF = temp;
                        }
                    }
                }
                System.out.println(lastNameF + ", " + firstNameF + " " + middleNameF);
                mark++;
            }

            if (mark == 3) {

                if (motherM.contains(".")) {
                    String toUp = motherM.toUpperCase();
                    int len = toUp.length();
                    String midName = toUp.charAt(0) + "";
                    for (int x = 0; x < len; x++) {
                        try {
                            if (toUp.charAt(x) == '.') {
                                midName += toUp.charAt(x + 1);
                            }
                        } catch (Exception e) {

                        }
                    }
                    midName.replaceAll(" ", "");
                    midName += ".";
                    middleNameM = midName;
                } else if (motherM.contains(" ")) {

                    String toUp = motherM.toUpperCase();
                    int len = toUp.length();
                    String mid = toUp.charAt(0) + "";
                    for (int x = 0; x < len; x++) {
                        if (toUp.charAt(x) == ' ') {
                            mid += toUp.charAt(x + 1);
                        }
                    }
                    mid += ".";
                    mid.replaceAll(" ", "");
                    middleNameM = mid;
                } else {
                    char startM;
                    int lenM = 0;
                    String upM = motherM.toUpperCase();
                    startM = upM.charAt(0);
                    lenM = motherM.length();
                    String lastM = motherM.substring(1, lenM);
                    middleNameM = startM + ". ";
                }
                char startL;
                char startF;
                //char startM;

                int lenL = 0;
                int lenF = 0;
                //int lenM=0;

                String upL = motherL.toUpperCase();
                startL = upL.charAt(0);

                String upF = motherF.toUpperCase();
                startF = upF.charAt(0);

                //String upM = motherM.toUpperCase();
                //startM = upM.charAt(0);
                String lowL = motherL.toLowerCase();
                String lowF = motherF.toLowerCase();
                String lowM = motherM.toLowerCase();

                lenL = motherL.length();
                lenF = motherF.length();
                //lenM = motherM.length();

                String lastL = lowL.substring(1, lenL);
                String lastF = lowF.substring(1, lenF);
                //String lastM = motherM.substring(1, lenM);

                lastNameM = startL + lastL;
                firstNameM = startF + lastF;
                //middleName = startM+". ";

                if (lastNameM.contains(" ")) {
                    int len = lastNameM.length();
                    for (int x = 0; x < len; x++) {
                        if (lastNameM.charAt(x) == ' ') {
                            String rep = " " + lastNameM.charAt(x + 1);
                            String repp = rep.toUpperCase();
                            String temp = lastNameM.replace(rep, repp);
                            lastNameM = temp;
                        }
                    }
                }
                if (firstNameM.contains(" ")) {
                    int len = firstNameM.length();
                    for (int x = 0; x < len; x++) {
                        if (firstNameM.charAt(x) == ' ') {
                            String rep = " " + firstNameM.charAt(x + 1);
                            String repp = rep.toUpperCase();
                            String temp = firstNameM.replace(rep, repp);
                            firstNameM = temp;
                        }
                    }
                }
                System.out.println(lastNameM + ", " + firstNameM + " " + middleNameM);
            }
            mark = 1;
            searchCombo.addItem(lastName + ", " + firstName + " " + middleName);
            Variables.Fullname.add(lastName + ", " + firstName + " " + middleName);
            Variables.Lastname.add(lastName);
            Variables.Firstname.add(firstName);
            Variables.Middlename.add(middleName);
            Variables.Civilstatus.add(civilCombo.getSelectedItem());
            Variables.Religion.add(religionField.getText());
            Variables.Zone.add(jComboBox2.getSelectedItem());
            Variables.Housenumber.add(houseNumField.getText());
            Variables.FullAddress.add("#" + houseNumField.getText() + " " + jComboBox2.getSelectedItem() + " Sta. Elena Hagonoy, Bulacan");
            Variables.Birthday.add(monthSpinner.getModel().getValue().toString() + " " + daySpinner.getModel().getValue().toString() + "," + yearSpinner.getModel().getValue().toString());
            Variables.FullnameFather.add(lastNameF + ", " + firstNameF + " " + middleNameF);
            Variables.surnameFather.add(lastNameF);
            Variables.firstnameFather.add(firstNameF);
            Variables.midnameFather.add(middleNameF);
            Variables.FullnameMother.add(lastNameM + ", " + firstNameM + " " + middleNameM);
            Variables.surnameMother.add(lastNameM);
            Variables.firstnameMother.add(firstNameM);
            Variables.midnameMother.add(middleNameM);
            if (maleRadio.isSelected()) {
                Variables.Gender.add("Male");
            } else {
                Variables.Gender.add("Female");
            }
            Variables.Unique.add(Variables.UniId);
            Variables.userPath.add("default.png");

            Variables.UniId++;
            surnameField.requestFocus();
            //System.out.println("My Name: " + Variables.Fullname);
            //System.out.println("Father's Name: " + Variables.FullnameFather);
            System.out.println("Full Address" + Variables.FullAddress);

            religionField.setText("");
            surnameMField.setText("");
            middleMField.setText("");
            firstMField.setText("");
            surnameFField.setText("");
            middleFField.setText("");
            firstFField.setText("");
            houseNumField.setText("");
            surnameField.setText("");
            firstField.setText("");
            middleField.setText("");
            maleRadio.setSelected(true);
            femaleRadio.setSelected(false);
            monthSpinner.setValue("January");
            daySpinner.setValue("1");
            yearSpinner.setValue("1900");

            civilCombo.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);

        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void recordsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsTableMouseClicked
        try {
            if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                if (flag == false) {
                    int index = recordsTable.getSelectedRow();
                    System.out.println("Clicked");
                    searchIndex = index;
                    FullnameLbl.setText(Variables.Fullname.get(index));
                    FatNameLbl.setText(Variables.FullnameFather.get(index).toString());
                    MotNameLbl.setText(Variables.FullnameMother.get(index).toString());
                    BirthdayLbl.setText(Variables.Birthday.get(index).toString());
                    CivilStatLbl.setText(Variables.Civilstatus.get(index).toString());
                    FullAddressLbl.setText(Variables.FullAddress.get(index).toString());
                    GenderLbl.setText(Variables.Gender.get(index).toString());
                    ReligionLbl.setText(Variables.Religion.get(index).toString());
                    picLbl.setIcon(ResizeImage(Variables.userPath.get(index)));

                    ProfilePanel.setVisible(true);
                    CensusPanel.setVisible(false);
                    editProfile.setVisible(false);
                    MainPanel.setVisible(false);
                    AddCitizenPanel.setVisible(false);
                    RecordsPanel.setVisible(false);
                } else {
                    int index = recordsTable.getSelectedRow();
                    System.out.println("Clicked");
                    searchIndex = index;
                    FullnameLbl.setText(Variables.Fullname.get(indexes.get(index)));
                    FatNameLbl.setText(Variables.FullnameFather.get(indexes.get(index)).toString());
                    MotNameLbl.setText(Variables.FullnameMother.get(indexes.get(index)).toString());
                    BirthdayLbl.setText(Variables.Birthday.get(indexes.get(index)).toString());
                    CivilStatLbl.setText(Variables.Civilstatus.get(indexes.get(index)).toString());
                    FullAddressLbl.setText(Variables.FullAddress.get(indexes.get(index)).toString());
                    GenderLbl.setText(Variables.Gender.get(indexes.get(index)).toString());
                    ReligionLbl.setText(Variables.Religion.get(indexes.get(index)).toString());
                    picLbl.setIcon(ResizeImage(Variables.userPath.get(indexes.get(index))));

                    ProfilePanel.setVisible(true);
                    CensusPanel.setVisible(false);
                    editProfile.setVisible(false);
                    MainPanel.setVisible(false);
                    AddCitizenPanel.setVisible(false);
                    RecordsPanel.setVisible(false);
                }

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_recordsTableMouseClicked

    public static boolean flag = false;
    public static int searchIndex = 0;
    public static ArrayList<Integer> indexes = new ArrayList();

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String search = searchAuto.getText();
        indexes.clear();
        int index = searchCombo.getSelectedIndex();
        if (search.equals("")) {
            recordsTable.clearSelection();
            flag = false;
            showRecords();
            // JOptionPane.showMessageDialog(null, search+" does not exists");
        } else {
            DefaultTableModel model = (DefaultTableModel) recordsTable.getModel();
            Object rowData[] = new Object[4];

            DefaultTableModel dm = (DefaultTableModel) recordsTable.getModel();
            dm.getDataVector().removeAllElements();
            revalidate();
            flag = true;
            for (int x = 0; x < Variables.Fullname.size(); x++) {
                if (Variables.Fullname.get(x).equals(search)) {
                    rowData[0] = Variables.Fullname.get(x);
                    rowData[1] = Variables.Birthday.get(x);
                    rowData[2] = Variables.Gender.get(x);
                    rowData[3] = Variables.Zone.get(x);
                    indexes.add(x);
                    model.addRow(rowData);
                }
            }
            recordsTable.setModel(model);
        }


    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboActionPerformed

    }//GEN-LAST:event_searchComboActionPerformed

    public static String autoCaps(String str) {
        String result = "";
        result = str.charAt(0) + "".toUpperCase() + str.substring(1, str.length());

        return result;
    }


    private void searchAutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String search = searchAuto.getText();

            int index = searchCombo.getSelectedIndex();
            if (search.equals("")) {
                recordsTable.clearSelection();
                flag = false;
                showRecords();
            } else {
                
                
                
                DefaultTableModel model = (DefaultTableModel) recordsTable.getModel();
                Object rowData[] = new Object[4];

                DefaultTableModel dm = (DefaultTableModel) recordsTable.getModel();
                dm.getDataVector().removeAllElements();
                revalidate();
                flag = true;

                indexes.clear();
                for (int x = 0; x < Variables.Fullname.size(); x++) {
                    if (Variables.Fullname.get(x).equals(search)) {
                        rowData[0] = Variables.Fullname.get(x);
                        rowData[1] = Variables.Birthday.get(x);
                        rowData[2] = Variables.Gender.get(x);
                        rowData[3] = Variables.Zone.get(x);
                        indexes.add(x);
                        model.addRow(rowData);
                    }
                }
                recordsTable.setModel(model);
            }
        }

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                break;
            default:
                EventQueue.invokeLater(new Runnable() {
                    @Override

                    public void run() {
                        String txt = searchAuto.getText();
                        if (!txt.equals("")) {
                            autocomplete(txt);
                        }

                    }
                });
        }
    }//GEN-LAST:event_searchAutoKeyPressed

    private void AddBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddBtnKeyReleased
        surnameField.requestFocus();
    }//GEN-LAST:event_AddBtnKeyReleased

    private void AddBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseReleased
        surnameField.requestFocus();
    }//GEN-LAST:event_AddBtnMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showRecords();
        recordsTable.clearSelection();
        flag = false;
        searchIndex = 0;
        indexes.clear();
        searchAuto.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminPass ad = new AdminPass();

        ImageIcon icon = new ImageIcon("pass.png");

        String[] options = new String[2];
        options[0] = new String("Save");
        options[1] = new String("Cancel");
        int pick = JOptionPane.showOptionDialog(null, ad, "PASSWORD SETTING", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);

        for (;;) {
            String oldpw = AdminPass.oldPw.getText();
            String pw1 = AdminPass.newPw.getText();
            String pw2 = AdminPass.newPw2.getText();

            if (pick == 0) {
                if (pw1.equals("") || oldpw.equals("") || pw2.equals("")) {
                    AdminPass.oldPw.setBorder(BorderFactory.createLineBorder(Color.red));
                    AdminPass.newPw.setBorder(BorderFactory.createLineBorder(Color.red));
                    AdminPass.newPw2.setBorder(BorderFactory.createLineBorder(Color.red));
                    pick = JOptionPane.showOptionDialog(null, ad, "PASSWORD SETTING", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);

                } else {
                    AdminPass.oldPw.setBorder(surnameField.getBorder());
                    AdminPass.newPw.setBorder(surnameField.getBorder());
                    AdminPass.newPw2.setBorder(surnameField.getBorder());
                    if (oldpw.equals(Variables.AdminPass.get(0).toString())) {
                        if (pw1.equals(pw2)) {
                            if (pw1.equals(Variables.AdminPass.get(0).toString())) {
                                JOptionPane.showMessageDialog(null, "Please Chose Different Password!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                                pick = JOptionPane.showOptionDialog(null, ad, "PASSWORD SETTING", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);
                            } else {
                                Variables.AdminPass.set(0, pw2);
                                JOptionPane.showMessageDialog(null, "Successfully Updated!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                                Login log = new Login();
                                log.setVisible(true);
                                dispose();
                                break;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Passwords Do Not Match!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                            pick = JOptionPane.showOptionDialog(null, ad, "PASSWORD SETTING", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Old Password Do Not Match!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                        pick = JOptionPane.showOptionDialog(null, ad, "PASSWORD SETTING", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);
                    }
                }
            } else {
                break;
            }
        }//unli
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    static int getFlag = 0;
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int fla = 0, captFla = 0, secFla = 0, tresFla = 0, kag1Fla = 0, kag2Fla = 0, kag3Fla = 0, kag4Fla = 0, kag5Fla = 0, kag6Fla = 0, kag7Fla = 0;

        if (captSur.getText().equals("") && captFirst.getText().equals("") && captMid.getText().equals("")) {
            captFla = 1;
            CaptField.setText(Variables.captFullname);
            captSur.setText(Variables.captSurname);
            captFirst.setText(Variables.captFirstname);
            captMid.setText(Variables.captMiddle);
        }
        if (!captSur.getText().equals("") && !captFirst.getText().equals("") && !captMid.getText().equals("")) {
            getFlag = 1;
            Variables.captFullname = getOff(captSur.getText().trim(), captFirst.getText().trim(), captMid.getText().trim());
            fla = 0;
            captFla = 1;
            CaptField.setText(Variables.captFullname);
            captSur.setText(Variables.captSurname);
            captFirst.setText(Variables.captFirstname);
            captMid.setText(Variables.captMiddle);
        }
        if (captFla == 0) {
            if (captSur.getText().equals("")) {
                fla = 1;
                captSur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                captSur.setBorder(surnameField.getBorder());
            }
            if (captFirst.getText().equals("")) {
                fla = 1;
                captFirst.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                captFirst.setBorder(surnameField.getBorder());
            }
            if (captMid.getText().equals("")) {
                fla = 1;
                captMid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                captMid.setBorder(surnameField.getBorder());
            }
        }
        /////////////
        if (secSur.getText().equals("") && secFirst.getText().equals("") && secMid.getText().equals("")) {
            secFla = 1;
            SecField.setText(Variables.secFullname);
            secSur.setText(Variables.secSurname);
            secFirst.setText(Variables.secFirstname);
            secMid.setText(Variables.secMiddle);
        }
        if (!secSur.getText().equals("") && !secFirst.getText().equals("") && !secMid.getText().equals("")) {
            getFlag = 2;
            Variables.secFullname = getOff(secSur.getText().trim(), secFirst.getText().trim(), secMid.getText().trim());
            fla = 0;
            secFla = 1;
            SecField.setText(Variables.secFullname);
            secSur.setText(Variables.secSurname);
            secFirst.setText(Variables.secFirstname);
            secMid.setText(Variables.secMiddle);
        }
        if (secFla == 0) {
            if (secSur.getText().equals("")) {
                fla = 1;
                secSur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                secSur.setBorder(surnameField.getBorder());
            }
            if (secFirst.getText().equals("")) {
                fla = 1;
                secFirst.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                secFirst.setBorder(surnameField.getBorder());
            }
            if (secMid.getText().equals("")) {
                fla = 1;
                secMid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                secMid.setBorder(surnameField.getBorder());
            }
        }

        /////////
        if (tresSur.getText().equals("") && tresFirst.getText().equals("") && tresMid.getText().equals("")) {
            tresFla = 1;
            TresField.setText(Variables.tresFullname);
            tresSur.setText(Variables.tresSurname);
            tresFirst.setText(Variables.tresFirstname);
            tresMid.setText(Variables.tresMiddle);
        }
        if (!tresSur.getText().equals("") && !tresFirst.getText().equals("") && !tresMid.getText().equals("")) {
            getFlag = 3;
            Variables.tresFullname = getOff(tresSur.getText().trim(), tresFirst.getText().trim(), tresMid.getText().trim());
            fla = 0;
            tresFla = 1;
            TresField.setText(Variables.tresFullname);
            tresSur.setText(Variables.tresSurname);
            tresFirst.setText(Variables.tresFirstname);
            tresMid.setText(Variables.tresMiddle);
        }
        if (tresFla == 0) {
            if (tresSur.getText().equals("")) {
                fla = 1;
                tresSur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                tresSur.setBorder(surnameField.getBorder());
            }
            if (tresFirst.getText().equals("")) {
                fla = 1;
                tresFirst.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                tresFirst.setBorder(surnameField.getBorder());
            }
            if (tresMid.getText().equals("")) {
                fla = 1;
                tresMid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                tresMid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag1Sur.getText().equals("") && kag1First.getText().equals("") && kag1Mid.getText().equals("")) {
            kag1Fla = 1;
            Kag1Field.setText(Variables.kag1Fullname);
            kag1Sur.setText(Variables.kag1Surname);
            kag1First.setText(Variables.kag1Firstname);
            kag1Mid.setText(Variables.kag1Middle);
        }
        if (!kag1Sur.getText().equals("") && !kag1First.getText().equals("") && !kag1Mid.getText().equals("")) {
            getFlag = 4;
            Variables.kag1Fullname = getOff(kag1Sur.getText().trim(), kag1First.getText().trim(), kag1Mid.getText().trim());
            fla = 0;
            kag1Fla = 1;
            Kag1Field.setText(Variables.kag1Fullname);
            kag1Sur.setText(Variables.kag1Surname);
            kag1First.setText(Variables.kag1Firstname);
            kag1Mid.setText(Variables.kag1Middle);
        }
        if (kag1Fla == 0) {
            if (kag1Sur.getText().equals("")) {
                fla = 1;
                kag1Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag1Sur.setBorder(surnameField.getBorder());
            }
            if (kag1First.getText().equals("")) {
                fla = 1;
                kag1First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag1First.setBorder(surnameField.getBorder());
            }
            if (kag1Mid.getText().equals("")) {
                fla = 1;
                kag1Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag1Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag2Sur.getText().equals("") && kag2First.getText().equals("") && kag2Mid.getText().equals("")) {
            kag2Fla = 1;
            Kag2Field.setText(Variables.kag2Fullname);
            kag2Sur.setText(Variables.kag2Surname);
            kag2First.setText(Variables.kag2Firstname);
            kag2Mid.setText(Variables.kag2Middle);
        }
        if (!kag2Sur.getText().equals("") && !kag2First.getText().equals("") && !kag2Mid.getText().equals("")) {
            getFlag = 5;
            Variables.kag2Fullname = getOff(kag2Sur.getText().trim(), kag2First.getText().trim(), kag2Mid.getText().trim());
            fla = 0;
            kag2Fla = 1;
            Kag2Field.setText(Variables.kag2Fullname);
            kag2Sur.setText(Variables.kag2Surname);
            kag2First.setText(Variables.kag2Firstname);
            kag2Mid.setText(Variables.kag2Middle);
        }
        if (kag2Fla == 0) {
            if (kag2Sur.getText().equals("")) {
                fla = 1;
                kag2Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag2Sur.setBorder(surnameField.getBorder());
            }
            if (kag2First.getText().equals("")) {
                fla = 1;
                kag2First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag2First.setBorder(surnameField.getBorder());
            }
            if (kag2Mid.getText().equals("")) {
                fla = 1;
                kag2Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag2Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag3Sur.getText().equals("") && kag3First.getText().equals("") && kag3Mid.getText().equals("")) {
            kag3Fla = 1;
            Kag3Field.setText(Variables.kag3Fullname);
            kag3Sur.setText(Variables.kag3Surname);
            kag3First.setText(Variables.kag3Firstname);
            kag3Mid.setText(Variables.kag3Middle);
        }
        if (!kag3Sur.getText().equals("") && !kag3First.getText().equals("") && !kag3Mid.getText().equals("")) {
            getFlag = 6;
            Variables.kag3Fullname = getOff(kag3Sur.getText().trim(), kag3First.getText().trim(), kag3Mid.getText().trim());
            fla = 0;
            kag3Fla = 1;
            Kag3Field.setText(Variables.kag3Fullname);
            kag3Sur.setText(Variables.kag3Surname);
            kag3First.setText(Variables.kag3Firstname);
            kag3Mid.setText(Variables.kag3Middle);
        }
        if (kag3Fla == 0) {
            if (kag3Sur.getText().equals("")) {
                fla = 1;
                kag3Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag3Sur.setBorder(surnameField.getBorder());
            }
            if (kag3First.getText().equals("")) {
                fla = 1;
                kag3First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag3First.setBorder(surnameField.getBorder());
            }
            if (kag3Mid.getText().equals("")) {
                fla = 1;
                kag3Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag3Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag4Sur.getText().equals("") && kag4First.getText().equals("") && kag4Mid.getText().equals("")) {
            kag4Fla = 1;
            Kag4Field.setText(Variables.kag4Fullname);
            kag4Sur.setText(Variables.kag4Surname);
            kag4First.setText(Variables.kag4Firstname);
            kag4Mid.setText(Variables.kag4Middle);
        }
        if (!kag4Sur.getText().equals("") && !kag4First.getText().equals("") && !kag4Mid.getText().equals("")) {
            getFlag = 7;
            Variables.kag4Fullname = getOff(kag4Sur.getText().trim(), kag4First.getText().trim(), kag4Mid.getText().trim());
            fla = 0;
            kag4Fla = 1;
            Kag4Field.setText(Variables.kag4Fullname);
            kag4Sur.setText(Variables.kag4Surname);
            kag4First.setText(Variables.kag4Firstname);
            kag4Mid.setText(Variables.kag4Middle);
        }
        if (kag4Fla == 0) {
            if (kag4Sur.getText().equals("")) {
                fla = 1;
                kag4Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag4Sur.setBorder(surnameField.getBorder());
            }
            if (kag4First.getText().equals("")) {
                fla = 1;
                kag4First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag4First.setBorder(surnameField.getBorder());
            }
            if (kag4Mid.getText().equals("")) {
                fla = 1;
                kag4Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag4Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag5Sur.getText().equals("") && kag5First.getText().equals("") && kag5Mid.getText().equals("")) {
            kag5Fla = 1;
            Kag5Field.setText(Variables.kag5Fullname);
            kag5Sur.setText(Variables.kag5Surname);
            kag5First.setText(Variables.kag5Firstname);
            kag5Mid.setText(Variables.kag5Middle);
        }
        if (!kag5Sur.getText().equals("") && !kag5First.getText().equals("") && !kag5Mid.getText().equals("")) {
            getFlag = 8;
            Variables.kag5Fullname = getOff(kag5Sur.getText().trim(), kag5First.getText().trim(), kag5Mid.getText().trim());
            fla = 0;
            kag5Fla = 1;
            Kag5Field.setText(Variables.kag5Fullname);
            kag5Sur.setText(Variables.kag5Surname);
            kag5First.setText(Variables.kag5Firstname);
            kag5Mid.setText(Variables.kag5Middle);
        }
        if (kag5Fla == 0) {
            if (kag5Sur.getText().equals("")) {
                fla = 1;
                kag5Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag5Sur.setBorder(surnameField.getBorder());
            }
            if (kag5First.getText().equals("")) {
                fla = 1;
                kag5First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag5First.setBorder(surnameField.getBorder());
            }
            if (kag5Mid.getText().equals("")) {
                fla = 1;
                kag5Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag5Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag6Sur.getText().equals("") && kag6First.getText().equals("") && kag6Mid.getText().equals("")) {
            kag6Fla = 9;
            Kag6Field.setText(Variables.kag6Fullname);
            kag6Sur.setText(Variables.kag6Surname);
            kag6First.setText(Variables.kag6Firstname);
            kag6Mid.setText(Variables.kag6Middle);
        }
        if (!kag6Sur.getText().equals("") && !kag6First.getText().equals("") && !kag6Mid.getText().equals("")) {
            getFlag = 3;
            Variables.kag6Fullname = getOff(kag6Sur.getText().trim(), kag6First.getText().trim(), kag6Mid.getText().trim());
            fla = 0;
            kag6Fla = 1;
            Kag6Field.setText(Variables.kag6Fullname);
            kag6Sur.setText(Variables.kag6Surname);
            kag6First.setText(Variables.kag6Firstname);
            kag6Mid.setText(Variables.kag6Middle);
        }
        if (kag6Fla == 0) {
            if (kag6Sur.getText().equals("")) {
                fla = 1;
                kag6Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag6Sur.setBorder(surnameField.getBorder());
            }
            if (kag6First.getText().equals("")) {
                fla = 1;
                kag6First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag6First.setBorder(surnameField.getBorder());
            }
            if (kag6Mid.getText().equals("")) {
                fla = 1;
                kag6Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag6Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////
        if (kag7Sur.getText().equals("") && kag7First.getText().equals("") && kag7Mid.getText().equals("")) {
            kag7Fla = 1;
            Kag7Field.setText(Variables.kag7Fullname);
            kag7Sur.setText(Variables.kag7Surname);
            kag7First.setText(Variables.kag7Firstname);
            kag7Mid.setText(Variables.kag7Middle);
        }
        if (!kag7Sur.getText().equals("") && !kag7First.getText().equals("") && !kag7Mid.getText().equals("")) {
            getFlag = 10;
            Variables.kag7Fullname = getOff(kag7Sur.getText().trim(), kag7First.getText().trim(), kag7Mid.getText().trim());
            fla = 0;
            kag7Fla = 1;
            Kag7Field.setText(Variables.kag7Fullname);
            kag7Sur.setText(Variables.kag7Surname);
            kag7First.setText(Variables.kag7Firstname);
            kag7Mid.setText(Variables.kag7Middle);
        }
        if (kag7Fla == 0) {
            if (kag7Sur.getText().equals("")) {
                fla = 1;
                kag7Sur.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag7Sur.setBorder(surnameField.getBorder());
            }
            if (kag7First.getText().equals("")) {
                fla = 1;
                kag7First.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag7First.setBorder(surnameField.getBorder());
            }
            if (kag7Mid.getText().equals("")) {
                fla = 1;
                kag7Mid.setBorder(BorderFactory.createLineBorder(Color.red));
            } else {
                kag7Mid.setBorder(surnameField.getBorder());
            }
        }
        ////////

        if (fla == 0) {
            //resetBoderStart
            captSur.setBorder(surnameField.getBorder());
            captFirst.setBorder(surnameField.getBorder());
            captMid.setBorder(surnameField.getBorder());

            secSur.setBorder(surnameField.getBorder());
            secFirst.setBorder(surnameField.getBorder());
            secMid.setBorder(surnameField.getBorder());

            tresSur.setBorder(surnameField.getBorder());
            tresFirst.setBorder(surnameField.getBorder());
            tresMid.setBorder(surnameField.getBorder());

            kag1Sur.setBorder(surnameField.getBorder());
            kag1First.setBorder(surnameField.getBorder());
            kag1Mid.setBorder(surnameField.getBorder());

            kag2Sur.setBorder(surnameField.getBorder());
            kag2First.setBorder(surnameField.getBorder());
            kag2Mid.setBorder(surnameField.getBorder());

            kag3Sur.setBorder(surnameField.getBorder());
            kag3First.setBorder(surnameField.getBorder());
            kag3Mid.setBorder(surnameField.getBorder());

            kag4Sur.setBorder(surnameField.getBorder());
            kag4First.setBorder(surnameField.getBorder());
            kag4Mid.setBorder(surnameField.getBorder());

            kag5Sur.setBorder(surnameField.getBorder());
            kag5First.setBorder(surnameField.getBorder());
            kag5Mid.setBorder(surnameField.getBorder());

            kag6Sur.setBorder(surnameField.getBorder());
            kag6First.setBorder(surnameField.getBorder());
            kag6Mid.setBorder(surnameField.getBorder());

            kag7Sur.setBorder(surnameField.getBorder());
            kag7First.setBorder(surnameField.getBorder());
            kag7Mid.setBorder(surnameField.getBorder());
            //resetBorderEnd

            editBtn.setVisible(true);
            CaptField.setVisible(true);
            SecField.setVisible(true);
            Kag1Field.setVisible(true);
            Kag5Field.setVisible(true);
            Kag6Field.setVisible(true);
            Kag2Field.setVisible(true);
            Kag3Field.setVisible(true);
            Kag7Field.setVisible(true);
            TresField.setVisible(true);
            Kag4Field.setVisible(true);
            SubmitBtn.setVisible(true);

            proLabel.setVisible(false);

            captSur.setVisible(false);
            captFirst.setVisible(false);
            captMid.setVisible(false);

            secSur.setVisible(false);
            secFirst.setVisible(false);
            secMid.setVisible(false);

            tresSur.setVisible(false);
            tresFirst.setVisible(false);
            tresMid.setVisible(false);

            kag1Sur.setVisible(false);
            kag1First.setVisible(false);
            kag1Mid.setVisible(false);

            kag2Sur.setVisible(false);
            kag2First.setVisible(false);
            kag2Mid.setVisible(false);

            kag3Sur.setVisible(false);
            kag3First.setVisible(false);
            kag3Mid.setVisible(false);

            kag4Sur.setVisible(false);
            kag4First.setVisible(false);
            kag4Mid.setVisible(false);

            kag5Sur.setVisible(false);
            kag5First.setVisible(false);
            kag5Mid.setVisible(false);

            kag6Sur.setVisible(false);
            kag6First.setVisible(false);
            kag6Mid.setVisible(false);

            kag7Sur.setVisible(false);
            kag7First.setVisible(false);
            kag7Mid.setVisible(false);
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    public static String getOff(String surname, String firstname, String middlename) {
        String lastName = "";
        String firstName = "";
        String middleName = "";

        String m = middlename;
        String f = firstname;
        String l = surname;

        if (m.equals("")) {
            middleName = "*";
        } else {
            if (m.contains(".")) {
                String toUp = m.toUpperCase();
                int len = toUp.length();
                String midName = toUp.charAt(0) + "";
                for (int x = 0; x < len; x++) {
                    try {
                        if (toUp.charAt(x) == '.') {
                            midName += toUp.charAt(x + 1);
                        }
                    } catch (Exception e) {

                    }
                }
                midName.replaceAll(" ", "");
                midName += ".";
                middleName = midName;
            } else if (m.contains(" ")) {

                String toUp = m.toUpperCase();
                int len = toUp.length();
                String mid = toUp.charAt(0) + "";
                for (int x = 0; x < len; x++) {
                    if (toUp.charAt(x) == ' ') {
                        mid += toUp.charAt(x + 1);
                    }
                }
                mid += ".";
                mid.replaceAll(" ", "");
                middleName = mid;
            } else {
                char startM;
                int lenM = 0;
                String upM = m.toUpperCase();
                startM = upM.charAt(0);
                lenM = m.length();
                String lastM = m.substring(1, lenM);
                middleName = startM + ". ";
            }
        }
        char startL;
        char startF;
        //char startM;

        int lenL = 0;
        int lenF = 0;
        //int lenM=0;

        String upL = l.toUpperCase();
        startL = upL.charAt(0);

        String upF = f.toUpperCase();
        startF = upF.charAt(0);

        //String upM = m.toUpperCase();
        //startM = upM.charAt(0);
        String lowL = l.toLowerCase();
        String lowF = f.toLowerCase();
        String lowM = m.toLowerCase();

        lenL = l.length();
        lenF = f.length();
        //lenM = m.length();

        String lastL = lowL.substring(1, lenL);
        String lastF = lowF.substring(1, lenF);
        //String lastM = m.substring(1, lenM);

        lastName = startL + lastL;
        firstName = startF + lastF;
        //middleName = startM+". ";

        if (lastName.contains(" ")) {
            int len = lastName.length();
            for (int x = 0; x < len; x++) {
                if (lastName.charAt(x) == ' ') {
                    String rep = " " + lastName.charAt(x + 1);
                    String repp = rep.toUpperCase();
                    String temp = lastName.replace(rep, repp);
                    lastName = temp;
                }
            }
        }
        if (firstName.contains(" ")) {
            int len = firstName.length();
            for (int x = 0; x < len; x++) {
                if (firstName.charAt(x) == ' ') {
                    String rep = " " + firstName.charAt(x + 1);
                    String repp = rep.toUpperCase();
                    String temp = firstName.replace(rep, repp);
                    firstName = temp;
                }
            }
        }
        System.out.println(lastName + ", " + firstName + " " + middleName);

        String result = lastName + ", " + firstName + " " + middleName;
        if (getFlag == 1) {
            Variables.captSurname = lastName;
            Variables.captFirstname = firstName;
            Variables.captMiddle = middleName;
            System.out.println("Captain: " + Variables.captSurname + ", " + Variables.captFirstname + " " + Variables.captMiddle);
        } else if (getFlag == 2) {
            Variables.secSurname = lastName;
            Variables.secFirstname = firstName;
            Variables.secMiddle = middleName;
            System.out.println("Secretary: " + Variables.secSurname + ", " + Variables.secFirstname + " " + Variables.secMiddle);
        } else if (getFlag == 3) {
            Variables.tresSurname = lastName;
            Variables.tresFirstname = firstName;
            Variables.tresMiddle = middleName;
            System.out.println("Tresu: " + Variables.tresSurname + ", " + Variables.tresFirstname + " " + Variables.tresMiddle);
        } else if (getFlag == 4) {
            Variables.kag1Surname = lastName;
            Variables.kag1Firstname = firstName;
            Variables.kag1Middle = middleName;
        } else if (getFlag == 5) {
            Variables.kag2Surname = lastName;
            Variables.kag2Firstname = firstName;
            Variables.kag2Middle = middleName;
        } else if (getFlag == 6) {
            Variables.kag3Surname = lastName;
            Variables.kag3Firstname = firstName;
            Variables.kag3Middle = middleName;
        } else if (getFlag == 7) {
            Variables.kag4Surname = lastName;
            Variables.kag4Firstname = firstName;
            Variables.kag4Middle = middleName;
        } else if (getFlag == 8) {
            Variables.kag5Surname = lastName;
            Variables.kag5Firstname = firstName;
            Variables.kag5Middle = middleName;
        } else if (getFlag == 9) {
            Variables.kag6Surname = lastName;
            Variables.kag6Firstname = firstName;
            Variables.kag6Middle = middleName;
        } else if (getFlag == 10) {
            Variables.kag7Surname = lastName;
            Variables.kag7Firstname = firstName;
            Variables.kag7Middle = middleName;
        }
        else if (getFlag == 11) {
            if(flag==false)
            {
                Variables.Firstname.set(searchIndex, firstName);
                Variables.Lastname.set(searchIndex, lastName);
                Variables.Middlename.set(searchIndex, middleName);
            }
            else
            {
                Variables.Firstname.set(indexes.get(searchIndex), firstName);
                Variables.Lastname.set(indexes.get(searchIndex), lastName);
                Variables.Middlename.set(indexes.get(searchIndex), middleName);
            }
        }
        else if (getFlag == 12) {
            if(flag==false)
            {
                Variables.firstnameMother.set(searchIndex, firstName);
                Variables.surnameMother.set(searchIndex, lastName);
                Variables.midnameMother.set(searchIndex, middleName);     
            }
            else
            {
                Variables.firstnameMother.set(indexes.get(searchIndex), firstName);
                Variables.surnameMother.set(indexes.get(searchIndex), lastName);
                Variables.midnameMother.set(indexes.get(searchIndex), middleName);
            }
        }
        else if (getFlag == 13) {
            if(flag==false)
            {
                Variables.firstnameFather.set(searchIndex, firstName);
                Variables.surnameFather.set(searchIndex, lastName);
                Variables.midnameFather.set(searchIndex, middleName);     
            }
            else
            {
                Variables.firstnameFather.set(indexes.get(searchIndex), firstName);
                Variables.surnameFather.set(indexes.get(searchIndex), lastName);
                Variables.midnameFather.set(indexes.get(searchIndex), middleName);
            }
        }
        
        return result;
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed

        int passFlag = 0;
        EnterPass ad = new EnterPass();

        ImageIcon icon = new ImageIcon("pass.png");

        String[] options = new String[2];
        options[0] = new String("Enter");
        options[1] = new String("Cancel");
        int pick = JOptionPane.showOptionDialog(null, ad, "ENTER PASSWORD", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);

        for (;;) {
            String oldpw = EnterPass.enterpasstxt.getText();

            if (pick == 0) {
                if (oldpw.equals("")) {
                    EnterPass.enterpasstxt.setBorder(BorderFactory.createLineBorder(Color.red));

                    pick = JOptionPane.showOptionDialog(null, ad, "ENTER PASSWORD", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);

                } else {
                    EnterPass.enterpasstxt.setBorder(surnameField.getBorder());

                    if (oldpw.equals(Variables.AdminPass.get(0).toString())) {
                        passFlag = 1;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Password Do Not Match!", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                        pick = JOptionPane.showOptionDialog(null, ad, "ENTER PASSWORD", 0, JOptionPane.INFORMATION_MESSAGE, icon, options, null);
                    }
                }
            } else {
                break;
            }

        }

        if (passFlag == 1) {

            editBtn.setVisible(false);
            CaptField.setVisible(false);
            SecField.setVisible(false);
            Kag1Field.setVisible(false);
            Kag5Field.setVisible(false);
            Kag6Field.setVisible(false);
            Kag2Field.setVisible(false);
            Kag3Field.setVisible(false);
            Kag7Field.setVisible(false);
            TresField.setVisible(false);
            Kag4Field.setVisible(false);
            SubmitBtn.setVisible(false);

            proLabel.setVisible(true);
            captSur.setVisible(true);
            captFirst.setVisible(true);
            captMid.setVisible(true);

            secSur.setVisible(true);
            secFirst.setVisible(true);
            secMid.setVisible(true);

            tresSur.setVisible(true);
            tresFirst.setVisible(true);
            tresMid.setVisible(true);

            kag1Sur.setVisible(true);
            kag1First.setVisible(true);
            kag1Mid.setVisible(true);

            kag2Sur.setVisible(true);
            kag2First.setVisible(true);
            kag2Mid.setVisible(true);

            kag3Sur.setVisible(true);
            kag3First.setVisible(true);
            kag3Mid.setVisible(true);

            kag4Sur.setVisible(true);
            kag4First.setVisible(true);
            kag4Mid.setVisible(true);

            kag5Sur.setVisible(true);
            kag5First.setVisible(true);
            kag5Mid.setVisible(true);

            kag6Sur.setVisible(true);
            kag6First.setVisible(true);
            kag6Mid.setVisible(true);

            kag7Sur.setVisible(true);
            kag7First.setVisible(true);
            kag7Mid.setVisible(true);

            //setText
            captSur.setText(Variables.captSurname);
            captFirst.setText(Variables.captFirstname);
            captMid.setText(Variables.captMiddle);

            secSur.setText(Variables.secSurname);
            secFirst.setText(Variables.secFirstname);
            secMid.setText(Variables.secMiddle);

            tresSur.setText(Variables.tresSurname);
            tresFirst.setText(Variables.tresFirstname);
            tresMid.setText(Variables.tresMiddle);

            kag1Sur.setText(Variables.kag1Surname);
            kag1First.setText(Variables.kag1Firstname);
            kag1Mid.setText(Variables.kag1Middle);

            kag2Sur.setText(Variables.kag2Surname);
            kag2First.setText(Variables.kag2Firstname);
            kag2Mid.setText(Variables.kag2Middle);

            kag3Sur.setText(Variables.kag3Surname);
            kag3First.setText(Variables.kag3Firstname);
            kag3Mid.setText(Variables.kag3Middle);

            kag4Sur.setText(Variables.kag4Surname);
            kag4First.setText(Variables.kag4Firstname);
            kag4Mid.setText(Variables.kag4Middle);

            kag5Sur.setText(Variables.kag5Surname);
            kag5First.setText(Variables.kag5Firstname);
            kag5Mid.setText(Variables.kag5Middle);

            kag6Sur.setText(Variables.kag6Surname);
            kag6First.setText(Variables.kag6Firstname);
            kag6Mid.setText(Variables.kag6Middle);

            kag7Sur.setText(Variables.kag7Surname);
            kag7First.setText(Variables.kag7Firstname);
            kag7Mid.setText(Variables.kag7Middle);
            //setText

        }


    }//GEN-LAST:event_editBtnActionPerformed
    public Icon ResizeImage(String ImagePath) {

        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picLbl.getWidth(), picLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Logout?", "LOGOUT", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            Login log = new Login();
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        MainPanel.setVisible(false);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(false);
        ProfilePanel.setVisible(false);
        officialP.setVisible(false);
        editProfile.setVisible(true);

        if (flag == false) {
            surnameField1.setText((String) Variables.Lastname.get(searchIndex));
            firstField1.setText((String) Variables.Firstname.get(searchIndex));
            middleField1.setText((String) Variables.Middlename.get(searchIndex));
            if (Variables.Gender.get(searchIndex).equals("Male")) {
                maleRadio1.setSelected(true);
            } else {
                femaleRadio1.setSelected(true);
            }
            religionField1.setText((String) Variables.Religion.get(searchIndex));
            bdayField1.setText((String) Variables.Birthday.get(searchIndex));
            if (Variables.Civilstatus.get(searchIndex).equals("Single")) {
                civilCombo1.setSelectedItem("Single");
            } else {
                civilCombo1.setSelectedItem("Married");
            }
            houseNumField1.setText((String) Variables.Housenumber.get(searchIndex));
            if (Variables.Zone.get(searchIndex).equals("Zone 1")) {
                zoneCombo.setSelectedItem("Zone 1");
            }
            if (Variables.Zone.get(searchIndex).equals("Zone 2")) {
                zoneCombo.setSelectedItem("Zone 2");
            }
            if (Variables.Zone.get(searchIndex).equals("Zone 3")) {
                zoneCombo.setSelectedItem("Zone 3");
            }
            if (Variables.Zone.get(searchIndex).equals("Zone 4")) {
                zoneCombo.setSelectedItem("Zone 4");
            }
            if (Variables.Zone.get(searchIndex).equals("Zone 5")) {
                zoneCombo.setSelectedItem("Zone 5");
            }
            if (Variables.Zone.get(searchIndex).equals("Zone Buga")) {
                zoneCombo.setSelectedItem("Zone Buga");
            }
            surmotherField1.setText((String) Variables.surnameMother.get(searchIndex));
            firstmotherField1.setText((String) Variables.firstnameMother.get(searchIndex));
            midmotherField1.setText((String) Variables.midnameMother.get(searchIndex));
            surfatherField1.setText((String) Variables.surnameFather.get(searchIndex));
            firstfatherField1.setText((String) Variables.firstnameFather.get(searchIndex));
            midfatherField1.setText((String) Variables.midnameFather.get(searchIndex));
        } else {
            surnameField1.setText((String) Variables.Lastname.get(indexes.get(searchIndex)));
            firstField1.setText((String) Variables.Firstname.get(indexes.get(searchIndex)));
            middleField1.setText((String) Variables.Middlename.get(indexes.get(searchIndex)));
            bdayField1.setText((String) Variables.Birthday.get(indexes.get(searchIndex)));
            if (Variables.Civilstatus.get(indexes.get(searchIndex)).equals("Single")) {
                civilCombo1.setSelectedItem("Single");
            } else {
                civilCombo1.setSelectedItem("Married");
            }
            houseNumField1.setText((String) Variables.Housenumber.get(indexes.get(searchIndex)));
            if (Variables.Zone.get(indexes.get(searchIndex)).equals("Zone 1")) {
                zoneCombo.setSelectedItem("Zone 1");
            }
            if (Variables.Zone.get(indexes.get(searchIndex)).equals("Zone 2")) {
                zoneCombo.setSelectedItem("Zone 2");
            }
            if (Variables.Zone.get(indexes.get(searchIndex)).equals("Zone 3")) {
                zoneCombo.setSelectedItem("Zone 3");
            }
            if (Variables.Zone.get(indexes.get(searchIndex)).equals("Zone 4")) {
                zoneCombo.setSelectedItem("Zone 4");
            }
            if (Variables.Zone.get(indexes.get(searchIndex)).equals("Zone 5")) {
                zoneCombo.setSelectedItem("Zone 5");
            }
            if (Variables.Zone.get(indexes.get(searchIndex)).equals("Zone Buga")) {
                zoneCombo.setSelectedItem("Zone 1");
            }
            surmotherField1.setText((String) Variables.surnameMother.get(indexes.get(searchIndex)));
            firstmotherField1.setText((String) Variables.firstnameMother.get(indexes.get(searchIndex)));
            midmotherField1.setText((String) Variables.midnameMother.get(indexes.get(searchIndex)));
            surfatherField1.setText((String) Variables.surnameFather.get(indexes.get(searchIndex)));
            firstfatherField1.setText((String) Variables.firstnameFather.get(indexes.get(searchIndex)));
            midfatherField1.setText((String) Variables.midnameFather.get(indexes.get(searchIndex)));

        }
    }//GEN-LAST:event_EditProfileActionPerformed

    private void changePicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePicBtnActionPerformed

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            Variables.path = selectedFile.getAbsolutePath();
            picLbl.setIcon(ResizeImage(Variables.path));
            if (flag == false) {
                Variables.userPath.set(searchIndex, Variables.path);
            } else {
                Variables.userPath.set(indexes.get(searchIndex), Variables.path);
            }
        }

    }//GEN-LAST:event_changePicBtnActionPerformed

    private void removePicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePicBtnActionPerformed

        if (flag == false) {
            Variables.userPath.set(searchIndex, "default.png");

        } else {
            Variables.userPath.set(indexes.get(searchIndex), "default.png");
        }
        picLbl.setIcon(ResizeImage("default.png"));
    }//GEN-LAST:event_removePicBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Records req = new Records();
        req.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        createDocu doc = new createDocu();
        doc.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        MainPanel.setVisible(false);
        CensusPanel.setVisible(false);
        AddCitizenPanel.setVisible(false);
        RecordsPanel.setVisible(true);
        ProfilePanel.setVisible(false);
        editProfile.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SubmitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtn1ActionPerformed
        if (!surnameField1.getText().equals("")
                && !firstField1.getText().equals("")
                && !middleField1.getText().equals("")
                && !religionField1.getText().equals("")
                && !houseNumField1.getText().equals("")
                && !surmotherField1.getText().equals("")
                && !firstmotherField1.getText().equals("")
                && !midmotherField1.getText().equals("")
                && !surfatherField1.getText().equals("") 
                && !firstfatherField1.getText().equals("")
                && !midfatherField1.getText().equals("")) {
            if (flag == false) {
                getFlag=11;
                String temp = getOff(surnameField1.getText().trim(), firstField1.getText().trim(),middleField1.getText().trim());
                Variables.Fullname.set(searchIndex, temp);
                Variables.Religion.set(searchIndex, religionField1.getText());
                Variables.Housenumber.set(searchIndex, houseNumField1.getText());
                getFlag=12;
                Variables.FullnameMother.set(searchIndex, getOff(surmotherField1.getText().trim(), firstmotherField1.getText().trim(),midmotherField1.getText().trim()));
                getFlag=13;
                Variables.FullnameFather.set(searchIndex, getOff(surfatherField1.getText().trim(), firstfatherField1.getText().trim(),midfatherField1.getText().trim()));
                Variables.Zone.set(searchIndex, zoneCombo.getSelectedItem());
                Variables.Civilstatus.set(searchIndex, civilCombo1.getSelectedItem());
                Variables.FullAddress.set(searchIndex, "#" + houseNumField1.getText() + " " + zoneCombo.getSelectedItem() + " Sta. Elena Hagonoy, Bulacan");
            } else {
                getFlag=11;
                String temp = getOff(surnameField1.getText().trim(), firstField1.getText().trim(),middleField1.getText().trim());
                Variables.Fullname.set(indexes.get(searchIndex), temp);
                Variables.Religion.set(indexes.get(searchIndex), religionField1.getText());
                Variables.Housenumber.set(indexes.get(searchIndex), houseNumField1.getText());
                getFlag=12;
                Variables.FullnameMother.set(indexes.get(searchIndex), getOff(surmotherField1.getText().trim(), firstmotherField1.getText().trim(),midmotherField1.getText().trim()));
                getFlag=13;
                Variables.FullnameFather.set(indexes.get(searchIndex), getOff(surfatherField1.getText().trim(), firstfatherField1.getText().trim(),midfatherField1.getText().trim()));
                Variables.Zone.set(indexes.get(searchIndex), zoneCombo.getSelectedItem());
                Variables.Civilstatus.set(indexes.get(searchIndex), civilCombo1.getSelectedItem());
                Variables.FullAddress.set(indexes.get(searchIndex), "#" + houseNumField1.getText() + " " + zoneCombo.getSelectedItem() + " Sta. Elena Hagonoy, Bulacan");
            }
            JOptionPane.showMessageDialog(null, "Saved");
            MainPanel.setVisible(false);
            CensusPanel.setVisible(false);
            AddCitizenPanel.setVisible(false);
            RecordsPanel.setVisible(true);
            ProfilePanel.setVisible(false);
            editProfile.setVisible(false);
            showRecords();
            //ProfilePanel.revalidate();
            //ProfilePanel.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Don't leave blank fields.");
        }
    }//GEN-LAST:event_SubmitBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    private void setsIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("topLogo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel AddCitizenPanel;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BirthdayLbl;
    private javax.swing.JTextField CaptField;
    private javax.swing.JButton CensusBtn;
    private javax.swing.JPanel CensusPanel;
    private javax.swing.JLabel CivilStatLbl;
    private javax.swing.JButton EditProfile;
    private javax.swing.JLabel FamLbl1;
    private javax.swing.JLabel FamLbl2;
    private javax.swing.JLabel FamLbl3;
    private javax.swing.JLabel FamLbl4;
    private javax.swing.JLabel FamLbl5;
    private javax.swing.JLabel FamLbl6;
    private javax.swing.JLabel FatNameLbl;
    private javax.swing.JLabel FullAddressLbl;
    private javax.swing.JLabel FullnameLbl;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel HouLbl1;
    private javax.swing.JLabel HouLbl2;
    private javax.swing.JLabel HouLbl3;
    private javax.swing.JLabel HouLbl4;
    private javax.swing.JLabel HouLbl5;
    private javax.swing.JLabel HouLbl6;
    private javax.swing.JTextField Kag1Field;
    private javax.swing.JTextField Kag2Field;
    private javax.swing.JTextField Kag3Field;
    private javax.swing.JTextField Kag4Field;
    private javax.swing.JTextField Kag5Field;
    private javax.swing.JTextField Kag6Field;
    private javax.swing.JTextField Kag7Field;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MotNameLbl;
    private javax.swing.JMenuItem OffView;
    private javax.swing.JLabel PeoLbl1;
    private javax.swing.JLabel PeoLbl2;
    private javax.swing.JLabel PeoLbl3;
    private javax.swing.JLabel PeoLbl4;
    private javax.swing.JLabel PeoLbl5;
    private javax.swing.JLabel PeoLbl6;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JPanel RecordsPanel;
    private javax.swing.JLabel ReligionLbl;
    private javax.swing.JTextField SecField;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton SubmitBtn1;
    private javax.swing.JTextField TresField;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JTextField bdayField1;
    private javax.swing.JTextField captFirst;
    private javax.swing.JTextField captMid;
    private javax.swing.JTextField captSur;
    private javax.swing.JButton changePicBtn;
    private javax.swing.JComboBox<String> civilCombo;
    private javax.swing.JComboBox<String> civilCombo1;
    private javax.swing.JSpinner daySpinner;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel editProfile;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JRadioButton femaleRadio1;
    private javax.swing.JTextField firstFField;
    private javax.swing.JTextField firstField;
    private javax.swing.JTextField firstField1;
    private javax.swing.JTextField firstMField;
    private javax.swing.JTextField firstfatherField1;
    private javax.swing.JTextField firstmotherField1;
    private javax.swing.JTextField houseNumField;
    private javax.swing.JTextField houseNumField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField kag1First;
    private javax.swing.JTextField kag1Mid;
    private javax.swing.JTextField kag1Sur;
    private javax.swing.JTextField kag2First;
    private javax.swing.JTextField kag2Mid;
    private javax.swing.JTextField kag2Sur;
    private javax.swing.JTextField kag3First;
    private javax.swing.JTextField kag3Mid;
    private javax.swing.JTextField kag3Sur;
    private javax.swing.JTextField kag4First;
    private javax.swing.JTextField kag4Mid;
    private javax.swing.JTextField kag4Sur;
    private javax.swing.JTextField kag5First;
    private javax.swing.JTextField kag5Mid;
    private javax.swing.JTextField kag5Sur;
    private javax.swing.JTextField kag6First;
    private javax.swing.JTextField kag6Mid;
    private javax.swing.JTextField kag6Sur;
    private javax.swing.JTextField kag7First;
    private javax.swing.JTextField kag7Mid;
    private javax.swing.JTextField kag7Sur;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JRadioButton maleRadio1;
    private javax.swing.JTextField middleFField;
    private javax.swing.JTextField middleField;
    private javax.swing.JTextField middleField1;
    private javax.swing.JTextField middleMField;
    private javax.swing.JTextField midfatherField1;
    private javax.swing.JTextField midmotherField1;
    private javax.swing.JSpinner monthSpinner;
    private javax.swing.JPanel officialP;
    private javax.swing.JLabel oficialLabel;
    private javax.swing.JLabel picLbl;
    private javax.swing.JPanel picP;
    private javax.swing.JLabel proLabel;
    private javax.swing.JTable recordsTable;
    private javax.swing.JTextField religionField;
    private javax.swing.JTextField religionField1;
    private javax.swing.JButton removePicBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchAuto;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchCombo;
    private javax.swing.JTextField secFirst;
    private javax.swing.JTextField secMid;
    private javax.swing.JTextField secSur;
    private javax.swing.JTextField surfatherField1;
    private javax.swing.JTextField surmotherField1;
    private javax.swing.JTextField surnameFField;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField surnameField1;
    private javax.swing.JTextField surnameMField;
    private javax.swing.JTextField tresFirst;
    private javax.swing.JTextField tresMid;
    private javax.swing.JTextField tresSur;
    private javax.swing.JSpinner yearSpinner;
    private javax.swing.JComboBox<String> zoneCombo;
    // End of variables declaration//GEN-END:variables
}
