package Modelo;

public class Prenda {
	
	// ATRIBUTOS //
	
	private Integer idPrenda;
	private String nombrePrenda;
	private Double precioUnitario;
	
	// CONSTRUCTORES //
	
	public Prenda(Integer idPrenda, String nombrePrenda, Double precioUnitario)
	{
		this.idPrenda = idPrenda;
		this.nombrePrenda = nombrePrenda;
		this.precioUnitario = precioUnitario;
	}
	
	// METODOS//
	
	public Integer getIdPrenda()
	{
		return idPrenda;
	}
	
	public String getNombrePrenda()
	{
		return nombrePrenda;
	}
	
	public Double getPrecioUnitario()
	{
		return precioUnitario;
	}
	
	

}
