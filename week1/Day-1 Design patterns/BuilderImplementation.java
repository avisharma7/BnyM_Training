/*
Implementation of builder design pattern

The Builder Design Pattern is a creational pattern used in software design to construct a complex object step by step.
It allows the construction of a product in a step-by-step fashion,
where the construction process can vary based on the type of product being built ( required and optional parameters)
The pattern separates the construction of a complex object from its representation,
allowing the same construction process to create different representations.


 */
class Company{
    //Required Parameters
    final String ceo;
    private String director;
    private int revenue;

    //optional parameter
    private boolean hasGym;
    private boolean hasCafe;

    //private constructor to be called by the builder
    private Company(CompanyBuilder builder){
        this.ceo = builder.ceo;
        this.director = builder.director;
        this.revenue = builder.revenue;
        this.hasCafe = builder.hasCafe;
        this.hasGym = builder.hasGym;
    }

    //Getters for the Company attributes
    public String getCeo(){
        return ceo;
    }

    public String getDirector(){
        return director;
    }

    public int getRevenue(){
        return revenue;
    }

    public boolean hasCafe() {
        return hasCafe;
    }

    public boolean hasGym() {
        return hasGym;
    }

    //static nested builder class
    public static class CompanyBuilder {
        // Required parameters
        private String ceo;
        private String director;
        private int revenue;

        // Optional parameters
        private boolean hasGym;
        private boolean hasCafe;

        // Constructor with required parameters
        public CompanyBuilder(String ceo, String director, int revenue) {
            this.ceo = ceo;
            this.director = director;
            this.revenue = revenue;
        }

        // Setter methods for optional parameters
        public CompanyBuilder setGym(boolean hasGym) {
            this.hasGym = hasGym;
            return this;
        }

        public CompanyBuilder setCafe(boolean hasCafe) {
            this.hasCafe = hasCafe;
            return this;
        }

        // Build method to create a Company object
        public Company build() {
            return new Company(this);
        }
    }
}

public class BuilderImplementation {
    public static void main(String[] args) {
        Company perficient = new Company.CompanyBuilder("Tom", "Parakash", 10000)  // Required parameters
                .setGym(false)               // Optional parameters
              //  .setCafe(true)
                .build();

        System.out.println("Company CEO: " + perficient.getCeo());
        System.out.println("Company Director: " + perficient.getDirector());
        System.out.println("Company Revenue: " + perficient.getRevenue());
        System.out.println("Company has Gym: " + perficient.hasGym());
        System.out.println("Company has Cafe: " + perficient.hasCafe());
    }
}

/*
Output:
Company CEO: Tom
Company Director: Parakash
Company Revenue: 10000
Company has Gym: false
Company has Cafe: false
 */
