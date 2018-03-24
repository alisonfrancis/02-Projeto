/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "Home", urlPatterns = {"/home.html"})
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
    /* Style Test */
            out.println("<style>.p{font-family: 'Orbitron', sans-serif;}</style>");
            out.println("<style>.p2{font-family: 'Advent Pro', sans-serif;}</style>");
            out.println("<style>.fim {\n" +"    position:static;\n" +"    bottom:0;\n" +"    width:100%;\n" +"}</style>");
           
    /* Fim Style Test */       
            
            out.println("<head>");
            out.println("<title>CONTinf</title>"); 
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
           
    /* ---- CSS ------ */
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
    /* ----Fim CSS ------- */
    
    /* ------ FAVICON -----*/
            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon.png\" />");
    /*---Fim do FAVICON --- */
    
    /* ---- Google Fonts ----*/
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Orbitron\" rel=\"stylesheet\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Advent+Pro\" rel=\"stylesheet\"> ");
    /* ------ Fim Fonts -----*/
    
            out.println("</head>");
            out.println("<body class='p'>");
            
     /*--- NAVBAR ---*/
            out.println("<div class=\"pos-f-t\">\n" +
                        "  <div class=\"collapse\" id=\"navbarToggleExternalContent\">\n" +
                        "    <div class=\"bg-dark p-4\">\n" +
                        "      <h4 class=\"text-white\">CONTinf</h4>\n" +
                        "      <span class=\"text-muted\">Toggleable via the navbar brand.</span>\n" +
                        "    </div>\n"/* Botoes da navbar*/ +"<ul class=\"nav nav-tabs navbar-dark bg-dark\">\n"
                        +" <li class=\"nav-item\">\n"
                        +"  <a class=\"nav-link active\" href=\"home.html\">HOME</a>\n"
                        +"</li>\n"
                        +"<li class=\"nav-item\">\n"
                        +" <a class=\"nav-link text-white\" href=\"jurossimples.html\">Juros Simples</a>\n"
                        +" </li>\n"
                        +"<li class=\"nav-item\">\n"
                        +" <a class=\"nav-link text-white\" href=\"juroscomposto.html\">Juros Composto</a>\n"
                        +"</li>\n"
                        +"<li class=\"nav-item\">\n"
                        +" <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n"
                        +"</li>\n"
                        +"</ul>\n"+
                        "  </div>\n" +/* fim dos botoes*/
                        "  <nav class=\"navbar navbar-dark bg-dark\">\n" +
                        "    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarToggleExternalContent\" aria-controls=\"navbarToggleExternalContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                        "      <span class=\"navbar-toggler-icon\"></span>\n" +
                        "    </button>\n" + "  </nav>\n" +
                        "</div>");
    /*--- Fim NAVBAR ---*/
    
/* INICIO DO CONTEUDO */

           
            out.println("<img src=\"Imagens/Continf.jpg\">");
           /* out.println("<h1>Servlet Home at " + request.getContextPath() + "</h1>");*/
            
        /* Cad Navigation */
            out.println("<div class=\"card text-center\">\n" +
                        "  <div class=\"card-header\">\n" +
                        "    <ul class=\"nav nav-tabs card-header-tabs\">\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link active\" href=\"#\">Calcule</a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link \" href=\"#\">Equipe</a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n" +
                        "      </li>\n" +
                        "    </ul>\n" +
                        "  </div>\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">Selecione uma das Opções</h5>\n" +
                        "    <p class=\"card-text\">Escolha uma da opção para calcular os juros.</p>\n" +
                        "    <a href=\"jurossimples.html\" class=\"btn btn-primary\">Juros Simples</a>\n" +"    <a href=\"juroscomposto.html\" class=\"btn btn-primary\">Juros Composto</a>\n"+
                        "  </div>\n" +
                        "</div>");
        /*Fim do Cad Navigation*/
        
        /* Test Carroucel*/
        out.println("<div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
"  <ol class=\"carousel-indicators\">\n" +
"    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n" +
"    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n" +
"    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n" +
"  </ol>\n" +
"  <div class=\"carousel-inner\">\n" +
"    <div class=\"carousel-item active\">\n" +/*test cad*/"<div class=\"card\">\n"+
"  <div class=\"card-header\">\n"+
"    Calculo\n"+
"  </div>\n"+
"  <div class=\"card-body\">\n"+
"    <blockquote class=\"blockquote mb-0\">\n"+
"      <p>Onde aparecera dois botões</p>\n"+"    <a href=\"jurossimples.html\" class=\"btn btn-primary\">Juros Simples</a>\n" +"    <a href=\"juroscomposto.html\" class=\"btn btn-primary\">Juros Composto</a>\n"+
"      <footer class=\"blockquote-footer\">Someone famous in <cite title=\"Source Title\">Source Title</cite></footer>\n"+
"    </blockquote>\n"+
"  </div>\n"+
"</div>\n"+/*fim cad*/
"\n"+     
"    </div>\n" +
"    <div class=\"carousel-item\">\n" +/*test cad*/"<div class=\"card\">\n"+
"  <div class=\"card-header\">\n"+
"   Equipe\n"+
"  </div>\n"+
"  <div class=\"card-body \">\n"+
"    <blockquote class=\"blockquote mb-0\">\n"+
"      <p>Acrescentar dois cards.</p>\n"+
"      <footer class=\"blockquote-footer\">Someone famous in <cite title=\"Source Title\">Source Title</cite></footer>\n"+
"    </blockquote>\n"+
"  </div>\n"+
"</div>\n"+/*fim cad*/
"\n"+
"    </div>\n" +
"    <div class=\"carousel-item\">\n" +/*test cad*/"<div class=\"card\">\n"+
"  <div class=\"card-header\">\n"+
"    Defini\n"+
"  </div>\n"+
"  <div class=\"card-body\">\n"+
"    <blockquote class=\"blockquote mb-0\">\n"+
"      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n"+
"      <footer class=\"blockquote-footer\">Someone famous in <cite title=\"Source Title\">Source Title</cite></footer>\n"+
"    </blockquote>\n"+
"  </div>\n"+
"</div>\n"+/*fim cad*/
"\n"+
"    </div>\n" +
"  </div>\n" +
"  <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n" +
"    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n" +
"    <span class=\"sr-only\">Previous</span>\n" +
"  </a>\n" +
"  <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n" +
"    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n" +
"    <span class=\"sr-only\">Next</span>\n" +
"  </a>\n" +
"</div>");
        /* Fim Test Carroucel*/
            
 
    
/* FIM DO CONTEUDO */

    /*---- Footer-----------*/
            out.println("<footer class=\"text-muted bg-dark fim\">\n" +
                        "<div class=\"container\">\n" +
                        "<p class=\"float-right \">\n" +
                        "<a class=\"text-white href=\"#\">Back to top</a>\n" +
                        "</p>\n" +
                        "<p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>\n" +
                        "<p>New to Bootstrap? <a class=\"text-white href=\"../../\">Visit the homepage</a> or read our <a class=\"text-white href=\"../../getting-started/\">getting started guide</a>.</p>\n" +
                        "</div>\n" +
                        "</footer>");
    /* --- Fim do Footer------*/
    
    /* ----- JS ------*/
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                         "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                         "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
    /* -----Fim do JS ----*/
    
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
