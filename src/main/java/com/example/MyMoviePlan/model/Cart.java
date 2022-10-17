package com.example.MyMoviePlan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MovieDetails")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "movie_name")
	private String movieName;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "show_timing")
	private String show_timing;
	
	@Column(name = "Ticket_price")
	private Long Ticket_price;
	
	public Cart() {}

	public Cart(String movieName, String showDate, String showTime, String showingLocation, Long price) {
		super();
		this.movieName = movieName;
		this.language = showDate;
		this.Description = showTime;
		this.show_timing = showingLocation;
		this.Ticket_price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getShow_timing() {
		return show_timing;
	}

	public void setShow_timing(String show_timing) {
		this.show_timing = show_timing;
	}

	public Long getTicket_price() {
		return Ticket_price;
	}

	public void setTicket_price(Long ticket_price) {
		Ticket_price = ticket_price;
	}

	
}
