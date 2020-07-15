package HomeWorkLinkedList.Penalty;

public class Penalty  {


    private String namePenalty;
    private DescribePenalty describePenalty;
    private TypePenalty typePenalty;

    public Penalty(String penalty, TypePenalty typePenalty, DescribePenalty describePenalty) {
        namePenalty = penalty;
        this.typePenalty = typePenalty;
        this.describePenalty = describePenalty;
    }

    public Penalty() {
    }

    public TypePenalty getTypePenalty() {
        return typePenalty;
    }

    public void setTypePenalty(TypePenalty typePenalty) {
        this.typePenalty = typePenalty;
    }

    public String getNamePenalty() {
        return namePenalty;
    }

    public void setNamePenalty(String penalty) {
        namePenalty = penalty;
    }

    public DescribePenalty getDescribePenalty() {
        return describePenalty;
    }

    public void setDescribePenalty(DescribePenalty describePenalty) {
        this.describePenalty = describePenalty;
    }

    @Override
    public String toString() {
        return "Штраф " + namePenalty + ". Ответственность: " + typePenalty.getString() + "Описание штрафа: " + describePenalty.toString();
    }
}
