public class Main {
    public static void main(String[] args) {

        String str1 = "This is introduction to Java's Strings";
        String str2 = "Java";

        if (str1.contains(str2)){
            System.out.println("Contains!");
        } else {
            System.out.println("Does not contain!");
        }

        //המתודה שמבצעת חיפוש כזה נקראת contains.
        //המתודה contains מקבלת כפרמטרים שתי מחרוזות: המחרוזת שבה אנו רוצים לחפש, והביטוי שאותו אנחנו רוצים לחפש.
        //אם נמצאת התאמה, מוחזר true, אחרת – false.
        // המתודה היא Case sensitive 
    }
}