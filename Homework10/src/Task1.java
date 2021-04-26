import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String song = "Uh huh, uh huh\n" +
                "Yeah, Rihanna\n" +
                "Uh huh, uh huh\n" +
                "Good girl gone bad\n" +
                "Uh huh, uh huh\n" +
                "Take three, action\n" +
                "Uh huh, uh huh, ho\n" +
                "\n" +
                "No clouds in my stones\n" +
                "Let it rain, I hydroplane into fame\n" +
                "Comin' down at the Dow Jones\n" +
                "When the clouds come, we gone\n" +
                "We Rocafella\n" +
                "We fly higher than weather\n" +
                "In G5's or better\n" +
                "You know me\n" +
                "In anticipation for precipitation stack chips for the rainy day\n" +
                "Rain man is back with little Ms. Sunshine\n" +
                "Rihanna, where you at?\n" +
                "\n" +
                "You have my heart, and we'll never be worlds apart\n" +
                "Maybe in magazines, but you'll still be my star\n" +
                "Baby, 'cause in the dark\n" +
                "You can't see shiny cars\n" +
                "And that's when you need me there\n" +
                "With you I'll always share\n" +
                "Because\n" +
                "\n" +
                "When the sun shines, we shine together\n" +
                "Told you I'll be here forever\n" +
                "Said I'll always be your friend\n" +
                "Took an oath that I'm a stick it out till the end\n" +
                "Now that it's raining more than ever\n" +
                "Know that we still have each other\n" +
                "You can stand under my umbrella\n" +
                "You can stand under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh, eh, eh, eh\n" +
                "\n" +
                "These fancy things will never come in between\n" +
                "You're part of my entity, here for infinity\n" +
                "When the world has took its part\n" +
                "When the world has dealt its cards\n" +
                "If the hand is hard, together we'll mend your heart\n" +
                "Because\n" +
                "\n" +
                "When the sun shines, we shine together\n" +
                "Told you I'll be here forever\n" +
                "Said I'll always be your friend\n" +
                "Took an oath that I'm a stick it out till the end\n" +
                "Now that it's raining more than ever\n" +
                "Know that we still have each other\n" +
                "You can stand under my umbrella\n" +
                "You can stand under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh, eh, eh, eh\n" +
                "\n" +
                "You can run into my arms\n" +
                "It's okay, don't be alarmed\n" +
                "(Come into me)\n" +
                "(There's no distance in between our love)\n" +
                "So I'm gonna let the rain pour\n" +
                "I'll be all you need and more\n" +
                "Because\n" +
                "\n" +
                "When the sun shines, we shine together\n" +
                "Told you I'll be here forever\n" +
                "Said I'll always be your friend\n" +
                "Took an oath that I'm a stick it out till the end\n" +
                "Now that it's raining more than ever\n" +
                "Know that we still have each other\n" +
                "You can stand under my umbrella\n" +
                "You can stand under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh\n" +
                "Under my umbrella, ella, ella, eh, eh, eh, eh, eh, eh\n" +
                "\n" +
                "It's raining, raining\n" +
                "Ooh, baby, it's raining, raining\n" +
                "Baby, come into me\n" +
                "Come into me\n" +
                "It's raining, raining\n" +
                "Ooh, baby, it's raining, raining\n" +
                "You can always come into me\n" +
                "Come into me\n" +
                "It's pouring rain\n" +
                "It's pouring rain\n" +
                "Come into me\n" +
                "Come into me\n" +
                "It's pouring rain\n" +
                "It's pouring rain";
        HashMap<String, Integer> umbrella = new HashMap<String, Integer>();
        String[] words = song.toLowerCase().replaceAll("\n", " ").replaceAll("[.,?()]"," ").split("\s+");
        for (String word : words) {
            umbrella.put(word,umbrella.getOrDefault(word, 0)+1);
        }
        int uniqueCount = 0;
        for (Integer freq : umbrella.values()) {
            if(freq == 1){
                uniqueCount++;
            }
        }
        System.out.println("Unique words is " + uniqueCount);
        umbrella.forEach((word, freq) -> System.out.println(word + " : " + freq));
        int mostFreq = 0;
        String theWord = null;
        for (Map.Entry<String, Integer> pair : umbrella.entrySet()) {
            Integer freq = pair.getValue();
            if (freq > mostFreq) {
                mostFreq = freq;
                theWord = pair.getKey();
            }
        }
        System.out.println("The most is " + theWord + " : " + mostFreq);
    }
}

