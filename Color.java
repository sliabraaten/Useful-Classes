package Week09.LiaBraatens;

import java.util.ArrayList;

/**
 * 1011-071_Labs, Purpose: to output a colored text to the console, testing was completed with the grep console plugin for inteliJ
 * Class: SE1101-071   Lab: N/A
 * FHT VERSION: 1.1 9/17/2014
 *
 * @author Seth
 * @version 1.0 Created on 11/6/2014 at 3:41 PM.
 */
public class Color
{
    /**
     * the standard ANSI escape code for black text "[30m"
     */
    public static final String BLACK = (char)27 + "[30m";
    /**
     * the standard ANSI escape code for red text "[31m"
     */
    public static final String RED = (char)27 + "[31m";
    /**
     * the standard ANSI escape code for green text "[32m"
     */
    public static final String GREEN = (char)27 + "[32m";
    /**
     * the standard ANSI escape code for yellow text "[33m"
     */
    public static final String YELLOW = (char)27 + "[33m";
    /**
     * the standard ANSI escape code for blue text "[34m"
     */
    public static final String BLUE = (char)27 + "[34m";
    /**
     * the standard ANSI escape code for magenta text "[35m"
     */
    public static final String MAGENTA = (char)27 + "[35m";
    /**
     * the standard ANSI escape code for cyan text "[36m"
     */
    public static final String CYAN = (char)27 + "[36m";
    /**
     * the standard ANSI escape code for white text "[37m"
     */
    public static final String WHITE = (char)27 + "[37m";

    /**
     * the standard ANSI escape code for black highlighting "[40m"
     */
    public static final String BLACK_BACKGROUND = (char)27 + "[40m";
    /**
     * the standard ANSI escape code for red highlighting "[41m"
     */
    public static final String RED_BACKGROUND = (char)27 + "[41m";
    /**
     * the standard ANSI escape code for green highlighting "[42m"
     */
    public static final String GREEN_BACKGROUND = (char)27 + "[42m";
    /**
     * the standard ANSI escape code for yellow highlighting "[43m"
     */
    public static final String YELLOW_BACKGROUND = (char)27 + "[43m";
    /**
     * the standard ANSI escape code for blue highlighting "[44m"
     */
    public static final String BLUE_BACKGROUND = (char)27 + "[44m";
    /**
     * the standard ANSI escape code for magenta highlighting "[45m"
     */
    public static final String MAGENTA_BACKGROUND = (char)27 + "[45m";
    /**
     * the standard ANSI escape code for cyan highlighting "[46m"
     */
    public static final String CYAN_BACKGROUND = (char)27 + "[46m";
    /**
     * the standard ANSI escape code for white highlighting "[47m"
     */
    public static final String WHITE_BACKGROUND = (char)27 + "[47m";
    /**
     * the standard ANSI escape code for no highlighting "[0m"
     */
    public static final String NO_BACKGROUND = (char)27 + "[0m";
    /**
     * the standard ANSI escape code for highlighting the same color as the text "[7m"
     */
    public static final String SAME_AS_TEXT = (char)27 + "[7m";

    /**
     * the standard ANSI escape code for bold "[1m"
     */
    public static final String BOLD = (char)27 + "[1m";

    //add intensities


    protected ArrayList<String> colors = new ArrayList<String>(){{add(BLACK);add(RED);add(GREEN);add(YELLOW);add(BLUE);add(MAGENTA);add(CYAN);add(WHITE);}};


