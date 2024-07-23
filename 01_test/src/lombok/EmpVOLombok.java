package lombok;

import java.time.LocalDate;
/**
 * 사원 정보 테이블 VO(값 객체) Lombok
 */
@Data
//Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmpVOLombok {
  /** 사원 번호 */
  private int empNo;  // scott 계정의 emp 테이블의 EMPNO 필드에 대응
  /** 사원명 */
  private String eName;  // scott 계정의 emp 테이블의 ENAME 필드에 대응
  /** 사원 직무 */
  private String job;  // scott 계정의 emp 테이블의 JOB 필드에 대응
  /** 담당 관리자 */
  private int mgr;  // scott 계정의 emp 테이블의 MGR 필드에 대응
  /** 입사일 */
  private LocalDate hiredate;  // scott 계정의 emp 테이블의 HIREDATE 필드에 대응
  /** 급여 */
  private float sal;  // scott 계정의 emp 테이블의 SAL 필드에 대응
  /** 보너스 */
  private float comm;  // scott 계정의 emp 테이블의 COMM 필드에 대응
  /** 부서 번호 */
  private int deptNo;  // scott 계정의 emp 테이블의 DEPTNO 필드에 대응
}
