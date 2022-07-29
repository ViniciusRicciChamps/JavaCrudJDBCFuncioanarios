import java.sql.Connection;

import conexao_jdbc.SingleConnection;

public class FuncDAO {

	
	private Connection connection;

	public FuncDAO() {
		
		this.connection = SingleConnection.getConnection();
	}
	
	
	
}
