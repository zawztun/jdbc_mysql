package controller.emp;

import config.Employee;
import modal.emp.Emp_Modal;

import java.sql.Connection;
import java.sql.SQLException;

public class Emp_controller implements emp_controller_interface{
    Emp_Modal modal = null;
   public Emp_controller(Connection con){
       this.modal = new Emp_Modal(con);
   }

    @Override
    public void createEmp() throws SQLException {
        Employee empObj = new Employee();
        empObj.askEmpInfo();
        modal.createEmp(empObj);
    }

    @Override
    public void updateEmp() throws SQLException {
       Employee empObj = new Employee();
       int id_to_update = empObj.updateEmpInfo();
       modal.updateEmp(empObj,id_to_update);
    }

    @Override
    public void deleteEmp() throws SQLException {
       Employee emp = new Employee();
      int id = emp.deleteEmpInfo();
       modal.deleteEmp(id);

    }
}

