import java.util.*;

public interface EmpDAO_interface {
          public int insert(EmpVO empVO);
          public int update(EmpVO empVO);
          public int delete(String empno);
          public EmpVO findByPrimaryKey(String empno);
          public List<EmpVO> getAll();
}
