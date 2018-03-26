<%@ include file="./partials/header.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

            <div class="container" style="margin-top: 65px">

                <c:choose>
                    <c:when test="${requestScope.errorMessage != null}">
                        <div class="row">
                            <h1>${requestScope.errorMessage}</h1>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <h1>GOT SOME GOODIES IN DA BASKET DO YA?</h1>
                        <div class="row">
                            <table class="table table-hover table-dark">
                                <thead>
                                    <tr>
                                        <th scope="col">Name</th>
                                        <th scope="col">Description</th>
                                        <th scope="col">Unit Price</th>
                                        <th scope="col">Quantity</th>
                                        <th scope="col">Total Price</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <!-- declare totalPrice -->
                                    <c:set var="totalPrice" scope="page" value="0" />

                                    <!-- one row per each product in shopping cart -->
                                    <c:forEach items="${sessionScope.shoppingcart}" var="product" varStatus="counter">
                                        <tr>
                                            <td>${product.productName}</td>
                                            <td style="white-space: pre-wrap;">${product.description}</td>
                                            <td>
                                                <fmt:formatNumber value="${product.unitPrice}" type="currency" />
                                            </td>
                                            <td>${sessionScope.purchaseQnty.get(counter.index)}</td>
                                            <td>
                                                <c:set var="productTotalPrice" scope="page" value="${product.unitPrice*sessionScope.purchaseQnty.get(counter.index)}" />
                                                <fmt:formatNumber value="${ productTotalPrice }" type="currency" />
                                            </td>

                                            <!-- increment totalPrice var -->
                                            <c:set var="totalPrice" scope="page" value="${totalPrice+productTotalPrice}" />
                                        </tr>
                                    </c:forEach>

                                    <!-- Totals row -->
                                    <tr>
                                        <td>
                                            <b>Totals:</b>
                                        </td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td>
                                            <fmt:formatNumber value="${totalPrice}" type="currency" />
                                        </td>
                                    </tr>
                                </tbody>
                            </table>

                        </div>
                    </c:otherwise>
                </c:choose>
                <div class="row">
                    <a href="/GroupKOPS_Assignment2/Products" class="btn btn-info" role="button">Continue Shopping</a>
                </div>
            </div>

            <%@ include file="./partials/footer.jsp" %>