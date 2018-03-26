GroupKOPS_Assignment2

---

This is the assignment 2 submission for COMP303 by Group KOPS.

Group Members:
	Kevin Ma				300867968
	Ostap Hamarnyk			300836326
	Poulad Ashraf Pour		300858337
	Suthas Ganeshathasan	300838430
---

First, we created the Product bean to represent a Product entity for our Shopping Cart application.

We then created a Utility class, DatabaseSimulator, to simulate data persistence for our application. It contains the logic to generate and store the products for this application.

We then created two servlets: Products and ShoppingCart to control the routing and flow of our application. Inside of our servlets, we stored values inside of our session scope such as the list of products, and the user's shopping cart as this data should be restricted to the current user's session.

We created 3 jsp pages (index, products, shoppingcart) which handles the presentation layer for our application. Inside of these jsp files, we employed JSTL and EL in order to display the data from our servlets to the client.

We added other accessories such as displaying the images of the products, displaying the ratings of the products as stars and much more inside of our WebContent/[css|img|partials|scripts] directories.