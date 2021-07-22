package money;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Map<String, Integer>> rates = new HashMap<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        Map<String, Integer> toMapping = rates.remove(from);
        if (toMapping == null)
            toMapping = new HashMap<>();

        toMapping.put(to, rate);
        rates.put(from, toMapping);
    }

    public int rate(String from, String to) {
        if (from.equals(to))
            return 1;

        Map<String, Integer> availableExchanges = rates.getOrDefault(from, new HashMap<>());
        Integer rate = availableExchanges.get(to);

        if (rate == null)
            throw new RuntimeException("No rates from " + from + " to " + to);

        return rate;
    }
}
