package com.epam.model;

public class Shop {
    private String name;
    private int numberofdeps;
    private int filleddeps = 0;
    int [] positions;
    private String[] depsnames;
    private Shop.Departments[] departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofdeps() {
        return numberofdeps;
    }

    public void setNumberofdeps(int numberofdeps) {
        this.numberofdeps = numberofdeps;
    }

    public int getFilleddeps() {
        return filleddeps;
    }

    public void setFilleddeps(int filleddeps) {
        this.filleddeps = filleddeps;
    }

    public String[] getDepsnames() {
        return depsnames;
    }

    public void setDepsnames(String[] depsnames) {
        this.depsnames = depsnames;
    }

    public Departments[] getDepartments() {
        return departments;
    }

    public void setDepartments(Departments[] departments) {
        this.departments = departments;
    }

    public int[] getPositions() {
        return positions;
    }

    public void setPositions(int[] positions) {
        this.positions = positions;
    }


    public Shop(String name, int numberofdeps) {
        this.name = name;
        this.numberofdeps = numberofdeps;
        this.depsnames = new String[numberofdeps];
        this.departments = new Departments[numberofdeps];
        this.positions = new int[numberofdeps];
    }

    @Override
    public String toString() {
        String result = "";
        for (String dep:depsnames) {
            result += dep + ", ";
        }
        return "Shop{" +
                "name='" + name + '\'' +
                ", numberofdeps=" + numberofdeps + ", departments: " + result +
                '}';
    }

    class Departments {
        private String depname;
        private String goods;
        private String services;
        private int position;

        public Departments() {
        }

        public Departments(String depname, String goods, String services, int position) {
            this.depname = depname;
            this.goods = goods;
            this.services = services;
            this.position = position;
        }

        @Override
        public String toString() {
            return "Departments{" +
                    "depname='" + depname + ' ' +
                    ", goods='" + goods + ' ' +
                    ", services='" + services + ' ' +
                    ", position=" + position +
                    '}' + "\n";
        }

        public String getDepname() {
            return depname;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }

}
