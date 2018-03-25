<%@ include file="./partials/header.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

            <div class="container-fluid wrapper" style="margin-top: 65px">
                <div class="row">
                    <h1 class="display-4" style="margin-left: 25px;">Headphones List</h1>
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

                            <c:forEach items="${sessionScope.products}" var="product" varStatus="counter">
                                <form action="Products" method="post">
                                    <input type="hidden" id="itemSku" name="itemSku" value="${product.key}" />
                                    <tr>
                                        <th scope="row">
                                            <img src="./img/${product.key}.png" style="height: 15vh;">
                                        </th>
                                        <th scope="row">
                                            <b>${product.value.productName}</b>
                                        </th>
                                        <td style="white-space: pre-wrap;"> ${product.value.description} </td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${product.value.stockQuantity > 0}">
                                                    <span class="text-success">In Stock (${product.value.stockQuantity}).</span>
                                                </c:when>
                                                <c:otherwise>
                                                    <span class="text-danger">Out of Stock.</span>
                                                </c:otherwise>
                                            </c:choose>
                                        </td>
                                        <td>
                                            <fmt:formatNumber value="${product.value.unitPrice}" type="currency" /> </td>
                                        <td><span class="stars">${product.value.rating}</span></td>
                                        <td>
                                            <input type="number" min="1" name="qnty" id="qnty${counter.count}" style="width: 3em;" oninput="if($(this).val().length == 0){$('#addToCart${counter.count}').prop('disabled',true);} else {$('#addToCart${counter.count}').prop('disabled',false);if($(this).val()>${product.value.stockQuantity}){alert('There are only ${ product.value.stockQuantity} headphones in stock!\nYou cannot purchase '+ $(this).val()+'!');$('#addToCart${counter.count}').prop('disabled',true);}}"
                                            />
                                        </td>
                                        <td>
                                            <input type="submit" class="btn btn-primary pull-right" value="Add To Cart" style="font-size: 10px;" id="addToCart${counter.count}"
                                                disabled />
                                        </td>
                                    </tr>
                                </form>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>

            </div>

            <%@ include file="./partials/footer.jsp" %>