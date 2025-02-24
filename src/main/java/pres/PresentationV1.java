package pres;

import dao.DaoImpl;
import metier.IMetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*Injection des dépendance par injection statique */
        DaoImpl d=new DaoImpl();
        IMetierImpl metier = new IMetierImpl(d);

        //metier.setDao(d); //Injection via la setter
        System.out.println("RES=" +metier.calculer());
    }
}
