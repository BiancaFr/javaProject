import java.io.*;
public class class3 //Creating 'class3'
{

    public void fixText() throws IOException  
    {//Creating 'class3' main method
        String line; //Temporary string that receives the text lines one by one
        String[] lines = new String[78]; //Array containing every text lines
        int i = 0; //While loop counter
    try{//Try block to read file
        File f1 = new File("C:/Unicamp/Java Project/javaProject-master/Texto01.txt"); //Create the type variable File to variable 'f1'
        BufferedReader in = (new BufferedReader(new FileReader(f1))); //Creates a buffer that reads chunks of characters of the 'f1' and stores them 
        
    while ((line = in.readLine()) != null) { //While loop that verifies if the buffer is reading a line not null and stores the value to the string 'line'
        lines[i] = line.replaceAll("[^a-zA-Z0-9 ÁÀÂÃáàâãÉÈÊẼèéêẽÍÌÎĨíìîĩÓÒÔÕóòôõÚÙÛŨúùũûçÇ]", "").toLowerCase(); //All special characters are removed and the letters are all replaced to lower case letters, the new characters are storage in the 'lines' array
        i++; // Incrementing the while loop counter by one
}   in.close();//Closing the buffer
        }
        catch (FileNotFoundException e) //Catch block to show error if and error ocurred in the try block
        {
        System.out.println("An error occurred."); //Prints the error message
        e.printStackTrace();//Shows the specified error
        } 
    }
}
