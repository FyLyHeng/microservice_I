package com.fylyheng.corebanking.account.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping("api/config")
public class ConfigController {

    private final AccountServerConfig config;

    @Value("${account.build.version}")
    private String accountBuildVersion;

    @Autowired
    public ConfigController(AccountServerConfig accountServerConfig) {
        this.config = accountServerConfig;
    }

    @GetMapping("account/properties")
    ResponseEntity<?> getProperties() throws JsonProcessingException {


        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(
                config.getMsg(),
                config.getBuildVersion(),
                config.getMailDetail(),
                config.getActiveBranches()
        );


        System.out.println("msg0 :: "+config.getMsg());
        System.out.println("ver1 :: "+config.getBuildVersion());
        System.out.println("ver2 :: "+accountBuildVersion);


        String json = objectWriter.writeValueAsString(properties);


        return ResponseEntity.ok(json);
    }

}
