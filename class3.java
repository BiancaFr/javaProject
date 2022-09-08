import java.io.*;
public class class3
{

    public static void main (String[] args) throws IOException
    {
        String line;
        String[] lines = new String[78]; //Array containing every text lines
        int i = 0;
    try{
        File f1 = new File("/home/felipe/Documents/JavaProject/Texto01.txt");
        BufferedReader in = (new BufferedReader(new FileReader(f1)));
        
    while ((line = in.readLine()) != null) {
        lines[i] = line.replaceAll("[^a-zA-Z0-9 ÁÀÂÃáàâãÉÈÊẼèéêẽÍÌÎĨíìîĩÓÒÔÕóòôõÚÙÛŨúùũûçÇ]", "").toLowerCase();
        i++;
}   in.close();
    }catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      for(int k = 0;k<=lines.length;k++){
      System.out.println(lines[k]);
      }
    }
}
