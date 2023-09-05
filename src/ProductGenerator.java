import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductGenerator
{
    public static void main(String[] args)
    {
        ArrayList<String> products = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\ProductTestData.txt");
        Product smoke = new Product("000001","Pipeweed","Long Bottom Leaf",600.00);
        Product addProds = new Product(smoke.toCSVDataRecord(), "pipeweed","Long Bottom Leaf", 600.00);
        addProds.toCSVDataRecord();
        boolean done = false;
        String productRec = "";

        do {
            productRec = smoke.getID() + ", " + smoke.getName() + ", " + smoke.getDescription() + ", " + smoke.getCost();
            products.add(productRec);
            done = SafeInput.getYNConfirm(in, "Are you finished?");
        } while (!done);

        for(String i: products)
            System.out.println(i);

        try
        {
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            for(String rec : products)
            {
                writer.write(rec, 0, rec.length());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}