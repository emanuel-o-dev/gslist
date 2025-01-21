package com.gamestore.gslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamestore.gslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
