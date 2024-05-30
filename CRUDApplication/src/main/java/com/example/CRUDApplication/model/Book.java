package com.example.CRUDApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;



@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	private String title;
	
	private String author;

	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		this.title=title2;
		
	}

	public void setAuthor(String author2) {
		// TODO Auto-generated method stub
		this.author=author2;
	}

}
