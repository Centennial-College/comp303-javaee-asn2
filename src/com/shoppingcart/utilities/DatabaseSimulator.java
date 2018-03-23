package com.shoppingcart.utilities;

import java.util.ArrayList;

import com.shoppingcart.beans.Product;

/**
 * 
 * @class DatabaseSimulator
 * @author
 * @description This class uses a Java Collection to store the products to
 *              simulate a database.
 * @date 2018-03-22
 *
 */
public class DatabaseSimulator {
	private ArrayList<Product> productList;
	private Product[] products;

	public DatabaseSimulator() {
		productList = new ArrayList<>();
		generateProducts();
		populateProductList();
	}

	public ArrayList<Product> getProductList() {
		return this.productList;
	}

	private void populateProductList() {
		for (int i = 0; i < products.length; i++) {
			productList.add(products[i]);
		}
	}

	/**
	 * private String sku; private String description; private int stockQuantity;
	 * private double unitPrice; private double rating;
	 */
	private void generateProducts() {
		products = new Product[6];

		// Product1
		products[0] = new Product();
		products[0].setSku("SHSRHD-440BTWL");
		products[0].setProductName("Sennheiser HD 4.40 BT Bluetooth Wireless Headphone");
		products[0].setDescription("Features:\n"
				+ "- Bluetooth 4.0 and aptX technologies to deliver exceptional wireless sound quality\r\n"
				+ "- Intuitive ear-cup mounted controls for changing tracks and for making calls via the integrated microphone.\r\n"
				+ "- NFC for simple pairing with compatible devices and frequency response is 18 to 22,000 Hz\r\n"
				+ "- Up to 25 hour battery life and is supplied with connecting cable for battery-free listening\r\n"
				+ "- 2 year warranty when purchased from an authorized Sennheiser dealer");
		products[0].setStockQuantity(0);
		products[0].setUnitPrice(129.95);
		products[0].setRating(4.3);

		// Product2
		products[1] = new Product();
		products[1].setSku("LUON-410STWL-MCNC");
		products[1].setProductName(
				"Luone Bluetooth Headphones, 4.1 Stereo Wireless Headphones With Mic, Noise Cancelling, Secure Fit, Upgraded 7 Hours Play Time");
		products[1].setDescription("Features:\n"
				+ "- Bluetooth V4.1: Latest Bluetooth V4.1 enables you to pair with all kinds of Bluetooth Enabled Devices. Skip-free stereo sound.\r\n"
				+ "- CVC 6.0 Noise Cancellation: CVC 6.0 noise cancellation technology ensures that perfect sound is delivered to your ears each time.\r\n"
				+ "- Playtime: Listen to music for up to 7 hours on a single charge. And the standby time can last to 180 hours, it is a Incredible Playtime\r\n"
				+ "- Bluetooth Wireless: Energy-efficient, cable-free connection for enjoy clear hands-free calls streaming from almost any device at a range of up to 10m (33ft).\r\n"
				+ "- Perfect Enjoyment: The volume, sound, song selection and telephone controls are all right on the wireless Bluetooth earbuds. Perfect for answering calls or listening.");
		products[1].setStockQuantity(3);
		products[1].setUnitPrice(29.99);
		products[1].setRating(2.5);

		// Product3
		products[2] = new Product();
		products[2].setSku("BOSE-QC25-ANC");
		products[2].setProductName(
				"Bose QuietComfort 25 Acoustic Noise Cancelling Headphones Samsung and Android Devices (Black)");
		products[2].setDescription("Features:\n"
				+ "- Do not place any stress or pull on the input cable. Doing so may shorten the life of your headset. Be sure the earcup ports are clear of lint, dust and debris. Do not allow moisture to get inside the earcups.\r\n"
				+ "- Significant noise reduction for travel, work and anywhere in between\r\n"
				+ "- Deep, powerful sound for the music you love\r\n"
				+ "- Lightweight, comfortable around-ear fit you can wear all day long\r\n"
				+ "- Control your music and calls on Samsung and android devices with inline mic/remote\r\n"
				+ "- Distinctive design in black or white");
		products[2].setStockQuantity(1);
		products[2].setUnitPrice(221.66);
		products[2].setRating(4.6);

		// Product4
		products[3] = new Product();
		products[3].setSku("SMSG-35EHS64");
		products[3].setProductName("Samsung 3.5mm EHS64 Stereo Headset with Remote and Mic OEM, White");
		products[3].setDescription("Features:\n" + "- Enjoy your music with the Samsung EHS64 Stereo Headset.\r\n"
				+ "- This headset comes with an in-line mic with remote function so you can answer/end calls without pulling out your phone.\r\n"
				+ "- The headset is made and designed for comfort so you can continue talking without interruptions.\r\n"
				+ "- The white color adds style and the lightweight design\r\n" + "Perfect for travelling.\r\n"
				+ "- Enjoy your music with the Samsung EHS64 Stereo Headset.\r\n"
				+ "- This headset comes with an in-line mic with remote function so you can answer/end calls without pulling out your phone");
		products[3].setStockQuantity(2);
		products[3].setUnitPrice(5.25);
		products[3].setRating(4.0);

		// Product5
		products[4] = new Product();
		products[4].setSku("SONY-MDREX15LP");
		products[4].setProductName("Sony MDREX15LP/B In-Ear Headphones (Black)");
		products[4].setDescription("Features:\n"
				+ "- Hybrid silicone earbuds for secure, comfortable fit, High quality 9mm dome type driver units\r\n"
				+ "- High energy neodymium magnets for powerful sound, Y-type cord with slider to prevent tangling\r\n"
				+ "- Two-tone color design");
		products[4].setStockQuantity(8);
		products[4].setUnitPrice(11.99);
		products[4].setRating(3.2);

		// Product6
		products[5] = new Product();
		products[5].setSku("PNSC-RPHJE120K");
		products[5].setProductName("Panasonic RPHJE120K In-Ear Headphone, Black");
		products[5].setDescription("Features:\n" + "- Color-matching for iPod Nano 5th Generation\r\n"
				+ "- Ergo-Fit Design for Ultimate Comfort and Fit\r\n"
				+ "- 3 Pairs of Soft Earpads Included (S/M/L), 1 Year Limited Warranty, Parts and Labor\r\n"
				+ "- Drive Unit (diam.in mm) - Diameter 9mm\r\n" + "- Impedance (ohm/1kHz) - 16");
		products[5].setStockQuantity(5);
		products[5].setUnitPrice(20.11);
		products[5].setRating(4);
	}
}
