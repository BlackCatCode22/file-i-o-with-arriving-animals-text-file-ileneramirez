import java.io.*;

public class FileIOwithCSV {
    public static void main(String[] args) throws IOException {

        System.out.println("\n\n Welcome to File I/O! \n\n ");

        String pathname = "C:\\Users\\BE218\\Java Files\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\Java Files\\myNewFile.txt/";
        BufferedReader reader = null;
        String line = " ";


        // Create a File Writer.
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));

        try {
            reader = new BufferedReader((new FileReader(pathname)));
            while( (line = reader.readLine()) != null ) {
                String[] row = line.split(",");

                for (String i : row) {
                    System.out.println("\n" + i);
                    writer.write("\n" + i);
                }

            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
        finally {
            reader.close();
            writer.close();
        }



        }

    }
