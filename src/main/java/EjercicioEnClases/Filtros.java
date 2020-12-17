package EjercicioEnClases;

import Modelo.Usuario;

import static spark.Spark.*;

/**
 * Esta clase se encarga de redireccionar al formulario de registro si las credenciales proporcionadas no coinciden con admin.
 * No permite navegar a la página de inicio al menos de que no haya un usuario registrado.
 * @author Ironelis Herrera
 */


public class Filtros {

        public void aplicarFiltros(){

                before("/", (request, response)->{
                        Usuario usuario = new Usuario(request.session().attribute("usuario"),request.session().attribute("contra"));

                        if(usuario.getUsuario()==null ){
                                response.redirect("/formulario");

                        }else if(!ComprobarUsuario("admin")==usuario.getUsuario().equals("admin") || !comprobarContrasena("admin")==usuario.getContrasena().equals("admin")){
                                response.redirect("/formulario");
                        }


                });

                get("/", (request, response) -> {
                        System.out.println("Entrando a pagina de inicio");
                        return  "INICIO";

                });

        }

        /**
         *
         * @param usuario
         * @return admin como nombre predeterminado para el Usuario.
         */

        private boolean ComprobarUsuario(String usuario) {
                return usuario.equals("admin");
        }

        /**
         *
         * @param contra
         * @return admin como nombre predeterminado para la Clave del Usuario.
         */

        private boolean comprobarContrasena(String contra){
                return contra.equals("admin");
        }






}
