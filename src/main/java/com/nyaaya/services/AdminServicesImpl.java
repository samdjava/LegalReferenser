package com.nyaaya.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyaaya.model.TrafficRulesResponse;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Samnbuddha
 */

public class AdminServicesImpl implements AdminServices{

    private static final String ELASTIC_SEARCH_END_POINT = "";
    private static final String urlEndpoint = "http://nyaaya.in/api/e1/traffic-challan/?city=1";

    public String ping(){
        return "Admin services are up";
    }

    public void pullDataToElasticSearch(){
        JSONObject json;
        TrafficRulesResponse trafficRulesResponse;
        try {
            readDataFromUrl(urlEndpoint);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void readDataFromUrl(String urlString) throws Exception{
        TrafficRulesResponse trafficRulesResponse;
        URL url = new URL(urlString);
        URLConnection connection = url.openConnection();
        try {
            String line;
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while((line = reader.readLine()) != null) {
                builder.append(line);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            trafficRulesResponse = objectMapper.readValue(builder.toString(), TrafficRulesResponse.class);
            pushData(trafficRulesResponse);
            if(StringUtils.isNotEmpty(trafficRulesResponse.getNext())){
                readDataFromUrl(trafficRulesResponse.getNext());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void pushData(TrafficRulesResponse trafficRulesResponse) {

    }

}
