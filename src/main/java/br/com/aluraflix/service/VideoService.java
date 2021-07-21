package br.com.aluraflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aluraflix.Repsistory.VideoRepository;
import br.com.aluraflix.model.Video;

@Service
public class VideoService {
	@Autowired
	private VideoRepository videoRepository;
	public List<Video> listaVideos() {
		return videoRepository.findAll();
	}

}
