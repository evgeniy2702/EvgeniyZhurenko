package HomeWorkLinkedList.Penalty;

public class DescribePenalty {

    String describePenalty;

    public DescribePenalty(String describePenalty) {
        this.describePenalty = describePenalty;
    }

    public String getDescribePenalty() {
        return describePenalty;
    }

    public void setDescribePenalty(String describePenalty) {
        this.describePenalty = describePenalty;
    }

    @Override
    public String toString() {
        return ": " + describePenalty;
    }
}
