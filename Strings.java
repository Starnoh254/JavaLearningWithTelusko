public class Strings {
    public static void main(String args[] ) {
        // String name = new String("Starnoh");
        // name = "John";
        // System.out.println(name);

        // String word = "Star";
        // word = word.concat("noh");
        // System.out.println(word);

        StringBuffer sb = new StringBuffer("Starnoh");
        sb.append(" John");

        sb.insert(0 , "Java ");
        System.out.println(sb);
    }
}
