package com.kafkademo.Payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserKafka {

	private int id;
	private String firstname;
	private String lastname;
	
	@Override
	public String toString() {
		return "UserKafka [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
