package Logic;

import java.util.ArrayList;

public class Usuario 
{
	private Long idUsuario;
	
	private int tarjetaCredito;
	
	private int tarjetaDebito;
	
	private ArrayList<Comentario> listaComFv;
	
	private ArrayList<Obra> listaObraFv;
	
	public Usuario()
	{
		
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(int tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public int getTarjetaDebito() {
		return tarjetaDebito;
	}

	public void setTarjetaDebito(int tarjetaDebito) {
		this.tarjetaDebito = tarjetaDebito;
	}

	public ArrayList<Comentario> getListaComFv() {
		return listaComFv;
	}

	public void setListaComFv(ArrayList<Comentario> listaComFv) {
		this.listaComFv = listaComFv;
	}
}
