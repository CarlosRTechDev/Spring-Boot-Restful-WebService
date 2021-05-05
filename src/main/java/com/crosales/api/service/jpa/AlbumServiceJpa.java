package com.crosales.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crosales.api.entity.Album;
import com.crosales.api.repository.AlbumsRepository;
import com.crosales.api.service.IAlbumService;


@Service
public class AlbumServiceJpa implements IAlbumService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll(); 
	}


	@Override
	public void guardar(Album album) {
		repoAlbums.save(album);
	}


	@Override
	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
	}

}
