package modal.emp;

import config.Employee;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp_Modal implements Emp_Modal_interface{

   private  Connection con = null;

 public Emp_Modal(Connection con){
       this.con = con;
   }
    public void createTable() throws SQLException {
        Statement stm= con.createStatement();
        String sql = "create table db_emp_1000 (name varchar(255), id int , age int , salary float)";
        boolean success = stm.execute(sql);
        if (success) {
            System.out.println(true);
        }
    }

    @Override
    public void deleteEmp(int id) throws SQLException {
        String sql = "delete from employee where id= ?;";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setInt(1,id);
        stm.executeUpdate();
    }

    public void createEmp(Employee empObj) throws SQLException {
        String sql = "insert into employee values(?,?,?,?)";
        PreparedStatement  stm= con.prepareStatement(sql);
        stm.setString(1,empObj.getName());
        stm.setInt(2,empObj.getId());
        stm.setInt(3,empObj.getAge());
        stm.setFloat(4,empObj.getSalary());
        stm.execute();
    }
    public void updateEmp(Employee empObj, int id) throws SQLException {
        String sql = " update employee set name = ?, id = ?, age = ?,salary = ? where id = ?; ";
        PreparedStatement  stm= con.prepareStatement(sql);
        stm.setString(1,empObj.getName());
        stm.setInt(2,empObj.getId());
        stm.setInt(3,empObj.getAge());
        stm.setFloat(4,empObj.getSalary());
        stm.setInt(5, id);
        stm.execute();
    }

}
