package com.model;

import javax.persistence.*;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBudget;

    private double limiteDepense;
    private String titre;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Budget() {
    }

    public Budget(double limiteDepense, String titre) {
        this.limiteDepense = limiteDepense;
        this.titre = titre;
    }

    // Getters and Setters
    public Long getIdBudget() {
        return idBudget;
    }

    public void setIdBudget(Long idBudget) {
        this.idBudget = idBudget;
    }

    public double getLimiteDepense() {
        return limiteDepense;
    }

    public void setLimiteDepense(double limiteDepense) {
        this.limiteDepense = limiteDepense;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


