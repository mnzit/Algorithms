/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.IOException;

/**
 *
 * @author Mnzit
 *
 * Rabin-karp String Matching algorithm
 */
public class StringSearch {

    public static void main(String[] args) throws IOException {
        Hasher hasher = new Hasher();
        String input = "WhenKateChopin'snovelTheAwakeningwaspublishedin1899,criticscondemnedthebookasimmoral.Onetypicalcritic,writingintheProvidenceJournal,fearedthatthenovelmight\"fallintothehandsofyouth,leadingthemtodwellonthingsthatonlymaturedpersonscanunderstand,andpromotingunholyimaginationsanduncleandesires\"(150).AreviewerintheSt.LouisPost-Dispatchwrotethat\"thereismuchthatisveryimproperinit,nottosaypositivelyunseemly.";
        String search = "typical";
        long searchHashValue = hasher.hash(search);
        for (int k = 0; k < input.length() - search.length() + 1; k++) {
            String send = input.substring(k, (k + search.length()));
            long receiveHashValue = hasher.hash(send);
            if (searchHashValue == receiveHashValue) {
                System.out.println("Found from index: " + k);
            }
        }
    }
}
