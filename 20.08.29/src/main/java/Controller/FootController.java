package Controller;

import DAO.Stock;
import Model.FootManufacture;

public class FootController {

    Stock stock = new Stock();

    // Метод добавления продукции на склад через экземпляр класс Сток

    public void addToStock(FootManufacture footManufacture){
        stock.addToStock(footManufacture);
    }

    // Метод получения остатков на складе через экземпляр класс Сток

    public void getAllFootStock(){
        stock.getAllFootInStock();
    }
}
