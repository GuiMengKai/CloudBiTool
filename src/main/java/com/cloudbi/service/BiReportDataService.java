package com.cloudbi.service;

import com.cloudbi.connector.util.ElasticsearClientUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * BiReportDataService: To get/save data from elasticsearch
 *
 * @author marcos
 */
@Service
public class BiReportDataService {
    private static final Log log = LogFactory.getLog(BiReportDataService.class);
    private static final String ES_TYPE = "_doc";
    private static RestHighLevelClient client = ElasticsearClientUtil.getClient();

    /**
     * @param esIndex String
     * @return List<Map> </Map>Returns the data of hits searched by the index in ES
     * @throws IOException
     */
    public List<Map> getHitsData(String esIndex) throws IOException {
        SearchRequest request = new SearchRequest(esIndex);
        request.types(ES_TYPE);
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.matchAllQuery());
        request.source(sourceBuilder);
        SearchResponse searchResponse = client.search(request);
        SearchHits searchHits = searchResponse.getHits();
        List<Map> resultData = new ArrayList<>();
        for (SearchHit hit : searchHits.getHits()) {
            resultData.add(hit.getSourceAsMap());
        }
        return resultData;
    }
}
