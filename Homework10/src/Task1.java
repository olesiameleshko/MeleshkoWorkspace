import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws Exception {
        String separator = File.separator;
        Path p = Paths.get(separator + "Users", "Olesia", "OneDrive", "Documents", "GitHub", "JavaForAQA", "Lesson10", "Nb_lecture10", "homework", "song");
        String song = Files.readString(p);
        HashMap<String, Integer> umbrella = new HashMap<String, Integer>();
        String[] words = song.toLowerCase().replaceAll("\r\n", " ").replaceAll("[.,?()]", " ").split("\s+");
        for (String word : words) {
            umbrella.put(word, umbrella.getOrDefault(word, 0) + 1);
        }
        System.out.println("Unique words is " + umbrella.size());
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

