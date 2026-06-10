<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>IPL Admin Login</title>
    <style>
        body { font-family: Arial; background: linear-gradient(135deg,#667eea,#764ba2); 
               display:flex; justify-content:center; align-items:center; height:100vh; margin:0; }
        .box { background:white; padding:40px; border-radius:10px; width:320px; text-align:center; }
        h2 { color:#667eea; }
        input { width:100%; padding:12px; margin:8px 0; border:1px solid #ddd; border-radius:5px; 
                font-size:15px; box-sizing:border-box; }
        button { width:100%; padding:14px; background:#667eea; color:white; border:none; 
                 border-radius:5px; font-size:16px; cursor:pointer; margin-top:10px; }
        button:hover { background:#5568d3; }
        .error { color:red; font-size:14px; }
    </style>
</head>
<body>
    <div class="box">
        <h2>🏏 IPL Admin Login</h2>
        <% if("1".equals(request.getParameter("error"))) { %>
            <p class="error">Invalid username or password!</p>
        <% } %>
        <form action="LoginServlet" method="post" onsubmit="return validate()">
            <input type="text"     name="username" id="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
    </div>
    <script src="js/validation.js"></script>
</body>
</html>