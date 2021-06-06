package warmup1;

public class HasWord {

    public static int hasWord(String input) {
        return input.indexOf("word");
    }

    public static void main(String[] args) {
        System.out.println(hasWord("word"));
        System.out.println(hasWord("WORD"));
        System.out.println(hasWord("helloWord"));
        System.out.println(hasWord("word word"));
        System.out.println(hasWord("hello"));
        System.out.println(hasWord(""));
    }
}
