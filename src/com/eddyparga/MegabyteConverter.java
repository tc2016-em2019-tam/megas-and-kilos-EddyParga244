package com.eddyparga;

public class MegabyteConverter {
    //MegabyteConverter properties
    private int kilobytes = 0;

    public MegabyteConverter(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            System.out.println("Kilobytes can't be negative.");
        } else {
            this.kilobytes = kilobytes;
        }
    }

    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception {
        if (kilobytes < 0) {
            throw new Exception("Kilobytes can't be negative.");
        } else {
            this.kilobytes = kilobytes;
        }
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception{
        if (kilobytes==0){
            System.out.println("0 can't be converted.");
        } else if (kilobytes < 0){
            throw new Exception("Kilobytes can't be negative.");
        } else {
            if ((kilobytes%1024) == 0) {
                System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB");
            } else {
                System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + kilobytes % 1024 + " KB");
            }
        }
    }
}
