import java.util.ArrayList;
import java.util.Map;

public class SentenceEvaluator {

	int Score(ArrayList<String> sentence,
			Map<String, Integer> wordFrequencyCount) {
		int score = 0;
		for (String word : sentence) {
			score += wordFrequencyCount.get(word);
		}
		return score;

	}

}
