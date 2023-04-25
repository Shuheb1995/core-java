package com.xworkz.encapsulation.dto;

public class ShopDto {
	
	private String shopName;
	private String address;
	private String type;
	private String owner;
	private int workers;
	private int monthyIncome;
	private int dailyExpenses;
	private int dailyIncome;
	private int dailySavings;
	private int openDays;
	private int offDay;
	private String workersLeave;
	private int shpoRent;
	private int shopDeposit;
	private String workerName;
	private String cashierName;
	private String mostSellingItem;
	private int itemPrice;
	private String itemName;
	private int price;
	private String oilName;
	private boolean sellsVegitables;
	private boolean sellsFruits;
	private int tomatoPerKg;
	private int onionPerKg;
	private int lemonPerPiece;
	private int cucumberPerKg;
	private int greenPeas;
	private int beans;
	private int cabbage;
	private int greenChilly;
	private int capcicum;
	private String Apple;
	private int applePrice;
	private String pineapple;
	private int pineapplePrice;
	private String pamogranate;
	private int pamoPrice;
	private String grapes;
	private int grapesPrice;
	private String chicoo;
	private int chicooPrice;
	private String guava;
	private int guavaPrice;
	private String biscuiteName;
	private int biscuitePrice;
	private String coolDrink;
	private String iceCreame;
	private String packetMasala;
	private int masalaPrice;
	private String pencils;
	private int pricePerPencil;
	private String pens;
	private int pricePerPen;
	private String cigerattes;
	private int pricePerPack;
	private String beedi;
	private int pricePerBundle;
	private String eggs;
	private int pricePerEgg;
	
	
	
	public ShopDto(String shopName,String address,String type,String owner,int workers,int monthyIncome,int dailyExpenses,int dailyIncome,int dailySavings,int openDays,int offDay,String workersLeave,int shpoRent,int shopDeposit,String workerName,String cashierName,String mostSellingItem,int itemPrice,String itemName,int price) {
		this.shopName=shopName;
		this.address=address;
		this.type=type;
		this.owner=owner;
		this.workers=workers;
		this.monthyIncome=monthyIncome;
		this.dailyExpenses=dailyExpenses;
		this.dailyIncome=dailyIncome;
		this.dailySavings=dailySavings;
		this.openDays=openDays;
		this.offDay=offDay;
		this.workersLeave=workersLeave;
		this.shpoRent=shpoRent;
		this.shopDeposit=shopDeposit;
		this.workerName=workerName;
		this.cashierName=cashierName;
		this.mostSellingItem=mostSellingItem;
		this.itemPrice=itemPrice;
		this.itemName=itemName;
		this.price=price;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName=shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public int getWorkers() {
		return workers;
	}
	public void setWorkers(int workers) {
		this.workers=workers;
	}
	public int getMonthyIncome() {
		return monthyIncome;
	}
	public void setMonthyIncome(int monthyIncome) {
		this.monthyIncome=monthyIncome;
	}
	public int getDailyExpenses() {
		return dailyExpenses;
	}
	public void setDailyExpenses(int dailyExpenses) {
		this.dailyExpenses=dailyExpenses;
	}
	public int getDailyIncome() {
		return dailyIncome;
	}
	public void setDailyIncome(int dailyIncome) {
		this.dailyIncome=dailyIncome;
	}
	public int getDailySavings() {
		return dailySavings;
	}
	public void setDailySavings(int dailySavings) {
		this.dailySavings=dailySavings;
	}
	public int getOpenDays() {
		return openDays;
	}
	public void setOpenDays(int openDays) {
		this.openDays=openDays;
	}
	public int getOffDay() {
		return offDay;
	}
	public void setOffDay(int offDay) {
		this.offDay=offDay;
	}
	public String getWorkersLeave() {
		return workersLeave;
	}
	public void setWorkersLeave(String workersLeave) {
		this.workersLeave=workersLeave;
	}
	public int getShpoRent() {
		return shpoRent;
	}
	public void setShpoRent(int shpoRent) {
		this.shpoRent=shpoRent;
	}
	public int getShopDeposit() {
		return shopDeposit;
	}
	public void setShopDeposit(int shopDeposit) {
		this.shopDeposit=shopDeposit;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName=workerName;
	}
	public String getCashierName() {
		return cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName=cashierName;
	}
	public String getmostSellingItem() {
		return mostSellingItem;
	}
	public void setMostSellingItem(String mostSellingItem) {
		this.mostSellingItem=mostSellingItem;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice=itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}

	public String getOilName() {
		return oilName;
	}

	public void setOilName(String oilName) {
		this.oilName = oilName;
	}

	public boolean getSellsVegitables() {
		return sellsVegitables;
	}

	public void setSellsVegitables(boolean sellsVegitables) {
		this.sellsVegitables = sellsVegitables;
	}

	public boolean getSellsFruits() {
		return sellsFruits;
	}

	public void setSellsFruits(boolean sellsFruits) {
		this.sellsFruits = sellsFruits;
	}

	public int getTomatoPerKg() {
		return tomatoPerKg;
	}

	public void setTomatoPerKg(int tomatoPerKg) {
		this.tomatoPerKg = tomatoPerKg;
	}

	public int getOnionPerKg() {
		return onionPerKg;
	}

	public void setOnionPerKg(int onionPerKg) {
		this.onionPerKg = onionPerKg;
	}

	public int getLemonPerPiece() {
		return lemonPerPiece;
	}

	public void setLemonPerPiece(int lemonPerPiece) {
		this.lemonPerPiece = lemonPerPiece;
	}

	public int getCucumberPerKg() {
		return cucumberPerKg;
	}

	public void setCucumberPerKg(int cucumberPerKg) {
		this.cucumberPerKg = cucumberPerKg;
	}

	public int getGreenPeas() {
		return greenPeas;
	}

	public void setGreenPeas(int greenPeas) {
		this.greenPeas = greenPeas;
	}

	public int getBeans() {
		return beans;
	}

	public void setBeans(int beans) {
		this.beans = beans;
	}

	public int getCabbage() {
		return cabbage;
	}

	public void setCabbage(int cabbage) {
		this.cabbage = cabbage;
	}

	public int getGreenChilly() {
		return greenChilly;
	}

	public void setGreenChilly(int greenChilly) {
		this.greenChilly = greenChilly;
	}

	public int getCapcicum() {
		return capcicum;
	}

	public void setCapcicum(int capcicum) {
		this.capcicum = capcicum;
	}

	public String getApple() {
		return Apple;
	}

	public void setApple(String apple) {
		Apple = apple;
	}

	public int getApplePrice() {
		return applePrice;
	}

	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
	}

