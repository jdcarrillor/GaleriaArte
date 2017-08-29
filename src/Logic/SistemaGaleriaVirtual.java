package Logic;

import java.util.ArrayList;

public class SistemaGaleriaVirtual
{
	private Administrador admin;

	private ArrayList<Obra> obras;

	private ArrayList<Producto> productos;

	private ArrayList<Usuario> usuarios;



	public SistemaGaleriaVirtual() {
		// TODO Auto-generated constructor stub
	}


	public void registrarHojaVida(Long id){

	}

	public void registrarTrayectoria(Long id){

	}
	
	public Comentario buscarComentarioPorTitulo(String titulo)
	{
		return null;
	}
	
	public void agregarComentariosFavoritos(Comentario x, Usuario agregar )
	{
		
	}
	
	public void agregarObraFavoritas(Comentario x, Usuario agregar )
	{
		
	}
	
	public void realizarPagoObra(ArrayList<Obra> obras, Usuario user)
	{
		
	}
	
	public void realizarPagoProducto(ArrayList<Producto> producto, Usuario user)
	{
		
	}
	
	public Pago consultarPago(Long id)
	{
		return null;
	}


	public Administrador getAdmin() {
		return admin;
	}


	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}


	public ArrayList<Obra> getObras() {
		return obras;
	}


	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
