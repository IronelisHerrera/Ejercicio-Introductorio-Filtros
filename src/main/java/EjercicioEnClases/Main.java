package EjercicioEnClases;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {

        port(8081);
        staticFiles.location("/publico");
        get("/", (request, response) -> {
            System.out.println("Entrando al action de la /");
            return  "Bienvenido";
        });
        new TemplateLoginControler().CogeForumularioUsuario();

        new Filtros().aplicarFiltros();


    }
}
