package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainNo;
    private String trainId;
    private List<List<Integer>> seats;
    private Map<String, String> stationTime;
    private List<String> stations;

    public Train(){}
    public Train(String trainNo, String trainId, List<List<Integer>> seats, Map<String, String> stationTime, List<String> stations) {
        this.trainNo = trainNo;
        this.trainId = trainId;
        this.seats = seats;
        this.stationTime = stationTime;
        this.stations = stations;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, String> getStationTime() {
        return stationTime;
    }

    public void setStationTime(Map<String, String> stationTime) {
        this.stationTime = stationTime;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }


}



