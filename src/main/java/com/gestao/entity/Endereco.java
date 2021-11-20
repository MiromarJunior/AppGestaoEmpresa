package com.gestao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.gestao.enumeration.UF;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 7339452821970613472L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 250)
	@Column(nullable = false, length = 250)
	private String logradouro;
	
	@NotBlank
	@Size(min = 3, max = 200)
	@Column(nullable = false, length = 200)
	private String bairro;
	
	@NotBlank
	@Size(min = 3, max = 150)
	@Column(nullable = false, length = 150)
	private String cidade;
	
	@NotNull(message = "{NotNull.endereco.uf}")
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 2)
	private UF uf;
	
	@NotBlank
	@Size(min = 9, max = 9, message = "{Size.endereco.cep}")
	@Column(nullable = false, length = 9)
	private String cep;

	@Column(length = 150)
	private String complemento;

	@NotNull(message = "{NotNull.endereco.numero}")
	@Digits(integer = 5, fraction = 0)
	@Column(length = 5)
	private Integer numero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
