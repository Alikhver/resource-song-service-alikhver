package com.example.resourcesongservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("my.client.song-service")
public class SongClientProperties {
    private String id;
    private String endpoint;
}
