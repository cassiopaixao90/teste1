
/**
 * @author CassioPaixao
 *
 */
public class Veiculo {

	protected String marca;
	
	
	public Veiculo() {
		super();
		System.out.println(Veiculo.class.getName());
	}
	public Veiculo(String marca){
		this.marca = marca;
		System.out.println(Veiculo.class.getMethods());
	}
}