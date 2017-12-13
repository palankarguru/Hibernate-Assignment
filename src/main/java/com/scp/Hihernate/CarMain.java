package com.scp.Hihernate;

import java.util.List;

public class CarMain {

	public static void main(String[] args) {

		/*
		 * CarList cl = new CarList(); cl.getCarId(101);
		 */

		DemoCar d1 = new DemoCar(101, "Benz", "Black", 1001001);
		DemoCar d2 = new DemoCar(102, "Audi", "White", 1001001);
		DemoCar d3 = new DemoCar(103, "Maruti", "Black", 1001001);
		DemoCar d4 = new DemoCar(104, "BMW", "White", 1001001);

		CarTypes ctype = new CarList();

		ctype.addCar(d1);
		ctype.addCar(d2);
		ctype.addCar(d3);
		ctype.addCar(d4);

		ctype.getCarId(101);

		 ctype.deleteCar(d2.getId());

		ctype.updateCar(d3);

		List<DemoCar> ls = ctype.getallCar();
		for (DemoCar c : ls) {
			System.out.println(c);
		}
		System.out.println("------------------------------");
		//ctype.SearchCarByName("Audi");

		System.out.println("Entery new Successfull........");
	}

}
