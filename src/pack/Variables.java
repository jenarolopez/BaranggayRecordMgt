
package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Variables {
    
    public static ArrayList<String> Fullname = new ArrayList();
    public static ArrayList Firstname = new ArrayList();
    public static ArrayList Lastname = new ArrayList();
    public static ArrayList Middlename = new ArrayList();
    public static ArrayList Birthday = new ArrayList();
    public static ArrayList Gender = new ArrayList();
    public static ArrayList Religion = new ArrayList();
    public static ArrayList Housenumber = new ArrayList();
    public static ArrayList Zone = new ArrayList();
    public static ArrayList Fulladdress = new ArrayList();
    public static ArrayList FullnameMother = new ArrayList();
    public static ArrayList surnameMother = new ArrayList();
    public static ArrayList firstnameMother = new ArrayList();
    public static ArrayList midnameMother = new ArrayList();
    public static ArrayList FullnameFather = new ArrayList();
    public static ArrayList surnameFather = new ArrayList();
    public static ArrayList firstnameFather = new ArrayList();
    public static ArrayList midnameFather = new ArrayList();
    public static ArrayList Civilstatus = new ArrayList();
    public static ArrayList FullAddress = new ArrayList();
    public static ArrayList<Integer> Unique = new ArrayList();
    public static ArrayList AdminPass = new ArrayList();
    public static ArrayList <String> userPath = new ArrayList();
    
    public static String path="";
    
    public static int UniId=0;
    public static String [][] Records;
    public static String [][] Certificate;
    public static int recordsCount=0;
    public static int CertificateCount=0;
    
    
    public static String captFullname = "Reyes III, Doroteo M.";
    public static String captSurname = "Reyes III";
    public static String captFirstname = "Doroteo";
    public static String captMiddle = "M.";
    
    public static String secFullname = "Del Rosario, Ronaldo M.";
    public static String secSurname = "Del Rosario";
    public static String secFirstname = "Ronaldo";
    public static String secMiddle = "M.";
    
    public static String tresFullname = "Dalmacio, Alvin D.";
    public static String tresSurname = "Dalmacio";
    public static String tresFirstname = "Alvin";
    public static String tresMiddle = "D.";
    
    public static String kag1Fullname = "Martin, Liberto F.";
    public static String kag1Surname = "Martin";
    public static String kag1Firstname = "Liberto";
    public static String kag1Middle = "F.";
    
    public static String kag2Fullname = "Magbitang, Daniel T.";
    public static String kag2Surname = "Magbitang";
    public static String kag2Firstname = "Daniel";
    public static String kag2Middle = "T.";
    
    public static String kag3Fullname = "Alfonso, Leonora R.";
    public static String kag3Surname = "Alfonso";
    public static String kag3Firstname = "Leonora";
    public static String kag3Middle = "R.";
    
    public static String kag4Fullname = "Miranda, Carolina F.";
    public static String kag4Surname = "Miranda";
    public static String kag4Firstname = "Carolina";
    public static String kag4Middle = "F.";
    
    public static String kag5Fullname = "Agulto, Marcelino F.";
    public static String kag5Surname = "Agulto";
    public static String kag5Firstname = "Marcelino";
    public static String kag5Middle = "F.";
    
    public static String kag6Fullname = "Dalmacio Sr, Herminio A.";
    public static String kag6Surname = "Dalmacio Sr";
    public static String kag6Firstname = "Herminio";
    public static String kag6Middle = "A.";
    
    public static String kag7Fullname = "Vistan, Arturo A.";
    public static String kag7Surname = "Vistan";
    public static String kag7Firstname = "Arturo";
    public static String kag7Middle = "A.";
    
    
    static final String JDBC_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        static final String DB_URL="jdbc:sqlserver://localhost:1433;DBSERVER=RecordsKeeping";

        static final String user="krishield";
        static final String pass="1234";
        
        static Connection conn = null;
        static Statement stmt = null;
        static PreparedStatement statement = null;
        static ResultSet rs  = null;  
    
    
    public static void main(String[] args) {
        
        
//         try 
//            {
//                Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                conn = DriverManager.getConnection(DB_URL,user,pass);
//                System.out.println ("Successfully Connected");
//
//                //Creating Table---------------------------------------------------------------------
//                stmt = conn.createStatement();
//                String admin = "create table ADMEN (Admin_id int primary key identity(1,1),"
//                        + "admin_user varchar (30),"
//                        + "admin_pass varchar(30),"
//                        + "report_id int,"
//                        + "req_id int, "
//                        + "stud_no int,"
//                        + "Register_count int,"
//                        + "Candidate_count int,)";
//                stmt.executeUpdate(admin);
//                System.out.println("Table created");
//            
//                stmt = conn.createStatement();
//                String stud = "create table STUDENT (Student_id int primary key,"
//                        + "Fname varchar(30),"
//                        + "Lname varchar(30),"
//                        + "Mname varchar(30), "
//                        + "age int, "
//                        + "gender varchar(20),"
//                        + "contact int,"
//                        + "address varchar(100),"
//                        + "emailAddress varchar(100), "
//                        + "Course varchar(50),"
//                        + "Years varchar(50),"
//                        + "Section varchar(50),"
//                        + "Groups varchar(50), "
//                        + "Password varchar(50),"
//                        + "Position varchar(50),"
//                        + "password_flag varchar(3))";
//                stmt.executeUpdate(stud);
//                System.out.println("Table created");
//                
//                stmt = conn.createStatement();
//                String Request = "create table REQUEST (Request_id int primary key,"
//                        + "Position varchar(50),"
//                        + "Status varchar(50),"
//                        + "Student_id int,"
//                        + "position_id int,)";
//                stmt.executeUpdate(Request);
//                System.out.println("Table created");
//                
//                stmt = conn.createStatement();
//                String posi = "create table POSITION (Position_id int primary key,"
//                        + "Position_Name varchar(50))";
//                stmt.executeUpdate(posi);
//                System.out.println("Table created");
//                
//                stmt = conn.createStatement();
//                String vote = "create table VOTE (vote_id int primary key identity(1,1),"
//                        + "Gov_vote varchar(50),"
//                        + "Vice_vote varchar(50),"
//                        + "Act_vote varchar(50),"
//                        + "Bsit_vote varchar(50),"
//                        + "Bit_vote varchar(50),"
//                        + "Student_no int,)";
//                stmt.executeUpdate(vote);
//                System.out.println("Table created");
//                
//                stmt = conn.createStatement();
//                String ballot = "create table BALLOT (ballot_id int primary key,"
//                        + "vote_id int,"
//                        + "Position_id int,)";
//                stmt.executeUpdate(ballot);
//                System.out.println("Table created");
//                
//                stmt = conn.createStatement();
//                String Report = "create table REPORT (report_id int primary key,"
//                        + "ballot_id int,"
//                        + "vote_count int,)";
//                stmt.executeUpdate(Report);
//                System.out.println("Table created");
//                //Creating Table---------------------------------------------------------------------
//                //adding constraint---------------------------------------------------------------------
//                stmt = conn.createStatement();
//                String admencons ="alter table ADMEN\n"
//                        + "add constraint stud_no_fk foreign key(stud_no) references STUDENT(Student_id),"
//                        + "constraint report_id_fk foreign key(report_id) references REPORT(report_id),"
//                        + "constraint req_id_fk foreign key(req_id) references REQUEST(Request_id)";
//                stmt.executeUpdate(admencons);
//                
//                stmt = conn.createStatement();
//                String requestcons ="alter table REQUEST\n"
//                        + "add constraint stud_id_fk foreign key(Student_id) references STUDENT(Student_id),"
//                        + "constraint posi_id_fk foreign key(position_id) references POSITION(Position_id)";
//                stmt.executeUpdate(requestcons);
//                
//                stmt = conn.createStatement();
//                String votecons ="alter table VOTE\n"
//                        + "add constraint stod_id_fk foreign key(Student_no) references STUDENT(Student_id)";
//                stmt.executeUpdate(votecons);
//                
//                stmt = conn.createStatement();
//                String ballotcons ="alter table BALLOT\n"
//                        + "add constraint vote_id_fk foreign key(vote_id) references VOTE(vote_id),"
//                        + "constraint pusi_id_fk foreign key(Position_id) references POSITION(Position_id)";
//                stmt.executeUpdate(ballotcons);
//                
//                stmt = conn.createStatement();
//                String reportcons ="alter table REPORT\n"
//                        + "add constraint bal_id_fk foreign key(ballot_id) references BALLOT(ballot_id)";
//                stmt.executeUpdate(reportcons);
//                //adding constraint---------------------------------------------------------------------
//            }   
//         catch(SQLException e)
//            {
//                System.out.println(e.getMessage());
//            }
//         catch (Exception e) 
//            {
//                System.out.println(e.getMessage());
//            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        AdminPass.add("admin");
        
        
        Records = new String [Fullname.size()+1][recordsCount+1];
        Certificate = new String [Fullname.size()+1][CertificateCount+1];
        
        Login wer = new Login();
        wer.setVisible(true);
        
    }
    
}
