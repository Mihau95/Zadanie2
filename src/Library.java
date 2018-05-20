class Library {
    public static void main(String[] args) {
        Comic comic1 = new Comic("Akame ga Kill", "Waneko", "Takahiro", 19.99);
        System.out.println(comic1.nazwa);
        System.out.println(comic1.wydawnictwo);
        System.out.println(comic1.autor);
        System.out.println(comic1.cena);


        Comic comic2 = new Comic("Saga Winlandzka", "Hanami", "Waneko", 65.00);
        System.out.println(comic2.nazwa);
        System.out.println(comic2.wydawnictwo);
        System.out.println(comic2.autor);
        System.out.println(comic2.cena);
    }
}
