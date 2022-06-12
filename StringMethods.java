public class StringMethods {
    public static void main(String[] argss) {
        System.out.println("\nSTRINGS IN JAVA\n");
        String str1 = "This is a String";
        String str2 = "Noice Testing";
        int num = 3000;

        System.out.println(str1 + " \t //str1");
        System.out.println(str2 + " \t //str2");

        System.out.println("\nMETHODS\n");
        System.out.println(str1.length() + " // length() method used on str1");
        System.out.println(str1.toUpperCase() + " // toUpperCase() method used");
        System.out.println(str1.toLowerCase() + " // toLowerCase() method used");
        System.out.println(str1.indexOf("This") + "// index of \'This\' is found through indexOf() method");

        System.out.println("\nCONCATENATION\n");
        System.out.println(str1 + str2 + "\t// way1 use + ");
        System.out.println(str1.concat(str2) + "\t// way2 use concat()");

        System.out.println("\nCONCATENATING NUMBER AND STRING\n");
        System.out.println(num + str1 + "\t// num + str1");
        System.out.println(str2 + num + str1 + "\t// str2+ num + str1");

    }
}