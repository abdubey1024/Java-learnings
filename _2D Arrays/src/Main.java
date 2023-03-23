public class Main{
    public static void main(String[]args){

        String[][]friends=     {    {"Khushi","Harshit","Samdarsh"},
                {"Tanay","Piyush","Vats"},
                {"Som","Suru","Adarsh"}

        };


        for (int i=0; i<friends.length; i++) {
            System.out.println();
            for (int j = 0; j < friends[i].length; j++) {
                System.out.print(friends[i][j] + " ");
            }
        }
    }
}

