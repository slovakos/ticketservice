package com.example.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode(of = { "id" })
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Integer eventStatus;
	
	@Column
	private String eventName;
	@Column
	private String artist;
	@Column	
	private Timestamp eventStart;
	@Column
	private Double eventDurationHours;
	@Column
	private int hall;
	@Column
	private int eventType;
	@Column
	private String description;
	@Column
	private List<String> images;
	@Column
	private List<PriceRange> priceRanges;
	

}

