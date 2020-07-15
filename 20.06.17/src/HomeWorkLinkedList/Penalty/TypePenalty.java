package HomeWorkLinkedList.Penalty;

public enum TypePenalty {

    ADMINISTRATIVE_RESPONSIBILITY("Административная ответственность."),
    CRIMINAL_RESPONSIBILITY("Криминальная ответственность.");

    String string;

    TypePenalty (String string) {
            this. string = string;
    }

    public String getString (){
        return string;
    }
}
