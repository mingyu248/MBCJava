package com.mbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
  
  /**
   * DB 연결
   * @return conn DB 연결 객체
   */
  public static Connection connect() {
    
    // DB 연결 객체
    Connection conn = null;
    
    // DB 연결 요소
    // JDBC driver
    // URL
    // 계정 ID/PW
    
    // jdbc:oracle:thin:@localhost:1521:xe 해석
    // jdbc       : jdbc 라이브러리
    // oracle     : 오라클로 연결
    // thin       : 자바로 연결 (반대는 OCI - OS로 작동)
    // @localhost :  내 내부 아이피로 접속
    // 1521       : 포트번호
    // XE         : 리스너
    String driver = "oracle.jdbc.OracleDriver";
    String url    = "jdbc:oracle:thin:@localhost:1521:xe";
    String id     = "java";
    String pw     = "java";
    
    // 에러가 많이 발생하는 부분이어서 예외처리를 필수로 걸게 돼있다
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
      System.err.println("ClassNotFoundException 에러 : " + e);
      e.printStackTrace();
    }
    
    return conn;
  }
  
  /**
   * DB 자원 반납(close)
   * @param pstmt SQL 처리 객체
   * @param rs SQL 결과셋 객체
   * @param conn DB 연결 객체
   */
  public static void close(PreparedStatement pstmt, ResultSet rs, Connection conn) {
    
    try {
      if (rs != null) {
        rs.close();
      }
      if (pstmt != null) {
        pstmt.close();
      }
      if (conn != null) {
        conn.close();
      } 
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  
  
  
  
  
  
}
