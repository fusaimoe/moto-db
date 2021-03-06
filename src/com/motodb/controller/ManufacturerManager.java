package com.motodb.controller;

import com.motodb.model.Manufacturer;

import javafx.collections.ObservableList;

public interface ManufacturerManager {

    void addManufacturer(String name, String urlLogo);

    ObservableList<Manufacturer> getManufacturers();

    ObservableList<String> getManufacturersNames();

    ObservableList<Manufacturer> getManufacturersByRiderAndYear(int rider, int year);

    ObservableList<Manufacturer> getManufacturersByTeamAndYear(String team, int year);
}