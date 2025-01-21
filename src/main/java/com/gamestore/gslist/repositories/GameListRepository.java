package com.gamestore.gslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamestore.gslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