    private String findCurrentColor(String input)
    {
        return colors.get(colors.indexOf(input));
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the black constant and the white constant
     */
    public static String makeBlack (String input)
    {
        return BLACK + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the red constant and the white constant
     */
    public static String makeRed (String input)
    {
        return RED + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the green constant and the white constant
     */
    public static String makeGreen (String input)
    {
        return GREEN + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the yellow constant and the white constant
     */
    public static String makeYellow (String input)
    {
        return YELLOW + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the blue constant and the white constant
     */
    public static String makeBlue (String input)
    {
        return BLUE + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the magenta constant and the white constant
     */
    public static String makeMagenta (String input)
    {
        return MAGENTA + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the cyan constant and the white constant
     */
    public static String makeCyan (String input)
    {
        return CYAN + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the white constant and the white constant
     */
    public static String makeWhite (String input)
    {
        return WHITE + input + WHITE;
    }

    /**
     *
     * @param input the String to change the color of
     * @return a string that contains input bracketed by the bold constant and the no_background constant as well as the white constant
     */
    public static String makeBold (String input)
    {
        return BOLD + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightBlack (String input)
    {
        return BLACK_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightRed (String input)
    {
        return RED_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightGreen (String input)
    {
        return GREEN_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightYellow (String input)
    {
        return YELLOW_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightBlue (String input)
    {
        return BLUE_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightMagenta (String input)
    {
        return MAGENTA_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightCyan (String input)
    {
        return CYAN_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightWhite (String input)
    {
        return WHITE_BACKGROUND + input + NO_BACKGROUND + WHITE;
    }

    public static String highlightSameColor (String input)
    {
        return SAME_AS_TEXT + input + NO_BACKGROUND + WHITE;
    }

    public static void printColor (String input, String color)
    {
        //add catching of wrong color
        System.out.println(color + input + WHITE);
    }

    public static void printBlack (String input)
    {
        System.out.println(Color.makeBlack(input));
    }

    public static void printRed (String input)
    {
        System.out.println(Color.makeRed(input));
    }

    public static void printGreen (String input)
    {
        System.out.println(Color.makeGreen(input));
    }

    public static void printYellow (String input)
    {
        System.out.println(Color.makeYellow(input));
    }

    public static void printBlue (String input)
    {
        System.out.println(Color.makeBlue(input));
    }

    public static void printMagenta (String input)
    {
        System.out.println(Color.makeMagenta(input));
    }

    public static void printCyan (String input)
    {
        System.out.println(Color.makeCyan(input));
    }

    public static void printWhite (String input)
    {
        System.out.println(Color.makeWhite(input));
    }

    public static void printBlackHighlight (String input)
    {
        System.out.println(Color.highlightBlack(input));
    }

    public static void printRedHighlight (String input)
    {
        System.out.println(Color.highlightRed(input));
    }

    public static void printGreenHighlight (String input)
    {
        System.out.println(Color.highlightGreen(input));
    }

    public static void printYellowHighlight (String input)
    {
        System.out.println(Color.highlightYellow(input));
    }

    public static void printBlueHighlight (String input)
    {
        System.out.println(Color.highlightBlue(input));
    }

    public static void printMagentaHighlight (String input)
    {
        System.out.println(Color.highlightMagenta(input));
    }

    public static void printCyanHighlight (String input)
    {
        System.out.println(Color.highlightCyan(input));
    }

    public static void printWhiteHighlight (String input)
    {
        System.out.println(Color.highlightWhite(input));
    }

    public static void printSameBackgroundHighlight (String input)
    {
        System.out.println(Color.highlightSameColor(input));
    }

    public static void printBold (String input)
    {
        System.out.println(Color.makeBold(input));
    }

    protected static String testTextColors ()
    {
        System.out.println("\nTesting Text Colors:\n");
        String output = "";
        String test = "\nTesting Default Color";
        output += "\n" + Color.makeBlack("Black");
        output += test;
        output += "\n" + Color.makeRed("Red");
        output += test;
        output += "\n" + Color.makeGreen("Green");
        output += test;
        output += "\n" + Color.makeYellow("Yellow");
        output += test;
        output += "\n" + Color.makeBlue("Blue");
        output += test;
        output += "\n" + Color.makeMagenta("Magenta");
        output += test;
        output += "\n" + Color.makeCyan("Cyan");
        output += test;
        output += "\n" + Color.makeWhite("White");
        output += test;

        return output;
    }

    protected static String testTextHighlight()
    {
        System.out.println("\nTesting Text Highlight\n");
        String output = "";
        String test = "\nTesting Default Color";
        output += "\n" + Color.highlightBlack("Black");
        output += test;
        output += "\n" + Color.highlightRed("Red");
        output += test;
        output += "\n" + Color.highlightGreen("Green");
        output += test;
        output += "\n" + Color.highlightYellow("Yellow");
        output += test;
        output += "\n" + Color.highlightBlue("Blue");
        output += test;
        output += "\n" + Color.highlightMagenta("Magenta");
        output += test;
        output += "\n" + Color.highlightCyan("Cyan");
        output += test;
        output += "\n" + Color.highlightWhite("White");
        output += test;

        return output;
    }

    public static void main(String[] args)
    {
        System.out.println(testTextColors());
        System.out.println(testTextHighlight());
        System.out.println(Color.highlightSameColor(testTextColors()));
        System.out.println(Color.makeBold(testTextColors()));
    }
}
