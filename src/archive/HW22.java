package archive;

public class HW22 {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        // "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }

    public static void enigmaCaesar(String s) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String otherSymbols = ",. ";
        alphabet += alphabet; // самый простой способ избежать ошибки когда нужно будет сделать "сдвиг" для шифра

        String result = "";

        for (int i = 0; i < s.length(); i++) { // итерируем входную строку
            for (int j = 0; j < alphabet.length(); j++) { // итерируем алфавит
                if (s.toLowerCase().charAt(i) == alphabet.charAt(j)) {
                    result += alphabet.charAt(j + 3);
                    break;
                }
            }
            for (int k = 0; k < otherSymbols.length(); k++) {
                if (s.toLowerCase().charAt(i) == otherSymbols.charAt(k)) result += otherSymbols.charAt(k);
            }
        }
        result = result.replace(result.substring(0,1),result.substring(0,1).toUpperCase());

        System.out.println(result);
    }


}
