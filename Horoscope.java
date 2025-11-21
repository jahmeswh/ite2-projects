import java.util.Scanner;

public class Horoscope 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int month = 0;
        int day = 0;

        System.out.print("Enter your birth month (1-12): ");
        month = input.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        day = input.nextInt();

        String sign = getZodiacSign(month, day);
        String horoscope = getHoroscope(sign);

        System.out.println("Your zodiac sign is: " + sign);
        System.out.println("Your horoscope: " + horoscope);
    }

    private static String getZodiacSign(int month, int day) {
        switch (month) {
            case 1:
                return (day <= 19) ? "Capricorn" : "Aquarius";
            case 2:
                return (day <= 18) ? "Aquarius" : "Pisces";
            case 3:
                return (day <= 20) ? "Pisces" : "Aries";
            case 4:
                return (day <= 19) ? "Aries" : "Taurus";
            case 5:
                return (day <= 20) ? "Taurus" : "Gemini";
            case 6:
                return (day <= 20) ? "Gemini" : "Cancer";
            case 7:
                return (day <= 22) ? "Cancer" : "Leo";
            case 8:
                return (day <= 22) ? "Leo" : "Virgo";
            case 9:
                return (day <= 22) ? "Virgo" : "Libra";
            case 10:
                return (day <= 22) ? "Libra" : "Scorpio";
            case 11:
                return (day <= 21) ? "Scorpio" : "Sagittarius";
            case 12:
                return (day <= 21) ? "Sagittarius" : "Capricorn";
            default:
                return "Unknown";
        }
    }

    private static String getHoroscope(String sign) {
        switch (sign) {
            case "Aries":
                return "Today is a day for bold actions. Embrace your adventurous spirit!";
            case "Taurus":
                return "Patience will be your ally. Enjoy the simple pleasures in life.";
            case "Gemini":
                return "Communication is key. Share your ideas and connect with others.";
            case "Cancer":
                return "Trust your intuition. Family and home bring comfort today.";
            case "Leo":
                return "Shine brightly! Your confidence will inspire those around you.";
            case "Virgo":
                return "Focus on details. Your analytical mind will solve problems.";
            case "Libra":
                return "Seek balance in all things. Harmony leads to happiness.";
            case "Scorpio":
                return "Dive deep into mysteries. Your passion drives you forward.";
            case "Sagittarius":
                return "Explore new horizons. Adventure awaits beyond your comfort zone.";
            case "Capricorn":
                return "Hard work pays off. Stay disciplined and aim for your goals.";
            case "Aquarius":
                return "Innovate and think outside the box. Your uniqueness is your strength.";
            case "Pisces":
                return "Let your creativity flow. Empathy will guide your decisions.";
            default:
                return "The stars are unclear today. Trust your own path.";
        }
    }
}