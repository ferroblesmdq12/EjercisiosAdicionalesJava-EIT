package Modelo;

public class Cotizacion {

	// ATRIBUTOS //
	
	private Integer idCotizacion;
	private String fechaHora;
	private Vendedor vendedor;
	private Prenda prendaCotizada;
	private Integer cantidadUnidadesCotizadas;
	private Double totalCotizacion;
	
	// CONSTRUCTORES //
	
	public Cotizacion(Integer idCotizacion, String fechaHora, Vendedor vendedor, Prenda prenda, Integer cantidadUnidadesCotizadas, Double totalCotizacion)
	{
		this.idCotizacion = idCotizacion;
		this.fechaHora = fechaHora;
		this.vendedor = vendedor;
		this.prendaCotizada = prenda;
		this.cantidadUnidadesCotizadas = cantidadUnidadesCotizadas;
		this.totalCotizacion = totalCotizacion;
	}
	
	public Integer getIdCotizacion()
	{
		return idCotizacion;
	}
	
	public String getFechaHora()
	{
		return fechaHora;
	}
	
	public Vendedor Vendedor()
	{
		return vendedor;
	}
	
	public Prenda getPrendaCotizada()
	{
		return prendaCotizada;
	}
	
	public Integer getCantidadUnidadesCotizadas()
	{
		return cantidadUnidadesCotizadas;
	}
	
	public Double getTotalCotizacion()
	{
		return totalCotizacion;
	}
	
	
		// Implementa la lógica para obtener la fecha y hora actual
    	private String getCurrentDateTime()
    	{
        // Implementa la obtención de la fecha y hora actual aquí
        return "Fecha y Hora Actual";
    	}	
}

