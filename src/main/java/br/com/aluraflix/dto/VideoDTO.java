package br.com.aluraflix.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.aluraflix.model.Video;

public class VideoDTO {
	
	private Long id;
	private String titulo;
	private String descricao;
	private String url;
	
	public VideoDTO() {
	}
	
	public VideoDTO(Video video) {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public static List<VideoDTO> converte(List<Video> lista) {
		return lista.stream().map(VideoDTO::new).collect(Collectors.toList());
	}

}
