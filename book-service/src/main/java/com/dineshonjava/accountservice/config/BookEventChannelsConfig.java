package com.dineshonjava.accountservice.config;

import com.dineshonjava.accountservice.event.BookEventChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;


@EnableBinding(BookEventChannels.class)
public class BookEventChannelsConfig {

}
