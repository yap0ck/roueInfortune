package roueinfortune.roueinfortune;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
@WebServlet("/roueInfortune")
public class personneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Personne> javanais = new ArrayList<>();
        Personne personne = new Personne("Dirheimer","Elise");
        javanais.add(personne);
        personne =  new Personne("Valenne","Laurent");
        javanais.add(personne);
        personne =  new Personne("Balon","Lucas");
        javanais.add(personne);
        personne =  new Personne("Beukens","Gaetan");
        javanais.add(personne);
        personne =  new Personne("Jacoby","Ismail");
        javanais.add(personne);
        personne =  new Personne("Beyer De ryke","Geoffrey");
        javanais.add(personne);
        personne =  new Personne("Depierreux","Samuel");
        javanais.add(personne);
        personne =  new Personne("Decock","Pascal");
        javanais.add(personne);
        personne =  new Personne("Geisbush","Nathan");
        javanais.add(personne);
        personne =  new Personne("Daems","Aline");
        javanais.add(personne);

        Random random = new Random();
        int indexAleatoire = random.nextInt(javanais.size());

        personne = javanais.get(indexAleatoire);

        resp.setStatus(200);
        req.setAttribute("roulette", personne);
        req.setAttribute("liste", javanais);
        req.getRequestDispatcher("/roueInfortune.jsp").forward(req,resp);
    }






}
