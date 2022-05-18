package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="pavi_Trip")

@Data
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripHistory {
	@Id
	@Column(name="trip_id")
	int tripId;
	
	@Column(name="trip_date")
	@DateTimeFormat(iso = ISO.DATE_TIME)
	LocalDateTime tripDateTime;
	
	@Column(name="source")
	String source;
	
	@Column(name="distination")
	String  distination;
	
	@Column(name="amount")
	double amount;
	

}
