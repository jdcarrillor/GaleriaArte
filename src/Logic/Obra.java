package Logic;

public class Obra 
{
	private Long id;
	
	private Artista creador;
	
	private String nombre;
	
	private double precio;
	
	private String categoria;
	
	private String tipo;
	
	private Comentario comentarioObra;
	
	public Obra()
	{
		
	}

	public Artista getCreador() {
		return creador;
	}

	public void setCreador(Artista creador) {
		this.creador = creador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Comentario getComentarioObra() {
		return comentarioObra;
	}

	public void setComentarioObra(Comentario comentariObra) {
		this.comentarioObra = comentariObra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
}
