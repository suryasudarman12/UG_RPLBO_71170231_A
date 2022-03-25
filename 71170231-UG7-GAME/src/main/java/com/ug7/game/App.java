package com.ug7.game;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player P_71190480 = new Player("bantolostd", "prakrplboasik");
        Player P_71170231 = new Player("Nama Kamu", "Password Kamu");

        Ninja A_71190480 = new Ninja();
        Penyihir A_71170231 = new Penyihir();

        System.out.println("\n========== AWAL ==========");
        A_71190480.getInfo();
        A_71170231.getInfo();

        System.out.println("\n========== NORMAL ATTACK #1 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.normalAttacked(A_71170231);

        System.out.println("\n========== BELI SENJATA #1 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.buyWeapon(2);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.buyWeapon(4);

        System.out.println("\n========== BELI SENJATA #2 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.buyWeapon(1);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.buyWeapon(3);

        System.out.println("\n========== NORMAL ATTACK #2 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.normalAttacked(A_71170231);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.normalAttacked(A_71190480);

        System.out.println("\n========== ABILITY ATTACK #1 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.ability(A_71170231);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.ability(A_71190480);

        System.out.println("\n========== WALKING AND NORMAL ATTACK #1 ==========");
        A_71190480.walk(true);
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.normalAttacked(A_71170231);
        A_71170231.walk(true);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.normalAttacked(A_71190480);

        System.out.println("\n========== ABILITY ATTACK #2 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.ability(A_71170231);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.ability(A_71190480);

        System.out.println("\n========== WAR #1 ==========");
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.walk(false);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.walk(false);
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.normalAttacked(A_71170231);
        System.out.print("["+A_71170231.getPlayer().getUsername()+"] - ");
        A_71170231.normalAttacked(A_71190480);
        System.out.print("["+A_71190480.getPlayer().getUsername()+"] - ");
        A_71190480.ability(A_71170231);

        System.out.println("\n========== AKHIR ==========");
        A_71190480.getInfo();
        A_71170231.getInfo();
    }
}
