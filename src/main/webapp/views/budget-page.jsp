<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/templates.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/budget-page.css" type="text/css">
</head>
<body>
    
    <jsp:include page="../templates/header.jsp" />

    <div class="show-budget-box">

        <c:choose>
            <c:when test="${custom == true}">

                <div class="savers-box details-card">
        
                    <div class="title-box">
                        <h3>Custom mode:</h3>
                    </div>
                    <div class="general-details-box">
                        <p>salary: <c:out value="${saverAcc.salary}"/></p>
                        <p>fixed prices: <c:out value="${saverAcc.fixedExpenses}"/></p>
                        <p>saved money: <c:out value="${saverAcc.moneyToSave}"/></p>
                        <p>money to spend:  <c:out value="${saverAcc.moneyToSpend}"/></p>
                    </div>
                    <div class="savings-details-box">
                        <h4>Savings:</h4>
                        <div class="different-savings-box">
                            <div class="normal-account">
                                <c:forEach items="${saverAcc.simpleBankAccount}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                            <div class="normal-interest">
                                <c:forEach items="${saverAcc.bankWithInterest}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                            <div class="stock-market">
                                <c:forEach items="${saverAcc.onStockMarket}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
                
            </c:when>
            <c:otherwise>

                <div class="spendersbox details-card">
                    
                    <div class="title-box">
                        <h3>Spenders mode:</h3>
                    </div>
                    <div class="general-details-box">
                        <p>Salary: <c:out value="${spenderAcc.salary}"/></p>
                        <p>fixed: <c:out value="${spenderAcc.fixedExpenses}"/></p>
                        <p>saved: <c:out value="${spenderAcc.moneyToSave}"/></p>
                        <p>spendable: <c:out value="${spenderAcc.moneyToSpend}"/></p>
                    </div>
                    <div class="savings-details-box">
                        <h4>Savings:</h4>
                        <div class="different-savings-box">
                            <div class="normal-account">
                                <c:forEach items="${spenderAcc.simpleBankAccount}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                            <div class="normal-interest">
                                <c:forEach items="${spenderAcc.bankWithInterest}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                            <div class="stock-market">
                                <c:forEach items="${spenderAcc.onStockMarket}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
        
                <div class="savers-box details-card">
        
                    <div class="title-box">
                        <h3>Savers mode:</h3>
                    </div>
                    <div class="general-details-box">
                        <p>salary: <c:out value="${saverAcc.salary}"/></p>
                        <p>fixed prices: <c:out value="${saverAcc.fixedExpenses}"/></p>
                        <p>saved money: <c:out value="${saverAcc.moneyToSave}"/></p>
                        <p>money to spend:  <c:out value="${saverAcc.moneyToSpend}"/></p>
                    </div>
                    <div class="savings-details-box">
                        <h4>Savings:</h4>
                        <div class="different-savings-box">
                            <div class="normal-account">
                                <c:forEach items="${saverAcc.simpleBankAccount}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                            <div class="normal-interest">
                                <c:forEach items="${saverAcc.bankWithInterest}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                            <div class="stock-market">
                                <c:forEach items="${saverAcc.onStockMarket}" var="acc">
                                    <p>year: <c:out value="${acc.key}"/> = <c:out value="${acc.value}"/> kr </p>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            
            </c:otherwise>
        </c:choose>


    </div>

    <jsp:include page="../templates/footer.jsp" />

</body>
</html>