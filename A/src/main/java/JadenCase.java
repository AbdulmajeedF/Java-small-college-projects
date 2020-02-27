public class JadenCase {

  public String toJadenCase(String phrase) {
    if((phrase == null) || (phrase.equals("")))
      return null;
    char[] charArray = phrase.toCharArray();
    charArray[0] = Character.toUpperCase(charArray[0]);
    for(int i=2; i < charArray.length; i++)
      if(charArray[i-1] == ' ')
        charArray[i] = Character.toUpperCase(charArray[i]);
    String str = new String(charArray);
    return str;
  }

}