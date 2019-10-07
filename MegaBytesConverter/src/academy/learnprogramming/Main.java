package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

    }
        public static int printMegaBytesAndKiloBytes(int kiloBytes){
            if (kiloBytes < 0) {
                System.out.println("Invalid Value");
            }
            else if (kiloBytes >= 0) {
                int MB = (kiloBytes / 1024);
                int KB = (kiloBytes % 1024);
                System.out.println(kiloBytes + " KB = " + MB +
                        " MB and " + KB + " KB");
            }
            printMegaBytesAndKiloBytes(5000);
            System.out.println(kiloBytes);
            System.out.println(printMegaBytesAndKiloBytes(5000));
        }


    }


