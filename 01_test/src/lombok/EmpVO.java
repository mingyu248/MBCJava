package lombok;

import java.time.LocalDate;
import java.util.Objects;

// DB의 table의 컬럼(필드) 1:1 mapping(대응)
// table field = VO field
// VO : Entity(테이블)의 내용(필드 => 행(레코드, 튜플)
/**
 * 사원 정보 테이블 VO(값 객체)
 */
public class EmpVO {
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
  
  public EmpVO() {};
  
  public EmpVO(int empNo, String eName, String job, int mgr, LocalDate hiredate, float sal, float comm, int deptNo) {
    super();
    this.empNo = empNo;
    this.eName = eName;
    this.job = job;
    this.mgr = mgr;
    this.hiredate = hiredate;
    this.sal = sal;
    this.comm = comm;
    this.deptNo = deptNo;
  }
  
  // 멤버 필드 => private : 보안(캡슐화) 적용
  // 멤버 필드에 접금 => getter/setter 간접 접근 + 가공(ex. 변환 등)
  // get method => getter
  public int getEmpNo() {
    return this.empNo;
  }
  // set method => setter
  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }
  public String geteName() {
    return eName;
  }
  public void seteName(String eName) {
    this.eName = eName;
  }
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }
  public int getMgr() {
    return mgr;
  }
  public void setMgr(int mgr) {
    this.mgr = mgr;
  }
  public LocalDate getHiredate() {
    return hiredate;
  }
  public void setHiredate(LocalDate localDate) {
    this.hiredate = localDate;
  }
  public float getSal() {
    return sal;
  }
  public void setSal(float sal) {
    this.sal = sal;
  }
  public float getComm() {
    return comm;
  }
  public void setComm(float comm) {
    this.comm = comm;
  }
  public int getDeptNo() {
    return deptNo;
  }
  public void setDeptNo(int deptNo) {
    this.deptNo = deptNo;
  }

  // toString 재정의(오버라이드)
  // 코드 생성 자동화 : 
  @Override
  public String toString() {
    return "[EmpVO] empNo : " + empNo + ", eName : " + eName + ", job : " + job
            + ", mgr : " + mgr + ", hiredate : " + hiredate + ", sal : "
            + sal + ", comm : " + comm + ", deptNo : " + deptNo;
  }

  @Override
  public int hashCode() {
    return Objects.hash(comm, deptNo, eName, empNo, hiredate, job, mgr, sal);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EmpVO other = (EmpVO) obj;
    return Float.floatToIntBits(comm) == Float.floatToIntBits(other.comm) && deptNo == other.deptNo
        && Objects.equals(eName, other.eName) && empNo == other.empNo && Objects.equals(hiredate, other.hiredate)
        && Objects.equals(job, other.job) && mgr == other.mgr
        && Float.floatToIntBits(sal) == Float.floatToIntBits(other.sal);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
