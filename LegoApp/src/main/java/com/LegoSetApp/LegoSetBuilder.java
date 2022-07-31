package com.LegoSetApp;

public class LegoSetBuilder {
    private String number;
        private String name;
        private String theme;
        private String age;
        private int pieces;
        private double retail;

        public LegoSetBuilder setNumber(String number) {
            this.number = number;
            return this;
        }

        public LegoSetBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public LegoSetBuilder setTheme(String theme) {
            this.theme = theme;
            return this;
        }

        public LegoSetBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public LegoSetBuilder setPieces(int pieces) {
            this.pieces = pieces;
            return this;
        }

        public LegoSetBuilder setRetail(double retail) {
            this.retail = retail;
            return this;
        }

        public LegoSet getLegoSet() {
            return new LegoSet(number, name, theme, age, pieces, retail);
        }
}
