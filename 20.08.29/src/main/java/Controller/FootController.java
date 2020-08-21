package Controller;

import DAO.Stock;
import Model.FootManufacture;

public class FootController {

    Stock stock = new Stock();

    public void addToStock(FootManufacture footManufacture){
        stock.addToStock(footManufacture);
    }

    public void getAllFootStock(){
        stock.getAllFootInStock();
    }
}
