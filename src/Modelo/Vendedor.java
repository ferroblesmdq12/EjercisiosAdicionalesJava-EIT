package Modelo;

import java.util.ArrayList;
import java.util.List;


public class Vendedor {
	
	// ATRIBUTOS //
	
	private String nombre;
	private String apellido;
	private Integer codigoVendedor;
	private List<Cotizacion> historialCotizaciones;
	
	// CONSTRUCTORES //
	
	public Vendedor(String nombre, String apellido, Integer codigoVendedor) 
	{
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoVendedor = codigoVendedor;
		this.historialCotizaciones = new ArrayList<>();
		
	}
	
	// METODOS //
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public Integer getCodigoVendedor()
	{
		return codigoVendedor;
	}
	
	public List<Cotizacion> getCotizaciones()
	{
		return historialCotizaciones;
	}
	
	
	

}
