package org.gfg.JBDL_76_NotificationService.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class CommonConfig {

    @Bean
    public ObjectMapper objectMapper(){
        return  new ObjectMapper();
    }

    @Bean
    public SimpleMailMessage getMailMessage(){
        return new SimpleMailMessage();
    }
}
