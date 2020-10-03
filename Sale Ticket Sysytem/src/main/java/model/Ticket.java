package model;

/**
 @author Evgeniy Zhurenko
 */


public class Ticket {

    public Integer idTicket;
    public String dateDeparture;
    public String dateArrival;
    public String typeWagon;
    public Integer numberWagon;
    public Integer numberSeat;
    public Boolean bed;

    public Ticket() {
    }

    public Ticket(String dateDep, String dateAr, String type, Integer numberWagon,
                  Integer numberSeat, Boolean bed){
        dateDeparture = dateDep;
        dateArrival = dateAr;
        typeWagon= type;
        this.numberWagon = numberWagon;
        this.numberSeat = numberSeat;
        this.bed = bed;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }

    public String getTypeWagon() {
        return typeWagon;
    }

    public void setTypeWagon(String typeWagon) {
        this.typeWagon = typeWagon;
    }

    public Integer getNumberWagon() {
        return numberWagon;
    }

    public void setNumberWagon(Integer numberWagon) {
        this.numberWagon = numberWagon;
    }

    public Integer getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(Integer numberSeat) {
        this.numberSeat = numberSeat;
    }

    public Boolean getBed() {
        return bed;
    }

    public void setBed(Boolean bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        String isBed = "";
        if(bed) isBed = "С постелью";
        else isBed = "Без постели";
        return "Билет :\n" +
                "№ билета : " + idTicket +
                "Дата отправки : " + dateDeparture + "\n" +
                "Дата прибытия : " + dateArrival + "\n" +
                "Тип Вагона : " + typeWagon + "\n" +
                "№ вагона : " + numberWagon + "\n" +
                "Место : " + numberSeat + "\n" +
                "Постель : " + isBed + "\n";
    }
}

