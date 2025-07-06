package com.example.app.controller;

import com.example.app.service.GCPStorageBucketService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/myApp")
public class RestController {


   private GCPStorageBucketService gcpStorageBucketService;

   public RestController(GCPStorageBucketService gcpStorageBucketService) {
        this.gcpStorageBucketService = gcpStorageBucketService;
   }

    @GetMapping("/getValue")
    public String getValue() {
        return "It's success call";
    }

    @GetMapping("/getGSBucketData")
    public String getGSBucketData() {
        return gcpStorageBucketService.getGSBucketData();
    }

}
