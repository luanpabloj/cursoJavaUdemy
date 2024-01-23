package polimorfismo;

public class Carro implements Veiculo{

	@Override
	public String acelerar() {
		
		return "Carro: *acelerando*";
	}

	@Override
	public String freiar() {
		return "Carro: *freiando*";
	}

}
