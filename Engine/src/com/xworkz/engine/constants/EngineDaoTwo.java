package com.xworkz.engine.constants;

import com.xworkz.engine.dto.EngineDto;

public class EngineDaoTwo implements EngineDao {

	EngineDto[] engine = new EngineDto[5];

	public EngineDto saveEngine(EngineDto name) {
		if (name != null) {
			if (name.getName() != null)
				for (int i = 0; i < engine.length; i++) {
					if (engine != null) {
						if (engine[i] == null) {
							engine[i] = name;
							System.out.println("Engine is Saved");
							return engine[i];
						}
					}

				}
			System.out.println("Array is not null");
			return null;
		}
		return null;
	}

	public EngineDto[] readEngine() {

		return engine;
	}

	public boolean updateEngine(String name, String type) {
		if (name != null && type != null) {
			for (int i = 0; i < engine.length; i++) {
				if (engine[i] != null && engine[i].getName() != null) {
					if (engine[i].getName().equals(name)) {
						engine[i].setType(type);
						System.out.println("Name Updated");
						return true;
					}
				}
			}
			System.out.println("Name not found");
			return false;

		}
		System.out.println("Name or type is null");
		return false;
	}

	public boolean searchEngine(String type) {
		if (type != null) {
			for (int i = 0; i < engine.length; i++) {
				if (engine[i] != null && engine[i].getType() != null) {
					if (engine[i].getType().equals(type)) {
						System.out.println("Engine Found");
						return true;

					}
				}

			}
			System.out.println("type not found");
			return false;
		}
		System.out.println("type is null");
		return false;
	}

	public boolean deleteEngine(String cycle) {
		if (cycle != null) {
			for (int i = 0; i < engine.length; i++) {
				if (engine[i] != null && engine[i].getCycle() != null) {
					if (engine[i].getCycle().equals(cycle)) {
						engine[i] = null;
						System.out.println("dto deleted");
						return true;
					}
				}

			}
			System.out.println("Engine Cycle not found");
			return false;
		}
		return false;
	}

}
