package com.github.mateuszwlosek.account.config;

import com.github.mateuszwlosek.account.event.EventChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(EventChannels.class)
public class EventChannelsConfig {

}
