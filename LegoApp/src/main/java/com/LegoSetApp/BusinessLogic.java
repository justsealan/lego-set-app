package com.LegoSetApp;

public class BusinessLogic {

    //Validate set number
    public boolean validateSetNumber(String setNumber) {
        if (setNumber.length() >= 4 && setNumber.length() <= 7) {
            return true;
        } else {
            return false;
        }
    }

    //Validate name
    public boolean validateName(String name) {
        if (name.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Validate theme
    public boolean validateTheme(String theme) {
        if (theme.equals("City") || theme.equals("Classic") || theme.equals("Creator") || theme.equals("Duplo") || theme.equals("Ninjago") || theme.equals("Star Wars") || theme.equals("Technic")) {
            return true;
        } else {
            return false;
        }
    }

    //Validate age restriction
    public boolean validateAgeRestriction(String ageRestriction) {
        if (ageRestriction.equals("1.5+") || ageRestriction.equals("4+") || ageRestriction.equals("6+") || ageRestriction.equals("9+") || ageRestriction.equals("13+") || ageRestriction.equals("18+")) {
            return true;
        } else {
            return false;
        }
    }

    //Validate pieces
    public boolean validatePieces(int pieces) {
        if (pieces > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Validate recommended retail price
    public boolean validateRecommendedRetailPrice(double recommendedRetailPrice) {
        if (recommendedRetailPrice > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Validate all fields
    public boolean validateAllFields(LegoSet legoSet) {
        if (validateSetNumber(legoSet.getNumber()) && validateName(legoSet.getName()) && validateTheme(legoSet.getTheme()) && validateAgeRestriction(legoSet.getAges()) && validatePieces(legoSet.getPieces()) && validateRecommendedRetailPrice(legoSet.getRecommendedRetailPrice())) {
            return true;
        } else {
            return false;
        }
    }

}
