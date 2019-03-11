package be.heh.strategypattern.domaine;

import java.util.ArrayList;

public class AddEmploy
{
    public ArrayList<Employe> employes = new ArrayList<>();

    public void add(Employe e)
    {
        this.employes.add(e);
    }

}