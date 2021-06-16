package fr.diginamic.core.entities;

import javax.persistence.*;

/**
 * Classe qui représente uune région de france
 * @author Miryem HRARTI
 */
@Entity
@Table(name="Regions")
public class Region {
    /**
     * une région caractérisée par son code, son nom, sa population
     */
    @Id
    @Column(name="code_region", nullable = false)
    private int codeRegion;
    @Column(name="nom_region", nullable = false)
    private String nom;
    @Column(name="population", nullable = false)
    private int population;

    /**
     * Constructeur par défaut
     */
    public Region() {
    }

    /**
     * Constructeur
     * @param codeRegion de la région
     * @param nom de la région
     * @param population de la région
     */
    public Region(int codeRegion, String nom, int population) {
        this.codeRegion = codeRegion;
        this.nom = nom;
        this.population = population;
    }

    /**
     *
     * @return le code de la région
     */
    public int getCodeRegion() {
        return codeRegion;
    }

    /**
     * modifie le code de la région
     * @param codeRegion nouveau code
     */
    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    /**
     *
     * @return le nom de la région
     */
    public String getNom() {
        return nom;
    }

    /**
     * modifie le nom de la région
     * @param nom nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return la population de la région
     */
    public int getPopulation() {
        return population;
    }

    /**
     * modifie la population de la région
     * @param population nouvelle population
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "Code:" + codeRegion +
                ", Nom: " + nom + ", Population: " + population + " Habitants}";
    }
}
