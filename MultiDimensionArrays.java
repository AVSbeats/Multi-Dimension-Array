import javax.swing.JOptionPane;

public class MultiDimensionArrays {
        public static void main(String[] args) {

                // This will take too long
                int[][] someNumbers = new int[1][1];
                someNumbers[0][0] = 14;
                // ------------------------------------------------------------------------------------

                // Best option
                int[][] numbers = {
                                // Column 0 & 1
                                { 0, 1 }, // Row 0
                                { 1, 2 }, // Row 1
                                { 2, 3 }, // Row 2
                                { 3, 4 } // Row 3
                };
                // ------------------------------------------------------------------------------------

                // Rent Practice Program
                int[][] rents = {
                                { 400, 450, 510 }, // Floor 0 Rent (Basement)
                                { 500, 560, 630 }, // Floor 1
                                { 625, 676, 740 }, // Floor 2
                                { 825, 895, 985 } // Floor 3
                };

                String entry;
                int floor;
                int bedrooms;

                entry = JOptionPane.showInputDialog(null, "Enter Floor Number: ");
                floor = Integer.parseInt(entry);

                entry = JOptionPane.showInputDialog(null, "Enter Number of Bedrooms: ");
                bedrooms = Integer.parseInt(entry);

                JOptionPane.showMessageDialog(null, "The Rent for " + bedrooms + " Bedrooms Apartment on Floor " + floor
                                + " is $" + rents[floor][bedrooms]);

                // Display all the multi arrays
                for (floor = 0; floor < rents.length; floor++)
                        for (bedrooms = 0; bedrooms < rents[floor].length; bedrooms++) {
                                System.out.println("Floor " + floor + " Bedrooms " + bedrooms + " Rent is $"
                                                + rents[floor][bedrooms]);
                        }
        }
}