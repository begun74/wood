package com.mc.dao.vmc;



import com.mc.select.Select;
import java.util.List;

/**
 * Created by Echoes on 26.12.2015.
 */
public interface VmcDao {

    public void addVmc(Vmc hmc);
    public void editVmc(Vmc hmc);
    public boolean existVmc(Vmc hmc);

    public Vmc getVmc(int id);
    
    public List<Vmc> listVmc();
    public List<Vmc> listVmcModelDESC();
    public List<Vmc> listHmc(int chDmg, int chMazak, int chHaas, int chpiner );
    public List<Vmc> listHmc(int chDmg, int chMazak, int chHaas, int chpiner,int chUSA, int chGermanyint );
    public List<Vmc> listHmc(Select select );
    public List<Vmc> listVmc(Select select, int page);
    public List<Vmc> listVmcLast4Machine();
//    public List<Vmc> listVmcRandomMachine();
    public List<Vmc> getListFromSearch(String str);

    public void removeHmc(int id);
//
//
//    public void updateBench(Bench bench);
}
