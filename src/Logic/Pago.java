package Logic;

import java.util.ArrayList;

public class Pago 
{
	private Long id;
	
	private Usuario userPago;
	
	private double totalPago;
	
	private double  desgloceImpuestos;
	
	
	
	public Pago() {
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Usuario getUserPago() {
		return userPago;
	}



	public void setUserPago(Usuario userPago) {
		this.userPago = userPago;
	}



	public double getTotalPago() {
		return totalPago;
	}



	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}



	public double getDesgloceImpuestos() {
		return desgloceImpuestos;
	}



	public void setDesgloceImpuestos(double desgloceImpuestos) {
		this.desgloceImpuestos = desgloceImpuestos;
	}

}
