package EjercicioEnClases;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class TemplateLoginControler {

    public void CogeForumularioUsuario() {
        FreemarkerLogin();
    }

    public void FreemarkerLogin(){

        get("/formulario/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Formulario en FreeMarker");
            return renderFreemarker(attributes, "formulario.ftl");
        });


    }

    public static String renderFreemarker(Map<String, Object> model, String templatePath) {
        return new FreeMarkerEngine().render(new ModelAndView(model, templatePath));
    }


}
