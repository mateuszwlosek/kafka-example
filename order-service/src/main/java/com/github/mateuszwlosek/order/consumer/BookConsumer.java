package com.github.mateuszwlosek.order.consumer;

import com.github.mateuszwlosek.order.event.BoughtBookEvent;
import com.github.mateuszwlosek.order.event.EventChannels;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookConsumer {

	@StreamListener(EventChannels.BOUGHT_BOOK_IN)
	public void listen(@Payload final BoughtBookEvent event) {
		log.info("Received info about bought book by account: {}, delivery details: " +
				"[country: {}, region: {}, zip code: {}, street: {}, house number: {}]",
			event.getBookId(),
			event.getDeliveryCountry(),
			event.getDeliveryRegion(),
			event.getDeliveryZipCode(),
			event.getDeliveryStreet(),
			event.getDeliveryHouseNumber());
	}
}
