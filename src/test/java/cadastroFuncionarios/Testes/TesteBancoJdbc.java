package cadastroFuncionarios.Testes;

import org.junit.Test;

import conexao_jdbc.SingleConnection;
import junit.framework.TestCase;

public class TesteBancoJdbc{

	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}
	
}
