public class Main {
    public static void main(String[] args) {
        String[] argsDeStrings = new String[]{"pedro", "pepe", "peter"};

        //System.out.println(argsDeStrings.length);
        int contador = 0;
        String stringsNames = "";

        while (argsDeStrings.length > contador){
            stringsNames+= argsDeStrings[contador] + " ";
            contador++;
        }
        System.out.println(stringsNames);
    }
}