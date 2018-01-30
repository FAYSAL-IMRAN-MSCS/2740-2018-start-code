import javax.swing.JOptionPane;

public class FImran2740Ex1E1 {
    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog(" Enter your city");
        String strPopulation = JOptionPane.showInputDialog(" Enter your city population ");
        int population = 25000;
        // convert strPopulation to int using Integer.parseInt()
        String strSalesTaxRate = JOptionPane.showInputDialog(" Enter your city sales tax rate:");
        double salesTaxRate = 10.05;
        // convert strSalesTaxRate to double using Double.parseDouble()

        showLenght(city);
     ShowUpperCase(city);
      showLower(city);
     showFirstChar(city);
//      showPopulation(population);
//      showSalesTaxRate(salesTaxRate);

        sampOperators();



    }

    public static void showLenght(String s) {

        JOptionPane.showMessageDialog(null, " Count of Characters in '" +
                s + " ': " + s.toUpperCase());

    }
    public static void ShowUpperCase(String s) {

        JOptionPane.showMessageDialog(null, " UpperCase'" + s.length());

    }

        public static void showLower(String s) {

        JOptionPane.showMessageDialog(null, " LowerCase '" + s.toLowerCase());

    }
    public static void showFirstChar(String s) {

        JOptionPane.showMessageDialog(null, "chars '" + s.chars());

    }
    public static void showPopulation(int P ) {
        // JOptionPane.showMessageDialog(null, " population '"+ showPopulation());
        // int population = Interger.parseInt(populationString());
       // Double population  = Double.parseDouble(population StringR);
    }
    public static void showSalesTaxRate(int R ) {
       // int SalesTaxRate = Interger.parseInt(showSalesTaxRate String);
      // Double showSalesTaxRate  = Double.parseDouble(showSalesTaxRate StringR);


    }

        public static void sampOperators ()
        {
            int i = 5, j = 4, k = 2;
            double d = 2.0;
            boolean t = true, f = false;
            char c = 'A', sp = 32;
            JOptionPane.showMessageDialog(null,
                    "1) i / k = " + i / k + '\n' +        // i/k = 2, because it doesn't want dec. point.
                            "2) i / d = " + i / d + '\n' +        // 1/d = 2.5, this one want dec. point.
                            "3) c++ = " + c++ + '\n' +        // only c has power of A, and ++ doesn't have any power.
                            "4) ++c = " + ++c + '\n' +        // ( it's something like 0+0= 0, or 0 * 2= 0, some consept here.
                            "5) c + sp = '" + c + sp + "'\n" +    // no idea
                            "6) (c + sp) = " + (c + sp) + '\n' +    // no idea how it worked.
                            "7) (c += sp) = " + (c += sp) + '\n' +    // no idea
                            "8) (i > j) && (j > k) = " + (((i > j) && (j > k)) ? "true" : "false") + '\n' +// ture because i is begger than j and j is begger then k,
                            //
                            "9) (i < j) && (j > k) = " + (((i < j) && (j > k)) ? "true" : "false") + '\n' +// some consept here, j is not begger than i ect.
                            //
                            "10) (i < j) || (j > k) = " + (((i < j) || (j > k)) ? "true" : "false") + '\n' +// i have no idea
                            //
                            "11) i + j / k = " + (i + j / k) + '\n' +    // it should be (5+4=9/2)=5,but it says 7,
                            "12) j / k + i = " + (j / k + i) + '\n' +    // 5+2=7 yes.
                            "13) j / (k + i) = " + (j / (k + i)) + '\n' +    // 0 make sence.(5/6)=0.833333, but it's not asking dec. points.
                            "14) f && t || t = " + ((f && t || t) ? "true" : "false") + '\n' +// no idea
                            //
                            "15) 100001000 - 100000900 = " + (100001000 - 100000900) + '\n' +// just subtrack it.
                            "16) 100001000f - 100000900f = " + (100001000f - 100000900f) + '\n' +// no idea
                            //
                            "17) 1.000001f - 1.0000009f = " + (1.000001f - 1.0000009f));// no idea.
            //
        }


    }


