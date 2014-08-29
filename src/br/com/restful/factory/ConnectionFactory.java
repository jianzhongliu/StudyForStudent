package br.com.restful.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * 
 * Classe respons醰el por conter os metodos criar e fechar o banco de dados.
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 01:54:02
 * @version 1.0
 */
public class ConnectionFactory {

	// Caminho do banco de dados.
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/webservice";
	private static final String USUARIO = "postgres";
	private static final String SENHA = "12345";
	

	/**
	 * 
	 * M閠odo respons醰el por criar uma conexao com o banco 
	 *
	 * @return
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 01:51:54
	 * @version 1.0
	 */
	public Connection criarConexao(){

		Connection conexao = null;
////////////////////////////////////////刘建中加上去的调试代码
		if (conexao == null){
			return conexao;
		}
////////////////////////////////////////
		try {
			
			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			
		} catch (Exception e) {
			System.out.println("Erro ao criar conex鉶 com o banco: " + URL);
			e.printStackTrace();
		}
		return conexao;
	}
	
	
	public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs){
		
		try {
			
			if(conexao != null){
				conexao.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(rs != null){
				rs.close();
			}
					
		} catch (Exception e) {
			System.out.println("Erro ao fechar conex鉶 com o banco: " + URL);
		}
	}
}

