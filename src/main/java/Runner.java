import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Golfer golfer1 = new Golfer("Hamish", "Mcdonald", 78);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Aileen", "Andrews", 63);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Ewan", "Scott", 87);
        DBGolfer.save(golfer3);

//        List<Golfer> golfers = DBGolfer.getAll();

//        Golfer golfer = DBGolfer.findByID(golfer2.getId());

        Golfer golferTee = DBGolfer.findByFirstName(golfer2.getFirstName());
    }

}
