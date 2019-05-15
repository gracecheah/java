
/**
 * PigLatin
 */

import java.util.ArrayList;

public class PigLatin {
  static String convert(String word) {
    String result = "";
    ArrayList<Character> chars = new ArrayList<Character>();
    ArrayList<Character> vowel = new ArrayList<Character>();
    vowel.add('a');
    vowel.add('e');
    vowel.add('i');
    vowel.add('o');
    vowel.add('u');

    if (vowel.contains(word.charAt(0))) {
      result = word;
    } else {
      for (char c : word.toCharArray()) {
        chars.add(c);
      }
      Boolean isVowel = false;
      int i = chars.size();
      while (!isVowel && i > 0) {
        if (!vowel.contains(chars.get(0))) {
          chars.add(chars.get(0));
          chars.remove(0);
          i -= 1;
        } else {
          isVowel = true;
        }
      }
      result = getStringRepresentation(chars) + "ay";
    }
    return result;
  }

  static String getStringRepresentation(ArrayList<Character> list) {
    StringBuilder builder = new StringBuilder(list.size());
    for (Character ch : list) {
      builder.append(ch);
    }
    return builder.toString();
  }

  public static void main(String[] args) {
    System.out.println(convert("art").equals("art"));
    System.out.println(convert("vowel").equals("owelvay"));
    System.out.println(convert("nginx").equals("inxngay"));
    System.out.println(convert("hello").equals("ellohay"));
    System.out.println(convert("Dr").equals("Dray"));
  }
}