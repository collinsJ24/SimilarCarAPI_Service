package com.kliptokon.similar.car.service;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.kliptokon.similar.car.entity.CarMake;
import com.kliptokon.similar.car.entity.CarVIN;
import com.kliptokon.similar.car.model.CARVINResponse;
import com.kliptokon.similar.car.repo.CarMakeRepo;
import com.kliptokon.similar.car.repo.CarRepo;
import org.json.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    @Autowired
    CarMakeRepo carMakeRepo;

    @Autowired
    CarRepo carRepo;

    @Autowired
    public CarServiceImpl(CarMakeRepo carMakeRepo, CarRepo carRepo){
        this.carMakeRepo = carMakeRepo;
        this.carRepo = carRepo;
    }

    @Override
    public List<CarMake> getAllCars(){
        List<CarMake> returnedCarList = carRepo.findAllCars();
        return returnedCarList;
    }

    @Override
    public List<CarVIN> getVIN_Details(String VIN) {
        String uri = "https://vpic.nhtsa.dot.gov/api/vehicles/DecodeVinValues/" + VIN + "?format=json";
        RestTemplate restTemplate = new RestTemplate();
        String VINDetails = restTemplate.getForObject(uri,String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        CARVINResponse carResponse = new CARVINResponse();
        try {
            carResponse= objectMapper.readValue(VINDetails, CARVINResponse.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return carResponse.getCars();
    }

    @Override
    public List<CarMake> getCarMakeInformation(Integer make_id) {
        List<CarMake> returnedCarList = carMakeRepo.findCarInfo(make_id);
        return returnedCarList;
    }

}
