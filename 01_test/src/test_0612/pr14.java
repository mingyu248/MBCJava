package test_0612;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pr14 {

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now(); // 현재 날짜와 시간을 가져옴
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 포맷 형식 지정
    String formattedDateTime = dateTime.format(formatter); // 날짜와 시간을 포맷팅

    System.out.println(formattedDateTime);

  }

}
