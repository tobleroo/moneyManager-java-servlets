<html>
<head>
    <link rel="stylesheet" href="./css/index.css" type="text/css">
    <link rel="stylesheet" href="./css/templates.css" type="text/css">
</head>
<body>

    <jsp:include page="./templates/header.jsp" />

    <div class="main-box">
        
        <div class="form-box">
            <form action="calculate" method="post">
                <div class="salary-box input-box">
                    <label for="salary">Enter your salary(after tax):</label>
                    <input type="number" name="salary" id="incomeID">
                </div>
                <div class="optional-input-box" id="optionalBox">
                    <div class="moneyToSave-box input-box">
                        <label for="savedMoney">How much to save:</label>
                        <input type="number" name="savedMoney" id="savedMoneyID">
                    </div>
                    <div class="yearsToSave-box input-box">
                        <label for="yearsToSave">How many years to save:</label>
                        <input type="number" name="yearsToSave" id="saveYearsID">
                    </div>
                    <div class="fixedExpenses-box input-box">
                        <label for="fixedMoney">fixed expenses:</label>
                        <input type="number" name="fixedMoney" id="fixedMoneyID">
                    </div>
                </div>
                <div class="optional-button-box" id="optionalBtn">
                    <button type="button" id="optionalBtn" onclick="showOptional()">Enter optional data</button>
                </div>
                <div class="submit-box">
                    <input type="submit" value="Enter">
                </div>
            </form>
        </div>
    
    </div>


    <jsp:include page="./templates/footer.jsp" />

    <script src="./script/index.js"></script>
</body>
</html>
