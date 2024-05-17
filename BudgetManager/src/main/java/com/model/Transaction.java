package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Transaction() {
    }

    public Transaction(double montant, Categorie categorie, Date date, String description) {
        this.montant = montant;
        this.categorie = categorie;
        this.date = date;
        this.description = description;
    }

    // Getters and Setters
    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Methods
    public void modifierTransaction(double montant, Categorie categorie, Date date, String description) {
        this.montant = montant;
        this.categorie = categorie;
        this.date = date;
        this.description = description;
    }

    public void supprimerTransaction() {
        // Implementation to remove this transaction
        // Typically handled by the repository in a Spring Data JPA context
    }

    public void consulterTransactions() {
        // Implementation to consult transactions
        // Typically handled by the repository in a Spring Data JPA context
    }
}


