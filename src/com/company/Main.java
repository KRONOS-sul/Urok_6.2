package com.company;

public class Main {

    public static void main(String[] args) {
        Boss vergil = new Boss();
        vergil.sethP(1500);
        vergil.setDamage(77);


        Weapon yamato = new Weapon();
        yamato.setWeaponName("Yamato");
        yamato.setWeaponType("katana");
        vergil.setWeapon(yamato);

        System.out.println("Vergil: "+vergil.gethP() + "(HP), " + vergil.getDamage() + "(damage)\n"
                + vergil.getWeapon().getWeaponName() + " " + vergil.getWeapon().getWeaponType());

    }
}
