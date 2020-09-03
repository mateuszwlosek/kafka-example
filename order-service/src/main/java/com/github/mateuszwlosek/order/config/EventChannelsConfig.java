package com.github.mateuszwlosek.order.config;

import com.github.mateuszwlosek.order.event.EventChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(EventChannels.class)
public class EventChannelsConfig {

}
