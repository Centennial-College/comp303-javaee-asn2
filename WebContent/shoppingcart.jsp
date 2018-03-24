<%@ include file="./partials/header.jsp" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

            <div class="container" style="margin-top: 65px">

                <c:choose>
                    <c:when test="${requestScope.errorMessage != null}">
                        <h1>${requestScope.errorMessage}</h1>
                    </c:when>
                    <c:otherwise>
                        <h1>GOT SOME GOODIES IN DA BASKET DO YA?</h1>
                    </c:otherwise>
                </c:choose>
            </div>


            <%@ include file="./partials/footer.jsp" %>