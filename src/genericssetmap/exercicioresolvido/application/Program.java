package genericssetmap.exercicioresolvido.application;

import genericssetmap.exercicioresolvido.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logs = new HashSet<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                logs.add(new LogEntry(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }
            System.out.println("Total users: " + logs.size());
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
