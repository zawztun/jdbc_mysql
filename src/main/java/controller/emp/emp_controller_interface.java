package controller.emp;

import config.Employee;

import java.sql.SQLException;

public interface emp_controller_interface {
    public void createEmp() throws SQLException;
    public void updateEmp() throws SQLException;

    public void deleteEmp() throws SQLException;
}
