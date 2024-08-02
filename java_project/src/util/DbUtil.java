package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {

  /**
   * DB 연결
   * 
   * @return DB 연결 객체
   */
  public static Connection connect() {
    
    // DB 연결 객체
    Connection conn = null;
    
    // DB 연결 요소 
    // JDBC driver
    // URL
    // 계정 ID/PW
    String driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String id = "java";
    String pw = "java";
    
    try {
      
      Class.forName(driver); // JDBC 드라이버 등록
      
      try {
        // DB 연결
        conn = DriverManager.getConnection(url, id, pw);
        
      } catch (SQLException e) {
        System.err.println("SQL 에러 : " + e);
        e.printStackTrace();
      }
      
    } catch (ClassNotFoundException e) {
      System.err.println("CNFE 에러 : " + e);
      e.printStackTrace();
    }
    
    return conn;
  }
  
  /**
   * DB 자원 반납(close)
   * 
   * @param pstmt SQL 처리 객체
   * @param rs SQL 결과셋 객체
   * @param conn DB 연결 객체
   */
  public static void close(PreparedStatement pstmt,
               ResultSet rs,
               Connection conn) {
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    
    if (pstmt != null) {
      try {
        pstmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    
  } //
  
}