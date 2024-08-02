package com.mbc.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

  public static void main(String[] args) {
    
    Connection conn = DbUtil.connect();
    
    
    
    ////////////////////////////////////
    String sql = "INSERT INTO MEMBER_TBL VALUES "
               + "(?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";
    
    PreparedStatement pstmt = null;
    
    try {
      
      // 자동 커밋 모드 => 수동 커밋 모드 전환
      // commit / rollback
      conn.setAutoCommit(false);
      
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, "abcd2222");
      pstmt.setString(2, "#Abcd1234");
      pstmt.setString(3, "신유빈");
      pstmt.setString(4, "f");
      pstmt.setString(5, "shin@naver.com");
      pstmt.setString(6, "010-9898-4545");
      pstmt.setString(7, "02-1111-2222");
      pstmt.setString(8, "12343");
      pstmt.setString(9, "서울특별시 노원구 화랑로 727");
      pstmt.setString(10, "서울특별시 노원구 공릉동 26-17");
      pstmt.setString(11, "태릉선수촌");
      pstmt.setDate(12, Date.valueOf("2024-07-29"));
      
      if(pstmt.executeUpdate() == 1) {
        System.out.println("회원정보 저장 성공");
      } else {
        throw new SQLException("회원정보 저장 실패");
      }
      // conn.commit(); // 레코드 영구 반영(등록)
      //conn.rollback(); // 레코드 작업 취소
    } catch (SQLException e) {
      System.err.println("insert 에러 : " + e);
      e.printStackTrace();
    }
    ////////////////////////////////////////////////
    sql = "INSERT INTO USER_ROLES VALUES "
        + "(?,?,?)";
    
    pstmt = null;
    
    try {
    
    // 자동 커밋 모드 => 수동 커밋 모드 전환
    // commit / rollback
    conn.setAutoCommit(false);
    
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, "102");
    pstmt.setString(2, "abcd2222");
    pstmt.setString(3, "ROLE_USER");
    
    if(pstmt.executeUpdate() == 1) {
      System.out.println("회원정보 저장 성공");
    } else {
      throw new SQLException("회원정보 저장 실패");
    }
    // conn.commit(); // 레코드 영구 반영(등록)
    //conn.rollback(); // 레코드 작업 취소
    } catch (SQLException e) {
      System.err.println("insert 에러 : " + e);
      e.printStackTrace();
    }
    
    try {
      // conn.commit(); // 레코드 영구 반영(등록)
      conn.rollback();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    
    DbUtil.close(pstmt, null, conn);
    
  }
  
}
