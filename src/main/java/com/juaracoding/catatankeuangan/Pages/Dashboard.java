package com.juaracoding.catatankeuangan.Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Dashboard {
		
	AndroidDriver<MobileElement> driver;
	
	public Dashboard(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		
	}
		By btntambahTransaksi = By.id("com.chad.financialrecord:id/fabMenu");
		By inputTanggal = By.id("com.chad.financialrecord:id/tvDate");
		By inputKategori = By.id("com.chad.financialrecord:id/tvName");
		By inputJumlah = By.id("com.chad.financialrecord:id/etAmount");
		By inputKeterangan = By.id("com.chad.financialrecord:id/etNote");
		By btnSimpan = By.id("com.chad.financialrecord:id/btSave");
	
	
		public void addNewTransaction() {
			driver.findElement(btntambahTransaksi).click();
			tunggu(1);
			driver.findElement(inputTanggal).click();
			tunggu(1);
			driver.findElement(inputKategori).click();
			tunggu(1);
			driver.findElement(inputJumlah).click();
			tunggu(1);
			driver.findElement(inputKeterangan).sendKeys("Test");
			tunggu(1);
			driver.findElement(btnSimpan).click();
				
		
		}
		
		
		public void tunggu(int detik) {
			try {
				Thread.sleep(detik*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

		
		public void scroll(int startX, int startY, int endX, int endY) {
			AndroidTouchAction touchAction = new AndroidTouchAction(driver);
			touchAction.longPress(PointOption.point(startX, startY))
			.moveTo(PointOption.point(endX, endY))
			.release().perform();
		
		}


}
