package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.timeModel;

public class TimeDAO {
	public void inserirTime(timeModel time) {
		String create = "insert into times (nome, titulos) values (?,?)";
		try {
			// abrir a conexão
			Connection con = new MyConnection().conectar();
			// preparar a query p/ exec no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// substituir parâmetros pelos conteúdos das variáveis
			pst.setString(1, time.getNome());
			pst.setString(2, time.getTitulos());
			// Executar a query
			pst.executeUpdate();
			// Encerrar a conexão com o banco
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
