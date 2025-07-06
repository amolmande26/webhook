package com.example.app.service;


import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class GCPStorageBucketService {

    @Autowired
    private Storage storage;


    public String getGSBucketData() {
        System.out.println("Hiii-qwiklabs-gcp-03-6a40ee768cbb");
        System.out.print(storage.toString());
        Bucket bucket = storage.get("qwiklabs-gcp-03-6a40ee768cbb");
        Blob blob = bucket.get("my-app.txt");
        String str = new String(blob.getContent(), StandardCharsets.UTF_8);
        return str;
    }
}
