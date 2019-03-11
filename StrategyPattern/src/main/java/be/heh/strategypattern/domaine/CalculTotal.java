package be.heh.strategypattern.domaine;

import java.util.ArrayList;

public class CalculTotal
{
    public ArrayList <Employe> employes = new ArrayList<>();

    public float SalaireTotal()
    {
        float result = 0;
        for(Employe tmp : employes)
        {
            result+=tmp.getSalaire();

        }
        return result;
    }

    public CalculTotal(ArrayList<Employe> e)
    {
        this.employes = e;
    }

}