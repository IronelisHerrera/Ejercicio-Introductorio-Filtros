package EjercicioEnClases;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class TemplateLoginControler {

    public void CogeForumularioUsuario() {
        FreemarkerLogin();
    }

    public void FreemarkerLogin(){

        get("/formulario/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Formulario registrar");
            return renderFreemarker(attributes, "formulario.ftl");
        });
        
        /*
        post("/registrar/", (request, response) -> {
            String usuario =request.queryParams("usuario");
            String contrasena =request.queryParams("contra");

            response.cookie("usuario", usuario);
            request.session(true).attribute("usuario", usuario);
            request.session().attribute("contra", contrasena);
            response.redirect("/");
            return 200;
        });

        */

    }

    public static String renderFreemarker(Map<String, Object> model, String templatePath) {
        return new FreeMarkerEngine().render(new ModelAndView(model, templatePath));
    }


}
