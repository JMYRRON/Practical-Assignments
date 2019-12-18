package com.epam.model;

public class ShopModel {

    private Shop shop;

    public ShopModel() {
        this.shop = new Shop("Jons", 4);
    }

    public String describeShop() {
        return shop.toString() + "\n" + showDepartments();
    }
    public void addDepartment (String depname, String goods, String services, int position) {
        if (shop.getFilleddeps()<shop.getNumberofdeps()&&checkName(depname)&&checkPosition(position)) {

            String[] deps = shop.getDepsnames();
            deps[position-1] = depname;
            shop.setDepsnames(deps);

            int[] positions = shop.getPositions();
            positions[position-1] = position;
            shop.setPositions(positions);


            Shop.Departments[] departments = shop.getDepartments();
            departments[position-1] = shop.new Departments(depname,goods,services,position);
            shop.setDepartments(departments);

            shop.setFilleddeps(shop.getFilleddeps()+1);
        } else {
            System.out.println("All departments are filled");
        }
    }

    public void removeDepartment (String depname) {
        boolean checker = false;
        String[] depsnames = shop.getDepsnames();
        for (int i = 0; i < shop.getNumberofdeps(); i++) {
            if (depsnames[i].equalsIgnoreCase(depname)) {

                String[] deps = shop.getDepsnames();
                deps[i] = null;
                shop.setDepsnames(deps);

                int[] positions = shop.getPositions();
                positions[i] = 0;
                shop.setPositions(positions);

                Shop.Departments[] departments = shop.getDepartments();
                departments[i] = null;
                shop.setDepartments(departments);

                shop.setFilleddeps(shop.getFilleddeps()-1);
                checker = true;
            }
        }
        if (!checker) System.out.println("We do not have this Department");
    }

    public void changePosition (String depname1, String depname2) {
        Shop.Departments[] departments = shop.getDepartments();
        if (!checkName(depname1)&&!checkName(depname2)) {
            Shop.Departments department1 = shop.new Departments();
            Shop.Departments department2 = shop.new Departments();
            for (int i = 0; i < shop.getNumberofdeps();i++) {
                if (departments[i] instanceof Shop.Departments && departments[i].getDepname().equalsIgnoreCase(depname1)) {
                    department1 = departments[i];
                }
                if (departments[i] instanceof Shop.Departments && departments[i].getDepname().equalsIgnoreCase(depname2)) {
                    department2 = departments[i];
                }
            }
            for (int i = 0; i < shop.getNumberofdeps();i++) {
                int index = 0;
                if (departments[i] instanceof Shop.Departments && departments[i].getDepname().equalsIgnoreCase(depname1)) {
                    index = i;
                }
                if (departments[i] instanceof Shop.Departments && departments[i].getDepname().equalsIgnoreCase(depname2)) {
                    departments[i] = department1;
                    departments[index] = department2;
                }
            }
        }
        shop.setDepartments(departments);
    }


   public String showDepartments() {
        String result = "";
        for (Shop.Departments dep:shop.getDepartments()){
            if (dep instanceof Shop.Departments) {
                result = result + dep.toString();
            }
        }
        return result;
    }

    public boolean checkPosition(int position){
        int[] positions = shop.getPositions();
        for (int pos:positions) {
            if ((Integer)pos instanceof Integer && pos==position) {
                return false;
            }
        } return true;
    }

    public boolean checkName(String depname){
        String[] deps = shop.getDepsnames();
        for (String dep:deps) {
            if (dep instanceof String && dep.equalsIgnoreCase(depname)) {
                return false;
            }
        } return true;
    }


}
