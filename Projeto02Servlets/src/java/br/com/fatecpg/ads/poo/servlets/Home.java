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
            out.println("<style>.p{font-family: 'Raleway', sans-serif;}</style>");
           
            
           
    /* Fim Style Test */       
            
            out.println("<head>");
            out.println("<title>Aplicacao Juros</title>"); 
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
           
    /* ---- CSS ------ */
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
    /* ----Fim CSS ------- */
    
    /* ------ FAVICON -----*/
            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon6.png\" />");
    /*---Fim do FAVICON --- */
    
    /* ---- Google Fonts ----*/
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\"> ");
           
    /* ------ Fim Fonts -----*/
    
            out.println("</head>");
            out.println("<body class='p' >");
            
     /*--- NAVBAR ---*/
            out.println(  /*Botoes da navbar*/"<br><ul class=\"nav nav-tabs \">\n" +
"  <li class=\"nav-item\">\n" +
"    <a class=\"nav-link active\" href=\"home.html\">Continf</a>\n" +
"  </li>\n" +
"  <li class=\"nav-item\">\n" +
"    <a class=\"nav-link\" href=\"home.html\">Home</a>\n" +
"  </li>\n" +
"  <li class=\"nav-item\">\n" +
"    <a class=\"nav-link\" href=\"jurossimples.html\">Juros Simples</a>\n" +
"  </li>\n" +
"  <li class=\"nav-item\">\n" +
"    <a class=\"nav-link\" href=\"juroscomposto.html\">Juros Composto</a>\n" +
"  </li>\n" +
"</ul>" /* fim dos botoes*/
                       );
    /*--- Fim NAVBAR ---*/
    
/* INICIO DO CONTEUDO */

       out.println("<div class=\"card bg-dark \">\n" +
"  <img class=\"card-img\" src=\"Imagens/investment1.png\" alt=\"Card image\">\n" +
"  <div class=\"card-img-overlay\">\n" +
"    <b><h4 class=\"card-title\">Regime de Capitalização</h4>\n" +
"    <p class=\"card-text\">Calcule seus Juros Simples e Composto.</p></b>\n" +
   
"  </div>\n" +
"</div>");
out.println("<div class=\"card\">\n" +
            "  <div class=\"card-header\">\n<h2>" +
            "   O que são Juros ?\n" +
            "  </h2></div>\n" +
            "  <div class=\"card-body\">\n" +
            
            "    <h5><p class=\"card-text \">Juros é a remuneração cobrada pelo empréstimo de dinheiro "
        + "(ou outro item). É expresso como um percentual sobre o valor emprestado (taxa de juro) e "
        + "pode ser calculado de duas formas: juros simples ou juros compostos.O juro pode ser compreendido como uma "
        + "espécie de \"aluguel sobre o dinheiro\". A taxa seria uma compensação paga "
        + "pelo tomador do empréstimo para ter o direito de usar o dinheiro até o dia do"
        + " pagamento. O credor, por outro lado, recebe uma compensação por não poder usar "
        + "esse dinheiro até o dia do pagamento e por correr o risco de não receber o dinheiro "
        + "de volta (risco de inadimplência).</p></h5>\n" +
        "    <h5 class=\"card-title\">Calcule agora seu juros</h5>\n" +
            "    <br><a href=\"jurossimples.html\" class=\"btn btn-secondary\">Juros simples</a>\n" +
        "    <a href=\"juroscomposto.html\" class=\"btn btn-secondary\">Juros Composto</a>\n" +
            "  </div>\n" +
            "</div><br>");
out.println(" <h3> Desenvolvido por:</h3>");
out.println("<div class=\"row\">\n" +
"  <div class=\"col-sm-6\">\n" +
"    <div class=\"card\">\n" +
"      <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">Alison Francisco</h5>\n" +/*
"        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n" + */

"        <a href=\"https://github.com/alisonfrancis\" class=\"btn btn-secondary\">Github</a>\n" +
"      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"  <div class=\"col-sm-6\">\n" +
"    <div class=\"card\">\n" +
"      <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">João Paulo Duarte</h5>\n" +/*
"        /*<p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n" + */
"        <a href=\"https://github.com/10joaopaulo\" class=\"btn btn-secondary\">Github</a>\n" +
"      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>");
/* FIM DO CONTEUDO */

    /*---- Footer-----------*/
          /*APAGAR AQUI CASO FOR IMPLEMENTAR  out.println("<footer class=\"text-muted bg-dark fim\">\n" +
                        "<div class=\"container\">\n" +
                        "<p class=\"float-right \">\n" +
                    
                        "</p>\n" +
                        "<p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>\n" +
                        "<p>New to Bootstrap? <a class=\"text-white href=\">@test</a></p>\n" +
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
