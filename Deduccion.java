public class Deduccion {
	public readonly decimal _deduccion;
	public Deduccion(ushort porcentage) {
		_deduccion = porcentage;
	}

	public decimal CalcularDeduccion(decimal importe) {
		return (importe*_deduccion)/100;
	}

}
