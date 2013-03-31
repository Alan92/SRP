public class Factura2 {

	public string _codigo;
	public DateTime _fechaEmision;
	public decimal _importeFactura;
	public decimal _importeIVA;
	public decimal _importeDeducir;
	public decimal _importeTotal;
	public ushort _porcentageDeduccion;

	public void CalcularTotal() {
		//calculamos el IVA
		IVA iva = new IVA();
		_importeIVA = iva.CalcularIVA(_importeFactura);

		//calculamos la deducción a aplicar
		Deduccion deduccion = new Deduccion(_porcentageDeduccion);
		_importeDeducir = deduccion.CalcularDeduccion(_importeFactura);

		//calculamos el total
		_importeTotal = (_importeFactura – _importeDeducir) + _importeIVA;
	}	
}


