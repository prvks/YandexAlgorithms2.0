package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Party> partyList = new ArrayList<>();
        int sumVotersCount = 0;
        int pos = 0;
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String name = s.substring(0, s.lastIndexOf(" "));
            double votes = Integer.parseInt(s.substring(s.lastIndexOf(" ") + 1));
            sumVotersCount += votes;
            Party party = new Party(name, votes, pos);
            partyList.add(party);
            pos++;
        }
        double f = sumVotersCount / (double) 450;
        int free = 450;
        for (Party party : partyList) {
            party.setPlaces((int) (party.getVotes() / f));
            free -= party.getPlaces();
            party.setRemainder(party.getVotes() % f);
        }
        partyList.sort(Comparator.comparing(Party::getRemainder).reversed());
        while (free != 0) {
            for (Party party : partyList) {
                if (free == 0) {
                    continue;
                }
                party.setPlaces(party.getPlaces() + 1);
                free--;
            }
        }
        partyList.sort(Comparator.comparing(Party::getPosition));
        for (Party party : partyList) {
            System.out.println(party.getName() + " " + party.getPlaces());
        }
    }
}

class Party {
    private String name;
    private double votes;
    private int position;
    private int places;
    private double remainder;

    public Party(String name, double votes, int position) {
        this.name = name;
        this.votes = votes;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVotes() {
        return votes;
    }

    public void setVotes(double votes) {
        this.votes = votes;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }
}
