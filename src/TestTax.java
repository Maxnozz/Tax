 class TestTax {
    public static void main(String[]arg){
        //Tax t = new Tax();
        NJTax t = new NJTax();

        t.grossIncome = 40000;

        t.numberOfDependents = 2;

        t.state = "NJ";

        double yourTax = t.calcTax();


        System.out.println("Your tax is " + t.adjustForStudens(yourTax));
    }
}
