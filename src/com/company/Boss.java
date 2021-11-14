package com.company;

public class Boss extends GameEntity {
    public Weapon bossWeapon;

    public Weapon getWeapon() {
        return bossWeapon;
    }

    public void setWeapon(Weapon weapon) {
        this.bossWeapon = weapon;
    }


    public String stats(){
        return  super.damage + "(damage) " + super.hP + "(HP)" /*+ "Weapon: "
                + bossWeapon.getWeaponName() + "\nWeapon type: " + bossWeapon.getWeaponType()*/ ;
    }
}
