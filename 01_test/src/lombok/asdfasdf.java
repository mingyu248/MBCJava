package lombok;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class asdfasdf {
  public static void main(String[] args) {
    EmpVO empVO1 = new EmpVO();
    empVO1.setEmpNo(1000);
    empVO1.seteName("자바맨");    // => 롬복은 EName 으로 써서 틀린다
    empVO1.setJob("자바맨");
    empVO1.setMgr(1000);
    empVO1.setHiredate(LocalDate.now());
    empVO1.setSal(88.88F);
    empVO1.setComm(88.88F);
    empVO1.setDeptNo(1000);
    
    System.out.println("empVO1.getHiredate() : " + empVO1.getHiredate());
    System.out.println("empVO1.toString() : " + empVO1.toString());
    System.out.println("empVO1 출력 : " + empVO1);
    
    EmpVO empVO2 = new EmpVO(1000, "자바맨", "자바맨", 1000,
        LocalDate.now(), 88.88F, 88.88F, 1000);
    
    System.out.println("empVO2 출력 : " + empVO2);
    
    // 두 객체간 필드를 비교
    // 두 객체의 필드들의 값이 완전 같으면 같다(Override 부분에서 원하는대로 수정 가능)
    System.out.println("empVO1.equals(empVO2) : " + empVO1.equals(empVO2));
    
    // 두 객체의 필드들의 값이 완전 같으면 두 해시코드는 같다
    System.out.println("empVO1.hashCode()" + empVO1.hashCode());
    System.out.println("empVO2.hashCode()" + empVO2.hashCode());
    
    
    EmpVOLombok emp = EmpVOLombok.builder()
        .empNo(1000)
        .eName("자바맨")
        .job("자바맨")
        .mgr(1000)
        .hiredate(LocalDate.now())
        .sal(88.88f)
        .comm(88.88f)
        .deptNo(1000)
        .build();
    
    System.out.println(emp);
  }
}
