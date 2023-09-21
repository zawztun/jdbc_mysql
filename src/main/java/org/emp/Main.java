package org.emp;

import config.ConnectionFactory;
import controller.emp.Emp_controller;
import modal.emp.Emp_Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        //database connection
        ConnectionFactory factory = new ConnectionFactory();
        Connection con = factory.getDBConnection();
        //Emp_Modal emp = new Emp_Modal(con);
        //emp.createEmp(con);
        //emp.createTable(stm);
        //emp.updateEmp(con);

        Emp_controller emp = new Emp_controller(con);

        while (true) {
            System.out.println("Enter 1 of create Emp 2 for update 3 for delete");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    emp.createEmp();
                    break;
                case 2:
                    emp.updateEmp();
                    break;
                case 3:
                    emp.deleteEmp();
                    break;
                default:
                    break;
            }
        }
    }

}
