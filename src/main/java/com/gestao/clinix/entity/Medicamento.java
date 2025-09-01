package com.gestao.clinix.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Medicamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NOME_COMERCIAL")
	private String nomeComercial;
	
	@Column(name="NOME_GENERICO")
	private String nomeGenerico;
	
	@Column(name="CODIGO")
	private Long codigo;
	
	@Column(name="FORMA_FARMACEUTICA")
	private String formaFarmaceutica;
	
	@Column(name="VIA_ADMINISTRACAO")
	private String viaAdministacao;
	
	@Column(name="CONCENTRACAO")
	private String concentracao;
	
	@Column(name="Quantidade")
	private int quantidade;
	
	@Column(name="UNIDADE_MEDIDA")
	private String unidadeMedida;
	
	@Column(name="REGISTRO_ANVISA")
	private Long registroAnvisa;
	
	@Column(name="CLASSE_TERAPEUTICA")
	private String classeTerapeutica;
	
	@Column(name="TARJA")
	private String tarja;
	
	@Column(name="FABRICANTE")
	private String fabricante;
	
	@Column(name="DATA_VALIDADE")
	private Date dataValidade;
	
	@Column(name="LOTE")
	private String lote;
	
	@Column(name="TIPO_CONTROLE_ESPECIAL")
	private String tipoControleEspecial;
	
	@Column(name="PRECO_CUSTO")
	private double precoCusto;
	
	@Column(name="FORNECEDOR")
	private String fornecedor;
	
	@Column(name="ESTOQUE_MINIMO")
	private int estoqueMinimo;
	
	@Column(name="ESTOQUE_MAXIMO")
	private int estoqueMaximo;
	
	@Column(name="ESTOQUE_ATUAL")
	private int estoqueAtual;
	
	@Column(name="LOCALIZACAO_ESTOQUE")
	private String localizacaoEstoque;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getNomeGenerico() {
		return nomeGenerico;
	}

	public void setNomeGenerico(String nomeGenerico) {
		this.nomeGenerico = nomeGenerico;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getFormaFarmaceutica() {
		return formaFarmaceutica;
	}

	public void setFormaFarmaceutica(String formaFarmaceutica) {
		this.formaFarmaceutica = formaFarmaceutica;
	}

	public String getViaAdministacao() {
		return viaAdministacao;
	}

	public void setViaAdministacao(String viaAdministacao) {
		this.viaAdministacao = viaAdministacao;
	}

	public String getConcentracao() {
		return concentracao;
	}

	public void setConcentracao(String concentracao) {
		this.concentracao = concentracao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Long getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(Long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}

	public String getClasseTerapeutica() {
		return classeTerapeutica;
	}

	public void setClasseTerapeutica(String classeTerapeutica) {
		this.classeTerapeutica = classeTerapeutica;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getTipoControleEspecial() {
		return tipoControleEspecial;
	}

	public void setTipoControleEspecial(String tipoControleEspecial) {
		this.tipoControleEspecial = tipoControleEspecial;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public int getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(int estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public String getLocalizacaoEstoque() {
		return localizacaoEstoque;
	}

	public void setLocalizacaoEstoque(String localizacaoEstoque) {
		this.localizacaoEstoque = localizacaoEstoque;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getControleTemperatura() {
		return controleTemperatura;
	}

	public void setControleTemperatura(String controleTemperatura) {
		this.controleTemperatura = controleTemperatura;
	}

	public String getStatusDisponibilidade() {
		return statusDisponibilidade;
	}

	public void setStatusDisponibilidade(String statusDisponibilidade) {
		this.statusDisponibilidade = statusDisponibilidade;
	}

	public String getContraindicacoes() {
		return contraindicacoes;
	}

	public void setContraindicacoes(String contraindicacoes) {
		this.contraindicacoes = contraindicacoes;
	}

	public String getEfeitosColaterais() {
		return efeitosColaterais;
	}

	public void setEfeitosColaterais(String efeitosColaterais) {
		this.efeitosColaterais = efeitosColaterais;
	}

	public String getInteracoesMedicamentosas() {
		return interacoesMedicamentosas;
	}

	public void setInteracoesMedicamentosas(String interacoesMedicamentosas) {
		this.interacoesMedicamentosas = interacoesMedicamentosas;
	}

	public String getPrecaucaoUso() {
		return precaucaoUso;
	}

	public void setPrecaucaoUso(String precaucaoUso) {
		this.precaucaoUso = precaucaoUso;
	}

	public String getRetencaoReceita() {
		return retencaoReceita;
	}

	public void setRetencaoReceita(String retencaoReceita) {
		this.retencaoReceita = retencaoReceita;
	}

	@Column(name="DATA_ENTRADA")
	private Date dataEntrada;
	
	@Column(name="CONTROLE_TEMPERATURA")
	private String controleTemperatura;
	
	@Column(name="STATUS_DISPONIBILIDADE")
	private String statusDisponibilidade;
	
	@Column(name="CONTRAINDICACOES")
	private String contraindicacoes;
	
	@Column(name="EFEITOS_COLATERAIS")
	private String efeitosColaterais;
	
	@Column(name="INTERACOES_MEDICAMENTOSAS")
	private String interacoesMedicamentosas;
	
	@Column(name="PRECAUCAO_USO")
	private String precaucaoUso;
	
	@Column(name="RETENCAO_RECEITA")
	private String retencaoReceita;
	
	
	
	
	
	

}
