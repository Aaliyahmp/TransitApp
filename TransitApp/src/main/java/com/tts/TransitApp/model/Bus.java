package com.tts.TransitApp.model;

import lombok.Data;
import org.springframework.web.client.RestTemplate;

import javax.xml.stream.Location;
@Data
public class Bus {
    public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public double distance;




}