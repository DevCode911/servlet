<%--
  Created by IntelliJ IDEA.
  User: dev
  Date: 12/29/25
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Error</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    body {
      margin: 0;
      font-family: Arial, Helvetica, sans-serif;
      background: #0f172a;
      color: #e5e7eb;
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    .error-container {
      text-align: center;
      padding: 40px;
      max-width: 400px;
      background: #020617;
      border-radius: 12px;
      box-shadow: 0 10px 30px rgba(0,0,0,0.4);
    }

    h1 {
      font-size: 72px;
      margin: 0;
      color: #38bdf8;
    }

    h2 {
      margin: 10px 0;
      font-weight: 500;
    }

    p {
      color: #94a3b8;
      margin-bottom: 25px;
    }

    a {
      text-decoration: none;
      color: #020617;
      background: #38bdf8;
      padding: 10px 18px;
      border-radius: 6px;
      font-weight: bold;
      transition: background 0.2s;
    }

    a:hover {
      background: #0ea5e9;
    }
  </style>
</head>
<body>
<div class="error-container">
  <h1>404</h1>
  <h2>Page Not Found</h2>
  <p>The page you are looking for doesn’t exist or has been moved.</p>
  <a href="/">Go Home</a>
</div>
</body>
</html>
