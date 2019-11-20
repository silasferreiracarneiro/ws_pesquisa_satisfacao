package domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ReceiveEmail {
	
	@Id
	private int receiveEmailId;
	private int pedidoId;
	private int pesquisaId;
	private String message;
	
	public int getReceiveEmailId() {
		return receiveEmailId;
	}
	public void setReceiveEmailId(int receiveEmailId) {
		this.receiveEmailId = receiveEmailId;
	}
	public int getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(int pedidoId) {
		this.pedidoId = pedidoId;
	}
	public int getPesquisaId() {
		return pesquisaId;
	}
	public void setPesquisaId(int pesquisaId) {
		this.pesquisaId = pesquisaId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
