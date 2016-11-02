package talab.xml.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * Created by Vladyslav_Shkola on 10/5/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        //Create the CSVFormat object
        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');

        //initialize the CSVParser object

        CSVParser parser = new CSVParser(new FileReader("D:\\examples\\clients.csv"), format);

        List<Clients> clientsList = new ArrayList<Clients>();
        for(CSVRecord record : parser){
            Clients clients = new  Clients();

            clients.setId(Integer.parseInt(record.get("id")));
            clients.setSurname(record.get("surname"));
            clients.setName(record.get("name"));
            clients.setIdentificationCode(("identificationCode"));
            clients.setPhoneNumber(record.get("phoneNumber"));

            clientsList.add(clients);
        }
        //close the parser
        parser.close();

        System.out.println(clientsList);


    }
}
