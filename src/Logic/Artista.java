package Logic;

import java.util.ArrayList;

public class Artista 
{
	private String nombre;
	
	private Long id;
	
	private String hojaVida;
	
	private String trayectoria;
	
	
	private ArrayList<Obra> obrasAsociadas;
	
	
	public Artista() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

}
