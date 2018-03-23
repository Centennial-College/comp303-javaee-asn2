<%@ include file="./partials/header.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

            <div class="container-fluid" style="margin-top: 65px">
                <div class="row">
                    <h1 class="">Headphones List</h1>
                </div>

                <div class="row">
                    <table class="table table-hover table-dark">
                        <thead>
                            <tr>
                                <th scope="col"></th>
                                <th scope="col">Name</th>
                                <th scope="col">Description</th>
                                <th scope="col"></th>
                                <th scope="col">Price</th>
                                <th scope="col">Rating</th>
                                <th scope="col">Quantity</th>
                                <th scope="col"></th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach items="${sessionScope.products}" var="product">
                                <form action="Products" method="post">
                                    <input type="hidden" id="itemSku" name="itemSku" value="${product.sku}" />
                                    <tr>
                                        <th scope="row">
                                            <img class="w-5" src="./img/${product.sku}.png" alt=""> </a>
                                        </th>
                                        <th scope="row">
                                            <b>${product.productName}</b>
                                        </th>
                                        <td> ${product.description} </td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${product.stockQuantity > 0}">
                                                    <span class="text-success">In Stock.</span>
                                                </c:when>
                                                <c:otherwise>
                                                    <span class="text-danger">Out of Stock.</span>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <fmt:formatNumber value="${product.unitPrice}" type="currency" /> </td>
                                        <td> ${product.rating} </td>
                                        <td>
                                            <input type="number" min="1" id="qnty" name="qnty" size="3" />
                                        </td>
                                        <td>
                                            <input type="submit" class="btn btn-primary pull-right" value="Add To Cart" style="font-size: 10px;" />
                                        </td>
                                    </tr>
                                </form>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>

            </div>

            <%@ include file="./partials/footer.jsp" %>