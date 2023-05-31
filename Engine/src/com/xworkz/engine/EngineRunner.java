package com.xworkz.engine;

import com.xworkz.engine.constants.EngineDaoTwo;
import com.xworkz.engine.dto.EngineDto;

public class EngineRunner {

	public static void main(String[] args) {

		EngineDaoTwo dao = new EngineDaoTwo();
		EngineDto dto = new EngineDto("Petrol Engine", "Two Stroke", "Petrol", 50000, "Thermodynamic", "Stright");
		EngineDto dto1 = new EngineDto("Diesel Engine", "Four Stroke", "Petrol", 100000, "dynamic", "V Shape");

		dao.saveEngine(dto);
		dao.saveEngine(dto1);
		EngineDto[] ref = dao.readEngine();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) {
				System.out.println(ref[i]);
			}
		}

		System.out.println("-------------------------------------------------------");
		boolean update = dao.updateEngine("Petrol Engine", "Absolute");
		System.out.println(update);
		EngineDto[] ref1 = dao.readEngine();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) {
				System.out.println(ref1[i]);
			}
		}

		System.out.println("-------------------------------------------------------");
		boolean search = dao.searchEngine("Four Stroke");
		System.out.println(search);
		EngineDto[] ref2 = dao.readEngine();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) {
				System.out.println(ref2[i]);
			}
		}

		System.out.println("-------------------------------------------------------");
		boolean delete = dao.deleteEngine("dynamic");
		System.out.println(delete);

		EngineDto[] ref3 = dao.readEngine();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) {
				System.out.println(ref3[i]);
			}
		}

	}

}
