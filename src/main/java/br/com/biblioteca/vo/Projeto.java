package br.com.biblioteca.vo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="projeto")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String nome;
	
	@Column(name="data_inicio") 
	private Date dataInicio;
	
	@ManyToOne
	@JoinColumn(name = "idgerente")
	private Pessoa gerente;
	
//	@ManyToOne
//	@JoinColumn(name = "idPessoa")
//	private Pessoa responsavel;
	
	@Column(name="data_previsao_fim") 
	private Date previsaoTermino;
	 
	@Column(name="data_fim") 
	private Date dataRealTermino;
	
	private BigDecimal orcamentoTotal;
	
	private String descrição;
	
	private String status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Pessoa getGerente() {
		return gerente;
	}
	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}
//	public Pessoa getResponsavel() {
//		return responsavel;
//	}
//	public void setResponsavel(Pessoa responsavel) {
//		this.responsavel = responsavel;
//	}
	public Date getPrevisaoTermino() {
		return previsaoTermino;
	}
	public void setPrevisaoTermino(Date previsaoTermino) {
		this.previsaoTermino = previsaoTermino;
	}
	public Date getDataRealTermino() {
		return dataRealTermino;
	}
	public void setDataRealTermino(Date dataRealTermino) {
		this.dataRealTermino = dataRealTermino;
	}
	public BigDecimal getOrcamentoTotal() {
		return orcamentoTotal;
	}
	public void setOrcamentoTotal(BigDecimal orcamentoTotal) {
		this.orcamentoTotal = orcamentoTotal;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
