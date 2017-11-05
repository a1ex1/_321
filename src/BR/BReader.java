package BR;


import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class BReader {
    public void read(File inputfile,File outputfile,int lineOfCompare) throws IOException {
        List<String> inputlist = new BufferedReader(new FileReader(inputfile)).lines().collect(Collectors.toList());
        List<String> outputlist = new BufferedReader(new FileReader(outputfile)).lines().collect(Collectors.toList());
        if (inputlist.size()-1<lineOfCompare){
            throw new IllegalArgumentException();

        }

        if(outputlist.size()-1<lineOfCompare || !inputlist.get(lineOfCompare).equals(outputlist.get(lineOfCompare))){
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputfile));
            for (int i=0; i<lineOfCompare; i++) {
                bufferedWriter.newLine();
            }
            bufferedWriter.write(inputlist.get(lineOfCompare));
        }


    }
}
