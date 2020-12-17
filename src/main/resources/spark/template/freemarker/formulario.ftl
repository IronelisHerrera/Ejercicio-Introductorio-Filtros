<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>

    <title>${titulo}</title>
    <link  rel="stylesheet" href="css/style.css" type="text/css"  />

</head>
<body>

<h1>Registro</h1>
<form action="/registrar/" method="post"  enctype="application/x-www-form-urlencoded">
    <div class="container" >
    Usuario: <input name="usuario" type="text" id = "usuario"/><br/><br/>
    Clave: <input name="contra" type="text " id="contra"/><br/><br/>
    <button name="Enviar" type="submit" id="buton">Enviar</button> </div>

</form>
</body>
</html>