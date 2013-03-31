public class Factura {

	public string _codigo;
	public DateTime _fechaEmision;
	public decimal _importeFactura;
	public decimal _importeIVA;
	public decimal _importeDeducir;
	public decimal _importeTotal;
	public ushort _porcentageDeduccion;

	public void CalcularTotal() {
		//Calculamos la deducción
		_importeDeducir = (_importeFactura*_porcentageDeduccion)/100;

		//Calculamos el IVA
		_importeIVA = _importeFactura * 0.16m;

		//calculamos el total
		_importeTotal = (_importeFactura – _importeDeducir) + _importeIVA;
	}
}


