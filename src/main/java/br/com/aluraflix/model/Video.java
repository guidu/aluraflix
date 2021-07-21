package br.com.aluraflix.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1857532174573412650L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idvideo")
	private Long idVideo;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "url")
	private String url;

	public Long getIdVideo() {
		return idVideo;
	}

	public void setIdVideo(Long idVideo) {
		this.idVideo = idVideo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
