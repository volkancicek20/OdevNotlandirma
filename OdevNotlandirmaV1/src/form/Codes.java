package form;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Codes {
    Connection con = null;
    PreparedStatement ps = null;
    
    public int Register(int No,String name,String surname,String password,String dp,int level){
        
        String query = "Select * From students";
        try{
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next())
            {
                int StdNo = rs.getInt("No");
                if(StdNo == No)
                {
                    return -2;
                }
            }  
        } catch (Exception e) {

        }
        String query2 = "INSERT INTO students VALUES (?, ?, ?, ?, ?, ?)";
        String query3 = "INSERT INTO studentNoteCheck VALUES (?,?,?,?)";
        try{
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query2);
            ps.setInt(1, No);
            ps.setString(2, name);
            ps.setString(3, surname);
            ps.setString(4, password);
            ps.setString(5, dp);
            ps.setInt(6, level);
            ps.executeUpdate();
            ps = con.prepareStatement(query3);
            ps.setInt(1, No);
            ps.setString(2, "Tanımlanmadı");
            ps.setInt(3, 0);
            ps.setInt(4, 0);
            ps.executeUpdate();
            return 1;
        }catch(Exception ex){
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public boolean LoginInstructors(int No,String password){
        try{
            String query = "Select * From instructor where No = ? and Sifre = ?";
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.56.1;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            
            ps.setInt(1, No);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
        catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean LoginStudents(int No,String password){
        try{
            String query = "Select * From students where No = ? and Sifre = ?";
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.56.1;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            ps.setInt(1, No);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
        catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public ArrayList FetchStudentInfo()
    {
        ArrayList<String> studentInfoArrayList = new ArrayList<String>();
        String query = "Select * From students";
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                int No = rs.getInt("No");
                String Ad = rs.getString("Ad");
                String Soyad = rs.getString("Soyad");
                
                studentInfoArrayList.add(String.valueOf(No));
                studentInfoArrayList.add(Ad);
                studentInfoArrayList.add(Soyad);
            }
            return studentInfoArrayList;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList bringStudentAssignments(int No)
    {
        ArrayList<String> studentLessonInfoArrayList = new ArrayList<String>();
        String query = "Select OdevAdi, OdevKontrol FROM studentNoteCheck where No = ?"; 
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            
            ResultSet rs;
            while(true)
            {
                ps.setInt(1, No);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    String OdevAdi = rs.getString("OdevAdi");
                    String OdevKontrol = rs.getString("OdevKontrol");
                    studentLessonInfoArrayList.add(OdevAdi);
                    studentLessonInfoArrayList.add(OdevKontrol);
                    break;
                }
                
            }
            return studentLessonInfoArrayList;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList FetchStudentInfo2(int No)
    {
        ArrayList<String> studentInfo2 = new ArrayList<String>();
        String query = "Select BolumAdi, Sinif FROM students where No = ?"; 
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            ResultSet rs;
            while(true)
            {
                ps.setInt(1, No);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    String BolumAdi = rs.getString("BolumAdi");
                    int Sinif = rs.getInt("Sinif");
                    studentInfo2.add(String.valueOf(No));
                    studentInfo2.add(BolumAdi);
                    studentInfo2.add(String.valueOf(Sinif));
                    break;
                }
                
            }
            return studentInfo2;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList FetchStudentInfo(int No)
    {
        ArrayList<String> studentInfo2 = new ArrayList<String>();
        String query = "Select Ad, Soyad, BolumAdi, Sinif FROM students where No = ?"; 
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.56.1;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            ResultSet rs;
            while(true)
            {
                ps.setInt(1, No);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    String Ad = rs.getString("Ad");
                    String Soyad = rs.getString("Soyad");
                    String BolumAdi = rs.getString("BolumAdi");
                    int Sinif = rs.getInt("Sinif");
                    studentInfo2.add(String.valueOf(No));
                    studentInfo2.add(Ad);
                    studentInfo2.add(Soyad);
                    studentInfo2.add(BolumAdi);
                    studentInfo2.add(String.valueOf(Sinif));
                    break;
                }
                
            }
            return studentInfo2;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList FetchStudentInfo3(int No)
    {
        ArrayList<String> studentInfo3 = new ArrayList<String>();
        String query = "Select OdevAdi, OdevNotu FROM studentNoteCheck where No = ?"; 
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            
            ResultSet rs;
            while(true)
            {
                ps.setInt(1, No);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    String OdevAdi = rs.getString("OdevAdi");
                    int Notu = rs.getInt("OdevNotu");
                    studentInfo3.add(OdevAdi);
                    studentInfo3.add(String.valueOf(Notu));
                    break;
                }
            }
            return studentInfo3;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList FetchStudentOdevAdi(int No)
    {
        ArrayList<String> studentInfoOdevAdi = new ArrayList<String>();
        String query = "Select OdevAdi FROM studentNoteCheck where No = ?"; 
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            
            ResultSet rs;
            while(true)
            {
                ps.setInt(1, No);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    String OdevAdi = rs.getString("OdevAdi");
                    studentInfoOdevAdi.add(OdevAdi);
                    break;
                }
            }
            return studentInfoOdevAdi;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList FetchStudentInfoCopyNo(int No)
    {
        ArrayList<String> studentInfoCopyNo = new ArrayList<String>();
        String query = "Select No FROM studentNoteCheck where No = ?"; 
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            
            ResultSet rs;
            while(true)
            {
                ps.setInt(1, No);
                rs = ps.executeQuery();
                if(rs.next())
                {
                    int stdNo = rs.getInt("No");
                    studentInfoCopyNo.add(String.valueOf(stdNo));
                    break;
                }
            }
            return studentInfoCopyNo;
            
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList studentNoteCheckUptade(int No, String OdevAdi, int OdevNotu)
    {
        ArrayList<String> studentCheckUptade = new ArrayList<String>();
        studentCheckUptade.add(OdevAdi);
        studentCheckUptade.add(String.valueOf(OdevNotu));
        String query = "UPDATE studentNoteCheck set OdevAdi = ?, OdevNotu = ?, OdevKontrol = ? where No = ?";
        try { 
            con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.24;databaseName=class; user=sa; password=admin321; encrypt=true; trustServerCertificate=true");
            ps = con.prepareStatement(query);
            ps.setString(1, OdevAdi);
            ps.setInt(2, OdevNotu);
            ps.setString(3, "");
            ps.setInt(4, No);
            ps.executeUpdate();
            return studentCheckUptade;
        } catch (SQLException ex) {
            
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
