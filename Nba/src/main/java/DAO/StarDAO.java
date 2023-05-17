package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




import model.mvpModel;
import model.starModel;
import model.timeModel;

public class StarDAO {




	public void inserirStar(starModel Star) {
		String create3 = "insert into star (star, starClass, starNac) values (?,?,?)";
		try {
			Connection con = new MyConnection().conectar();
			PreparedStatement pst = con.prepareStatement(create3);
			pst.setString(1, Star.getStar());
			pst.setString(2, Star.getStarClass());
			pst.setString(3, Star.getStarNac());
			pst.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
