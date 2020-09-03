package com.github.mateuszwlosek.account.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EventChannels {
	
	String BOUGHT_BOOK_IN = "boughtBook-in";

	@Input(BOUGHT_BOOK_IN)
	SubscribableChannel boughtBookIn();
}
