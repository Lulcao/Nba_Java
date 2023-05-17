package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.mvpModel;

public class MvpDAO {

	public void inserirMvp(mvpModel Mvp) {
		String create2 = "insert into mvp (mvp, mvpClass, mvpNac) values (?,?,?)";
		try {
			Connection con = new MyConnection().conectar();
			PreparedStatement pst = con.prepareStatement(create2);
			pst.setString(1, Mvp.getMvp());
			pst.setString(2, Mvp.getMvpClass());
			pst.setString(3, Mvp.getMvpNac());
			pst.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
