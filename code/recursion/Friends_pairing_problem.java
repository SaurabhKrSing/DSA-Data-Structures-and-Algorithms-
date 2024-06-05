// Friends Pairing Problem

// Given n friends, each one can remain single oe can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

public class Friends_pairing_problem {
     public static int friend_pairing(int person) {
          // base case
          if (person == 1 || person == 2) {
               return person;
          }
          // // choice
          // // single
          // int fp1 = friend_pairing(person - 1);
          // // pair
          // int fp2 = friend_pairing(person - 2);
          // int pairways = (person - 1) * fp2;

          // // toways
          // int totalways = fp1 + pairways;
          // return totalways;

          // Optimized Code
          return friend_pairing(person - 1) + (person - 1) * friend_pairing(person - 2);

     }

     public static void main(String[] args) {
          System.out.println(friend_pairing(3));
     }
}
