package com.fylyheng.corebanking.account.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.List;
import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "account")
public class AccountServerConfig {

    private String msg;
    private String buildVersion;
    private Map<String,String> mailDetail;
    private List<String> activeBranches;
}
