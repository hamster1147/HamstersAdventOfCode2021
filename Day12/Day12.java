import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        CaveSystem caveSystem;

        if (args.length >= 2) {
            caveSystem = parseDataFile(args[1]);
        } else {
            caveSystem = parseDataFile("Day12/Day12_Example_Input.csv");
        }

        System.out.println("Part 1 Answer: " + part1(caveSystem));
        System.out.println("Part 2 Answer: " + part2(caveSystem));
    }

    static public CaveSystem parseDataFile(String filePath) {
        CaveSystem CaveSystem = new CaveSystem();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {
                CaveSystem.addConnection(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return CaveSystem;
    }

    /**
     * Part 1 of Day 12 Challenge.
     * 
     * @param grid Object containing the parsed data from the input file.
     * @return The answer for part 1.
     */
    static public int part1(CaveSystem caveSystem) {
        ArrayList<CavePath> paths = caveSystem.spelunk(false);

        // for (CavePath path : paths) {
        // System.out.println(path);
        // }

        return paths.size();
    }

    /**
     * Part 2 of Day 12 Challenge.
     * 
     * @param grid Object containing the parsed data from the input file.
     * @return The answer for part 2.
     */
    static public int part2(CaveSystem caveSystem) {
        ArrayList<CavePath> paths = caveSystem.spelunk(true);

        for (CavePath path : paths) {
            System.out.println(path);
        }

        return paths.size();
    }
}
