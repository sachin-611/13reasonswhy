package com.db.exception;
import java.util.*;

public class CustomerNotFound extends Exception{
	private int id;
	public CustomerNotFound(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
