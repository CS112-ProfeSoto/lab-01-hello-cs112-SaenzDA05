

    public class Main {

        public static void ImTired() {
            System.out.println("I wanna go back to sleep");
        }

        public static int cubed(int number) {
            return number * number * number;
        }

        public static void main(String[] args) {
            System.out.println("Welcome To CS112");
            ImTired();
            int finall = cubed(5);
            System.out.println("The resut of 5 cubed is " + finall);

            Movie choiceMovie = new Movie("inception");
            System.out.println(choiceMovie);
            choiceMovie.setTitle("One Piece");
            System.out.println("Updated Title: " + choiceMovie.getTitle());
        }
    }
