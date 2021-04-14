package javalab.lab7;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n PRINT STATIC METHOD PUT UP \n");
        ChristmasTree.printStaticPutUP();



        ChristmasTree newYearTree = new ChristmasTree(180, "Chine", 122, "Plastic");

        ChristmasTree oldNewYearTree = new ChristmasTree(180, "Chine", 122, "Plastic",
                "white", 2021, "102cm", "Contemporary",
                "Palm", 12, "LED");



        System.out.print("\n PRINT New Year Tree  \n");
        System.out.println(newYearTree);

        System.out.print("\n PRINT Old NewYear Tree \n");
        System.out.println(oldNewYearTree);

        System.out.print("\n PRINT PUT UP \n");
        newYearTree.printPutUP();

        System.out.print("\n RESET VALUES \n");
        oldNewYearTree.resetValues(200, "Ukraine", 200, "Plastic",
                "Green", 2021, "120cm", "Contemporary",
                "Palm", 10, "LED");

        System.out.println(oldNewYearTree);

    }


}
