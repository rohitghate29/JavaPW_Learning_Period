class types {
    public static void main(String[] args) {
        //Immutable String
        String brand = "PWSkills";
        System.out.println(brand);

        brand.concat("Bengaluru");
        System.out.println(brand); // immutable strings can not change values

        //Mutable String
        StringBuilder brand1 = new StringBuilder("PWSkills");
        System.out.println(brand1);

        brand1.append("Bengaluru");
        System.out.println(brand1); // mutable strings can change values
    }
}