package com.cloudbi.connector.util;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * ElasticsearchClientUtil: Returns the Connection Client of the elasticsearch
 *
 * @author marcos
 */
public class ElasticsearClientUtil {
    private static final String HOST = "localhost";

    private static final int PORT = 9200;

    private static final String SCHEMA = "http";

    private static RestHighLevelClient client;

    static {
        client = new RestHighLevelClient(
            RestClient.builder(
                new HttpHost(HOST, PORT, SCHEMA)
            )
        );
    }


    public static RestHighLevelClient getClient() {
        return client;
    }
}
