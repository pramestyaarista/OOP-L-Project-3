
package pertemuan401;

/**
 *
 * @author Tea
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BukuTeman BTeman = new BukuTeman();
        String ul = "Ya";
        do{
            System.out.println("=================================");
            System.out.println("|          Main Menu            |");
            System.out.println("=================================");
            System.out.println("| A. View Data                  |");
            System.out.println("| B. Add Data                   |");
            System.out.println("| C. Edit Data                  |");
            System.out.println("| D. Delete Data                |");
            System.out.println("| E. Exit                       |");
            System.out.println("=================================");
            System.out.print("Choose Option (A/B/C/D/E): ");
            String mPIL = BTeman.dtIN.nextLine().toUpperCase();
            switch (mPIL) {
                case "A":
                    BTeman.viewdata();
                    break;
                case "B":
                    BTeman.storedata();
                    break;
                case "C":
                    BTeman.Update();
                    break;
                case "D":
                    BTeman.Destroy();
                    break;
                case "E":
                    ul = "Tidak";
                    break;
                default:
                    System.out.println("Please enter a valid option (A/B/C/D/E)");
                    break;

            }
        } while(!ul.equals("Tidak"));    
    }
}

