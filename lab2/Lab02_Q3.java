import java.util.Scanner;

public class Lab02_Q3 {

    public static void main(String[] args) {

        String dateAndTime;
        int date;
        String day;
        String month;
        int year;
        String hour;
        String minute;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter date and time: ");

        dateAndTime = input.nextLine();

        input.close();

        dateAndTime = dateAndTime.trim();

        year = Integer.parseInt(dateAndTime.substring(0, dateAndTime.indexOf("/")).trim());
        
        dateAndTime = dateAndTime.substring(dateAndTime.indexOf("/"));

        month = dateAndTime.substring(0,dateAndTime.indexOf("/")).trim();

        dateAndTime = dateAndTime.substring(dateAndTime.indexOf("/"));

        date = Integer.parseInt(dateAndTime.substring(0, dateAndTime.indexOf(",")).trim());

        dateAndTime = dateAndTime.substring(dateAndTime.indexOf(","));

        day = dateAndTime.substring(0,dateAndTime.indexOf("-")).trim();

        dateAndTime = dateAndTime.substring(dateAndTime.indexOf("-"));

        hour =dateAndTime.substring(0, dateAndTime.indexOf(":")).trim();

        minute = dateAndTime.substring(dateAndTime.indexOf(":"),dateAndTime.length());

        System.out.println("Date: "+ date);
        System.out.println("Day: "+ day);
        System.out.println("Month: "+month);
        System.out.println("Year: "+year);
        System.out.println("Time: "+ minute + " minutes after " + hour);

    }

}
