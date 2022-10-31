<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos de la Persona</h1>
        <form action="SvPersona" method="POST">
            <P><label>Dni: </label><input type="text" name="dni"></P>
            <P><label>Nombre: </label><input type="text" name="nombre"></P>
            <P><label>Apellido: </label><input type="text" name="apellido"></P>
            <P><label>Telefono: </label><input type="text" name="telefono"></P>
            <button type="submit" >Enviar</button>
        </form>
        
        <h1>Ver lista de Personas</h1>
        <p>Si desea ver todas las personas haga click en el boton mostrar personas</p>
        <form action="SvPersona" method="GET">
            <button type="submit">Mostrar Personas</button>
        </form>
        
        <h1>Eliminar Personas</h1>
        <P>Ingrese la id de la persona a eliminar</P>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label><input type="text" name="id_eliminar"></p>
            <button type="submit">Eliminar</button>
        </form>
    </body>
</html>
