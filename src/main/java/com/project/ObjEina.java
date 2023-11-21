package com.project;

import java.util.ArrayList;

public class ObjEina {

    private int id;
    private String nom;
    private int any;
    private ArrayList<Integer> llenguatges;

    public ObjEina (int id, String nom, int any, ArrayList<Integer> llenguatges) {
        this.id = id;
        this.nom = nom;
        this.any = any;
        this.llenguatges = llenguatges;
    }

    public int getId () {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAny() {
        return any;
    }
    public void setAny(int any) {
        this.any = any;
    }
    public void setLlenguatges(ArrayList<Integer> llenguatges) {
        this.llenguatges = llenguatges;
    }
    public ArrayList<Integer> getLlenguatges(){
        return llenguatges;
    }

    public void addLlenguatge(int idLlenguatge) {
        if (!llenguatges.contains(idLlenguatge)) {
            llenguatges.add(idLlenguatge);
        }
    }
    public void removeLlenguatge(int idLlenguatge) {
        llenguatges.remove(Integer.valueOf(idLlenguatge));
    }

    @Override
    public String toString () {
        return "Eina: " + this.id + " " + this.nom + ", " + this.any + " - " + this.llenguatges;
    }
}
