package Exam06012017;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniKaraoke {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> participants = new TreeMap<>();
        List<String> appliedParticipants = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        List<String> availableSongs = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        String inputPerformance = scan.nextLine();

        while (!inputPerformance.equals("dawn")) {
            String[] performance = inputPerformance.split(",\\s+");
            String participant = performance[0];
            String song = performance[1];
            String award = performance[2];

            if (appliedParticipants.contains(participant) && availableSongs.contains(song)){

                if (participants.containsKey(participant)){

                    if (!participants.get(participant).contains(award)){
                        participants.get(participant).add(award);
                    }

                } else {
                    participants.put(participant, new ArrayList<>());
                    participants.get(participant).add(award);
                }
            }

            inputPerformance = scan.nextLine();
        }

        if (participants.isEmpty()){
            System.out.println("No awards");
        } else {
            participants.forEach((k, v) -> {
                System.out.printf("%s: %d awards%n", k, v.size());
                for (String award : v) {
                    System.out.printf("--%s%n", award);
                }
                    });
        }
    }
}
