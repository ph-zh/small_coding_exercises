/*
Перед вами программа для выдачи билетов пассажирам. Каждому билету должен быть присвоен уникальный номер.
Ваша задача — реализовать логику присвоения этих номеров таким образом, чтобы каждый следующий номер был больше предыдущего на единицу.
 */
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(23765);
        String[] passengersTimestamps = new String[]{
                "08:33",
                "09:42",
                "10:43",
                "17:59",
                "18:01",
                "19:15"
        };

        for (int i = 0; i < passengersTimestamps.length; i++) {
            increaseTicketNumber(bus);
            System.out.println("Оплата поездки в " + passengersTimestamps[i]
                    + ". Номер билета: " + bus.ticketNumber);
        }
    }

    private static void increaseTicketNumber(Bus bus) {
        // вставьте код для увеличения номера билета
        bus.ticketNumber = bus.ticketNumber + 1;
    }

}

class Bus {
    public Bus(int initialNumber) {
        ticketNumber = initialNumber;
    }

    int ticketNumber;
}