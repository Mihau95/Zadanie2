class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemnosc silnika
        Car car2 = new Car("Opel", "Vectra", 2004, 1.8);

        System.out.printf("Samochod 1:");
        System.out.println(" ");
        System.out.printf("Marka: " + car1.marka + ", model: " + car1.model +
                ", rocznik: " + car1.rocznik + ", pojemnosc: " + car1.pojemnosc);
        System.out.println(" ");

        System.out.printf("Samochod 2:");
        System.out.println (" ");
        System.out.printf("Marka: " + car2.marka + ", model: " + car2.model +
                    ", rocznik: " + car2.rocznik + ", pojemnosc: " + car2.pojemnosc);
    }
}
