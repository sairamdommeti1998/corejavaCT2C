package com.tnsif.jdbccrud1;

import java.sql.SQLException;

import com.tnsif.jdbccrud.service.Service;



public class Client {

	public static void main(String[] args) throws SQLException {
		Service service=new Service();
        //service.addStudent();
        //service.getStudents();
       //service.updateStudent();
       service.deleteStudnet();
		//service.storedProcedure();
        //service.closeSession();
	}

}





