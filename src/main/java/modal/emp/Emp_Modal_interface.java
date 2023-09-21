package modal.emp;

import config.Employee;

import java.sql.SQLException;

public interface Emp_Modal_interface {
    public  void createEmp(Employee empObj) throws SQLException;
    public  void updateEmp(Employee empObj, int id) throws  SQLException;
    public  void createTable()throws  SQLException;
   public  void deleteEmp(int id)throws  SQLException;
}
