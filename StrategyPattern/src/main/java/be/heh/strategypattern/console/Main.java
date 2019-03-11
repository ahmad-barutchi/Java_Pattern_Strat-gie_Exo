package be.heh.strategypattern.console;


import be.heh.strategypattern.domaine.*;

public class Main
{
    public static void main(String[] args) 
    {
        Employe employe = new Employe(new  Commission());
        Employe employe1 = new Employe(new Horaire());
        AddEmploy list = new AddEmploy();
        employe.setStatus(new Salaire());
        list.add(employe);
        list.add(employe1);
        CalculTotal cTotal = new CalculTotal(list.employes);
        System.out.println("Status 1 : "+cTotal.SalaireTotal());
        employe.setStatus(new Commission());
        System.out.println("Changement de status d'un employer(Status 2) : "+cTotal.SalaireTotal());

       
       
        
    }
}