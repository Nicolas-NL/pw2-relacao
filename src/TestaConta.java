
public class TestaConta {
	public static void main(String[] args) {
		
		AgenciaNum agencia1 = new AgenciaNum();
		
		agencia1.numero = "2";
		
		ContaBan conta1 = new ContaBan();
		
		conta1.numero = "1";
		conta1.saldo = "2000";
		conta1.limite = "5000";
		conta1.agencia = agencia1;
	}
}
