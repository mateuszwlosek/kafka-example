package com.dineshonjava.accountservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoughtBookPayload {

	private int accountId;
	private int bookId;
	private DeliveryDetails deliveryDetails;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class DeliveryDetails {
		private String street;
		private String houseNumber;
		private String zipCode;
		private String country;
		private String region;
	}
}



