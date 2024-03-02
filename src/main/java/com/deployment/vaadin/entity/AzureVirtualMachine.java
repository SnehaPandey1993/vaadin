package com.deployment.vaadin.entity;



import java.util.Map;


public class AzureVirtualMachine {
    // Virtual machine details
    private String name;
    private String vmSize;
    private String osType;
    private String location;
    private String subnet;
    private Map<String, String> tags;
}
