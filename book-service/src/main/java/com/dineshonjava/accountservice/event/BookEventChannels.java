package com.dineshonjava.accountservice.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

public interface BookEventChannels {
	
	String BOUGHT_BOOK_OUT = "boughtBook-out";

	@Output(BOUGHT_BOOK_OUT)
	MessageChannel boughtBookOut();
}
