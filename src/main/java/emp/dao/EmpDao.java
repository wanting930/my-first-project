package emp.dao;

import java.util.List;

import emp.vo.Emp;

public interface EmpDao {

	int insert(Emp emp);

	int deleteByEmpno(Integer empno);

	int updateByEmpno(Emp emp);

	Emp selectByEmpno(Integer empno);

	List<Emp> selectAll() throws ClassNotFoundException;

}