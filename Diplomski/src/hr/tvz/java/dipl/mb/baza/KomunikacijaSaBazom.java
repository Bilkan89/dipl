package hr.tvz.java.dipl.mb.baza;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class KomunikacijaSaBazom {

		private static final String DATABASE_PROPERTIES_FILE = "Resursi/DataBaseProperties/app.properties";

		public static Connection konekcijaDB() throws Exception {

			Connection vezaSaBazom = null;
			Properties svojstva = new Properties();

			final FileReader citacDatoteke = new FileReader(DATABASE_PROPERTIES_FILE);
			svojstva.load(citacDatoteke);

			String urlBaze = svojstva.getProperty("bazaPodatakaURL");
			String korisnickoIme = svojstva.getProperty("korisnickoIme");
			String lozinka = svojstva.getProperty("lozinka");

			
			vezaSaBazom = DriverManager.getConnection(urlBaze, korisnickoIme, lozinka);
			return vezaSaBazom;

		}

		public static void zatvoriKonekciju(Connection vezaSaBazom) throws SQLException{
			vezaSaBazom.close();			
		}

		
}

