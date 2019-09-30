package entidades;

import java.util.Date;

import entidades.enums.OrdemStatus;

public class Pedido {
	
	private Integer id;
	private Date moment;
	private OrdemStatus status;
	
	public Pedido () {	
	}

	public Pedido(Integer id, Date moment, OrdemStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	

}
