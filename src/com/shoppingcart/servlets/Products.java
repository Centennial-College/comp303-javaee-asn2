package com.shoppingcart.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shoppingcart.beans.Product;
import com.shoppingcart.utilities.DatabaseSimulator;

/**
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DatabaseSimulator db = new DatabaseSimulator();
		HttpSession session = request.getSession();

		// only load the product list from the DatabaseSimulator into session scope if
		// it has not already been loaded
		if (session.getAttribute("products") == null) {
			session.setAttribute("products", db.getProducts());
		}
		request.getRequestDispatcher("products.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		// only create new cart for the session (user) if it does not already exist
		if (session.getAttribute("shoppingcart") == null) {
			// the cart can be arraylist unlike products which was hashmap
			// this is because we simply iterate through cart to display items and sum the
			// total price for display; no querying the collection
			session.setAttribute("shoppingcart", new ArrayList<Product>());
		}

		ArrayList shoppingcart = (ArrayList<Product>) session.getAttribute("shoppingcart");
		HashMap availableProducts = (HashMap<String, Product>) session.getAttribute("products");

		// append the item which was clicked on by the user to the shoppingcart
		shoppingcart.add(availableProducts.get(request.getParameter("itemSku")));

		// update the user's (session's) shopping cart with the new cart
		session.setAttribute("shoppingcart", shoppingcart);

		// redirect to ShoppingCart servlet, webbrowser will fire a new HTTP GET request
		response.sendRedirect("ShoppingCart");
	}

}
