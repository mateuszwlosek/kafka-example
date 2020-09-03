package com.dineshonjava.accountservice.service;

import com.dineshonjava.accountservice.event.BookEventChannels;
import com.dineshonjava.accountservice.event.BoughtBookEvent;
import com.dineshonjava.accountservice.model.BoughtBookPayload;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookService {

	private final BookEventChannels eventChannels;

	public void buyBook(final BoughtBookPayload payload) {
		log.info("User: {} has bought a book with id: {}", payload.getAccountId(), payload.getBookId());
		sendBoughtBookInfo(payload);
	}

	private void sendBoughtBookInfo(final BoughtBookPayload payload) {
		final BoughtBookPayload.DeliveryDetails deliveryDetails = payload.getDeliveryDetails();

		final BoughtBookEvent event = BoughtBookEvent.builder()
			.accountId(payload.getAccountId())
			.bookId(payload.getBookId())
			.deliveryCountry(deliveryDetails.getCountry())
			.deliveryStreet(deliveryDetails.getStreet())
			.deliveryHouseNumber(deliveryDetails.getHouseNumber())
			.deliveryRegion(deliveryDetails.getRegion())
			.deliveryZipCode(deliveryDetails.getZipCode())
			.build();

		eventChannels.boughtBookOut()
			.send(MessageBuilder.withPayload(event)
			.build());

		log.info("Sent info about bought book: {} by account id: {}: {}", payload.getBookId(), payload.getAccountId(), event);
	}
}
