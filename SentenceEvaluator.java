import java.util.ArrayList;
import java.util.Map;

public class SentenceEvaluator {

	int Score(ArrayList<String> sentence,
			Map<String, Integer> wordsFrequencies) {
		int score = 0;
		for (String word : sentence) {
			Integer wordFrequency = wordsFrequencies.get(word);
			if (wordFrequency != null) {
				score += wordFrequency;
			}
		}
		return score;

	}

}
