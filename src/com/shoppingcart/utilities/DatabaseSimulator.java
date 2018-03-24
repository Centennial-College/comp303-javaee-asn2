package com.shoppingcart.utilities;

import java.util.HashMap;

import com.shoppingcart.beans.Product;

/**
 * 
 * @class DatabaseSimulator
 * @author
 * @description This class uses a Java Collection to store the products to
 *              simulate a database.
 * @date 2018-03-23
 *
 */
public class DatabaseSimulator {
	// 2018.03.23 - 12:17:22 - changed ArrayList productList to HashMap b/c we do lots of querying on SKU
	// arraylist would need to iterate through whole collection to search. hashmap can do lookup by sku (key) to grab product (value)
	private HashMap<String, Product> productsMap;
	private Product[] productsArray;

	public DatabaseSimulator() {
		productsMap = new HashMap<>();
		generateProducts();
		// 2018.03.23 - 12:21:24 - changed to HashMap
		populateProductsMap();
	}

	// 2018.03.23 - 12:21:24 - changed to HashMap
	public HashMap<String, Product> getProducts() {
		return this.productsMap;
	}

	private void populateProductsMap() {
		for (int i = 0; i < productsArray.length; i++) {
			// 2018.03.23 - 12:21:24 - changed to HashMap
			productsMap.put(productsArray[i].getSku(), productsArray[i]);
		}
	}

	/**
	 * private String sku; private String description; private int stockQuantity;
	 * private double unitPrice; private double rating;
	 */
	private void generateProducts() {
		productsArray = new Product[6];

		// Product1
		productsArray[0] = new Product();
		productsArray[0].setSku("SHSRHD-440BTWL");
		productsArray[0].setProductName("Sennheiser HD 4.40 BT Bluetooth Wireless Headphone");
		productsArray[0].setDescription("Features:\n"
				+ "- Bluetooth 4.0 and aptX technologies to deliver exceptional wireless sound quality\r\n"
				+ "- Intuitive ear-cup mounted controls for changing tracks and for making calls via the integrated microphone.\r\n"
				+ "- NFC for simple pairing with compatible devices and frequency response is 18 to 22,000 Hz\r\n"
				+ "- Up to 25 hour battery life and is supplied with connecting cable for battery-free listening\r\n"
				+ "- 2 year warranty when purchased from an authorized Sennheiser dealer");
		productsArray[0].setStockQuantity(0);
		productsArray[0].setUnitPrice(129.95);
		productsArray[0].setRating(4.3);

		// Product2
		productsArray[1] = new Product();
		productsArray[1].setSku("LUON-410STWL-MCNC");
		productsArray[1].setProductName(
				"Luone Bluetooth Headphones, 4.1 Stereo Wireless Headphones With Mic, Noise Cancelling, Secure Fit, Upgraded 7 Hours Play Time");
		productsArray[1].setDescription("Features:\n"
				+ "- Bluetooth V4.1: Latest Bluetooth V4.1 enables you to pair with all kinds of Bluetooth Enabled Devices. Skip-free stereo sound.\r\n"
				+ "- CVC 6.0 Noise Cancellation: CVC 6.0 noise cancellation technology ensures that perfect sound is delivered to your ears each time.\r\n"
				+ "- Playtime: Listen to music for up to 7 hours on a single charge. And the standby time can last to 180 hours, it is a Incredible Playtime\r\n"
				+ "- Bluetooth Wireless: Energy-efficient, cable-free connection for enjoy clear hands-free calls streaming from almost any device at a range of up to 10m (33ft).\r\n"
				+ "- Perfect Enjoyment: The volume, sound, song selection and telephone controls are all right on the wireless Bluetooth earbuds. Perfect for answering calls or listening.");
		productsArray[1].setStockQuantity(3);
		productsArray[1].setUnitPrice(29.99);
		productsArray[1].setRating(2.5);

		// Product3
		productsArray[2] = new Product();
		productsArray[2].setSku("BOSE-QC25-ANC");
		productsArray[2].setProductName(
				"Bose QuietComfort 25 Acoustic Noise Cancelling Headphones Samsung and Android Devices (Black)");
		productsArray[2].setDescription("Features:\n"
				+ "- Do not place any stress or pull on the input cable. Doing so may shorten the life of your headset. Be sure the earcup ports are clear of lint, dust and debris. Do not allow moisture to get inside the earcups.\r\n"
				+ "- Significant noise reduction for travel, work and anywhere in between\r\n"
				+ "- Deep, powerful sound for the music you love\r\n"
				+ "- Lightweight, comfortable around-ear fit you can wear all day long\r\n"
				+ "- Control your music and calls on Samsung and android devices with inline mic/remote\r\n"
				+ "- Distinctive design in black or white");
		productsArray[2].setStockQuantity(1);
		productsArray[2].setUnitPrice(221.66);
		productsArray[2].setRating(4.6);

		// Product4
		productsArray[3] = new Product();
		productsArray[3].setSku("SMSG-35EHS64");
		productsArray[3].setProductName("Samsung 3.5mm EHS64 Stereo Headset with Remote and Mic OEM, White");
		productsArray[3].setDescription("Features:\n" + "- Enjoy your music with the Samsung EHS64 Stereo Headset.\r\n"
				+ "- This headset comes with an in-line mic with remote function so you can answer/end calls without pulling out your phone.\r\n"
				+ "- The headset is made and designed for comfort so you can continue talking without interruptions.\r\n"
				+ "- The white color adds style and the lightweight design\r\n" + "Perfect for travelling.\r\n"
				+ "- Enjoy your music with the Samsung EHS64 Stereo Headset.\r\n"
				+ "- This headset comes with an in-line mic with remote function so you can answer/end calls without pulling out your phone");
		productsArray[3].setStockQuantity(2);
		productsArray[3].setUnitPrice(5.25);
		productsArray[3].setRating(4.0);

		// Product5
		productsArray[4] = new Product();
		productsArray[4].setSku("SONY-MDREX15LP");
		productsArray[4].setProductName("Sony MDREX15LP/B In-Ear Headphones (Black)");
		productsArray[4].setDescription("Features:\n"
				+ "- Hybrid silicone earbuds for secure, comfortable fit, High quality 9mm dome type driver units\r\n"
				+ "- High energy neodymium magnets for powerful sound, Y-type cord with slider to prevent tangling\r\n"
				+ "- Two-tone color design");
		productsArray[4].setStockQuantity(8);
		productsArray[4].setUnitPrice(11.99);
		productsArray[4].setRating(3.2);

		// Product6
		productsArray[5] = new Product();
		productsArray[5].setSku("PNSC-RPHJE120K");
		productsArray[5].setProductName("Panasonic RPHJE120K In-Ear Headphone, Black");
		productsArray[5].setDescription("Features:\n" + "- Color-matching for iPod Nano 5th Generation\r\n"
				+ "- Ergo-Fit Design for Ultimate Comfort and Fit\r\n"
				+ "- 3 Pairs of Soft Earpads Included (S/M/L), 1 Year Limited Warranty, Parts and Labor\r\n"
				+ "- Drive Unit (diam.in mm) - Diameter 9mm\r\n" + "- Impedance (ohm/1kHz) - 16");
		productsArray[5].setStockQuantity(5);
		productsArray[5].setUnitPrice(20.11);
		productsArray[5].setRating(4);
	}
}
