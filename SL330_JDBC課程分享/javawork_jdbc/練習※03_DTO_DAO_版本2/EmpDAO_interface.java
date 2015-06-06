import java.util.*;

public interface EmpDAO_interface {
          public int insert(EmpVO empVO);
          public int update(EmpVO empVO);
          public int delete(Integer empno);
          public EmpVO findByPrimaryKey(Integer empno);
          public List<EmpVO> getAll();
}
