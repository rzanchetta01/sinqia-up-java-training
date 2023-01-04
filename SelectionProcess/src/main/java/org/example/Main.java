package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        case2(
                Arrays.asList(
                        new Applicant("a1", BigDecimal.valueOf(1300)),
                        new Applicant("a2", BigDecimal.valueOf(200)),
                        new Applicant("a3", BigDecimal.valueOf(1600)),
                        new Applicant("a4", BigDecimal.valueOf(13000)),
                        new Applicant("a5", BigDecimal.valueOf(1300)),
                        new Applicant("a5", BigDecimal.valueOf(1300)),
                        new Applicant("a6", BigDecimal.valueOf(1300)),
                        new Applicant("a7", BigDecimal.valueOf(1300)),
                        new Applicant("a8", BigDecimal.valueOf(1300))
                )
        );
    }


    private static String case1(BigDecimal wage)
    {
        BigDecimal avgWage = BigDecimal.valueOf(2000);

        return switch (avgWage.compareTo(wage)) {
            case 1 -> "CALLING APPLICANT";
            case 0 -> "CALLING APPLICANT WITH COUNTER OFFER";
            default -> "AWAITING OTHERS APPLICANT'S OFFER";
        };
    }

    private record Applicant(String name, BigDecimal wage) implements Comparable<BigDecimal>{

        @Override
        public int compareTo(BigDecimal o) {
            return this.wage.compareTo(o);
        }
    }

    private static void case2(List<Applicant> applicants) {

        applicants.sort((o1, o2) ->  o1.compareTo(o2.wage));

        int indexCount = 0;
        for (Applicant finalApplicant : applicants) {

            if(finalApplicant.wage.compareTo(BigDecimal.valueOf(2000)) > 0 || indexCount >= 5)
                break;

            indexCount += 1;
            System.out.println("HIRED NAME: " + finalApplicant.name + " WAGE: " + finalApplicant.wage);
            case1(finalApplicant.wage);
        }


    }
}