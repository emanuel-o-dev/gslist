package com.gamestore.gslist.dto;

import com.gamestore.gslist.entities.Game;
import com.gamestore.gslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;		
	private String title;
	private Integer year;	
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();	
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	public GameMinDTO(GameMinProjection projecction) {
		this.id = projecction.getId();
		this.title = projecction.getTitle();	
		this.year = projecction.getGameYear();
		this.imgUrl = projecction.getImgUrl();
		this.shortDescription = projecction.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
}
