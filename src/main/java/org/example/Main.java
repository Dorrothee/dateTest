package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException {

        Function function = new Function();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the start date to count days from using format yyyy-mm-dd: ");
        String startDateInput = reader.readLine();
        System.out.print("Enter the end date to count days to using format yyyy-mm-dd: ");
        String endDateInput = reader.readLine();

        function.Gap(startDateInput, endDateInput);
    }
}