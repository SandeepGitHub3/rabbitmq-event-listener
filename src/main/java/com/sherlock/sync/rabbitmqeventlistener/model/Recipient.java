package com.sherlock.sync.rabbitmqeventlistener.model;

import com.sherlock.sync.rabbitmqeventlistener.model.BasicProfile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Recipient {
	private BasicProfile basicProfile;
	private List<Address> addresses;
}
