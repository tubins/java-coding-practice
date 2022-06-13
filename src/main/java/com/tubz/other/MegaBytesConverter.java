package com.tubz.other;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println();
        }
        int mb = kiloBytes / 1024;
        int kb = kiloBytes % 1024;
        System.out.println(mb + " MB and " + kb + " KB");
    }
}
