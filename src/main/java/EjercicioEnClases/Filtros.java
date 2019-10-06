package EjercicioEnClases;

import static spark.Spark.*;


public class Filtros {

        public void aplicarFiltros(){

                before("/", (request, response)->{
                        Usuario usuario = new Usuario(request.session().attribute("usuario"),request.session().attribute("contra"));

                        if(usuario.getUsuario()==null ){
                                response.redirect("/formulario");

                        }else if(!ComprobarUsuario("admin")==usuario.getUsuario().equals("admin") && !comprobarContrasena("admin")==usuario.getContrasena().equals("admin")){
                                response.redirect("/formulario");
                        }




                });

                get("/", (request, response) -> {
                        System.out.println("Entrando a Bienvenidos");
                        return  "Bienvenido";

                });
               ;

        }


        private boolean ComprobarUsuario(String usuario) {
                if (usuario.equals("admin") ){
                        return true;
                }
                else{
                        return false;
                }
        }

        private boolean comprobarContrasena(String contra){
                if(contra.equals("admin")){
                        return true;
                }
                return false;
        }






}
