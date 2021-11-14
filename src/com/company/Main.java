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

        System.out.println("\n---------------------------------\n");

        System.out.println(vergil.stats());

        System.out.println("\n----------------------------------\n");

        Skeleton kirt = new Skeleton();
        kirt.sethP(220);
        kirt.setDamage(25);
        kirt.setAmountOfArrows(30);

        Skeleton lerk = new Skeleton();
        lerk.sethP(280);
        lerk.setDamage(30);
        lerk.setAmountOfArrows(40);
        System.out.println("Skeleton Kirt: " + kirt.skeletonStats() + "\nSkeleton Lerk: " + lerk.skeletonStats());
    }
}
