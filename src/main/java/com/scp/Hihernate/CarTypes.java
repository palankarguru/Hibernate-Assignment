package com.scp.Hihernate;

import java.util.List;

public interface CarTypes {
	DemoCar getCarId(int id);

	boolean addCar(DemoCar car);

	boolean deleteCar(int id);

	DemoCar updateCar(DemoCar car);

	List<DemoCar> getallCar();

	//DemoCar SearchCarByName(String s);

}
