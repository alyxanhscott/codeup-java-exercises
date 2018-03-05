public class ServerNameGenerator {


    public static void main(String[] args) {

        int n = (int) Math.floor(Math.random() * 10);


        String[] adjectives = {"angry", "gentle", "calm", "jolly", "brave", "amused", "tiny", "thoughtful", "lonely", "silent"};

        String[] nouns = {"coder", "egg", "castle", "mormon", "potato", "dancer", "gamer", "tree", "hat", "butterfly"};

        System.out.println("Here's your server name:");
        System.out.println(adjectives[n] + "-" + nouns[n]);

    }




}
