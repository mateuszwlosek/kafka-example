package com.github.mateuszwlosek.account.consumer;

import com.github.mateuszwlosek.account.event.BoughtBookEvent;
import com.github.mateuszwlosek.account.event.EventChannels;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookConsumer {

	@StreamListener(EventChannels.BOUGHT_BOOK_IN)
	public void listen(@Payload final BoughtBookEvent event) {
		log.info("Received info about bought book: {} by account: {}", event.getBookId(), event.getAccountId());
	}
}
