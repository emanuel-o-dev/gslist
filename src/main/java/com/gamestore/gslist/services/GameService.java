package com.gamestore.gslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamestore.gslist.dto.GameDto;
import com.gamestore.gslist.dto.GameMinDTO;
import com.gamestore.gslist.entities.Game;
import com.gamestore.gslist.projections.GameMinProjection;
import com.gamestore.gslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id){
		Game result = gameRepository.findById(id).get();
		GameDto dto = new GameDto(result);
		return dto; 
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result  = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;		
	}
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result  = gameRepository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;		
	}
	
	
	
}
