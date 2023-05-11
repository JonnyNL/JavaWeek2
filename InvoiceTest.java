public class InvoiceTest {
    public static void main(String[] args) {
        
        
        InvoiceItem ChoccyMilk = new InvoiceItem("cm34", "Chocolate Milk", 2.50);
        ChoccyMilk.PrintCount();
        System.out.println(ChoccyMilk);
        System.out.println(" ");
        
        InvoiceItem Flour = new InvoiceItem("bf12", "Baking flour", 4.50);
        Flour.PrintCount();
        System.out.println(Flour);
        System.out.println(" ");
        
        InvoiceItem Bicycle = new InvoiceItem("byc04", "Mountain Bike", 450.99);
        Bicycle.PrintCount();
        System.out.println(Bicycle);
        System.out.println(" ");
        
        InvoiceItem Markers = new InvoiceItem("asm08", "8 pack of assorted markers", 7.99);
        Markers.PrintCount();
        System.out.println(Markers);
        System.out.println(" ");
        
        InvoiceItem SaltnVinny = new InvoiceItem("svc077", "Salt and Vinegar Chips", 3.49);
        SaltnVinny.PrintCount();
        System.out.println(SaltnVinny);
        System.out.println(" ");
        
        InvoiceItem CovidCure = new InvoiceItem("cbhc123", "Be Well Again, covid cure.", 0.00);
        CovidCure.PrintCount();
        System.out.println(CovidCure);

        System.out.println("End of invoices");

    }
}
