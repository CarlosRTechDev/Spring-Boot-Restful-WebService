package com.crosales.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crosales.api.entity.Album;


public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
