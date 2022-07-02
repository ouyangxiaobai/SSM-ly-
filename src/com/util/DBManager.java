package com.util;

import java.sql.*;

public class DBManager {
	static String driver = "com.mysql.cj.jdbc.Driver";

	static String url = "jdbc:mysql://localhost:3306/ssm_zxncpshop_db?characterEncoding=utf-8";

	static String user = "root";

	static String pwd = "123456";

	static Connection con;

	public static Connection getCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeCon(Connection con) {
		try {
			if (con != null || !con.isClosed()) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}