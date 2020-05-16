package introduction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class ChildClass extends ParentClass {

    @Override
    public Double test(Double a) throws RuntimeException {
        return 2.0;
    }

    public static void main(String[] args) {

        try (BufferedReader r = new BufferedReader(new FileReader("path"))) {
            r.lines();
        } catch (IOException e) {
            e.printStackTrace();

        }


        System.out.println("res: ");
        try {
            new ChildClass().test(3.0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        Integer.valueOf("r");
    }
}
