package com.dineshonjava.accountservice.controller;

import com.dineshonjava.accountservice.model.BoughtBookPayload;
import com.dineshonjava.accountservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {

	private final BookService service;

	@PostMapping("buy")
	public void buyBook(@RequestBody final BoughtBookPayload payload) {
		service.buyBook(payload);
	}
}
