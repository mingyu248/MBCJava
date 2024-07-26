package com.mbc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
  
  public static void main(String[] args) {
    
    // DB 연결
    Connection conn = DbUtil.connect();
    
    // SQL 문
    String sql = "SELECT * FROM MEMBER_TBL WHERE ID = ?";
    
    // SQL 처리 객체
    PreparedStatement pstmt = null;
    
    // SQL 결과셋 객체
    ResultSet rs = null;
    
    String id = "abcd1111";
    
    MemberVO memberVO = null;
    
    try {
      // SQL 처리/해석
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id);
      
      // SQL 실행 => 결과셋
      rs = pstmt.executeQuery();
      
      if (rs.next()) {
        memberVO = new MemberVO();
        memberVO.setId(rs.getString("ID"));
        memberVO.setPw(rs.getString("PW"));
        memberVO.setName(rs.getString("NAME"));
        memberVO.setGender(rs.getString("GENDER"));
        memberVO.setEmail(rs.getString("EMAIL"));
        memberVO.setMobile(rs.getString("MOBILE"));
        memberVO.setPhone(rs.getString("PHONE"));
        memberVO.setZip(rs.getString("ZIP"));
        memberVO.setRoadAddress(rs.getString("ROAD_ADDRESS"));
        memberVO.setJibunAddress (rs.getString("JIBUN_ADDRESS"));
        memberVO.setDetailAddress(rs.getString("DETAIL_ADDRESS"));
        memberVO.setBirthday(rs.getDate("BIRTHDAY"));
        memberVO.setJoindate(rs.getDate("JOINDATE"));
      }
      
    } catch (SQLException e) {
      System.err.println("SQL 에러 : " + e);
      e.printStackTrace();
    }
    
    System.out.println(memberVO);
    
    // DB 자원 반납
    DbUtil.close(pstmt, rs, conn);
    
  }
  
}
