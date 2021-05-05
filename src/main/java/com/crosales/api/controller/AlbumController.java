package com.crosales.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crosales.api.entity.Album;
import com.crosales.api.service.IAlbumService;


@RestController
@RequestMapping("/music-api")
public class AlbumController {
	
	@Autowired
	private IAlbumService serviceAlbum;
	
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbum.buscarTodos();
	}
	
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album){ //@RequestBody: le indica a Spring, que busque en el cuerpo de la peticion la info en JSON y convierte en automatico el databinding a un objeto Album 
		serviceAlbum.guardar(album);
		return album;
	}
	
	
	@PutMapping("/albums")
	public Album actualizar(@RequestBody Album album){
		serviceAlbum.guardar(album); //Cuando se ejecuta el metodo guardar(), SpringJPA detecta el Id existente y por tanto actualiza el registro de manera automatica
		return album;
	}
	
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") int idAlbum){
		serviceAlbum.eliminar(idAlbum);
		return "Registro eliminado";
	}
	

}
