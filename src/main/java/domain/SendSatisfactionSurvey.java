package domain;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SendSatisfactionSurvey {
	
	@Id
	private int pesquisaId;
	private int pedidoId;
	private int cutomerId;
	private String sessionId;
	private ArrayList<ReceiveEmail> questions;
	
	public int getPesquisaId() {
		return pesquisaId;
	}
	public void setPesquisaId(int pesquisaId) {
		this.pesquisaId = pesquisaId;
	}
	public int getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(int pedidoId) {
		this.pedidoId = pedidoId;
	}
	public int getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public ArrayList<ReceiveEmail> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<ReceiveEmail> questions) {
		this.questions = questions;
	}
}
