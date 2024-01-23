package polimorfismo;

public class Moto implements Veiculo{
	
	@Override
	public String acelerar() {
		
		return "Moto: *acelerando*";
	}

	@Override
	public String freiar() {
		return "Moto: *freiando*";
	}

}
