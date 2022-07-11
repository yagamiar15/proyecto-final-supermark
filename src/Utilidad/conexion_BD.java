package Utilidad;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

public class conexion_BD {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private String DB_URL;
	private String USER;
	private String PASS;
	//private String baseDato;
	Connection connection;

	public conexion_BD(String USER, String PASS, String baseDato) {
		this.USER = USER;
		this.PASS = PASS;
		//this.baseDato = baseDato;
		this.DB_URL = "jdbc:mysql://localhost:3306/supermark";
	}

		public String connect() 
			{
			String resp="";

			try {
	            Class.forName(JDBC_DRIVER);
	            this.connection = DriverManager.getConnection(this.DB_URL,this.USER,this.PASS);
	            
	            if(this.connection != null) 
	            {
	            	resp = "Conectado!";
	            }
	            else 
	            {
	            	resp = "No conectado";
	            }
	        }catch (ClassNotFoundException e) {
				resp="Excepcion ClassNotFound : "+e.getMessage();
			}
			catch (SQLSyntaxErrorException e) {
				resp="Excepcion SQLSyntax: "+e.getMessage()+"\n";
				resp+="Verifique que la base de datos y las tablas sean correctas...";
			}
			catch (CommunicationsException e) {
				resp="Excepcion de Communications: "+e.getMessage()+"\n";
				resp+="Verifique que la base de datos fue iniciada...";
			}
			catch (SQLException e) {
				resp="Excepcion de SQL: "+e.getMessage()+"\n";
				resp+="Consulte al administrador";
			}

			return resp;
		}

		public Connection getConnection(){
			return this.connection;
		}

		public void disconnect(){
			this.connection = null;
		}
	}
