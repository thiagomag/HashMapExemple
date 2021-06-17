package br.com.thiago;

import java.util.HashMap;
import java.util.Scanner;

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public void getWinner() {
        int maior = 0;
        String nome = null;
        for (String i : players.keySet()){
            if (maior < players.get(i)) {
                maior = players.get(i);
                nome = i;
            }
        }
        System.out.println(nome);
    }


}

public class HashMapExemple {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}