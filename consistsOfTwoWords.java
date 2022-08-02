import java.util.HashSet;

// input string Dictionary of words

// return if string consists up to two words from dictionary

// catdog - true
// catcat - true
// catsdog - false
// cat - true

// c cat dog i5 ""

// strat
// c d
// a o
// t g
// END


// c cat dog i5
// catdog

// cat dog i5 ca
// catdog


// "" cat 
// ""
class X {
boolean consistsOfTwoWords(String str, HashSet<String> words) {
  
  //validation
  if(str==null||str.equals("")) return true;

  if(words==null) return false;

  int n = str.length();
  //run over str
  if(words.contains(str)) return true;
  for(int i=1;i<n;i++) {
    String firstSubStr = str.substring(0,i);
    consistsOfTwoWords(firstSubStr)
    if(words.contains(firstSubStr)) {
      String secondSubStr = str.substring(i,n);
        if(words.contains(secondSubStr)) {
            return true;
        }
    }
  }

  //return true or false
  return false;
}
}
