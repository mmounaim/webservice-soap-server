package ws;

import java.util.Date;

public class Compte {

    private int code;
    private double solde;
    private Date creationDate;

    public Compte() {
    }

    public Compte(int code, double solde, Date creationDate) {
        this.code = code;
        this.solde = solde;
        this.creationDate = creationDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
