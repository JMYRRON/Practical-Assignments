package com.epam.controller;

import com.epam.model.ShopModel;
import com.epam.view.ShopView;

public class ShopController {
    private ShopModel model;
    private ShopView view;

    public ShopController() {
        this.model = new ShopModel();
        this.view = new ShopView();
    }

    public void run() {
        model.addDepartment("meat","goods1","services1",1);
        view.viewData(model.describeShop());
        model.addDepartment("fruits","goods2","services2",2);
        model.addDepartment("vegetables","goods3","services3",3);
        model.addDepartment("milk products","goods4","services4",4);
        model.addDepartment("milk products","goods1","services1",1);
        view.viewData(model.describeShop());
        model.removeDepartment("vegetables");
        view.viewData(model.describeShop());
        model.addDepartment("fruits","goods3","services3",3);
        view.viewData(model.describeShop());
        model.changePosition("meat","fruits");
        view.viewData(model.describeShop());

    }
}
