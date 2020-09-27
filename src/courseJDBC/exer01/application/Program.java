package courseJDBC.exer01.application;

import java.sql.Connection;

import courseJDBC.exer01.db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();

		DB.closeConnection();

	}

}
