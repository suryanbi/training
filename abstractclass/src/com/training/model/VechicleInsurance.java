package com.training.model;

public class VechicleInsurance extends Insurance {
	
	private String vechicleModel;
	private int yearOfManufacture;

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium = 1000;
		
		if(yearOfManufacture<2020 && vechicleModel.equals("car")) {
			premium=2000;
		}
		return premium;
	}

	public VechicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VechicleInsurance(int policyNumber, String policyHolderName, String vechicleModel, int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vechicleModel = vechicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getVechicleModel() {
		return vechicleModel;
	}

	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

}
