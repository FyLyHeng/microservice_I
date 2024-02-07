package com.fylyheng.corebanking.account.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private String msg;
    private String buildVersion;
    private Map<String,String> mailDetail;
    private List<String> activeBranches;
}
