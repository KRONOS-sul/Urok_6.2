package com.company;

public class Skeleton extends Boss {
     private int amountOfArrows;

    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }

    public String skeletonStats(){
        return super.gethP() + "(HP), " + super.getDamage() + "(damage), " + "arrows "  + getAmountOfArrows();
    }
}
