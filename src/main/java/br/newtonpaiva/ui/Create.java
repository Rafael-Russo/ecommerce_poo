package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Create {
    public static void main(String[] args) {
// cria uma factory e passa como parametro a conexão com o BD que vai ser utilizada
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = factory.createEntityManager();

// começa uma transaction com o BD
        em.getTransaction().begin();

        Categoria c = new Categoria();
        c.setId(1);
        c.setNome("Jogos");

// insert no BD
        em.persist(c);

// envia os comandos para o BD
        em.getTransaction().commit();

// fim
        em.close();
        factory.close();
    }
}
