package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab07_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        ArrayList<String> movieNames = new ArrayList<String>();
        ArrayList<ArrayList<String>> movieReviews = new ArrayList<ArrayList<String>>();
        ArrayList<Integer> movieRatings = new ArrayList<Integer>();
        ArrayList<Integer> numberReviews = new ArrayList<Integer>();

        while (!exit)
        {
            int choice;

            System.out.println();
            System.out.println("Movie Review System:");
            System.out.println("1. Add a new movie");
            System.out.println("2. Remove a movie");
            System.out.println("3. Submit a review and rating for a movie");
            System.out.println("4. View all movies, reviews, and average ratings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            System.out.println();

            if(choice==1)//add movie
            {                
                String movieTitle;
                System.out.print("Enter the movie title: ");
                movieTitle = input.nextLine();

                movieNames.add(movieTitle);
                System.out.println("Movie added!");

                ArrayList<String> newMovieReviews= new ArrayList<String>();
                
                numberReviews.add(0);
                movieRatings.add(0);
                movieReviews.add(newMovieReviews);
            }
            else if(choice==2)//remove movie
            {
                int movieChoice;

                do {
                    System.out.println("Select a movie to remove:");
                    for(int i=0;i<movieNames.size();i++)
                    {
                        System.out.println((i+1)+". "+movieNames.get(i));
                    }
                    System.out.print("Enter your choice:");
                    movieChoice = input.nextInt();

                } while (!(movieChoice-1<=movieNames.size()-1));
                
                int indexToRemove = movieChoice-1;

                System.out.println(movieNames.get(indexToRemove)+" has been removed.");
                movieNames.remove(indexToRemove);
                movieRatings.remove(indexToRemove);
                movieReviews.remove(indexToRemove);
            }
            else if(choice==3)//review movie
            {
                int movieChoice;

                do {
                    System.out.println("Select a movie to review");
                    for(int i=0;i<movieNames.size();i++)
                    {
                        System.out.println((i+1)+". "+movieNames.get(i));
                    }
                    System.out.print("Enter movie number:");
                    movieChoice = input.nextInt();
                    input.nextLine();

                } while (!(movieChoice-1<=movieNames.size()-1));

                int indexToRate = movieChoice-1;


                String reviewForMovie;

                System.out.print("Enter your review:");
                
                reviewForMovie = input.nextLine();

                int rating;
                System.out.print("Enter your rating (1-5): ");
                rating = input.nextInt();

                movieReviews.get(indexToRate).add(reviewForMovie);
                System.out.println("Review and rating submitted!");


                movieRatings.set(indexToRate, movieRatings.get(indexToRate)+rating);
                numberReviews.set(indexToRate, numberReviews.get(indexToRate)+1);
            }
            else if(choice==4)
            {
                System.out.println("Movie List:");
                
                for(int i=0;i<movieNames.size();i++)
                {
                    System.out.println((i+1)+ ". "+movieNames.get(i));

                    double averageRate;

                    if(movieRatings.get(i)!=0)
                    {
                        averageRate = (double)movieRatings.get(i) / (double)numberReviews.get(i);
                    }
                    else
                    {
                        averageRate = 0;
                    }
                    
                    System.out.println("   Average Rating: "+averageRate);
                    System.out.println("   Reviews:");

                    for(int z =0;z<movieReviews.get(i).size();z++)
                    {
                        System.out.println("   - "+movieReviews.get(i).get(z));
                    }
                    System.out.println();
                }
            }
            else if(choice==5)
            {
                System.out.println("Movie system is closing.");
                exit = true;
            }
            else
            {
                System.out.println(choice +" does not exist.");
                System.out.println("Please make your choice between 1-5");
            }

        }
        input.close();

    }
}
