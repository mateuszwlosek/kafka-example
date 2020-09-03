package com.github.mateuszwlosek.order.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

public interface EventChannels {
	
	String BOUGHT_BOOK_IN = "boughtBook-in";

	@Input(BOUGHT_BOOK_IN)
	SubscribableChannel boughtBookIn();
}
