package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Cine;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/WEB-INF/header.jspf");
    _jspx_dependants.add("/WEB-INF/inicio.jspf");
    _jspx_dependants.add("/WEB-INF/verPeliculas.jspf");
    _jspx_dependants.add("/WEB-INF/verPelicula.jspf");
    _jspx_dependants.add("/WEB-INF/verCinesList.jspf");
    _jspx_dependants.add("/WEB-INF/footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"Multicines Cinestar es una empresa pionera en el formato de multicines en el Perú. Información de películas, estrenos, concursos y más\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/varios/favicon.ico\">\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Multicines Cinestar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <nav class=\"nav-sec\">\n");
      out.write("        <a href=\"index.jsp\">Inicio</a>&nbsp;&nbsp;l&nbsp;&nbsp;\n");
      out.write("        <a href=\"http://www.cinestar.com.pe/quienes_somos\">Quiénes somos</a>&nbsp;&nbsp;l&nbsp;&nbsp;\n");
      out.write("        <a href=\"http://www.cinestar.com.pe/trabaja_con_nosotros\">Trabaja con nosotros</a>&nbsp;&nbsp;l&nbsp;&nbsp;\n");
      out.write("        <a href=\"https://www.efact.pe/consult.html\" target=\"_blank\">Consulta tu comprobante de pago </a>&nbsp;&nbsp;l&nbsp;&nbsp;\n");
      out.write("        <a href=\"http://www.cinestar.com.pe/contactenos/#contenido_titulo\" class=\"anchorLink\">Contáctenos</a>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"area-logo\">\n");
      out.write("        <a href=\"index.jsp\"><img src=\"img/varios/logo-cinestar.png\"></a>\t\n");
      out.write("    </div>\n");
      out.write("    <nav class=\"menu\">\n");
      out.write("        <span class=\"img-social\">\n");
      out.write("            <a href=\"http://www.facebook.com/multicinestar\" target=\"_blank\"><img src=\"img/varios/ico-face.png\"></a>\n");
      out.write("            <a href=\"http://www.twitter.com/multicinestar\" target=\"_blank\"><img src=\"img/varios/ico-twitter.png\"></a>\n");
      out.write("        </span>\n");
      out.write("        <span class=\"social\">Síguenos en: </span>\n");
      out.write("        <ul class=\"menu-principal\">\n");
      out.write("            <li class=\"menu-item\"><a href=\"svlPelicula?id=1\">Cartelera</a></li>\n");
      out.write("            <li class=\"menu-item\"><a href=\"svlPelicula?id=2\">Próximos estrenos</a></li>\n");
      out.write("            <li class=\"menu-item\"><a href=\"http://www.cinestar.com.pe/starcard\">Star Card</a></li>\n");
      out.write("            <li class=\"menu-item\"><a href=\"svlCine\">Nuestros Cines</a></li>\n");
      out.write("            <li class=\"menu-item\"><a href=\"http://www.cinestar.com.pe/ventas_corporativas\">Ventas Corporativas</a></li>\n");
      out.write("            <li class=\"menu-item\"><a href=\"http://www.cinestar.com.pe/promociones\">Promociones</a></li>\n");
      out.write("            <li class=\"menu-item\"><a href=\"http://www.cinestar.com.pe/cinefilo_star\">Blog</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"slider\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"papaya\">\n");
      out.write("        <a href=\"http://www.cinepapaya.com/pe/cinestar\" target=\"_blank\"><img src=\"img/varios/bg-papaya.jpg\"></a>\n");
      out.write("    </div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"contenido\">\n");
      out.write("            <div class=\"publicidad\">\n");
      out.write("                <a href=\"http://www.cinestar.com.pe/starcard/\"><img src=\"img/varios/starcard.jpg\"></a>\n");
      out.write("                <a href=\"http://www.cinestar.com.pe/cinefilo_star/\"><img src=\"img/varios/cinefilo-star.jpg\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"contenido-interno\">\n");
      out.write("\n");
      out.write("                ");
 Object id = session.getAttribute("id");
                   if (id == null){ 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 } else if (id.equals("1")|| id.equals("2")) { 
      out.write("\n");
      out.write("                ");
      out.write('\n');


    if (session.getAttribute("mPeliculas") != null) {
        String[][] mPeliculas = (String[][]) session.getAttribute("mPeliculas");


      out.write("\n");
      out.write("<div class=\"contenido-interno\">\n");
      out.write("    <br><h1>Cartelera</h1><br>\n");
      out.write("    \n");
      out.write("    ");
 for (String aPelicula[] : mPeliculas) { 
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"contenido-pelicula\">\n");
      out.write("        <div class=\"datos-pelicula\">\n");
      out.write("            <h2>");
      out.print( aPelicula[1] );
      out.write("</h2><br>\n");
      out.write("            <p>");
      out.print( aPelicula[2] );
      out.write("</p>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"boton-pelicula\"> \n");
      out.write("                <a href=\"svlPelicula?isPelicula=");
      out.print( aPelicula[0] );
      out.write("\" >\n");
      out.write("                    <img src=\"img/varios/btn-mas-info.jpg\" width=\"120\" height=\"30\" alt=\"Ver info\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"boton-pelicula\"> \n");
      out.write("                <a href=\"http://www.cinestar.com.pe/popups/trailer/");
      out.print( aPelicula[0] );
      out.write("\" onclick=\"return hs.htmlExpand(this, {objectType: 'iframe'})\" >\n");
      out.write("                    <img src=\"img/varios/btn-trailer.jpg\" width=\"120\" height=\"30\" alt=\"Ver trailer\">\n");
      out.write("                </a>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        <img src=\"img/pelicula/");
      out.print( aPelicula[0] );
      out.write(".jpg\" width=\"160\" height=\"226\"><br><br>\n");
      out.write("    </div>\n");
      out.write("                    \n");
      out.write("    ");
 }}
      out.write("\n");
      out.write("    \n");
      out.write("</div>");
      out.write("\n");
      out.write("                ");
 } else if (id.equals("3")) { 
      out.write("\n");
      out.write("                ");
      out.write('\n');
      out.write('\n');

    if (session.getAttribute("aPelicula")!=null) {
        String [] aPelicula = (String[])session.getAttribute("aPelicula");
            
        


      out.write(" \n");
      out.write("<br><h1>Cartelera</h1><br>\n");
      out.write("\n");
      out.write("<div class=\"contenido-pelicula\">\n");
      out.write("    <div class=\"datos-pelicula\">\n");
      out.write("        <h2>");
      out.print(aPelicula[1]);
      out.write(" </h2>\n");
      out.write("        <p>");
      out.print(aPelicula[11]);
      out.write(" </p>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"tabla\">\n");
      out.write("            <div class=\"fila\">\n");
      out.write("                <div class=\"celda-titulo\">Título Original :</div>\n");
      out.write("                <div class=\"celda\">");
      out.print(aPelicula[1]);
      out.write(" </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fila\">\n");
      out.write("                <div class=\"celda-titulo\">Estreno :</div>\n");
      out.write("                <div class=\"celda\">");
      out.print(aPelicula[2]);
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fila\">\n");
      out.write("                 <div class=\"celda-titulo\">");
      out.print(aPelicula[4]);
      out.write("</div>\n");
      out.write("                <div class=\"celda\">Aventura / Acción</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fila\">\n");
      out.write("                <div class=\"celda-titulo\">");
      out.print(aPelicula[3]);
      out.write("</div>\n");
      out.write("                <div class=\"celda\">Jake Kasdan</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fila\">\n");
      out.write("                <div class=\"celda-titulo\">");
      out.print(aPelicula[10]);
      out.write("</div>\n");
      out.write("                <div class=\"celda\">Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <img src=\"img/pelicula/");
      out.print(aPelicula[0]);
      out.write("\" width=\"160\" height=\"226\"><br><br>\n");
      out.write("</div>\n");
      out.write("<div class=\"pelicula-video\">\n");
      out.write("    <!-- <iframe width=\"580\" height=\"400\" src=\"http://www.youtube.com/v/6maujJFcuxA\" frameborder=\"0\" allowfullscreen></iframe> -->\n");
      out.write("    <embed src=\"http://www.youtube.com/v/");
      out.print(aPelicula[9]);
      out.write("\" type=\"application/x-shockwave-flash\" allowscriptaccess=\"always\" allowfullscreen=\"true\" width=\"580\" height=\"400\">\n");
      out.write("</div>\n");
      out.write("\n");
}
      out.write(' ');
      out.write("\n");
      out.write("                 ");
 } else if (id =="4") { 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    if (session.getAttribute ("lstCines") != null) {
        List<Cine> lstCines =(List<Cine>) session.getAttribute("lstCines");
    
    
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"contenido-interno\">\n");
      out.write("    <br><h1>Nuestros Cines</h1><br>\n");
      out.write("\n");
      out.write("    ");
 for (Cine Cine : lstCines){ 
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"contenido-cine\">\n");
      out.write("        <img src=\"img/cine/");
      out.print( Cine.getIdCine() );
      out.write(".1.jpg\" width=\"227\" height=\"170\">\n");
      out.write("        <div class=\"datos-cine\">\n");
      out.write("            <h4>");
      out.print( Cine.getRazonSocial() );
      out.write("</h4><br>\n");
      out.write("            <span>");
      out.print( Cine.getDireccion() );
      out.write(" - ");
      out.print( Cine.getDetalle() );
      out.write("<br><br>Teléfono: ");
      out.print( Cine.getDetalle() );
      out.write("</span>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("             <a href=\"svlPelicula?id=1\">\n");
      out.write("            \n");
      out.write("            <img src=\"img/varios/ico-info2.png\" width=\"150\" height=\"40\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    ");
 } }
      out.write("\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("                 ");
 } session.setAttribute("1", null); { 
      out.write("\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"clearbox\"><br></div>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"contenido-footer\">\n");
      out.write("        <p>Copyright © 2016 ® Multicines CINESTAR - Todos los Derechos Reservados</p>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
