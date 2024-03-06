package com.bezkoder.springgraphql.mysql.model;

import jakarta.persistence.*;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "todo_title", nullable = false)
	private String todoTitle;

	@Column(name = "description")
	private String description;

	public Todo() {
	}

	public Todo(Long id) {
		this.id = id;
	}

	public Todo(String todoTitle, String description) {
		this.todoTitle = todoTitle;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", todoTitle=" + todoTitle + ", description=" + description + "]";
	}

}
