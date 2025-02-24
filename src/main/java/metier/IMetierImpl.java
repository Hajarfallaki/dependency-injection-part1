package metier;

import dao.DaoImpl;
import dao.IDao;

public class IMetierImpl implements IMetier {
    //couplage faible
    private IDao dao = null;

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculer() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }

    /* Pour Injecter dans la variable dao un objet
    * dunne classe qui implémente l'interface IDao
    * */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
