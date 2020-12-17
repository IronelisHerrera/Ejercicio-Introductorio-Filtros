import EjercicioEnClases.Filtros;
import EjercicioEnClases.ControladoraLogin;

import static spark.Spark.*;
/**
 * Clase cargar formulario en freemarker
 * @author Ironelis Herrera
 */

public class Main {
    public static void main(String[] args) {

        port(8081);
        staticFiles.location("/spark/template/freemarker");

        new ControladoraLogin().CogeFormularioUsuario();

        new Filtros().aplicarFiltros();

    }
}
