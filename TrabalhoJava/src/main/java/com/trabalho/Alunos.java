package com.trabalho;

import javafx.beans.property.SimpleDoubleProperty;

import javafx.beans.property.SimpleStringProperty;

public class Alunos {
	private SimpleStringProperty nome;
	private SimpleDoubleProperty n1;
	private SimpleDoubleProperty n2;
	private SimpleDoubleProperty media;
	private SimpleStringProperty situacao;
	
	public Alunos(String nome, Double n1, Double n2, Double media, String situacao) {
		this.nome =  new SimpleStringProperty(nome);
		this.n1 = new SimpleDoubleProperty(n1);
		this.n2 = new SimpleDoubleProperty(n2);
		this.media = new SimpleDoubleProperty(media);
		this.situacao = new SimpleStringProperty(situacao);
	}
	
	public String getNome() {
		return this.nome.get();
	}
	
	public void setNome(String nome) {
		this.nome.set(nome);
	}
	
	public Double getN1() {
		return this.n1.get();
	}
	public void setN1(Double n1) {
		this.n1.set(n1);
	}
	public Double getN2() {
		return this.n2.get();
	}
	public void setN2(Double n2) {
		this.n1.set(n2);
	}
	
	public Double getMedia() {
		return this.media.get();
	}
	public void setMedia(Double media) {
		this.media.set(media);
	}
	public String getSituacao() {
		return this.situacao.get();
	}
	public void setSituacao(String situacao) {
		this.situacao.set(situacao);
	}
	
	
	
	

}
