<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <form action="currency" method="post">
      <div>
          <h1>Currency Converter</h1><br />
          <h2>FROM</h2>
          <select name="fromCurrency">
              <option value="nc">Nepali Currency</option>
          </select>
          <h3>TO</h3>
          <select name="toCurrency">
              <option value="usD">US Dollar</option>
              <option value="pound">Pound</option>
              <option value="ic">Indian Currency</option>
              <option value="auD">Australian Dollar</option>
              <option value="yen">Yen</option>
          </select>
          <br />
          <input type="text" name="amount"/>
          <br/>

          <br/>

          <input name="convert" type="submit" value="Convert" />
          <input name="reset" type="reset" value="Clear" />
      </div>
  </form>

  </body>
</html>