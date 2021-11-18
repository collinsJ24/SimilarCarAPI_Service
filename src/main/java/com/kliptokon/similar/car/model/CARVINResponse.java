package com.kliptokon.similar.car.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kliptokon.similar.car.entity.CarVIN;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CARVINResponse {
    @JsonProperty("Results")
    List<CarVIN> Results;

    public List<CarVIN> getCars() {
        return Results;
    }

    public void setCars(List<CarVIN> Results) {
        this.Results = Results;
    }


    public String getSearchCriteria() {
        return SearchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        SearchCriteria = searchCriteria;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }
    @JsonProperty("SearchCriteria")
    private String SearchCriteria;
    @JsonProperty("Count")
    private String Count;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }


    @JsonProperty("Message")
    private String Message;

    @Override
    public String toString() {
        return "CarResponse{" +
                "Results=" + Results +
                '}';
    }

}