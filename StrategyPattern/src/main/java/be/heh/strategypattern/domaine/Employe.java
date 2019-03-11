package be.heh.strategypattern.domaine;

public class Employe
{
    protected MethodePay methode;

    public Employe(MethodePay m)
    {
        this.methode = m;
    }
    public void setStatus(MethodePay m)
    {
        this.methode = m;

    }
    public float getSalaire()
    {
        return this.methode.renum();
    }
    
}