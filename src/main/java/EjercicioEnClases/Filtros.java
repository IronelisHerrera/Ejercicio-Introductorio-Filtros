package EjercicioEnClases;

import static spark.Spark.before;
import javax.servlet.http.HttpServletResponse;


public class Filtros {

        public void aplicarFiltros(){

                before("/", (request, response)->{
                        Usuario usuario = new Usuario(request.session().attribute("usuario"),request.session().attribute("contra"));
                        if(usuario.getUsuario()==null ){
                                response.redirect("/formulario");

                        }else if(!ComprobarUsuario(usuario.getContrasena(),(usuario.getUsuario()))){
                                        response.redirect("/formulario");
                                }


                });

        }
        public boolean ComprobarUsuario(String usuario, String contra){
                if(usuario.equals("admin") && contra.equals("23")){
                        return true;
                }
                else{
                        return false;
                }
        }




}
