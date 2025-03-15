package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainNo;
    private String trainId;
    private List<List<Integer>> seats;
    private Map<String, Time> stationTime;
    private List<String> stations;
}



