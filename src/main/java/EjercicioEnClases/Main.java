package EjercicioEnClases;

import spark.Session;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {

        port(8081);

         /*
            //http://localhost:8081/formulario
            Para repetir el proceso una vez visto el --bienvenidos--, poner la misma url
         */
        staticFiles.location("/spark/template/freemarker");



        new TemplateLoginControler().CogeForumularioUsuario();

        new Filtros().aplicarFiltros();





    }
}