	public String getPineapple() {
		return pineapple;
	}

	public void setPineapple(String pineapple) {
		this.pineapple = pineapple;
	}

	public int getPineapplePrice() {
		return pineapplePrice;
	}

	public void setPineapplePrice(int pineapplePrice) {
		this.pineapplePrice = pineapplePrice;
	}

	public String getPamogranate() {
		return pamogranate;
	}

	public void setPamogranate(String pamogranate) {
		this.pamogranate = pamogranate;
	}

	public int getPamoPrice() {
		return pamoPrice;
	}

	public void setPamoPrice(int pamoPrice) {
		this.pamoPrice = pamoPrice;
	}

	public String getGrapes() {
		return grapes;
	}

	public void setGrapes(String grapes) {
		this.grapes = grapes;
	}

	public int getGrapesPrice() {
		return grapesPrice;
	}

	public void setGrapesPrice(int grapesPrice) {
		this.grapesPrice = grapesPrice;
	}

	public String getChicoo() {
		return chicoo;
	}

	public void setChicoo(String chicoo) {
		this.chicoo = chicoo;
	}

	public int getChicooPrice() {
		return chicooPrice;
	}

	public void setChicooPrice(int chicooPrice) {
		this.chicooPrice = chicooPrice;
	}

	public String getGuava() {
		return guava;
	}

	public void setGuava(String guava) {
		this.guava = guava;
	}

	public int getGuavaPrice() {
		return guavaPrice;
	}

	public void setGuavaPrice(int guavaPrice) {
		this.guavaPrice = guavaPrice;
	}

	public String getBiscuiteName() {
		return biscuiteName;
	}

	public void setBiscuiteName(String biscuiteName) {
		this.biscuiteName = biscuiteName;
	}

	public int getBiscuitePrice() {
		return biscuitePrice;
	}

	public void setBiscuitePrice(int biscuitePrice) {
		this.biscuitePrice = biscuitePrice;
	}

	public String getCoolDrink() {
		return coolDrink;
	}

	public void setCoolDrink(String coolDrink) {
		this.coolDrink = coolDrink;
	}

	public String getIceCreame() {
		return iceCreame;
	}

	public void setIceCreame(String iceCreame) {
		this.iceCreame = iceCreame;
	}

	public String getPacketMasala() {
		return packetMasala;
	}

	public void setPacketMasala(String packetMasala) {
		this.packetMasala = packetMasala;
	}

	public int getMasalaPrice() {
		return masalaPrice;
	}

	public void setMasalaPrice(int masalaPrice) {
		this.masalaPrice = masalaPrice;
	}

	public String getPencils() {
		return pencils;
	}

	public void setPencils(String pencils) {
		this.pencils = pencils;
	}

	public int getPricePerPencil() {
		return pricePerPencil;
	}

	public void setPricePerPencil(int pricePerPencil) {
		this.pricePerPencil = pricePerPencil;
	}

	public int getPricePerPen() {
		return pricePerPen;
	}

	public void setPricePerPen(int pricePerPen) {
		this.pricePerPen = pricePerPen;
	}

	public String getPens() {
		return pens;
	}

	public void setPens(String pens) {
		this.pens = pens;
	}

	public int getPricePerPack() {
		return pricePerPack;
	}

	public void setPricePerPack(int pricePerPack) {
		this.pricePerPack = pricePerPack;
	}

	public String getCigerattes() {
		return cigerattes;
	}

	public void setCigerattes(String cigerattes) {
		this.cigerattes = cigerattes;
	}

	public String getBeedi() {
		return beedi;
	}

	public void setBeedi(String beedi) {
		this.beedi = beedi;
	}

	public int getPricePerBundle() {
		return pricePerBundle;
	}

	public void setPricePerBundle(int pricePerBundle) {
		this.pricePerBundle = pricePerBundle;
	}

	public String getEggs() {
		return eggs;
	}

	public void setEggs(String eggs) {
		this.eggs = eggs;
	}

	public int getPricePerEgg() {
		return pricePerEgg;
	}

	public void setPricePerEgg(int pricePerEgg) {
		this.pricePerEgg = pricePerEgg;
	}
}
