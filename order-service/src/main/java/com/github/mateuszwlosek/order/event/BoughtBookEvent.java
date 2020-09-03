package com.github.mateuszwlosek.order.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoughtBookEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private long accountId;
	private long bookId;

	private String deliveryStreet;
	private String deliveryHouseNumber;
	private String deliveryZipCode;
	private String deliveryCountry;
	private String deliveryRegion;
}
