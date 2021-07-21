package br.com.aluraflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aluraflix.dto.VideoDTO;
import br.com.aluraflix.model.Video;
import br.com.aluraflix.service.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("/lista")
	public ResponseEntity<List<VideoDTO>> listaDeVideos() {
		List<Video> lista = videoService.listaVideos(); 
		if (lista != null && !lista.isEmpty()) {
			return new ResponseEntity<List<VideoDTO>>(VideoDTO.converte(lista),HttpStatus.OK);

		} else {
			return new ResponseEntity<List<VideoDTO>>(HttpStatus.NOT_FOUND);
		}
	}
}
