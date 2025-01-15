package com.bharath.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class User {
	private Long userId;
	private String email;
	private String userName;
	private String gender;
	private LocalDate dob;
	private LocalDate doj;

	public User(Long userId, String email, String userName, String gender, LocalDate dob, LocalDate doj) {
		super();
		this.userId = userId;
		this.email = email;
		this.userName = userName;
		this.gender = gender;
		this.dob = dob;
		this.doj = doj;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", userName=" + userName + ", gender=" + gender
				+ ", dob=" + dob + ", doj=" + doj + "]";
	}

}

public class JDBCConnectionDemo {
	private final static String URL = "jdbc:mysql://localhost:3306/ us_sessions_db";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";

	public static void insert() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			Statement statement = connection.createStatement();
//		String insert = "insert into users (user_name,user_creation_date,email,gender,user_dob) values("
//				+ "\"ajinkya\",\"" + LocalDate.now() + "\",\"ajinkya@gmail.com\"" + ",\"MALE\",\""
//				+ LocalDate.of(2000, 10, 9) + "\");";
			String userName = "";
			String email = "";
			String dob = LocalDate.now().toString();
			String userCreationDate = LocalDate.now().toString();
			String gender = "MALE";
			String insert = String.format(
					"insert into users (user_name,user_creation_date,email,gender,user_dob) values(\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",
					userName, userCreationDate, email, gender, dob);
			System.out.println("query " + insert);
			int update = statement.executeUpdate(insert);
			if (update > 0)
				System.out.println("successfully inserted");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void select() {
		List<User> userEntityList = new ArrayList();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			Statement statement = connection.createStatement();

			String select = "select * from users;";
			System.out.println("query " + select);
			ResultSet result = statement.executeQuery(select);

			while (result.next()) {
//				System.out.print("user_id " + result.getLong("user_id"));
//				System.out.print(" user_name " + result.getString("user_name"));
//				System.out.print(" gender " + result.getString("gender"));
//				System.out.print(" email " + result.getString(3));
//				System.out.print(" dob " + result.getDate("user_dob"));
//				System.out.print(" created at " + result.getDate(4));
				Long userId = result.getLong("user_id");
				String email = result.getString(3);
				String userName = result.getString("user_name");
				String gender = result.getString("gender");
				Date creationDate = result.getDate(4);
			
				int month = creationDate.getMonth();
				//System.out.println("month " + month);
				LocalDate creationDatefinal = convertFromDateToLocalDate(creationDate);
				Date dob = result.getDate("user_dob");
				LocalDate dobfinal = convertFromDateToLocalDate(dob);
				User user = new User(userId, email, userName, gender, dobfinal, creationDatefinal);
				userEntityList.add(user);
				System.out.println(user);
			}
			System.out.println(userEntityList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		 //insert();
		select();
	}

	private static LocalDate convertFromDateToLocalDate(Date date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(date.toString(), dtf);
	}
}
